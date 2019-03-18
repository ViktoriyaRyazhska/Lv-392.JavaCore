package homework3;

import java.util.Arrays;
import java.util.Collections;


public class FirstTask {
    /*я не знала як тестувати функції в яких є інпут з клавіатури (тобто я не знатиму що саме введе користувач),
    тому зробила щоб вона приймала ці числа як аргументи а вже в мейні відбувається інпут.
    нижче закоментовано версії функцій де інпут відбувається під час виклику методу.
    */

    public static String rangeNumbers(double n1, double n2, double n3){

        if ((n1 >= -5 && n1 <= 5) && (n2 >= -5 && n2 <= 5) && (n3 >= -5 && n3 <= 5)){
            return "All numbers are in range [-5;5].";
        }
        return "Not all numbers are in range [-5;5].";
    }

    public static String minMaxNumber(int n1, int n2, int n3){

        int max_flag = Collections.max(Arrays.asList(n1, n2, n3));
        int min_flag = Collections.min(Arrays.asList(n1, n2, n3));
        return "Max number = " + max_flag + ", min number = " + min_flag + ".";
    }

    public static String httpErrors(int number){
        switch (number){
            case 400:
                return "" + HTTPErrors.BAD_REQUEST;
            case 401:
                return "" + HTTPErrors.UNAUTHORIZED;
            case 402:
                return "" + HTTPErrors.PAYMENT_REQUIRED;
            case 403:
                return "" + HTTPErrors.FORBIDDEN;
            case 404:
                return "" + HTTPErrors.NOT_FOUND;
            case 405:
                return "" + HTTPErrors.METHOD_NOT_ALLOWED;
        }
        return "No this error";
    }

       /*
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean rangeNumbers()throws IOException {
        System.out.println("Enter three numbers : ");

        for (int i = 0; i < 3; i++){
            double number = Double.parseDouble(br.readLine());

            if (number < -5 || number > 5){
                return false;
                //"Not all numbers are in range [-5;5].";
            }
        }
        return true;
        //"All numbers are in range [-5;5].";
    }

    public static String minMaxNumber()throws IOException{
        System.out.println("Enter three numbers : ");

        int number = Integer.parseInt(br.readLine());

        int max_flag = 0;
        int min_flag = number;

        for (int i = 0; i < 2; i++){
            number = Integer.parseInt(br.readLine());

            if (number > max_flag){
                max_flag = number;
            }else if (number < min_flag){
                min_flag = number;
            }
        }
        return "Max number = " + max_flag + ", min number = " + min_flag + ".";
    }

    public static void httpErrors() throws IOException{
        System.out.println("Enter the number of the error : ");
        Integer number = Integer.parseInt(br.readLine());

        switch (number){
            case 400:
                System.out.println(HTTPErrors.BAD_REQUEST);
                break;
            case 401:
                System.out.println(HTTPErrors.UNAUTHORIZED);
                break;
            case 402:
                System.out.print(HTTPErrors.PAYMENT_REQUIRED);
                break;
            case 403:
                System.out.println(HTTPErrors.FORBIDDEN);
                break;
            case 404:
                System.out.println(HTTPErrors.NOT_FOUND);
                break;
            case 405:
                System.out.println(HTTPErrors.METHOD_NOT_ALLOWED);
                break;
            default:
                System.out.println("No this error");
                break;
        }
    }*/

}