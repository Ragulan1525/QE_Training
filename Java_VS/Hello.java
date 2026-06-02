class Calculator
{

    int a;
     public int add(int num1,int num2)
     {
        int r = num1+num2;
        return r;
     }

}
public class Hello{
    public static void main(String[] artgs) {

        int num1=3 ;
        int num2 =8;

       // int result=num1+num2;
       // System.out.println(result);

       Calculator calc = new Calculator();

       int result = calc.add(num1,num2);

       System.out.println(result);



    }   
}  