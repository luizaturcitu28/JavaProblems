//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Sa se creeze un sistem de gestionare a unui singur cont bancar folosind design pattern-ul Singleton
        //Implementarea va include o clasa interna pentru detalii ale contului si va arunca o exceptie personalizata
        //in cazul in care se incearca retragerea unei sume mai mari decat soldul disponibil.

        BankAccount account = BankAccount.getInstance();

        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(700);
    }
}