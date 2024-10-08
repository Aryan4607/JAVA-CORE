
class BankMain {

    public static void main(String[] args) {
        Bank b1 = new Bank("Aryan", 123, 12345677, 222333);
        Bank b2 = new Bank("Prem", 12233445);

        System.out.println(b1.getName());
        System.out.println(b1.getAccountno());
        System.out.println(b1.getBalance());

        System.out.println(b2.getName());
        System.out.println(b2.getAccountno());

    }

}
