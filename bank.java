import java.util.Scanner;

public class bank {
    public static void account_type(int n){
        if (n==1){
            System.out.println("savings account");
        }
        else if (n==2){
            System.out.println("current account");
        }
        else if (n==3){
            System.out.println("business account");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user_name,name="", login="";
        int age=0;
        int balance=0,deposit,withdraw;
        while (true) {
            System.out.println("login :choose 1");
            System.out.println("create an account:choose 2");
            System.out.println("deposit money:choose 3");
            System.out.println("check balance:choose 4");
            System.out.println("withdraw money:choose 5");
            System.out.println("exit :choose 6");

            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Enter account holder name:");
                    user_name=sc.next();
                    if (user_name.equals(login)){
                        System.out.println("login successful...");
                    }
                    else if (name.equals(login)){
                        System.out.println("login successful...");
                    }
                    else {
                        System.out.println("invalid user name");
                    }
                    System.out.println("balance available in this account :"+balance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("enter name");
                    name=sc.next();
                    System.out.println("enter age");
                    age= sc.nextInt();
                    System.out.println("account type");
                    int n1=sc.nextInt();
                    account_type(n1);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("deposit money");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println(deposit+": rupees added successfully");
                    break;

                case 4:
                    System.out.println("check balance");
                    System.out.println("your account balance is:"+balance);
                    break;

                case 5:
                    System.out.println("withdraw money");
                    withdraw=sc.nextInt();
                    if (withdraw<balance) {
                        balance = balance - withdraw;
                    }
                    else {
                        System.out.println("insufficient balance");
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
