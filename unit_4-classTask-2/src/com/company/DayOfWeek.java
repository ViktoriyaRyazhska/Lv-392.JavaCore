package com.company;

public enum DayOfWeek {

    MONDAY("Monday", "Понеділок", "Понедельник"),
    TUESDAY("Tuesday","Вівторок","Вторник"),
    WEDNESDAY("Wednesday", "Середа", "Среда"),
    THURSDAY("Thursday", "Четвер", "Четверг"),
    FRIDAY("Friday", "Пятниця", "Пятница"),
    SATURDAY("Saturday", "Субота", "Суббота"),
    SUNDAY("Sunday", "Неділя", "Воскресенье");

    private final String eng;
    private final String ua;
    private final String rus;

    DayOfWeek(String eng, String ua, String rus){
        this.eng = eng;
        this.ua = ua;
        this.rus = rus;
    }

    public String getEng() {
        return eng;
    }

    public String getUa(){
        return ua;
    }

    public String getRus(){
        return rus;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "eng='" + eng + '\'' +
                ", ua='" + ua + '\'' +
                ", rus='" + rus + '\'' +
                '}';
    }

}
