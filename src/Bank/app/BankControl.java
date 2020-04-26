package Bank.app;

import Bank.io.DataReaderAddAccount;
import Bank.model.Data.BankCustomer;
import Bank.model.LogIn.LogInFirst;
import Bank.model.addAccount.AddAcountFirst;
import Bank.io.DataReaderAddAccount;

public class BankControl {

           private final static int EXIT =0;
            private static final int LOG_IN =1;
            private static final int ADD_ACCOUNT=2;
            private static final int PRINT_ACCOUNTT=3;


           private DataReaderAddAccount dataReader= new DataReaderAddAccount();
           private AddAcountFirst Account = new AddAcountFirst();
           private LogInFirst LogIn = new LogInFirst();

           public void controlLop(){
               int option;

               do{
                       printOptions();
                       option = dataReader.getInt();
                       switch(option) {
                           case LOG_IN:
                               System.out.println("logowanie");
                               break;
                           case ADD_ACCOUNT:
                               addAccount();
                               break;
                           case PRINT_ACCOUNTT:
                               printCustomer();
                               break;
                           case EXIT:
                               exit();
                           default:
                               System.out.println("Błąd");
                       }
                }while(option != EXIT);
           }

    private void addAccount() {
        BankCustomer customer = DataReaderAddAccount.readAndCreateAccount();
    }

    private void exit() {
        System.out.println("Koniec programu, BYE!");
        dataReader.close();
    }

    private void printCustomer() {
    BankCustomer.printCustomer();
    }

    private void printOptions() {
        System.out.println("Wybierz opcje:");
        System.out.println(EXIT +" - Wyjscie z programu");
        System.out.println(LOG_IN +" - Zaloguj");
        System.out.println(ADD_ACCOUNT +" - Dodaj konto");
        System.out.println(PRINT_ACCOUNTT +" - Wyświetl konto");


    }
}

