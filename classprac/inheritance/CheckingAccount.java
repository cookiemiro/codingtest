package classprac.inheritance;

public class CheckingAccount extends Account {
    private String cardNo;

    public void calcRate() {

    }

    public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
        super(accid, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void pay(long amount, String cardNo) {
        if (this.cardNo.equals(cardNo)) {
            long bal = getBalance();
            if (amount < bal) {
                setBalance(bal - amount);
            }
        } else {
            System.out.println("지불이 불가능합니다.");
        }
    }
}
