package com.company.serviseMethods_ERRORS;

/**
 * This class contains fields of wage size for Designer and Developer of different position per hour
 */
public enum PositionMod {

    NONE(0, 0),
    JUNIOR(2, 3),
    JUNIOR_STRONG(3, 4),
    JUNIOR_PRO(4, 5),
    INTERMIDIATE(5, 7),
    INTERMIDIATE_STRONG(6, 10),
    INTERMIDIATE_PRO(9, 15),
    SENIOR(12, 25);

    private final int rageOfHourDesigner;
    private final int rageOfHourDeveloper;

    PositionMod(int rageOfHourDesigner, int rageOfHourDeveloper) {
        this.rageOfHourDeveloper = rageOfHourDesigner;
        this.rageOfHourDesigner = rageOfHourDesigner;
    }

    public int getRageOfHourDeveloper() {
        return rageOfHourDeveloper;
    }

    public int getRageOfHourDesigner() {
        return rageOfHourDesigner;
    }
}
