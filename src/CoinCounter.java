import java.util.Scanner;

public class CoinCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your amount ");
        int amount = in.nextInt();
        System.out.println("Your amount is "+amount);

        int twoEiro;
        int oneEiro;
        int fiftyCent;
        int twentyCent;
        int tenCent;
        int fiveCent;
        int twoCent;
        int oneCent;
        int balance;

        balance=amount%200;
            if (amount / 200 >= 1) {
                twoEiro = amount / 200;
                System.out.println("You will get 2 eiro coins: " + twoEiro);
                           }
            if (balance/100>=1){
                oneEiro=balance/100;
                balance=balance-100*oneEiro;
                System.out.println("You will get 1 eiro coins: " + oneEiro);
            }

            if (balance/50>=1){
                fiftyCent=balance/50;
                balance=balance-50*fiftyCent;
                System.out.println("You will get fifty cent coins: "+fiftyCent);
            }

            if (balance/20>=1){
                twentyCent=balance/20;
                balance=balance-20*twentyCent;
                System.out.println("You will get twenty cent coins: "+twentyCent);
            }

            if (balance/10>=1){
                tenCent=balance/10;
                balance = balance-10*tenCent;
                System.out.println("You will get ten cent coins: "+tenCent);
            }

            if (balance/5>=1){
                fiveCent=balance/5;
                balance = balance-5*fiveCent;
                System.out.println("You will get five cent coins: "+fiveCent);
            }
             if (balance/2>=1){
               twoCent=balance/2;
               balance = balance-2*twoCent;
               System.out.println("You will get two cent coins: "+twoCent);
             }
             if (balance/1>=1){
                oneCent=balance/1;
               balance = balance-oneCent;
              System.out.println("You will get one cent coins: "+oneCent);
              }
                }
            }
