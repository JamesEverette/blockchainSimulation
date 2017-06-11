package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name for your new blockchain: ");
        String name = scanner.nextLine();
        System.out.println("Enter a difficulty for the " + name + " blockchain: ");
        int difficulty = scanner.nextInt();
        Blockchain bc = new Blockchain(name,difficulty);

        printOptions();
        String input;
        while(true) {
            input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            else {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        bc.startMining();
                        break;
                    case 2:
                        System.out.println("Block count is: " + bc.getBlockCount());
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        break;
                }
                printOptions();
            }
        }
    }
    public static void printOptions(){
        System.out.println("-------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1: Mine");
        System.out.println("2: View block count");
        System.out.println("3: View current block details");
        System.out.println("5: Exit");
        System.out.println("-------------------------------");
    }
}


