package classprac;

public class Account {
    private String accNo;
    private int balance;

    public void setAccNo(String accNo) {
        System.out.println(accNo + " 계좌가 개설되었습니다.");
        this.accNo = accNo;
    }

    public String getAccNo() {
        return accNo;
    }

    public void save(int balance) {
        System.out.println(accNo + " 계좌에 " + balance + "만원이 입금되었습니다.");
        this.balance += balance;
    }

    public void deposit(int balance) {
        System.out.println(accNo + " 계좌에 " + balance + "만원이 출금되었습니다.");
        this.balance -= balance;
    }

    public int getBalance() {
        return balance;
    }
}
