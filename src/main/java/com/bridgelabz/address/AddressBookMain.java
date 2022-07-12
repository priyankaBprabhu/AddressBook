package com.bridgelabz.address;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBookMain {

    static Scanner scan = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO ADDREES BOOK PROGRAM" );
        Map<String, AddressBook> map = new HashMap<>();
        System.out.println("Enter Number of address book you want to add");
        int count = scan.nextInt();
        int i = 0;
        while (i < count) {
            System.out.println("Enter book name");
            String bookName = scan.next();
            AddressBook addressBook = new AddressBook();
            addressBook.operation();
            map.put(bookName, addressBook);
            i++;
        }
        System.out.println(map);
    }
}
