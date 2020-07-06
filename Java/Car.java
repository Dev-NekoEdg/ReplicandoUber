public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public Integer getPassengers() {
        return this.passengers;
    }

    public void setPassengers(Integer passengers) {

        if (passengers < 4) {
            System.out.println("el auot bede de tener minimo 4 pasajeros.");
        } else {
            this.passengers = passengers;
        }

    }

    public void printDataCar() {
        if (passengers == 4) {
            System.out.println("License: " + this.license + " - Driver Name: " + this.driver.name + " - Passengers: "
                    + this.passengers);
        }
    }
}
