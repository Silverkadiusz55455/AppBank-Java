public class AddAcountFirst {
private final int maxCustomerNumber =5;
private BankCustomer [] customers = new BankCustomer[maxCustomerNumber];
private int registerCustomer = 0;


public void addAccount(BankCustomer customer){

    if(registerCustomer < maxCustomerNumber){
        customers[registerCustomer] = customer;
        registerCustomer ++;
    }else{
        System.out.println("The limit of places has been exhausted");
    }
}

    public void printCustomer(String s){
    for(int i = 0; i < registerCustomer; i++){
        System.out.println("The account was created correctly"+customers[i].getFirstName()+ " "+
                customers[i].getLastName()+" " +customers[i].getcode()
                +" " + customers[i].getCash());
        System.out.println("What next? ");

    }
}

}
