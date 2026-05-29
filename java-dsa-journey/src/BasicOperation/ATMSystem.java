package BasicOperation;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args){
        System.out.println("1. Deposite Amount ");
        System.out.println("2. withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Exist");

        int amount = 5000;

        System.out.println("choose option");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter deposit amount");
                int deposit = sc.nextInt();
                    if(deposit>0){
                    amount = amount+deposit;
                        System.out.println("Amount Deposited Successfully");
                        System.out.println("current balance "+ amount);
                    }
                    else {
                        System.out.println("Invalid Amount");
                    }

                break;

            case 2:
                System.out.println("Enter withdrawal amount");
                int withdrawal = sc.nextInt();
                if(withdrawal>0){
                    if(withdrawal<=amount){
                        if(withdrawal%100==0){
                            amount = amount-withdrawal;
                            System.out.println("Withdrawal successfully");
                            System.out.println("Remaining Balance" + amount);
                        }
                        else {
                            System.out.println("Amount should be multiple of 100");
                        }
                    }
                    else {
                        System.out.println("Insufficient Balance");
                    }
                }
                else {
                    System.out.println("Invalid Amount");
                }
                break;

            case 3:
                System.out.println("Enter your PIN");
                int PIN = sc.nextInt();
                if(PIN==1234){
                    System.out.println("current Balance " + amount);
                }
                else {
                    System.out.println("wrong PIN");
                }

                break;

            case 4:
                System.out.println("thank you for using ATM");
                break;
            default:
                System.out.println("choose correct option");
        }
    }
}
