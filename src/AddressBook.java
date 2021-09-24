import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList = new ArrayList<>();

    public AddressBook() {}

    public AddressBook(ArrayList<BuddyInfo> buddyList) {
        this.buddyList = buddyList;
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddyList.remove(buddy);
    }


    public static void main(String[] args) {

        //Change to test github
        
        //Second change (on github)

        //branched change to merge into master

        BuddyInfo buddy1 = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-8707");

        AddressBook address = new AddressBook();

        address.addBuddy(buddy1);

        address.removeBuddy(buddy1);


    }


}
