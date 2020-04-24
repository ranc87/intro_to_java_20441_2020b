/**
 * Write a description of class Time2 here.
 *
 * @Guy Goldman
 * @19/04/2020
 */

public class Time2{
    int _minFromMid;

    private final int HOURS_IN_DAY=24;
    private final int MINUTES_IN_HOUR=60;
    private final int MINUTES_IN_DAY=1440;
    private final int DEFAULT_TIME_VAL=0;
    private final int MIN_TWO_DIGIT_VAL=10; //a constant helper to build 4 digit time format if hours \ minutes are 1 digit.
    private final int MAX_HOUR_VAL=23;
    private final int MIN_HOUR_VAL=0;
    private final int MAX_MINUTE_VAL=59;
    private final int MIN_MINUTE_VAL=0;

    public Time2(int h,int m){
        if (h<MIN_HOUR_VAL || h>MAX_HOUR_VAL) 
            h=DEFAULT_TIME_VAL;
        if (m<MIN_MINUTE_VAL || m>MAX_MINUTE_VAL)
            m=DEFAULT_TIME_VAL;
        _minFromMid=h*MINUTES_IN_HOUR+m;
    }

    public Time2(Time2 other){
        this._minFromMid=other._minFromMid; 
    }

    public int getHour(){
        return this._minFromMid/MINUTES_IN_HOUR;
    }

    public int getMinute(){
        return this._minFromMid%MINUTES_IN_HOUR;
    }    

    public void setHour(int num){
        if (num>=MIN_HOUR_VAL && num<=MAX_HOUR_VAL)
            _minFromMid=num*MINUTES_IN_HOUR+getMinute();
    }
    
    public void setMinute(int num){
        if (num>=MIN_MINUTE_VAL && num<=MAX_MINUTE_VAL)
            _minFromMid=num+(getHour()*MINUTES_IN_HOUR);
    }
    
    public int minFromMidnight(){
        return _minFromMid;
    }
    
    public boolean equals(Time2 other){
        return this._minFromMid==other._minFromMid;
    }
    
    public boolean before(Time2 other){
        return this._minFromMid<other._minFromMid;
    }
    
    public boolean after(Time2 other){
        return other.before(this);
    }
    
    public int difference(Time2 other){
        return Math.abs(this._minFromMid-other._minFromMid);
    }
    
    public String toString(){
        int hours=this.getHour();
        int minutes=this.getMinute();
        String t = ""; //an empty string to use for building a time format

        if (hours<MIN_TWO_DIGIT_VAL)
            t+="0";
        t+=hours;
        t+=":";
        if (minutes<MIN_TWO_DIGIT_VAL)
            t+="0";
        t+=minutes;

        return t;
    }
    
    public Time2 addMinutes(int num){
        int newTime = (this.minFromMidnight() + num)%MINUTES_IN_DAY;
        if (newTime<DEFAULT_TIME_VAL)
            newTime+=MINUTES_IN_DAY;

        return new Time2((newTime/MINUTES_IN_HOUR)%HOURS_IN_DAY,newTime%MINUTES_IN_HOUR); 
    }
}