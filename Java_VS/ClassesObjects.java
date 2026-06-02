class Gymbro
{

    int biceps;
    int chest;
    int leg;

    public void gym()
    {
        System.out.println("No of sets in biceps :"+biceps);
        System.out.println("No of sets in chest :"+chest);
        System.out.println("No of sets in leg :"+leg);

    }
}


public class ClassesObjects{

    public static void main (String[]args)
    {
        Gymbro mysets = new Gymbro();
        mysets.biceps=4;
        mysets.chest=7;
        mysets.leg=3;
        
        mysets.gym();


    }
}