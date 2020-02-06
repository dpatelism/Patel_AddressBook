package com.example.addressbookapplication;



import static java.awt.Menu.*;

class AddressBookApplication

{

//Main method.

    public static void main(String[] args)

    {
        AddressBook ab = new AddressBook();

//New instance for Menu class.

        Menu Menu = new Menu();

//Function call to prompt_FirstName.

        Menu.prompt_FirstName();

//Function call to prompt_LastName.

        Menu.prompt_LastName();

//Function call to prompt_Street.

        Menu.prompt_Street();

//Function call to prompt_City.

        Menu.prompt_City();

//Function call to prompt_State.

        Menu.prompt_State();

//Function call to prompt_Zip.

        Menu.prompt_Zip();

//Function call to prompt_Telephone.

        Menu.prompt_Telephone();

//Function call to prompt_Email.

        Menu.prompt_Email();
        int AddressBookExcercise;

//End of main method.
  }

  static void initAddressBookExcercise(AddressBook ab){
        AddressEntry entry1 = new AddressEntry("Dhruvin", "Patel","2175 Aborn","San Jose", "CA","95121","4082849866","pateldhruvin65@gmail.com");
        AddressEntry entry2 = new AddressEntry();
        ab.add(entry1);
        ab.add(entry2);
        ab.list();
  }
//End of class.

}

