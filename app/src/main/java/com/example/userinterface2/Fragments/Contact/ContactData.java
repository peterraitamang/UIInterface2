package com.example.userinterface2.Fragments.Contact;

public class ContactData {
    private String contactName, contactNumber;
    private int profileImg;

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public ContactData(String contactName, String contactNumber, int profileImg) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.profileImg = profileImg;
    }
}
