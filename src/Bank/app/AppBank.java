package Bank.app;

public class AppBank{

    private static final String APP_NAME = "Bank v 0.2";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        BankControl BanCon = new BankControl();
        BanCon.controlLop();
    }
}