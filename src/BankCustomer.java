    class BankCustomer {
    private String firstName;
    private String lastName;
    private String code;
    private double cash;

    public BankCustomer(String firstName, String lastName, String code, double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
        this.cash = cash;
    }

        public BankCustomer() {

        }

        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
