class BankAccount {

    final int AccountNumber;
    static String BankName = "Global Bank";

    BankAccount(int AccountNumber) {

        this.AccountNumber = AccountNumber;
        System.out.println("Bank account creeated :" + AccountNumber);

    }

    static void getBankName() {
        System.out.println("Bank Name :" + BankName);

    }

    void displayAccount() {
        System.out.println("Account Number" + AccountNumber + "at"+" " + BankName);

    }

}
