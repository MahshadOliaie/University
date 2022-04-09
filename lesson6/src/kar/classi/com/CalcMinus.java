package kar.classi.com;

public class CalcMinus implements Calculate{
    @Override
    public float calc(float num1, float num2){
        float min = num1-num2;
        return min;
    }

}
