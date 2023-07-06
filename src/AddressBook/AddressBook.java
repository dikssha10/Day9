package AddressBook;

import java.util.ArrayList;
class Contact{
    private String firstName;
    private String lastName;
    private String address;
    private int zipNo;
    private int phoneNumber;
    private String email;
    private static ArrayList<Contact> list = new ArrayList<Contact>();
    public Contact(String firstName, String lastName, String address, int zipNo, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipNo = zipNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getZipNo() {
        return zipNo;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipNo(int zipNo) {
        this.zipNo = zipNo;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static void addContact(Contact add){
        list.add(add);
    }
    public static void removeContact(Contact remove,String firstName){
        list.remove(remove);
    }

    public static  ArrayList<Contact> getContact(){
        return list;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", zipNo=" + zipNo +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
          '}';
    }
}

public class AddressBook {
    public static void main(String[] args) {
        Contact c=new Contact("Diksha","Mendhe","Wardha",442001,12345,"diksha@gmail.com");
        Contact c1=new Contact("Dipti","Mendhe","pune",442002,7888,"dipti@gmail.com");
        Contact c2=new Contact("Manisha","Hinge","Banglore",442003,9876,"manisha@gmail.com");
        Contact c3=new Contact("Devyani","Bakal","Hydrabad",442004,1798,"devyani@gmail.com");

        Contact.addContact(c);
        Contact.addContact(c1);
        Contact.addContact(c2);
        Contact.addContact(c3);
        c.setFirstName("Diks");
        System.out.println(c.getFirstName());

        ArrayList<Contact> list=Contact.getContact();
        //System.out.println(Contact.getContact());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n After removing");
        Contact.removeContact(c3,"Rohit");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

}
