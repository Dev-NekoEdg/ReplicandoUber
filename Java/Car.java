public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println(
            "License: " + this.license + " - Driver Name: " + this.driver.name
        );        
    }
}


//No sirve...
// no se puede levantar el debugger, ni el intelicense ni ejecutar...