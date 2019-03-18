package ua.com.lozinska.lesson4.httpError;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input number of HTTP error, please.");
        String er = br.readLine();

        Main.errorNum(er);
    }

    public static HTTP errorNum(String er) {
        if (er.equals("400")) {
            System.out.println("400 " + HTTP.BAD_REQUEST + " error appear.");
            return HTTP.BAD_REQUEST;

        }
        if (er.equals("401")) {
            System.out.println("401 " + HTTP.UNAUTHORIZED + " error appear.");
            return HTTP.UNAUTHORIZED;
        }
        if (er.equals("402")) {
            System.out.println("402 " + HTTP.PAYMENT_REQUIRED + " error appear.");
            return HTTP.PAYMENT_REQUIRED;
        } else System.out.println("Unknown error appeared.");
        return null;

    }
}
