package com.example.addressbookapplication;

import java.util.Iterator;
import java.util.LinkedList;

public class AddressBook {
    LinkedList<AddressEntry>contacts;

    AddressBook(){
        contacts = new LinkedList<AddressEntry>();
    }
    public void add(AddressEntry entry) {
        contacts.addLast(entry);
    }
    public void list() {
        Iterator it = contacts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
