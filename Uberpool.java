class Uberpool extends Car {

    String brand;
    String model;

    public Uberpool(String licence, Account driver, String brand, String model){
        super(licence,driver);
        this.brand = brand;
        this.model = model;
    }
}
