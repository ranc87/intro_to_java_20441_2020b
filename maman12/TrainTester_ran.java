public class TrainTester {
    public static void main(String[] args) {
        System.out.println("********** Test Train - Started **********");
        System.out.println("\n1. Testing Constructors and toString:");
        // test concstructor with 7 parameters and toString
        Train tr1 = new Train("Paris", 12, 30, 90, 70, 100, 10);
        System.out.println("\tTrain 1: " + tr1);
        // test copy concstructor
        Train tr2 = new Train(tr1);
        System.out.println("\tTrain 2: " + tr2);
        // test concstructor with 7 parameters and toString
        Train tr3 = new Train("{duration = -6, pass = 150,seats =  10 ,price = 10} ", 12, 30, -6, 150,   10, 10);
        Train tr4 = new Train("{h=25,duration = 90, pass = 70 ,seats = 100 ,price = 10}",  25, 30, 90, 70,   100, 10);
        Train tr5 = new Train("{m=65,duration = 90, pass = 70 ,seats = -10 ,price = 10}",  12, 65, 90, 70,   -10, 10);
        Train tr6 = new Train("{m=-30,duration = 90, pass = 70 ,seats =  10 ,price = 10}", 12, -30, 90, 70,    10, 10);
        Train tr7 = new Train("{h=-12duration = 90, pass = -70 ,seats = 100 , price =-10}", -12, 30, 90, -70, 100, -10);
        Train tst;

        tst = new Train(tr3);
        System.out.println("\tTrain :\t getDestination:" + tst.getDestination() +"\t getDuration:" +tst.getDuration()+ "\t getPassengers:" +tst.getPassengers()+"\t getSeats:" +tst.getSeats()+"\t getPrice:" + tst.getPrice() +"\t getDeparture:" + tst.getDeparture());
        tst = new Train(tr4);
        System.out.println("\tTrain :\t getDestination:" + tst.getDestination() +"\t getDuration:" +tst.getDuration()+ "\t getPassengers:" +tst.getPassengers()+"\t getSeats:" +tst.getSeats()+"\t getPrice:" + tst.getPrice()+"\t getDeparture:" + tst.getDeparture());
        tst = new Train(tr5);
        System.out.println("\tTrain :\t getDestination:" + tst.getDestination() +"\t getDuration:" +tst.getDuration()+ "\t getPassengers:" +tst.getPassengers()+"\t getSeats:" +tst.getSeats()+"\t getPrice:" + tst.getPrice()+"\t getDeparture:" + tst.getDeparture());
        tst = new Train(tr6);
        System.out.println("\tTrain :\t getDestination:" + tst.getDestination() +"\t getDuration:" +tst.getDuration()+ "\t getPassengers:" +tst.getPassengers()+"\t getSeats:" +tst.getSeats()+"\t getPrice:" + tst.getPrice()+"\t getDeparture:" + tst.getDeparture());
        tst = new Train(tr7);
        System.out.println("\tTrain :\t getDestination:" + tst.getDestination() +"\t getDuration:" +tst.getDuration()+ "\t getPassengers:" +tst.getPassengers()+"\t getSeats:" +tst.getSeats()+"\t getPrice:" + tst.getPrice()+"\t getDeparture:" + tst.getDeparture());


        System.out.println("\n2. Testing accessors and mutators:");
        // test getters
        System.out.println("\tTrain 1 destination: " + tr1.getDestination());
        System.out.println("\tTrain 1 departure: " + tr1.getDeparture());
        System.out.println("\tTrain 1 duration: " + tr1.getDuration());
        System.out.println("\tTrain 1 passengers: " + tr1.getPassengers());
        System.out.println("\tTrain 1 seats: " + tr1.getSeats());
        System.out.println("\tTrain 1 price: " + tr1.getPrice());

        // test setters
        System.out.println("");
        System.out.println("**** test setters **** ");
        tr7.setDestination("London");
        tst = new Train(tr7);
        System.out.println("\tTrain :\t getDestination: " + tst.getDestination());

        System.out.println("\tbefore Departure : " + tst.getDeparture());
        tst.setDeparture(new Time1(-17, 15));  // -17 become 0 and that is valid
        System.out.println("");
        System.out.println("\tDeparture : set (-17, 15) :\t get: " + tst.getDeparture());
        tst.setDeparture(new Time1(17, 15));
        System.out.println("\tDeparture : set (17, 15) :\t get: " + tst.getDeparture());
        System.out.println("");

        System.out.println("\tbefore Duration : " + tst.getDuration());
        tst.setDuration(10);
        System.out.println("\tDuration : set (10) :\t get: " + tst.getDuration());
        tst.setDuration(0);
        System.out.println("\tDuration : set (0) :\t get: " + tst.getDuration());
        tst.setDuration(-10);
        System.out.println("\tDuration : set (-0) :\t get: " + tst.getDuration());
        tst.setDuration(360);
        System.out.println("\tDuration : set (360) :\t get: " + tst.getDuration());
        System.out.println("");

        System.out.println("\tbefore Passengers : " + tst.getPassengers());
        System.out.println("\tseats :"+ tst.getSeats());
        tst.setPassengers(-10);
        System.out.println("\tsetPassengers: (-10) : get: " + tst.getPassengers());
        tst.setPassengers(150);
        System.out.println("\tsetPassengers: (150) : get: " + tst.getPassengers());
        tst.setPassengers(0);
        System.out.println("\tsetPassengers: (0)   : get: " + tst.getPassengers());
        tst.setPassengers(80);
        System.out.println("\tsetPassengers: (80)  : get: " + tst.getPassengers());
        System.out.println("");

        System.out.println("\tbefore Seats : " + tst.getSeats());
        System.out.println("\tPassengers :"+ tst.getPassengers());
        tst.setSeats(70);
        System.out.println("\tsetSeats: (70)  : get: " + tst.getSeats() );
        tst.setSeats(85);
        System.out.println("\tsetSeats: (85)  : get: " + tst.getSeats() );
        tst.setSeats(0);
        System.out.println("\tsetSeats: (0)   : get: " + tst.getSeats() );
        tst.setSeats(-10);
        System.out.println("\tsetSeats: (-10)  : get: " + tst.getSeats() );
        tst.setSeats(100);
        System.out.println("\tsetSeats: (100)  : get: " + tst.getSeats() );
        System.out.println("");

        System.out.println("\tbefore Price: " + tst.getPrice());
        tst.setPrice(50);
        System.out.println("\tsetPrice: (50)  : get: " + tst.getPrice() );
        tst.setPrice(-50);
        System.out.println("\tsetPrice: (-50)  : get: " + tst.getPrice() );
        tst.setPrice(0);
        System.out.println("\tsetPrice: (0)  : get: " + tst.getPrice() );
        tst.setPrice(100);
        System.out.println("\tsetPrice: (100)  : get: " + tst.getPrice() );
        System.out.println("End setters \n");



        System.out.println("\n3. Testing equal method:");
        Train tst1 = new Train("same", 12, 30, 60, 25,   50, 10);
        Train tst2 = new Train("same",  12, 30, 61, 41,   50, 11);
        Train tst3 = new Train("not same",  12, 30, 60, 40,   50, 10);
        Train tst4 = new Train("same",  12, 31, 60, 40,   50, 10);
        Train tst5 = new Train("same",  13, 30, 60, 40,   50, 10);
        Train tst6 = new Train("same",  12, 30, 61, 40,   51, 10);

        System.out.println("\t t1: " + tst1.getDestination()+"/" +tst1.getSeats()+"/"+tst1.getDeparture()+"\t t2: "
                + tst2.getDestination()+"/" +tst2.getSeats()+"/"+tst2.getDeparture()+" is equal? \t"
                + tst1.equals(tst2) + " " +tst2.equals(tst1));

        tst2 = new Train(tst3);
        System.out.println("\t t1: "
                + tst1.getDestination()+"/" +tst1.getSeats()+"/"+tst1.getDeparture()+"\t t2: "
                + tst2.getDestination()+"/" +tst2.getSeats()+"/"+tst2.getDeparture()+" is equal? \t"
                + tst1.equals(tst2) + " " +tst2.equals(tst1));

        tst2 = new Train(tst4);
        System.out.println("\t t1: "
                + tst1.getDestination()+"/" +tst1.getSeats()+"/"+tst1.getDeparture()+"\t t2: "
                + tst2.getDestination()+"/" +tst2.getSeats()+"/"+tst2.getDeparture()+" is equal? \t"
                + tst1.equals(tst2) + " " +tst2.equals(tst1));

        tst2 = new Train(tst5);
        System.out.println("\t t1: "
                + tst1.getDestination()+"/" +tst1.getSeats()+"/"+tst1.getDeparture()+"\t t2: "
                + tst2.getDestination()+"/" +tst2.getSeats()+"/"+tst2.getDeparture()+" is equal? \t"
                + tst1.equals(tst2) + " " +tst2.equals(tst1));

        tst2 = new Train(tst6);
        System.out.println("\t t1: "
                + tst1.getDestination()+"/" +tst1.getSeats()+"/"+tst1.getDeparture()+"\t t2: "
                + tst2.getDestination()+"/" +tst2.getSeats()+"/"+tst2.getDeparture()+" is equal? \t"
                + tst1.equals(tst2) + " " +tst2.equals(tst1));
        tst2 = new Train(tst1);
        System.out.println("\t t1: "
                + tst1.getDestination()+"/" +tst1.getSeats()+"/"+tst1.getDeparture()+"\t t2: "
                + tst2.getDestination()+"/" +tst2.getSeats()+"/"+tst2.getDeparture()+" is equal? \t"
                + tst1.equals(tst2) + " " +tst2.equals(tst1));
        System.out.println("End equals \n");


        System.out.println("\n4. Testing getArrivalTime method:");
        tst1 = new Train("same", 0, 0, 60, 25,   50, 10);
        tst2 = new Train("same", 23, 59, 61, 25,   50, 10);
        tst3 = new Train("same", 0, 0, 48*60, 25,   50, 10);
        tst4 = new Train("same", 0, 30, 60, 25,   50, 10);
        tst5 = new Train("same", 13, 24, 46, 25,   50, 10);


        System.out.println("Departure at: " + tst1.getDeparture() +" Duration: "+ tst1.getDuration() + " ArrivalTime: " +tst1.getArrivalTime());
        tst1 = new Train(tst2);
        System.out.println("Departure at: " + tst1.getDeparture() +" Duration: "+ tst1.getDuration() + " ArrivalTime: " +tst1.getArrivalTime());
        tst1 = new Train(tst3);
        System.out.println("Departure at: " + tst1.getDeparture() +" Duration: "+ tst1.getDuration() + " ArrivalTime: " +tst1.getArrivalTime());
        tst1 = new Train(tst4);
        System.out.println("Departure at: " + tst1.getDeparture() +" Duration: "+ tst1.getDuration() + " ArrivalTime: " +tst1.getArrivalTime());
        tst1 = new Train(tst5);
        System.out.println("Departure at: " + tst1.getDeparture() +" Duration: "+ tst1.getDuration() + " ArrivalTime: " +tst1.getArrivalTime());
        System.out.println("End getArrivalTime \n");


        System.out.println("\n5. Testing addPassengers method:");
        System.out.println("\tbefore Passengers : " + tst.getPassengers());
        System.out.println("\tseats :"+ tst.getSeats());
        System.out.println("\taddPassengers: (5)     : get: " +tst.addPassengers(5)   +"\t: "+ tst.getPassengers());
        System.out.println("\taddPassengers: (150)   : get: " +tst.addPassengers(150) +"\t: "+ tst.getPassengers());
        System.out.println("\taddPassengers: (-10)   : get: " +tst.addPassengers(-10) +"\t: "+ tst.getPassengers());
        System.out.println("\taddPassengers: (0)     : get: " +tst.addPassengers(0)   +"\t: "+ tst.getPassengers());
        System.out.println("\taddPassengers: (3)     : get: " +tst.addPassengers(3)   +"\t: "+ tst.getPassengers());
        System.out.println("\taddPassengers: (2)     : get: " +tst.addPassengers(2)   +"\t: "+ tst.getPassengers());
        System.out.println("\taddPassengers: (80)    : get: " +tst.addPassengers(80)  +"\t: "+ tst.getPassengers());
        System.out.println("End addPassengers \n");

//
        System.out.println("\n6. Testing isFull method:");
        tst1 = new Train("same", 0, 0, 60, 25,   25, 10);
        tst2 = new Train("same", 0, 0, 60, 25,   50, 20);
        tst3 = new Train("same", 0, 0, 60, 2,   0, 0);

        System.out.println("\tPassengers: " + tst1.getPassengers() + "\tSeats: " + tst1.getSeats() + "\tis full:" + tst1.isFull());
        System.out.println("\tPassengers: " + tst2.getPassengers() + "\tSeats: " + tst2.getSeats() + "\tis full:" + tst2.isFull());
        System.out.println("\tPassengers: " + tst3.getPassengers() + "\tSeats: " + tst3.getSeats() + "\tis full:" + tst3.isFull());
        System.out.println("End isFull \n");

        System.out.println("\n7. Testing isCheaper method:");
        System.out.println("\tis - price1: " + tst1.getPrice() + " < " + "price2: " + tst2.getPrice() + " ?\t  : " + tst1.isCheaper(tst2));
        System.out.println("\tis - price1: " + tst2.getPrice() + " < " + "price2: " + tst1.getPrice() + " ?\t  : " + tst2.isCheaper(tst1));
        System.out.println("\tis - price1: " + tst2.getPrice() + " < " + "price2: " + tst3.getPrice() + " ?\t  : " + tst2.isCheaper(tst3));
        System.out.println("\tis - price1: " + tst3.getPrice() + " < " + "price2: " + tst3.getPrice() + " ?\t  : " + tst3.isCheaper(tst3));
        System.out.println("\tis - price1: " + tst1.getPrice() + " < " + "price2: " + tst1.getPrice() + " ?\t  : " + tst1.isCheaper(tst1));
        System.out.println("End isCheaper \n");


        System.out.println("\n8. Testing totalPrice method:");
        tst1 = new Train("same", 0, 0, 60, 25,   25, 10);
        tst2 = new Train("same", 0, 0, 60, 0,   50, 20);
        tst3 = new Train("same", 0, 0, 60, 20,   150, 0);
        tst4 = new Train("same", 0, 0, 60, 20,   0, 0);

        System.out.println("\tprice: " + tst1.getPrice() + "\tPassengers: " + tst1.getPassengers() + "\t total: " + tst1.totalPrice());
        System.out.println("\tprice: " + tst2.getPrice() + "\tPassengers: " + tst2.getPassengers() + "\t total: " + tst2.totalPrice());
        System.out.println("\tprice: " + tst3.getPrice() + "\tPassengers: " + tst3.getPassengers() + "\t total: " + tst3.totalPrice());
        System.out.println("\tprice: " + tst4.getPrice() + "\tPassengers: " + tst4.getPassengers() + "\t total: " + tst4.totalPrice());
        System.out.println("End totalPrice \n");



        System.out.println("\n9. Testing arrivesEarlier method:");
        tst1 = new Train("same", 0, 0, 60, 25,   25, 10);
        tst2 = new Train("same", 0, 0, 30, 25,   25, 10);
        tst3 = new Train("same", 1, 0, 60, 25,   25, 10);
        tst4 = new Train("same", 0, 1, 60, 25,   25, 10);
        tst5 = new Train("same", 0, 30, 29, 25,   25, 10);
        tst6 = new Train("same", 0, 0, 60, 25,   25, 10);




        System.out.println("\tTrain 1 arrives earlier than Train 2: " + tr1.arrivesEarlier(tr2));
        System.out.println("\tis - arr1: " + tst1.getArrivalTime() + " before " + "arr2: " + tst2.getArrivalTime() + " ?\t  : " + tst1.arrivesEarlier(tst2));
        System.out.println("\tis - arr1: " + tst1.getArrivalTime() + " before " + "arr2: " + tst3.getArrivalTime() + " ?\t  : " + tst1.arrivesEarlier(tst3));
        System.out.println("\tis - arr1: " + tst1.getArrivalTime() + " before " + "arr2: " + tst4.getArrivalTime() + " ?\t  : " + tst1.arrivesEarlier(tst4));
        System.out.println("\tis - arr1: " + tst1.getArrivalTime() + " before " + "arr2: " + tst5.getArrivalTime() + " ?\t  : " + tst1.arrivesEarlier(tst5));
        System.out.println("\tis - arr1: " + tst1.getArrivalTime() + " before " + "arr2: " + tst6.getArrivalTime() + " ?\t  : " + tst1.arrivesEarlier(tst6));
        System.out.println("");
        System.out.println("\tis - arr1: " + tst2.getArrivalTime() + " before " + "arr2: " + tst1.getArrivalTime() + " ?\t  : " + tst2.arrivesEarlier(tst1));
        System.out.println("\tis - arr1: " + tst3.getArrivalTime() + " before " + "arr2: " + tst1.getArrivalTime() + " ?\t  : " + tst3.arrivesEarlier(tst1));
        System.out.println("\tis - arr1: " + tst4.getArrivalTime() + " before " + "arr2: " + tst1.getArrivalTime() + " ?\t  : " + tst4.arrivesEarlier(tst1));
        System.out.println("\tis - arr1: " + tst5.getArrivalTime() + " before " + "arr2: " + tst1.getArrivalTime() + " ?\t  : " + tst5.arrivesEarlier(tst1));
        System.out.println("\tis - arr1: " + tst6.getArrivalTime() + " before " + "arr2: " + tst1.getArrivalTime() + " ?\t  : " + tst6.arrivesEarlier(tst1));


        System.out.println("\n********** Test Train - Finished **********\n");
    }
}
