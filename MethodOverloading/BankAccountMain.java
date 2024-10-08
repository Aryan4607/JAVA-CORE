class BankAccountMain {
    public static void main(String[] args) {
        BankAccount.getBankName();
        BankAccount b1 = new BankAccount(123456);
        BankAccount b2 = new BankAccount(22345533);
        b1.displayAccount();
        b2.displayAccount();

    }

}
