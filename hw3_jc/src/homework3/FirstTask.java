package homework3;


public class FirstTask {

    public static String rangeNumbers(double n1, double n2, double n3){

        if ((n1 >= -5 && n1 <= 5) && (n2 >= -5 && n2 <= 5) && (n3 >= -5 && n3 <= 5)){
            return "All numbers are in range [-5;5].";
        }
        return "Not all numbers are in range [-5;5].";
    }

    public static String minMaxNumber(int n1, int n2, int n3){

        int min_flag = n1;
        int max_flag = n1;

        if (n2 > n1 && n2 > n3){
            max_flag = n2;
        }else if (n3 > n1 && n3 > n2){
            max_flag = n3;
        }else if (n2 < n1 && n2 < n3){
            min_flag = n2;
        }else if (n3 < n1 && n3 < n2){
            min_flag = n3;
        }

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
}
