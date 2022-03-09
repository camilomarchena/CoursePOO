class Uberx extends Car {

    String brand;
    String model;
    
    public Uberx(String licence, Account driver, String brand, String model){
        super(licence,driver);
        this.brand = brand;
        this.model = model;

    }
    @Override
    void printCar() {
        super.printCar();
        System.out.println(
                "Modelo: " + model + " Brand: " + brand);
    }

}
