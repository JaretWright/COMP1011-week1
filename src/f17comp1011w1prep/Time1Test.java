package f17comp1011w1prep;

/**
 *
 * @author jwright
 */
public class Time1Test {
    
    public static void main(String[] args)
    {
        //call the time1 constructor
        Time1 time = new Time1(15,30,00);
        
        System.out.printf("The time in military time is %s.%n",time.toUniversalString());
        System.out.printf("The time in standard time is %s.%n",time.toString());
        
        try {
            time.setTime(25, 0, 0);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("The exception was: %s%n", e.getMessage());
        }
        
        
        try {
            time.setTime(23, -1, 0);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("The exception was: %s%n", e.getMessage());
        }
        
        
        try {
            time.setTime(23, 0, 60);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("The exception was: %s%n", e.getMessage());
        }
    }
    
    
}
