import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameView {

    private AddressBook ab = new AddressBook();
    private final JFrame frame;

    public FrameView() {

        this.frame = new JFrame("Address Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);
    }

    public void getBar() {

        JMenuBar bar = new JMenuBar();

        JMenu addressMenu = new JMenu("AddressBook");
        JMenu buddyMenu = new JMenu("BuddyInfo");

        JMenuItem createAddress = new JMenuItem("Create");
        JMenuItem displayAddress = new JMenuItem("Display");
        JMenuItem addBuddy = new JMenuItem("Add");
        JMenuItem removeBuddy = new JMenuItem("Remove");

        createAddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddressBook ab = new AddressBook();
                JOptionPane.showMessageDialog(frame, "Address Book successfully created.");
            }
        });

        displayAddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getList();
            }
        });

        addBuddy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Buddy name: ");
                String address = JOptionPane.showInputDialog("Buddy address: ");
                String number = JOptionPane.showInputDialog("Buddy phone number (XXX-XXXX): ");

                BuddyInfo buddy = new BuddyInfo(name, address, number);
                ab.addBuddy(buddy);
            }
        });

        removeBuddy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(JOptionPane.showInputDialog("Enter integer of buddy to remove (1,2,3... descending order): ")) - 1;

                ab.removeBuddy(index);
            }
        });

        addressMenu.add(createAddress);
        addressMenu.add(displayAddress);
        buddyMenu.add(addBuddy);
        buddyMenu.add(removeBuddy);
        bar.add(addressMenu);
        bar.add(buddyMenu);
        this.frame.setJMenuBar(bar);
    }

    public void getList() {

        DefaultListModel<BuddyInfo> model = ab.getListModel();
        JList<BuddyInfo> list = new JList<>();
        list.setModel(model);
        this.frame.add(list);
    }

    public void displayGUI() { frame.setVisible(true);}

    public static void main(String[] args) {

        FrameView fv = new FrameView();
        fv.getBar();
        fv.displayGUI();

    }
}
