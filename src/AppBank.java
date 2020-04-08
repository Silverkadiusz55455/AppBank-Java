import java.util.Scanner;

public class AppBank {

    public static void main(String[] args) {
        final int exit =0;
        final int logIn =1;
        final int addAccount=2;
        final int deleteAccount=3;
        final int helpAccount=4;
        final int ShowData = 1;
        final String back = "B";

        Scanner input = new Scanner(System.in);
        int option = -1;

        AddAcountFirst addAcc = new AddAcountFirst();

        while(option !=exit){
            System.out.println("Wybierz: ");

            System.out.println("1. Log in.");
            System.out.println("2. Add Account.");

            System.out.println("3. Delete Account.");
            System.out.println("4. Help.");
            System.out.println("5. Exit.");
            option = input.nextInt();
            input.nextLine();


            switch(option){
                case logIn:
                    break;
                case addAccount:
                    BankCustomer customer = new BankCustomer();
                    System.out.println("First Name: ");
                    customer.setFirstName(input.nextLine());
                    System.out.println("Last Name: ");
                    customer.setLastName(input.nextLine());
                    System.out.println("Code: ");
                    customer.setcode(input.nextLine());
                    System.out.println("Cash: ");
                    customer.setCash(input.nextInt());

                    addAcc.addAccount(customer);
                    System.out.println("What next? ");
                    break;

              /*  switch (option){
                    case ShowData:
                        addAcc.printCustomer(input.nextLine());
                        System.out.println("Show data");
                        break;
                }*/

                case exit:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Something fucked up");
            }

        }
    input.close();

    }
}
