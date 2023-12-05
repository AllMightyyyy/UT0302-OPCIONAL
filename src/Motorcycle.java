public class Motorcycle {
    private String brand, model, color;
    private int speed;
    public Motorcycle() {
        this.speed = 0;
    }
    public Motorcycle(String brand,String model,String color) {
        this();
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public Motorcycle(String brand,String model,String color, int speed) {
        this(brand, model, color);
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void accelerate(int increment) {
        this.setSpeed(this.getSpeed() + increment);
        System.out.println("the speed of the motorcycle is now : " + this.getSpeed() + " KM/H");
    }
    public void brake(int decrement) {
        this.setSpeed(this.getSpeed() - decrement);
        System.out.println("the speed of the motorcycle is now : " + this.getSpeed() + " KM/H");
    }
    public String getInformation() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", Current speed=" + speed + " KM/H" + '\'' +
                '}';
    }
}
