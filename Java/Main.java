class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo en Java");

        //Account account = new Account("Neko Miaunster","123456789");
        UberX uberX = new UberX("XSW123",new Account("Tao Miaunster", "11111111"),"Ford","Fiesta");
        uberX.setPassengers(4);
        uberX.printDataCar();

        // Car carTwo = new Car("DBZ456", new Account("Tao Miaunster", "555851234"));
        // carTwo.printDataCar();
    }
}
