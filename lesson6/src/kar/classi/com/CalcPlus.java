package kar.classi.com;

public class CalcPlus implements Calculate{
    @Override
    public float calc(float num1, float num2){
        float sum = num1+num2;
        return sum;
    }
}
