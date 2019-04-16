import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class PracticalTask {
	public static long calculateFactorial(long n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	public static int Numbers() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number: ");
        int n = Integer.parseInt(br.readLine()); 

        int sum = 0;

        for (int i = 0; i < n; i++) {

            Random random = new Random();
            int number = random.nextInt(2);
            System.out.print(number + " ");
            if (number == 1) {
                sum = sum + 1;
            }
        }
		return sum;
        
    }
	  // Return true if the card number is valid 
    public static boolean isValid(long number) 
    { 
       return (getSize(number) >= 13 &&  
               getSize(number) <= 16) &&  
               (prefixMatched(number, 4) ||  
                prefixMatched(number, 5) ||  
                prefixMatched(number, 37) ||  
                prefixMatched(number, 6)) &&  
              ((sumOfDoubleEvenPlace(number) +  
                sumOfOddPlace(number)) % 10 == 0); 
    } 
  
    // Get the result from Step 2 
    public static int sumOfDoubleEvenPlace(long number) 
    { 
        int sum = 0; 
        String num = number + ""; 
        for (int i = getSize(number) - 2; i >= 0; i -= 2)  
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2); 
          
        return sum; 
    } 
  
    // Return this number if it is a single digit, otherwise, 
    // return the sum of the two digits 
    public static int getDigit(int number) 
    { 
        if (number < 9) 
            return number; 
        return number / 10 + number % 10; 
    } 
  
    // Return sum of odd-place digits in number 
    public static int sumOfOddPlace(long number) 
    { 
        int sum = 0; 
        String num = number + ""; 
        for (int i = getSize(number) - 1; i >= 0; i -= 2)  
            sum += Integer.parseInt(num.charAt(i) + "");         
        return sum; 
    } 
  
    // Return true if the digit d is a prefix for number 
    public static boolean prefixMatched(long number, int d) 
    { 
        return getPrefix(number, getSize(d)) == d; 
    } 
  
    // Return the number of digits in d 
    public static int getSize(long d) 
    { 
        String num = d + ""; 
        return num.length(); 
    } 
  
    // Return the first k number of digits from  
    // number. If the number of digits in number 
    // is less than k, return number. 
    public static long getPrefix(long number, int k) 
    { 
        if (getSize(number) > k) { 
            String num = number + ""; 
            return Long.parseLong(num.substring(0, k)); 
        } 
        return number; 
    } 
		
	




	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"1.	Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)");
		System.out.println(
				"2.	Input number and decompose this number into a product of prime numbers with their degrees (e.g. number: 84, result 2^2, 3, 7)");
		System.out.println(
				"3.	Input cost of dollar and sum of money in gryvna. Calculate how many dollars user can buy and change.");
		System.out.println(
				"4.	Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)");
		System.out.println("5.	Input string and check if this string is palindrome (e.g. “ABCCBA”)");
		System.out.println("6.	Input text and calculate number of words in this text");
		System.out.println("7.	Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)");
		System.out.println("8.	Input number in range from 1 to 1 000 000 and output this number in English");
		System.out.println(
				"9.	Write method to return random value 0 or 1. Input number n, call this method n times and calculate how many times were number one");
		System.out.println(
				"10.	Find the number of steps for which you get 1, using the following process: we take any\r\n the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then\r\n multiply by 3 and add 1\r\n"
						+ "");
		System.out.println("");
		System.out.println("Enter number of task from list" + "\n");
		System.out.println("");

		int n = Integer.parseInt(br.readLine());

		switch (n) {

		case 1:
			System.out.println("Enter number...");
			BufferedReader fibonacciBr = new BufferedReader(new InputStreamReader(System.in));

			int m = Integer.parseInt(fibonacciBr.readLine());
			int t1 = 1;
			int t2 = 1;
			System.out.print("First " + n + " terms: ");

			for (int i = 1; i <= m; ++i) {
				System.out.print(t1 + ", ");
				int sum = t1 + t2;
				t1 = t2;
				t2 = sum;
			}
			break;

		case 2:
			BufferedReader task2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Put number: ");
			int number = Integer.parseInt(task2.readLine());

			for (int i = 2; i < number; i++) {
				while (number % i == 0) {
					System.out.println(i + " ");
					number = number / i;
				}
			}
			if (number > 2) {
				System.out.println(number);
			}
			break;
		case 3:
			BufferedReader dollar = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Put dollar cost");
			int dollarCost = Integer.parseInt(dollar.readLine());
			System.out.println("Put hryvna sum");
			int hryvnaSum = Integer.parseInt(dollar.readLine());

			System.out.println("If u change u`r hryvnas to dollar u take " + (hryvnaSum / dollarCost));
			break;
		case 4:
			BufferedReader task4 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Put text: ");

			String s = task4.readLine();
			System.out.println("Vowel Count: " + (s.length() - s.toLowerCase().replaceAll("a|e|i|o|u|", "").length()));

			break;
		case 5:

			String a = "";
			String b = "";
			Scanner sk = new Scanner(System.in);
			System.out.print("Enter the string you want to check:");
			a = sk.nextLine();
			int n1 = a.length();
			for (int i = n1 - 1; i >= 0; i--) {
				b = b + a.charAt(i);
			}
			if (a.equalsIgnoreCase(b)) {
				System.out.println("The string is palindrome.");
			} else {
				System.out.println("The string is not palindrome.");
			}
			break;
		case 6:
			BufferedReader task6 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Put text: ");

			String text = task6.readLine();
			int count = 0;

			if (text.length() != 0) {
				count++;

				for (int i = 0; i < text.length(); i++) {
					if (text.charAt(i) == ' ') {

						count++;
					}
				}
			}

			System.out.println("You put " + count + " words");
			break;
		case 7:

			BufferedReader task7 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Put number: ");
			long n11 = Long.parseLong(task7.readLine());
			System.out.println(calculateFactorial(n11));
			break;
		case 8:
			BufferedReader task8 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Put number in range 1 to 1 000 000");
			int number1 = Integer.parseInt(task8.readLine());
			System.out.println(EnglishNumberToWords.convert(number1));
			break;
		case 9:
			System.out.println("Number of 1 : " + Numbers());

			break;
		case 10:
			System.out.println("Not ready");
			break;
		case 11:
			System.out.println("Put card number please");
			long numberLong222 = Long.parseLong(br.readLine());
			String firstNumber = Long.toString(numberLong222);
			 
//			String str = "1234567890";
			String first4char = firstNumber.substring(0,1);
			int intForFirst4Char = Integer.parseInt(first4char);

	        System.out.println(numberLong222 + " is " +  
	        (isValid(numberLong222) ? "valid" : "invalid"));
	        if(isValid(numberLong222)) {
	        if(intForFirst4Char == 4) {
	        	System.out.println("U put VISA");
	        } else if (intForFirst4Char == 5) {
	        	System.out.println("U put MASTER CARD");
	        } else if (intForFirst4Char == 6) {
	        	System.out.println("U put DISCOVER CARD");
	        } else {
	        	System.out.println("U put AMERICAN EXPRESS CARD");
	        }
	        }
	        break;

		default:
			System.out.println("PLS...Enter correct number of task");
			break;
		}
	}
}

