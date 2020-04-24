/**
 * This class represents time - hours:minutes
 * 
 * Author : Guy Goldman
 * Date : 23/4/2020
 * Version : 1.0
 */

public class Time1{
    //instance variables
    private int _hour;
    private int _minute;
    private final int HOURS_IN_DAY=24;
    private final int MINUTES_IN_HOUR=60;
    private final int MINUTES_IN_DAY=1440;
    private final int DEFAULT_TIME_VAL=0;
    private final int MIN_TWO_DIGIT_VAL=10; //a constant helper to build 4 digit time format if hours \ minutes are 1 digit.
    private final int MAX_HOUR_VAL=23;
    private final int MIN_HOUR_VAL=0;
    private final int MAX_MINUTE_VAL=59;
    private final int MIN_MINUTE_VAL=0;

    /**
     * Constructs a Time1 object. 
     * Construct a new time instance with the specified hour and minute . 
     * hour should be between 0-23, otherwise it should be set to 0. 
     * minute should be between 0-59, otherwise it should be set to 0.
     * @param h the hour of the time
     * @param m the minute of the time
     */
    public Time1 (int h, int m){
        _hour=(h<MIN_HOUR_VAL || h>MAX_HOUR_VAL)?DEFAULT_TIME_VAL:h;
        _minute=(m<MIN_MINUTE_VAL || m>MAX_MINUTE_VAL)?DEFAULT_TIME_VAL:m;
    }

    /**
     * Copy constructor for Time1. Construct a time with the same instance variables as another time.
     * @param t The time object from  which to construct the new time
     */
    public Time1(Time1 t){
        this._hour=t._hour;
        this._minute=t._minute;
    }

    /**
     * Returns the hour of the time.
     * @return The hour of the time
     */
    public int getHour(){
        return _hour;
    }    

    /**
     * Returns the minute of the time.
     * @return The minute of the time
     */
    public int getMinute(){
        return _minute;
    }

    /**
     * Changes the hour of the time.
     * If illegal number is received hour will remain  unchanged.
     * @param num The new hour 
     */
    public void setHour(int num){
        if (num>=MIN_HOUR_VAL && num<=MAX_HOUR_VAL)
            _hour=num;
    }

    /**
     * Changes the minute of the time.
     * If illegal number is received minute will remain unchanged.
     * @param num The new minute 
     */
    public void setMinute(int num){
        if (num>=MIN_MINUTE_VAL && num<=MAX_MINUTE_VAL)
            _minute=num;
    }

    /**
     * Returns a string representation of this time (""hh:mm"").
     * @return String representation of this time (""hh:mm"").
     */
    public String toString(){
        String t = ""; //an empty string to use for building a time format

        if (_hour<MIN_TWO_DIGIT_VAL)
            t+="0";
        t+=_hour;
        t+=":";
        if (_minute<MIN_TWO_DIGIT_VAL)
            t+="0";
        t+=_minute;

        return t;
    }

    /**
     * Return the amount of minutes since midnight.
     * @return amount of minutes since midnight.
     */
    public int minFromMidnight(){
        return _hour * MINUTES_IN_HOUR + _minute;
    }

    /**
     * Checks if the received time is equal to this time.
     * @param other The time to be compared with this time
     * @return true if the received time is equal to this time
     */
    public boolean equals(Time1 other){
        return (this._hour==other._hour && this._minute==other._minute);
    }

    /**
     * Checks if this time is before a received time.
     * @param other The time to check if this time is before
     * @return true if this time is before other time
     */
    public boolean before(Time1 other){
        return (this.minFromMidnight()<other.minFromMidnight());
    }

    /**
     * Checks if this time is after a received time.
     * @param other The time to check if this time is after
     * @return true if this time is after other time
     */
    public boolean after(Time1 other){
        return other.before(this);
    }

    /**
     * Calculates the difference (in minutes) between two times. 
     * Assumption: this time is after other time.
     * @param other The time to check the difference to.
     * @return int difference in minutes
     */
    public int difference(Time1 other){
        return (this.minFromMidnight()-other.minFromMidnight());
    }

    /**
     * Adds num Minutes to time.
     * @param num The number of minutes to add
     * @return the update time
     */ 
    public Time1 addMinutes(int num){
        int newTime = (this.minFromMidnight() + num)%MINUTES_IN_DAY;
        if (newTime<DEFAULT_TIME_VAL)
            newTime+=MINUTES_IN_DAY;

        return new Time1((newTime/MINUTES_IN_HOUR)%HOURS_IN_DAY,newTime%MINUTES_IN_HOUR); 
    }
}

