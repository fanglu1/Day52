public class BankAccount {
  public static void main(String[] args){
    BankAcc account = new BankAcc(500, "Fang");
    account.deposit(100);
    System.out.println(account.total());
    BankAcc account2 = new BankAcc(5000, "Larry");
    account2.withdrawal(100);
    System.out.println(account2.total());
    BankAcc account3 = new BankAcc(300, "Mary");
    account3.deposit(100);
    System.out.println(account3.total());
  }
}
