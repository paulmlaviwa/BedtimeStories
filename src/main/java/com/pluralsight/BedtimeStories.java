package com.pluralsight;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

public class BedtimeStories {
    public static void main(String[] args) {
        String filename;
        int userChoice;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the file number (1, 2 or 3)  of the story you want to read: ");
        System.out.println("(1). Goldilocks");
        System.out.println("(2). Hansel and Gretel");
        System.out.println("(3). Mary Had a Little Lamb");
        userChoice = myScanner.nextInt();

        FileInputStream fis = null;

        if (userChoice == 1) {

            try {
                fis = new FileInputStream("src/main/resources/goldilocks.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()){
                    filename = scanner.nextLine();
                    System.out.println(filename);
                }
                scanner.close();
            } catch (FileNotFoundException e){
                throw new RuntimeException(e);
            }

        } else if (userChoice == 2) {
            try {
                fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()){
                    filename = scanner.nextLine();
                    System.out.println(filename);
                }
                scanner.close();
            } catch (FileNotFoundException e){
                throw new RuntimeException(e);
            }

        } else if (userChoice ==3 ) {
            try {
                fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()){
                    filename = scanner.nextLine();
                    System.out.println(filename);
                }
                scanner.close();
            } catch (FileNotFoundException e){
                throw new RuntimeException(e);
            }
        }else
            System.out.println("Invalid choice. Please choose 1, 2, or 3.");
    }

}