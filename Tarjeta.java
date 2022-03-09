class Tarjeta extends Payment {

    Integer number;
    Integer cvv;
    Integer date;

    public Tarjeta(Integer id, Integer number, Integer cvv, Integer date){ //constructor
        super(id); //super clase
        this.number = number;
        this.cvv = cvv;
        this.date = date; 
    }
    

    
}
