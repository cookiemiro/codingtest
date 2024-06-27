package array.quiz4;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[100];
        int index = 0;
        
        boolean isfinished = false;
        
        while(!isfinished) {
            System.out.println("----------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("-----------");
                    System.out.println("계좌생성");
                    System.out.println("-----------");
                    Account account = new Account();
                    System.out.print("계좌번호: ");
                    account.accountNo = sc.next();
                    System.out.print("계좌주: ");
                    account.accountUser = sc.next();
                    System.out.print("초기입금액: ");
                    account.balance = sc.nextInt();
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    accounts[index++] = account;
                    break;
                case 2:
                    for (Account a : accounts) {
                        if (a != null) {
                            System.out.println(a.accountNo + "  " + a.accountUser + "  " + a.balance);
                        }
                    }
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("예금");
                    System.out.println("-------------------");
                    System.out.print("계좌번호: ");
                    String acc = sc.next();
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            continue;
                        }

                        if (accounts[i].accountNo.equals(acc)) {
                            System.out.print("예금액: ");
                            int balance = sc.nextInt();
                            accounts[i].balance += balance;
                            break;
                        } else {
                            System.out.println("찾는 계좌가 없습니다.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("-------------------");
                    System.out.println("출금");
                    System.out.println("-------------------");
                    System.out.print("계좌번호: ");
                    String acc1 = sc.next();
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            continue;
                        }

                        if (accounts[i].accountNo.equals(acc1)) {
                            System.out.print("출금액: ");
                            int balance = sc.nextInt();
                            if (accounts[i].balance < balance) {
                                System.out.println("잔고가 부족합니다.");
                                return;
                            }
                            accounts[i].balance -= balance;
                            System.out.println("결과: 출금 성공했습니다.");
                            break;
                        } else {
                            System.out.println("찾는 계좌가 없습니다.");
                        }
                    }
                    break;
                case 5:
                    isfinished = true;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    break;
            }
        }
    }
}

class Account {
    public String accountNo;
    public String accountUser;
    public int balance;
}