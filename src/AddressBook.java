import javax.swing.DefaultListModel;

public class AddressBook extends DefaultListModel {

    private DefaultListModel<BuddyInfo> listModel;

    public AddressBook() {
        this.listModel = new DefaultListModel<BuddyInfo>();
    }

    public AddressBook(DefaultListModel<BuddyInfo> listModel) {
        this.listModel = listModel;
    }

    public void addBuddy(BuddyInfo buddy) {
        this.listModel.addElement(buddy);
    }

    public void removeBuddy(int index) {
        this.listModel.remove(index);
    }

    public DefaultListModel<BuddyInfo> getListModel() {
        return this.listModel;
    }
}
