package com.bridgelabz;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(firstName("Suchendra"));
        System.out.println(lastName("Mishra"));
        System.out.println(email("suchendramishra396@gmail.com"));
        System.out.println(mobile("91 7209439312"));
        System.out.println(password("Mypassword123"));
    }
    /*
     validate first name with 1st letter capital and at least 3 words
     */
    public static boolean firstName(String firstName) {
        return firstName.matches("[A-Z][a-z]{3,}");
    }
    /*
 validate last name with 1st letter capital and at least 3 words
 */
    public static boolean lastName(String lastName) {
        return lastName.matches("[A-Z][a-z]{3,}");
    }
    /*
      validate the email address
      */
    public static boolean email(String email) {
        return email.matches("[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}");
    }
    /*
    validate the mobile number
    */
    public static boolean mobile(String mobile) {
        return mobile.matches("91{1}" + "\s" + "[0-9]{10}");
    }
    /*
       validate the password of minimum one numeric
       */
    public static boolean password(String password) {
        return password.matches("(?=.*[A-Z])" + "(?=.*[0-9])" + ".{8,}");
    }
}