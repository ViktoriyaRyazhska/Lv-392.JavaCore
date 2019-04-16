package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter task number, please : ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                int number = Integer.parseInt(br.readLine());
                switch (number) {
                    case 1:
                        System.out.println("Input number and generate Fibonacci sequence " +
                                "(e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
                        Task1.getFibonacciSequense();
                        break;
                    case 2:
                        System.out.println("Input number and decompose this number into a product of prime numbers " +
                                "with their degrees (e.g. number: 84, result 2^2, 3, 7)");
                        Task2.getProductOfPrimeNumbers();
                        break;
                    case 3:
                        System.out.println("Input cost of dollar and sum of money in gryvna. Calculate how many " +
                                "dollars user can buy and change.");
                        Task3.getBuyDollars();
                        break;
                    case 4:
                        System.out.println("Input string and calculate number of loud letters (e.g. word: " +
                                "“My test text”, result: 3)");
                        Task4.getLoudLetters();
                        break;
                    case 5:
                        System.out.println("Input string and check if this string is palindrome (e.g. “ABCCBA”)");
                        Task5.getPalindrome();
                        break;
                    case 6:
                        System.out.println("Input text and calculate number of words in this text");
                        Task6.getNumberOfWords();
                        break;
                    case 7:
                        System.out.println("Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)");
                        Task7.getFuctorial();
                        break;
                    case 8:
                        System.out.println("Input number in range from 1 to 1 000 000 and output this number " +
                                "in English");
                        Task8.getNumberInEnglish();
                        break;
                    case 9:
                        System.out.println("Write method to return random value 0 or 1. Input number n, call this " +
                                "method n times and calculate how many times were number one");
                        Task9.getRandomValue();
                        break;
                    case 10:
                        System.out.println("Find the number of steps for which you get 1, using the following process: we take any\n" +
                                "the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then\n" +
                                "multiply by 3 and add 1");
                        Task10.getStepsNumber();
                        break;
                    case 11:
                        System.out.println("Enter the credit card number from the manufacturer (Visa, MasterCard, " +
                                "American Express, Discover) and check for the correct number (see how credit cards " +
                                "use the checksum)");
                        break;
                    case 12:
                        System.out.println("If we list all the natural numbers below 10 that are multiples of 3 or 5, " +
                                "we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the " +
                                "multiples of 3 or 5 below 1000.");
                        Task12.numbers();
                        break;
                    case 13:
                        System.out.println("2520 is the smallest number that can be divided by each of the numbers from" +
                                " 1 to 10 without\n" +
                                "any remainder. What is the smallest positive number that is evenly divisible by all of the\n" +
                                "numbers from 1 to 20?");
                        break;
                    case 14:
                        System.out.println("In England the currency is made up of pound, £, and pence, p, and there are eight coins in\n" +
                                "general circulation: 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p). It is possible to make £2\n" +
                                "in the following way: 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p. How many different ways can\n" +
                                "£2 be made using any number of coins?");
                        Task14.pounds();
                        break;
                    default:
                        System.out.println("Wrong task number. Must be 1 - 14.");
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}
