package LexiconJava.Exercises.Week3.OOP;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount HusaynsBankAccount = new BankAccount("1456917836791", 100_00.00, "Husayn","husan254@gmail.com","0729089893");

        //testing
        System.out.println("Husayn has: " + HusaynsBankAccount.getBalance() + " kr in his bankAccount.");


        HusaynsBankAccount.depositMethod((1000)); //adds 1000kr to account
      //  HusaynsBankAccount.setBalance(100);
        System.out.println("Husayns new balance: " + HusaynsBankAccount.getBalance());

        HusaynsBankAccount.withdrawalMethod(2000); //takes out 2000kr from the account
        System.out.println("Husayns new balance after withdrawal: " + HusaynsBankAccount.getBalance());

        HusaynsBankAccount.withdrawalMethod(10000); //tries to withdrawal more than the available balance. gets error message
        System.out.println("Husayns balance: " + HusaynsBankAccount.getBalance());


    }




}
