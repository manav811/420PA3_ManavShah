package Assignment;

public class Car { private String model;
    private int year;
    private boolean isElectric;

    public Car(String model, int year, boolean isElectric) {
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return year == car.year &&
                isElectric == car.isElectric &&
                model.equals(car.model);
    }



}
