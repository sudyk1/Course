package com.example.oop.basics.inner_class;

class CarObj {
    private String modelName;
    private String manufacturer;
    private int year;

    public static class CarObjBuilder {
        private CarObj car = new CarObj();
        public CarObjBuilder setModelName(String modelName) {
            car.modelName = modelName;
            return this;
        }
        public CarObjBuilder setManufacturer(String manufacturer) {
            car.manufacturer = manufacturer;
            return this;
        }
        public CarObjBuilder setYear(int year) {
            car.year = year;
            return this;
        }
        public CarObj getCar() {
            return this.car;
        }
    }

    private CarObj(){}

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObj{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}


public class PublicStaticInnerClass {
    public static void main(String[] args) {

        CarObj car = new CarObj.CarObjBuilder()
                .setModelName("TT")
                .setManufacturer("Audi")
                .setYear(2006)
                .getCar();

        System.out.println(car);
    }
}
