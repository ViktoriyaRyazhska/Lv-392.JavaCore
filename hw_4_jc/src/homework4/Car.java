package homework4;

public class Car {
    private String type;
    private int year;
    private int engine_capacity;

    public Car(String type, int year, int engine_capacity) {
        this.type = type;
        this.year = year;
        this.engine_capacity = engine_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(int engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine_capacity=" + engine_capacity +
                '}';
    }
}
