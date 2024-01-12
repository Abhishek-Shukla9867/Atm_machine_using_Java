package Java;

import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        int pin = 1234;
        int withdraw, Current_Amt = 10000, Add_Amt;
        int x;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("-***Welcome to ATM_Machine***-\n");
            System.out.println("Enter Pin number: ");
            pin = scanner.nextInt();

            if (pin == 1234) {

                System.out.println("***-Welcome-***");

                System.out.println(" Press 1:Withdraw Amount");
                System.out.println(" Press 2: Add Amount");
                System.out.println(" Press 3: Check Balance");

                x = scanner.nextInt();

                switch (x) {

                    case 1:
                        System.out.println("Enter The Money You Want to Withdraw");
                        withdraw = scanner.nextInt();
                        if (Current_Amt >= withdraw) {

                            System.out.println("Please Collect Amount");

                            Current_Amt = Current_Amt - withdraw;

                            System.out.println("Your Bank  Amount  is Now:-" + Current_Amt);

                        }

                        else {

                            System.out.println("Insufficient Amount");
                        }

                        break;

                    case 2:
                        System.out.println("Enter The Money You Want to Add");

                        Add_Amt = scanner.nextInt();

                        Current_Amt = Current_Amt + Add_Amt;

                        System.out.println("Your Bank  Amount  is Now:-" + Current_Amt);

                        break;

                    case 3:
                        System.out.println("Your Current Amount :-" + Current_Amt);
                        Current_Amt = scanner.nextInt();

                }

            }

            else {
                System.out.println("Invalid Pin");
            }

        }
    }
}
