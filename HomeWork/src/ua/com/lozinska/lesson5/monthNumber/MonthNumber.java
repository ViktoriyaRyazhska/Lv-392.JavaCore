package ua.com.lozinska.lesson5.monthNumber;

public class MonthNumber {
    static int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   static int monthNumber (int monthNum){
       if ((monthNum>=1)&&(monthNum<=12)){
        return month_days[monthNum-1];}
       else return -1;

    }

}

