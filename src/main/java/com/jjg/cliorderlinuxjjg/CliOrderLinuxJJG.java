/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.jjg.cliorderlinuxjjg;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juljimgar
 */
public class CliOrderLinuxJJG {

    private static boolean Order;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_ERROR = "\u001B[31m";
    public static final String ANSI_YELLOW_ANSWER = "\u001B[33m";
    public static final String ANSI_GREEN_DEFAULT = "\u001B[32m";

    public static void main(String[] args) {
        int choice;
        String choiceX;
        Scanner scanner = new Scanner(System.in);

        java.util.Date date = null;
        String takeOrRest = "";
        int tableNumber = 0;
        String customerName = "";
        String emailCustomer = "";
        String customerComments = "";
        Double grandTotal = 0.0;
        String paymentCustomer = "";
        int tipping = 0;
        String request = "";
        
       String os = System.getProperty("os.name").toLowerCase();
        
        if (os.contains("win")) {
            System.out.println("Operating System (OS): Microsoft Windows");
        } else if (os.contains("nix") || os.contains("nux")) {
            System.out.println(ANSI_GREEN_DEFAULT + "Operating System (OS): Linux or Unix" + ANSI_RESET);
        } else if (os.contains("mac")) {
            System.out.println("Operating System (OS): macOS");
        } else {
            System.out.println("Unknown computer operating system (OS)");
        }

        try {

            do {
                System.out.println( ANSI_GREEN_DEFAULT + "Welcome to the Application!!!" + ANSI_RESET);
                System.out.println( ANSI_GREEN_DEFAULT + "\nMenu:" + ANSI_RESET);
                System.out.println("1. Set Date and Time");
                System.out.println("2. Set Take in restaurant or takeaway");
                System.out.println("3. Set Table number");
                System.out.println("4. Set Full Customer name");
                System.out.println("5. Set Email Customer");
                System.out.println("6. Set Customer comments");
                System.out.println("7. Set Grand Total");
                System.out.println("8. Set Payment method");
                System.out.println("9. Set Tipping");
                System.out.println("10. Set Request");
                System.out.println("11. Exit");
                System.out.print("Select an option: ");

                choiceX = scanner.nextLine();
                if (choiceX.toLowerCase().equals("x")) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Thanks for using this application!!!");
                    break;
                } else if (choiceX.toLowerCase().equals("a")) {
                    System.out.println("Developer Name: Julian Jimenez Garcia");
                    System.out.println("App Name: CliOderLinuxJJG");
                    System.out.println("Version: 1.0");
                    break;
                }else{
                    System.out.println("ERROR");
                }


                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        long millis = System.currentTimeMillis();
                        date = new java.util.Date(millis);
                        System.out.println("Date and Time set: " + date);
                        break;
                    case 2:
                        System.out.print("Take in restaurant or takeaway ('takeaway' or 'takerest'): ");
                        takeOrRest = scanner.nextLine();
                        if (!(takeOrRest.equals("takeaway") || takeOrRest.equals("takearest"))) {
                            System.out.println("Select takeway or takerest please...");
                        }
                        System.out.println("Your selection " + takeOrRest);
                        break;
                    case 3:
                        System.out.print("Table number: ");
                        tableNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (!(tableNumber <= 50)) {
                            System.out.println("Select a range 1 to 50 please...");
                        }
                        break;
                    case 4:
                        System.out.print("Full Customer name: ");
                        customerName = scanner.nextLine();
                        break;
                    case 5:
                        System.out.print("Email Customer: ");
                        emailCustomer = scanner.nextLine();

                        if (isValidEmail(emailCustomer)) {
                            System.out.println("Valid email address");
                        } else {
                            if (emailCustomer.length() == 0) {
                                System.out.println("Blank email address");
                            } else {
                                System.out.println("Invalid email address");
                            }
                        }
                        break;
                    case 6:
                        System.out.print("Customer comments: ");
                        customerComments = scanner.nextLine();
                        break;
                    case 7:
                        System.out.print("Grand Total: ");
                        grandTotal = scanner.nextDouble();
                        scanner.nextLine();
                        break;
                    case 8:
                        System.out.print("Payment method (in cash or by credit card 'cash' or 'card'): ");
                        paymentCustomer = scanner.nextLine();
                        if (!(paymentCustomer.equals("cash") || paymentCustomer.equals("card"))) {
                            System.out.println("Invalid payment method");
                        }
                        break;
                    case 9:
                        System.out.print("Tipping: 5%,10%, 15% or 20%");
                        tipping = scanner.nextInt();
                        scanner.nextLine();
                        if (!((tipping <= 5) && tipping >= 10 && tipping <= 15 && tipping <= 20)) {

                        }
                        break;
                    case 10:
                        System.out.print("Request (yes/no): ");
                        request = scanner.nextLine();
                        break;
                    case 11:
                        System.out.println("Exiting the input menu.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (choice != 11);


        } catch (NumberFormatException numberFormatException) {
            System.out.println("Invalid data input. Please try again.");
        }

    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
