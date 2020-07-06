import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;
    Integer passengers;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }

    @Override
    public void printDataCar() {
        super.printDataCar();
    }

    @Override
    public Integer getPassengers() {
        return super.getPassengers();
    }

    @Override
    public void setPassengers(Integer passengers) {
        if (passengers < 6) {
            System.out.println("el auot bede de tener minimo 6 pasajeros.");
        } else {
            this.passengers=passengers; 
        }
    }

    
    

}