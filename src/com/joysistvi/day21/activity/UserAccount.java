package com.joysistvi.day21.activity;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Parameterized Constructor
    public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
        this.setAddress(address);
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {

        if (email.contains("@") && email.contains(".com") && email.lastIndexOf('@') < email.lastIndexOf(".com")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address.");
        }

    }

    public void setPassword(String password) {

        boolean hasNumber = false;
        while (true) {


            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasNumber = true;
                    break;
                }
            }

            if (password.length() >= 8 && hasNumber) {
                this.password = password;
                password.trim();
                break;
            } else {
                System.out.println("Password must have a number and more than 8 characters");
                return;
            }
        }

    }

    @Override
    public String toString() {
        return "Full Name: " + firstName + " " + middleName + " " + lastName +
                "\nEmail: " + email +
                "\nAddress: " + address;
    }
}

