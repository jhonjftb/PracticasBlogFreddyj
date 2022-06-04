class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo ");
        Car car = new Car("FJB879", new Account("juan seballos", "JHF846"));
        car.passegenger = 4;
        car.printDataCar();
       
        
        Car car2 = new Car("FJB879", new Account("juan seballos", "JHF846"));
        car2.passegenger = 5;
        car2.printDataCar();

    }
}