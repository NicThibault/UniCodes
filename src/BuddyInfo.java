public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this("John Smith","123 Boulevard of Broken Dreams", "(123) 456-7890");
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static void main(String[] args) {



        BuddyInfo newBuddy1 = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-8707");

        System.out.println("Hello " + newBuddy1.getName());
    }
}
