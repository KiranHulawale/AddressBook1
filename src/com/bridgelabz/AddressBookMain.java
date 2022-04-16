package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {
            int choice,i=0;
            final AddressBook help = new AddressBook();
            while(i==0)
            {
                System.out.println("\t--MENU--");
                System.out.println("1: Add New Person \n");
                System.out.println("2: Display Records \n");
                System.out.println("3: Edit Person \n");
                System.out.println("4: Delete Person \n");
                System.out.println("5: Sort \n");
                System.out.println("6: Exit	\n");
                System.out.println("Enter Your Choice");
                choice = Input.getIntValue();
                switch(choice)
                {
                    case 1 :
                        help.addRecord();
                        break;
                    case 2 :
                        help.displayRecord();
                        break;
                    case 3 :
                        help.editRecord();
                        break;
                    case 4 :
                        help.deleteRecord();
                        break;
                    case 5 :
                        help.sortRecords();
                        break;
                    case 6 :
                        i=1;
                        break;
                    default :
                        System.out.println("Please Enter Valid Option!");
                }
            }
        }
}
