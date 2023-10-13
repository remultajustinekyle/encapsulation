
public class BankAccount {
    
    private String name;
    private int age;
    private int accountNumber;
    private double balance;
    
    public BankAccount(String name,int age, int accountNumber,double balance){
    this.name = name;
    this.age = age;
    this.accountNumber = accountNumber;
    this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
public void displayAccount(){
    System.out.println("Account");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: " + balance);
}
public static void main(String[] args){
    BankAccount myAccount = new BankAccount("Justine kyle ",21,123456789,2000.00);
    myAccount.deposit(3000.00);
    myAccount.deposit(1000.00);
    myAccount.displayAccount();

     }
}
    

