
class Driver extends Account {

    String name;
    String document;
    Car car;

    public Driver(String name, String document, Car car) {
        super(name, document);
        this.car = car;
    }

}