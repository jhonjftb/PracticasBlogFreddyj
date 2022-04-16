class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo ");
        Car car = new Car();
        car.license = "FJB879";
        car.driver = "johan sabedra ";
        car.passegenger = 4;
        car.printDataCar();
        System.out.println("Car License: " + car.license);
        
        Car car2 = new  Car();
        car2.license = "RTS362"; 
        car2.driver = "juan seballos";
        car2.passegenger = 5;
        System.out.println("Car License: " + car2.license);

    }
}