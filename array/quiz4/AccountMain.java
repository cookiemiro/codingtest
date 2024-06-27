package array.quiz4;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());
    }
}


class Account {
    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
            return;
        }
        
        this.balance = balance;
    }
}