class EnglishNumberToWords {

	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	private EnglishNumberToWords() {
	}

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = numNames[number % 100];
			number /= 100;
		} else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return numNames[number] + " hundred" + soFar;
	}

	public static String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "zero";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int millions = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = convertLessThanOneThousand(billions) + " billion ";
			break;
		default:
			tradBillions = convertLessThanOneThousand(billions) + " billion ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertLessThanOneThousand(millions) + " million ";
			break;
		default:
			tradMillions = convertLessThanOneThousand(millions) + " million ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "one thousand ";
			break;
		default:
			tradHundredThousands = convertLessThanOneThousand(hundredThousands) + " thousand ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result = result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Put number in range 1 to 1 000 000");
		int number = Integer.parseInt(br.readLine());
		System.out.println(EnglishNumberToWords.convert(number));
	}
}

class Task7 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static long calculateFactorial(long n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Put number: ");
		long n1 = Long.parseLong(br.readLine());
		System.out.println(calculateFactorial(n1));

	}

}

class Task11 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Put card number please");
		long numberLong222 = Long.parseLong(br.readLine());
		String firstNumber = Long.toString(numberLong222);
		 
//		String str = "1234567890";
		String first4char = firstNumber.substring(0,1);
		int intForFirst4Char = Integer.parseInt(first4char);

        System.out.println(numberLong222 + " is " +  
        (isValid(numberLong222) ? "valid" : "invalid"));
        if(isValid(numberLong222)) {
        if(intForFirst4Char == 4) {
        	System.out.println("U put VISA");
        } else if (intForFirst4Char == 5) {
        	System.out.println("U put MASTER CARD");
        } else if (intForFirst4Char == 6) {
        	System.out.println("U put DISCOVER CARD");
        } else {
        	System.out.println("U put AMERICAN EXPRESS CARD");
        }
        }
    } 
  
    // Return true if the card number is valid 
    public static boolean isValid(long number) 
    { 
       return (getSize(number) >= 13 &&  
               getSize(number) <= 16) &&  
               (prefixMatched(number, 4) ||  
                prefixMatched(number, 5) ||  
                prefixMatched(number, 37) ||  
                prefixMatched(number, 6)) &&  
              ((sumOfDoubleEvenPlace(number) +  
                sumOfOddPlace(number)) % 10 == 0); 
    } 
  
    // Get the result from Step 2 
    public static int sumOfDoubleEvenPlace(long number) 
    { 
        int sum = 0; 
        String num = number + ""; 
        for (int i = getSize(number) - 2; i >= 0; i -= 2)  
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2); 
          
        return sum; 
    } 
  
    // Return this number if it is a single digit, otherwise, 
    // return the sum of the two digits 
    public static int getDigit(int number) 
    { 
        if (number < 9) 
            return number; 
        return number / 10 + number % 10; 
    } 
  
    // Return sum of odd-place digits in number 
    public static int sumOfOddPlace(long number) 
    { 
        int sum = 0; 
        String num = number + ""; 
        for (int i = getSize(number) - 1; i >= 0; i -= 2)  
            sum += Integer.parseInt(num.charAt(i) + "");         
        return sum; 
    } 
  
    // Return true if the digit d is a prefix for number 
    public static boolean prefixMatched(long number, int d) 
    { 
        return getPrefix(number, getSize(d)) == d; 
    } 
  
    // Return the number of digits in d 
    public static int getSize(long d) 
    { 
        String num = d + ""; 
        return num.length(); 
    } 
  
    // Return the first k number of digits from  
    // number. If the number of digits in number 
    // is less than k, return number. 
    public static long getPrefix(long number, int k) 
    { 
        if (getSize(number) > k) { 
            String num = number + ""; 
            return Long.parseLong(num.substring(0, k)); 
        } 
        return number; 
    } 
		
	}
class Task9 {
	        
	public static int Numbers() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number: ");
        int n = Integer.parseInt(br.readLine()); 

        int sum = 0;

        for (int i = 0; i < n; i++) {

            Random random = new Random();
            int number = random.nextInt(2);
            System.out.print(number + " ");
            if (number == 1) {
                sum = sum + 1;
            }
        }
		return sum;
        
    }
	
	
       
	public static void main(String[] args) throws NumberFormatException, IOException {
	
        System.out.println("Number of 1 : " + Numbers());
       
	}     
}

