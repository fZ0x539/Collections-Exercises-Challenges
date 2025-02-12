package se.lexicon;

public class Car {
    private static int refId = 0;
    private int id;
    private String brand;
    private String model;

    public Car(String brand, String model){
        this.id = ++refId;
        setBrand(brand);
        setModel(model);
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


}
