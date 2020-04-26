package Bank.io;

import Bank.model.Data.BankCustomer;

import java.util.Scanner;


public class DataReaderAddAccount {

    private static Scanner reader = new Scanner(System.in);

    public static BankCustomer readAndCreateAccount(){

        System.out.println("First Name: ");
        String firstName= reader.nextLine();
        System.out.println("Last Name: ");
        String lastName= reader.nextLine();
        System.out.println("Code: ");
        String code= reader.nextLine();
        System.out.println("Cash: ");
        double cash= reader.nextDouble();
        System.out.println("What next? ");
        reader.nextLine();

        return new BankCustomer(firstName, lastName, code, cash);
    }


    public int getInt(){
        int number = reader.nextInt() ;
        reader.nextLine();
        return number;
    }


    public void close() {
        reader.close();
    }
}
