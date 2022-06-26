package LexiconJava.Exercises.Week3.OOP;

public class BankAccount {

   private String accountNumber; //fields
   private double balance;
   private String customerName;
   private String email;
   private String phoneNumber;


   //sets the initial values
   public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){ //constructor
       this.accountNumber = accountNumber;
       this.balance = balance;
       this.customerName = customerName;
       this.email = email;
       this.phoneNumber = phoneNumber;
   }


    //getter/setter methods
   public String getAccountNumber(){
       return accountNumber;
   }

    public double getBalance(){
        return balance;
    }

   public String getCustomerName(){
       return customerName;
   }

   public String email(){
       return email;
   }

   public String getPhoneNumber(){
       return phoneNumber;
   }


   public void setBalance(double balance){ //sets a new balance and uses it instead of the constructor value of balance
       this.balance = balance;
   }

   public double depositMethod(double depositAmount){
       double newBalance = getBalance() + depositAmount; //adds deposit money on the current balance
       setBalance(newBalance); // sets new balance and uses the setBalance() method instead of constructor value of balance
       return newBalance;
   }



   public void withdrawalMethod(double withdrawalAmount){
       double newBalance = getBalance() - withdrawalAmount; //subtracts withdrawal money on the current balance

       if(newBalance > withdrawalAmount)  //checks if the amount balance is enough to withdrawal the money. if not gives error
           setBalance(newBalance);
       else
           System.out.println("You don't have enough money to withdrawal that much money!");

       // else
       // return newBalance;
      // return newBalance;  // returns the new balance after withdrawal of money
   }

}
