class Main{
    public static void main(String[] args) {
    Uberx uberx = new Uberx("POD29E",new Account("Camilo" , "POD29E"),"Kia","Sportage");
    uberx.setPassenger(4);
    uberx.printCar();

    Ubervan ubervan = new Ubervan("DUR014", new Account("Camilo", "POD29E"));
    ubervan.setPassenger(6);
    ubervan.printCar();

    } 
} 