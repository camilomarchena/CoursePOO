import java.util.Map;
import java.util.ArrayList;

class Ubervan extends Car {

    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    /*public Ubervan(String licence, Account driver,Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String>seatsMaterial){
        super(licence,driver);
        
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    } */
    
    public Ubervan(String licence, Account driver) {
        super(licence, driver);

    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}