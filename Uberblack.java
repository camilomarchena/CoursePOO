import java.util.Map;
import java.util.ArrayList;

class Uberblack extends Car{

    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public Uberblack(String licence, Account driver,Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String>seatsMaterial){
        super(licence,driver);
        
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
    
    
}
