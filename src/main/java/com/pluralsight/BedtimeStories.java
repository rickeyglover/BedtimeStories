package com.pluralsight;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class BedtimeStories {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of the story you want.");
        System.out.println("(1)Hansel and Gretel\n(2)Goldilocks\n(3)Mary Had a Little Lamb\n");
        int choice = myScanner.nextInt();
        if (choice ==1){
            readHanselAndGretel();
        }
        else if (choice == 2){
            readGoldilocks();
        }
        else if (choice == 3){
            readMaryHadALittleLamb();
        }
        myScanner.close();
    }

    public static void readHanselAndGretel() {
        try {
            String input;

            FileInputStream fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
            Scanner myScanner = new Scanner(fis);
            int startingNumber = 0;
            while (myScanner.hasNextLine()) {
                startingNumber++;
                input = myScanner.nextLine();
                System.out.println(startingNumber + ": " + input);
            } myScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readGoldilocks() {
        try {
            String input;

            FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");
            Scanner myScanner = new Scanner(fis);
            int startingNumber = 0;
            while (myScanner.hasNextLine()) {
                startingNumber++;
                input = myScanner.nextLine();
                System.out.println(startingNumber + ": " + input);
            } myScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readMaryHadALittleLamb() {
        try {
            String input;

            FileInputStream fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
            Scanner myScanner = new Scanner(fis);
            int startingNumber = 0;
            while (myScanner.hasNextLine()) {
                startingNumber++;
                input = myScanner.nextLine();
                System.out.println(startingNumber + ": " + input);
            }myScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}