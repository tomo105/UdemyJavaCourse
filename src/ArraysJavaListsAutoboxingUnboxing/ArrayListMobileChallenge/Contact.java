package ArraysJavaListsAutoboxingUnboxing.ArrayListMobileChallenge;

public class Contact {
    private String name;
    private String PhoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.PhoneNumber = phoneNumber;
    }

    public static Contact CreateContact(String name, String number)
    {
        return new Contact(name, number);
    }

    //factory method
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
