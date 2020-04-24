/**
 * This class represents a Train.
 * 
 * Author : Guy Goldman
 * Date : 20/4/2020
 * Version : 1.0
 */ 

public class Train{
    //instance variables
    private String _destination;
    private Time1 _departure;
    private int _duration; //duration of train ride in *minutes*
    private int _passengers; 
    private int _seats; 
    private int _price; 
    private final int DEFAULT_DURATION=0;
    private final int DEFAULT_SEAT_AMOUNT=0;
    private final int DEFAULT_PASS_AMOUNT=0; //default passenger amount
    private final int DEFAULT_PRICE_AMOUNT=0;
    private final int MINUTES_IN_HOUR=60;

    /**
     * Constructor of class Train. 
     * Constructs a new train. 
     * duration should be positive, otherwise it should be set to 0. 
     * pass should be positive, otherwise it should be set to 0. 
     * pass should be less than seats otherwise it should be set to seats. 
     * seats should be positive, otherwise it should be set to 0. 
     * price should be positive, otherwise it should be set to 0.
     * @param dest the destination of the train
     * @param h the hour of departure.
     * @param m the minute of departue.
     * @param duration the duration of the travel.
     * @param pass the number of passeners.
     * @param seats the number of seats in the train.
     * @param price the price of the travel.
     */      
    public Train(String dest,int h, int m, int duration, int pass, int seats, int price){
        _destination=dest;
        _departure = new Time1(h,m);

        if (seats>0)
            _seats=seats;
        else    
            _seats=DEFAULT_SEAT_AMOUNT;

        if (pass>0 && pass<seats)
            _passengers=pass;
        else if (pass>=seats)
            _passengers=_seats;
        else
            _passengers=DEFAULT_PASS_AMOUNT;

        if (duration>DEFAULT_DURATION)
            _duration=duration;
        else
            _duration=DEFAULT_DURATION;

        if (price>DEFAULT_PRICE_AMOUNT)
            _price=price;
        else
            _price=DEFAULT_PRICE_AMOUNT;
    }

    /**
     * Copy constructor for Train.
     * Construct a train with the same instance variables as another train.
     * @param other The train object from which to construct the new train.
     */   
    public Train(Train other){
        this._destination=other._destination;
        this._departure=new Time1(other._departure);
        this._duration=other._duration;
        this._passengers=other._passengers;
        this._seats=other._seats;
        this._price=other._price;
    }

    /**
     * Returns the arrival time.
     * @return the arrival time.
     */
    public Time1 getArrivalTime(){
        return new Time1(this._departure.addMinutes(_duration));
    }

    /**
     * returns the departure time.
     * @return the departure time.
     */
    public Time1 getDeparture(){
        return new Time1(_departure);
    }

    /**
     * returns the destination.
     * @return the destination of the train.
     */
    public String getDestination(){
        return _destination;
    }

    /**
     * returns the duration of the train.
     * @return the duration of the train.
     */
    public int getDuration(){
        return this._duration;
    }

    /**
     * returns the number of passengers.
     * @return the number of passengers.
     */
    public int getPassengers(){
        return this._passengers;
    }

    /**
     * returns the price of the train.
     * @return the price of the train.
     */
    public int getPrice(){
        return this._price;
    }

    /**
     * returns the number of seats.
     * @return the number of seats.
     */
    public int getSeats(){
        return this._seats;
    }

    /**
     * updates the departure time of the train.
     * t in not null.
     * @param t the new departure time of the train.
     */
    public void setDeparture(Time1 t){
        this._departure=new Time1(t);
    }

    /**
     * updates the destination of the train.
     * d in not null.
     * @param d the new detination of the train.
     */
    public void setDestination(String d){
        _destination=d;
    }

    /**
     * updates the duration of the train.
     * d should be positive or zero, otherwise duration is unchanged.
     * @param d the new duration of the train.
     */
    public void setDuration(int d){
        if (d>=0)
            this._duration=d;
    }

    /**
     * updates the number of passengers.
     * p should be positive or zero, otherwise passengers is unchanged. 
     * p should be less than seats otherwise it should be set to seats.
     * @param p the new number of passengers.
     */
    public void setPassengers(int p){
        if (p>=0 && p<=_seats)
            this._passengers=p;
        if (p>_seats)
            this._passengers=_seats;    
    }

    /**
     * updates the price.
     * p should be positive or zero, otherwise price is unchanged.
     * @param p the new price.
     */
    public void setPrice(int p){
        if (p>=0)
            this._price=p;
    }

    /**
     * updates the number of seats.
     * s should be positive or zero, otherwise seats is unchanged. 
     * s should be larger than passengers, otherwise seats is unchanged.
     * @param s the new number of seats.
     */
    public void setSeats(int s){
        if (s>=0 && s>_passengers)
            this._seats=s;   
    }

    /**
     * Check if the received train is equal to this train.
     * @param other The train to be compared with this train
     * @return true if the received train is equal to this train.
     */
    public boolean equals(Train other){
        return (this._destination.equals(other._destination) && 
            this._departure.equals(other._departure) &&
            this._seats==other._seats);
    }

    /**
     * Add num passengers to the train.
     * @param num The number of passengers to add.
     * @return true if the total number of current passengers and num is less or equal to seats.
     */
    public boolean addPassengers(int num){
        int newPassengers=this._passengers+num;
        if (newPassengers<=_seats){
            this._passengers = newPassengers;
            return true;
        }
        return false;
    }

    /**
     * Returns true if train is full.
     * @return true if train is full.
     */
    public boolean isFull(){
        return this._seats==this._passengers;
    }

    /**
     * Returns true if the price for this train is cheaper than the other train.
     * @param other the other train to compare price with.
     * @return true if the price for this train is cheaper than the other train.
     */
    public boolean isCheaper(Train other){
        if (this._price<other._price)
            return true;
        return false;
    }

    /**
     * Returns the total price for all passengers.
     * @return the total price for all passengers.
     */
    public int totalPrice(){
        return this.getPassengers()*this.getPrice();
    }

    /**
     * Returns true if the arrival time of this train is earlier than the arrival time of the other train. 
     * other is not null.
     * @param other the other train to compare arrival time with.
     * @return true if the arrival time of this train is earlier than arrival time of the other train.
     */
    public boolean arrivesEarlier(Train other){
        return (this.getArrivalTime().before(other.getArrivalTime()));
    }

    /**
     * Return a string representation of the train.
     * @return String representation of the train.
     */
    public String toString(){
        if (_seats==_passengers)
            return ("Train to " +_destination+ " departs at " +_departure+". Train is full.");
        else
            return ("Train to " +_destination+ " departs at " +_departure+". Train is not full.");
    }
}
