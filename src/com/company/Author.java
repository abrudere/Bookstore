package com.company;

public class Author {
    public String firstName;
    public String lastName;
    public String gender;

     Author (String firstName, String lastName, String gender) {
         super();
         this.firstName = firstName;
         this.lastName = lastName;
         this.gender = gender;
     }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
