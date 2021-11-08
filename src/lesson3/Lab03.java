package lesson3;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        String x = "2hrs and 5 minutes";
        String myPassword = "password123";
        String myStr = "https://google.com";
        String myStrWithNumber = "100 minutes";
        calculateMinutes(x);
        inputPassword(myPassword);
        extractNumberFromString(myStrWithNumber);
        checkURL(myStr);
    }

    private static void extractNumberFromString(String myStrWithNumber) {
        System.out.println("----------- Extract number from String --------");
        char [] dStr = myStrWithNumber.toCharArray();
        System.out.print("Number in string \"" + myStrWithNumber + "\" is: ");
        for (char c : dStr) {
            if(c >= '0' && c <= '9'){
                System.out.print(c);
            }
        }
        System.out.println();
    }

    private static void checkURL(String myStr) {
        System.out.println("--------------Check string " + myStr + " -------");
        String[] aStr = myStr.split("://");
        if (aStr[0].equals("https")) {
            System.out.println("Its HTTPS");
        } else {
            if (aStr[0].equals("http")) {
                System.out.println("Its HTTP");
            }
        }
        String [] cStr = myStr.split("\\.");
        System.out.println("Domain name is: " + cStr[0]);
        if (cStr[1].equals("com")) {
            System.out.println("Its .Com");
        } else {
            if (cStr[1].equals("net")) {
                System.out.println("Its .Com");
            }
        }
    }

    private static void inputPassword(String myPassword) {
        System.out.println("------Input pw 3 times-----");
        for (int i = 1; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input PW " + i + " :");
            String inputPw1 = scanner.next();
            if (myPassword.equals(inputPw1)){
                System.out.println("Correct Password");
                break;
            }else{
                System.out.println("Incorrect Password");
            }

        }

    }

    private static void calculateMinutes(String x) {
        String [] firstPartOfString = x.split("hrs");
        String [] secondPartOfString = firstPartOfString[1].trim().split(" ");

        int numberOfMinutes = (Integer.parseInt(firstPartOfString[0]) * 60) + Integer.parseInt(secondPartOfString[1]);
        System.out.println("Total number of minutes in string is: " + numberOfMinutes);
    }
}
