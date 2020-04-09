public class TrainStudentTester
{
    public static void main(String[] args) {
        System.out.println("********** Test Train - Started **********");
        System.out.println("\n1. Testing Constructors and toString:");               
        // test concstructor with 7 parameters and toString
        Train tr1=new Train(new String("Paris"), 12, 30, 90, 70, 100, 10); 
        System.out.println("\tTrain 1: " + tr1);
        // test copy concstructor
        Train tr2 = new Train(tr1);
        System.out.println("\tTrain 2: " + tr2);
        
        System.out.println("\n2. Testing accessors and mutators:");
        // test getters
        System.out.println("\tTrain 1 destination: " + tr1.getDestination());
        System.out.println("\tTrain 1 departure: " + tr1.getDeparture());
        System.out.println("\tTrain 1 duration: " + tr1.getDuration());
        System.out.println("\tTrain 1 passengers: " + tr1.getPassengers());
        System.out.println("\tTrain 1 seats: " + tr1.getSeats());
        System.out.println("\tTrain 1 price: " + tr1.getPrice());
        
        // test setters   
        tr2.setDestination("London"); 
        tr2.setDeparture(new Time1(17,15)); 
        tr2.setDuration(60);
        tr2.setPassengers(80); 
        tr2.setSeats(200); 
        tr2.setPrice(25);
        System.out.println("\tTrain 2: " + tr2);
        
        System.out.println("\n3. Testing equal method:");
        System.out.println("\tTrain 1: " + tr1);
        System.out.println("\tTrain 2: " + tr2);
        System.out.println("\tTrain 1 is equal to Train 2: " + tr1.equals(tr2));
        
        System.out.println("\n4. Testing getArrivalTime method:");
        System.out.println("\tTrain 1 arrives at " + tr1.getArrivalTime());
        
        System.out.println("\n5. Testing addPassengers method:");
        System.out.println("\tAdding 20 passengers to Train 1 returns "+tr1.addPassengers(20)+
                           ". It now has "+tr1.getPassengers()+" passengers.");
                           
        System.out.println("\n6. Testing isFull method:");
        System.out.println("\tTrain 1 is full: " + tr1.isFull());
        
        System.out.println("\n7. Testing isCheaper method:");
        System.out.println("\tTrain 1 is cheaper than Train 2: " + tr1.isCheaper(tr2));
        
        System.out.println("\n8. Testing totalPrice method:");
        System.out.println("\tTrain 1 total price is: " + tr1.totalPrice());
        
        System.out.println("\n9. Testing arrivesEarlier method:");
        System.out.println("\tTrain 1 arrives earlier than Train 2: " + tr1.arrivesEarlier(tr2));
        
        System.out.println("\n********** Test Train - Finished **********\n");
    }
}
