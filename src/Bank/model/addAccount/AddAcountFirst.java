package Bank.model.addAccount;

import Bank.model.Data.BankCustomer;

public class AddAcountFirst {
private static final int MAX_CUSTOMER_NUMBER =5;
private BankCustomer[] customers = new BankCustomer[MAX_CUSTOMER_NUMBER];
private int registerCustomer = 0;


public void addAccount(BankCustomer customer){

    if(registerCustomer < MAX_CUSTOMER_NUMBER){
        customers[registerCustomer] = customer;
        registerCustomer ++;
    }else{
        System.out.println("The limit of places has been exhausted");
    }
}

    public void printCustomer(){
    for(int i = 0; i < registerCustomer; i++){
        System.out.println("The account was created correctly"+customers[i].getFirstName()+ " "+
                customers[i].getLastName()+" " +customers[i].getcode()
                +" " + customers[i].getCash());
        System.out.println("What next? ");

    }
}

}
