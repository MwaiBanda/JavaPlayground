package DesignPatterns.Builder;

public class Car {
    private final String make; // required
    private final String model; // required
    private final String color; // optional
    private final int year; // optional
    private final String license; // optional

    public Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.license = builder.license;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getLicense() {
        return license;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public static class  Builder {
        private final String make; // required
        private final String model; // required
        private String color; // optional
        private int year; // optional
        private String license; // optional

        public Builder(String make, String model) {
            this.make = make;
            this.model = model;
        }
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        public Car build() {
            Car car =  new Car(this);
            validateCarObject(car);
            return car;
        }
        private void validateCarObject(Car car) {

        }
    }
}
