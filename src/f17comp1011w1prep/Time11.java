package f17comp1011w1prep;

/**
 *
 * @author jwright
 */
public class Time11 {
    private int hour, minutes, seconds;
    
    /**
     * No argument constructor, sets time at 0:00:01
     */
    public Time11()
    {
        setTime(0,0,1);
    }
    
    /**
     * 3 argument constructor
     * @param hour - 0-23
     * @param minutes - 0-59
     * @param seconds - 0-59
     */
    public Time11(int hour, int minutes, int seconds)
    {
        setTime(hour, minutes, seconds);
    }
    
    /**
     * This method validates the arguments and sets the time
     * @param hour - valid inputs 0-23
     * @param minutes - valid inputs 0-59
     * @param seconds - valid inputs 0-59
     */
    public void setTime(int hour, int minutes, int seconds)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23 inclusive");
        if (minutes < 0 || minutes >= 60)
            throw new IllegalArgumentException("Minutes must be 0-59 inclusive");
        if (seconds < 0 || seconds >= 60)
            throw new IllegalArgumentException("Seconds must be 0-59 inclusive");
        
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    /**
     * This method returns a String representing the time on a 24 hour clock
     * @return 
     */
    public String toMilitaryTime()
    {
       return  String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }
    
    /**
     * This method returns time with hours 1-12 and AM/PM information
     * @return 
     */
    public String toStandardTime()
    {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0) || (hour == 12) ? 12 : hour % 12),
                minutes,
                seconds,
                (hour < 12 ? "AM" : "PM"));
    }
    
    
}
