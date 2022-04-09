package exercise3;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory1= new CarFactory();
        Car car1 = carFactory1.getCar("Lamborgini");
        car1.carDetail();
    }
}
