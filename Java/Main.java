class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo en Java");

        Account account = new Account("Neko Miaunster","123456789");
        Car car = new Car("DBZ743", account);
        car.printDataCar();

        Car carTwo = new Car("DBZ456", new Account("Tao Miaunster", "555851234"));
        carTwo.printDataCar();
    }
}