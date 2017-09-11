
package f17comp1011w1prep;

/**
 *
 * @author jwright
 */
public class Time1 {
    private int hour, minute, second;
    
    public Time1()
    {
        setTime(0,0,1);
    }
    
    public Time1(int hour, int minute, int second)
    {
        setTime(hour, minute, second);
    }
    
    public Time1(int hour, int minute, int second, String amPM)
    {
        if (amPM.equalsIgnoreCase("AM"))
        {
            if (hour <0 || hour >= 12)
                throw new IllegalArgumentException("If it is AM, hour must be less than 12");
        }
        else if (amPM.equalsIgnoreCase("PM"))
        {
                    
        }
        setTime(hour, minute, second);
    }
    
    

    /**
     * This method validates the arguments and sets the instance variables
     * @param hour 0-23
     * @param minute 0-59
     * @param second 0-59
     */
    public void setTime(int hour, int minute, int second)
    {
        //validate hour, minutes and seconds
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23 inclusive");
        if (minute <0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0-59 inclusive");
        if (second <0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0-59 inclusive");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }   //end of method setTime
    
    
    /**
     * This method will convert the time to military/standard time.  
     * @return - the time on a 24 hour clock
     */
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", 
                ((hour == 0 || hour == 12) ? 12:hour % 12),minute, second,
                 (hour < 12 ? "AM" : "PM"));
    }
}
