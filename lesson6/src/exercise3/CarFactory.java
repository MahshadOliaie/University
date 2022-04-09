package exercise3;

public class CarFactory {
    public Car getCar(String car){
        if(car.equals("Lamborgini")){
            return new Lamborgini();
        }
        else
            if(car.equals("Tesla")){
                return new Tesla();
            }
            else
                return new Benz();
    }
}
