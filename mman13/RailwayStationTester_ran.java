/**
 * 2020b - 06/03/2020
 */

import java.util.Random;

public class RailwayStationTester_ran {
    public static void main(String[] args) {

        /*******************************  RailwayStation CLASS TESTER *******************************/
        /***********************************************************************************/
        Random rand = new Random();
        //Check constructor

        System.out.println("1. check addTrain:");
        RailwayStation rs = new RailwayStation();
        RailwayStation rsSmall = new RailwayStation();


        //AddTrain
        Train f11 = new Train("Haifa", 12, 0, 210, 250, 250, 55);
        Train f12 = new Train("Jerusalem", 10, 50, 210, 250, 250, 40);
        Train f13 = new Train("Jerusalem", 10, 50, 210, 250, 250, 40);
        Train f14 = new Train("Jerusalem", 10, 50, 210, 250, 250, 40);


        System.out.println("\t t: \t" + rs.addTrain(f11) + "\t;\t" + f11);
        System.out.println("\t t: \t" + rs.addTrain(f12) + "\t;\t" + f12);
        System.out.println("\t f: \t" + rs.addTrain(f13) + "\t;\t" + f13);
        System.out.println("\t f: \t" + rs.addTrain(f14) + "\t;\t" + f14);


        RailwayStation rs_full = new RailwayStation();
        for (int i = 0; i <= 150; i++)
            rs_full.addTrain(new Train("rio", rand.nextInt(23) + 1, rand.nextInt(59) + 1, 210, 25, (int) (Math.random() * 100) + +35, 55));
        System.out.print("\t f:\t \t");
        System.out.print(rs_full.addTrain(new Train("Not Same", 0, 0, 210, 25, 0, 55)));
        System.out.println("\t;\tAdd one to full RailwayStation\t");

        System.out.println("\n");

        System.out.println("2. check removeTrain:");
        //need to check holes after remove.
        //RemoveTrain
        RailwayStation rs_empty = new RailwayStation();
        System.out.println("\tt:\t regular remove f11:    \t" + rs.removeTrain(f11));
        System.out.print("\tf:\t remove not exist one : \t");
        System.out.println(rs_full.removeTrain(new Train("Not Same", 0, 0, 210, 25, 0, 55)));
        System.out.print("\tf:\t remove when empty :    \t");
        System.out.println(rs_empty.removeTrain(new Train("Not Same", 0, 0, 210, 25, 0, 55)));


        //First Train to Destination
        Train f3a = new Train("Tel-Aviv", 7, 15, 180, 200, 200, 35);
        rs.addTrain(f3a);
        Train f3 = new Train("Tel-Aviv", 11, 35, 180, 100, 200, 35);
        rs.addTrain(f3);

        Train f3b = new Train("Tel-Aviv", 8, 14, 180, 200, 199, 35);

        rs.addTrain(f3b);
        System.out.println();

        System.out.println("3. check firstDepartureToDestination:");

        Time1 t1 = rs.firstDepartureToDestination("Tel-Aviv");
        System.out.println("\t07:15:\tThe first train to Tel-Aviv departs at  \t" + t1);

        Time1 t2 = rs_full.firstDepartureToDestination("Tel-Aviv");
        System.out.println("\tnull:\tThe Destination not there:  \t" + t2);

        Time1 t3 = rs_empty.firstDepartureToDestination("Haifa");
        System.out.println("\tnull:\tThe RailwayStation is empty:  \t" + t3);
        System.out.println();

        //toString
        System.out.println("4. toString:");
        System.out.println("\t empty: \t" + rs_empty);
        System.out.println("" + rs);
        System.out.println();


        //HowMany Full Trains
        System.out.println("5. How Many Full Trains:");
        int x = rs.howManyFullTrains();
        System.out.println("rs_reg: number if Full Trains - " + x);
        System.out.println("rs_empty:   - " + rs_empty.howManyFullTrains());
        System.out.println("rs all available :  - " + rs_full.howManyFullTrains());
        System.out.println();

        //Most Popular Destination
        System.out.println("6. Most Popular Destination:");
        String mostPopular = rs.mostPopularDestination();
        System.out.println("Most Popular Destination - " + mostPopular);
        System.out.println("rs_empty:   - " + rs_empty.mostPopularDestination());
        System.out.println("rs all  rio :  - " + rs_full.mostPopularDestination());
        System.out.println();

        //Most Expensive Ticket
        System.out.println("7. Most Expensive Ticket:");
        Train mostExpensive = rs.mostExpensiveTicket();
        System.out.println("Most Expensive Ticket - " + mostExpensive);
        System.out.println();


        //Longest Train
        System.out.println("8. Longest Train:");
        Train longestTrain = rs.longestTrain();
        System.out.println("Longest Train - " + longestTrain);
        System.out.println("Longest Train when empty - " + rs_empty.longestTrain());


        Train tst1 = new Train("same", 12, 30, 60, 25, 50, 10);
        Train tst2 = new Train("same", 12, 30, 61, 41, 50, 11);
        Train tst3 = new Train("not same", 12, 30, 60, 40, 50, 10);
        Train tst4 = new Train("same", 12, 31, 60, 40, 50, 10);
        Train tst5 = new Train("same", 13, 30, 60, 40, 50, 10);
        Train tst6 = new Train("same", 12, 30, 61, 40, 51, 10);
        rsSmall.addTrain(f11);


    }
}


