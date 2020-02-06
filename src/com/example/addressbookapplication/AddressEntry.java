package com.example.addressbookapplication;

public class AddressEntry {
   String firstName;
   String lastName;
   String street;
   String city;
   String state;
   Integer zip;
   String telephone;
   String email;

   AddressEntry(){
       this.firstName = "";
       this.lastName = "";
       this.street = "";
       this.city = "";
       this.state = "";
       this.zip = 0;
       this.telephone = "";
       this.email = "";
   }

    public AddressEntry(String dhruvin, String patel, String s, String san_jose, String ca, String s1, String s2, String s3) {
    }
}
