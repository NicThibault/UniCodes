import java.util.Objects;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    @Override
    public String toString() {
        return  name +
                ": address = " + address + ", phoneNumber = " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuddyInfo buddyInfo = (BuddyInfo) o;
        return Objects.equals(name, buddyInfo.name) && Objects.equals(address, buddyInfo.address) && Objects.equals(phoneNumber, buddyInfo.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phoneNumber);
    }
}
