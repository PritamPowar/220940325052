import java.util.Scanner;
class BankAccount{
    int accno;
    double balance;
    BankAccount(int account_no,double balance){
        this.accno=account_no;
        this.balance=balance;
    }
    public void withDraw(double wd){
        this.balance = this.balance - wd;
    }
    public void deposit(double di){
        this.balance=this.balance+di;
    }
    public void show(){
        System.out.println("Account no: "+this.accno);
        System.out.println("Balance: "+this.balance);
    }
}
public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba= new BankAccount(123,0);
        while (true){
            System.out.println("1. show 2. deposit 3. withdraw 0.exit");
            int b=sc.nextInt();
            if (b==0) break;
            else if (b==1) {
                ba.show();
            }
            else if (b==2) {
                System.out.println("enter amount to deposit");
                double di=sc.nextDouble();
                ba.deposit(di);
            }
            else if (b==3) {
                System.out.println("Enter amount to withdraw");
                double w=sc.nextDouble();
                try{
                    if ((ba.balance - w)>0) {
                        ba.withDraw(w);
                    }
                    else {
                        double a= 0/0;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception");
                }
            }
            else {
                System.out.println("wrong input");
            }
        }
    }
}
