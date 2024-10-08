/*make an object class using constructor add parameters (name,id,,balance,Accountsno) create two objects */
class Bank {

    String Name;
    int Id;
    int Accountno;
    int Balance;

    String getName() {
        return Name;
    }

    int getId() {
        return Id;

    }

    int getAccountno() {
        return Accountno;

    }

    int getBalance() {
        return Balance;

    }

    Bank(String Name, int Id, int Accountno, int Balance) { // constructor 1
        this.Name = Name;
        this.Id = Id;
        this.Accountno = Accountno;
        this.Balance = Balance;
    }

    Bank(String Name, int Accountno) { // constructor 2 (method overloading)
        this.Name = Name;
        this.Accountno = Accountno;
    }

}
