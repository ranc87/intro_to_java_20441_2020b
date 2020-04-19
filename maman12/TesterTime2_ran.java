public class Time2Tester
{
    public static void main(String [] args) {

        System.out.println("\n********** Test Time2 - Started **********\n");
        System.out.println("\n1. Testing Constructors and toString:");
        Time2 t1 = new Time2(17, 45);
        System.out.println("\tt1=" + t1);
        Time2 t2 = new Time2(t1);
        System.out.println("\tt2=" + t2);
        Time2 t134 = new Time2(7, 5);
        System.out.println("\tt134=" + t134);

        // if not in range
        Time2 t33 = new Time2(-17, 61);
        System.out.println("\tt33=" + t33);


        System.out.println("\n2. Testing accessors and mutators:");
        t1.setHour(20);
        t1.setMinute(10);
        System.out.println("\tt1=" + t1);
        System.out.println("\tHour   of t1=" + t1.getHour());
        System.out.println("\tMinute of t1=" + t1.getMinute());

        //cheack out of range setters
        System.out.println("\n2. Testing out of range setters:");
        t33.setHour(-20);
        t33.setMinute(65);
        System.out.println("\tt1=" + t33);
        System.out.println("\tHour   of t33=" + t33.getHour());
        System.out.println("\tMinute of t33=" + t33.getMinute());




        System.out.println("\n3. Testing minFromMidnight method:");
        t1 = new Time2(10, 15);
        System.out.println("\tt1=" + t1);
        System.out.println("\tMinutes from midnight of t1=" + t1.minFromMidnight());

        System.out.println("\n3. Testing minFromMidnight method:");
//        t1 = new Time2(0, 15);
        System.out.println("\tt33=" + t33);
        System.out.println("\tMinutes from midnight of t33=" + t33.minFromMidnight());

        System.out.println("\n3. Testing minFromMidnight method:");
        t1 = new Time2(23, 59);
        System.out.println("\tt1=" + t1);
        System.out.println("\tMinutes from midnight of t1=" + t1.minFromMidnight());


        System.out.println("\n4. Testing equals method:");
        Time2 t3=new Time2(12, 34);
        Time2 t4=new Time2(23, 45);
        t33=new Time2(23, 45);
        Time2 t34=new Time2(23, 46);
        Time2 t35=new Time2(22, 45);
        Time2 t36=new Time2(23, 44);

        System.out.println("\tt3=" + t3);
        System.out.println("\tt4=" + t4);
        System.out.println("\tt33=" + t33);
        System.out.println("\tt3=" + t3+" = t4=" + t4+ " ? " + t3.equals(t4) );
        System.out.println("\tt33=" + t33+" = t4=" + t4+ " ? " + t33.equals(t4) );
        System.out.println("\tt34=" + t34+" = t4=" + t4+ " ? " + t34.equals(t4) );
        System.out.println("\tt35=" + t35+" = t4=" + t4+ " ? " + t35.equals(t4) );

        System.out.println("\n5. Testing before method:");
        System.out.println("\tt3=" + t3+" before t4=" + t4+ " ? " + t3.before(t4) );
        System.out.println("\tt33=" + t33+" before t4=" + t4+ " ? " + t33.before(t4) );
        System.out.println("\tt34=" + t34+" before t4=" + t4+ " ? " + t34.before(t4) );
        System.out.println("\tt35=" + t35+" before t4=" + t4+ " ? " + t35.before(t4) );
        System.out.println("\tt35=" + t36+" before t4=" + t4+ " ? " + t36.before(t4) );

        System.out.println("\n6. Testing after method:");
        System.out.println("\tt3=" + t3+" after t4=" + t4+ " ? " + t3.after(t4) );
        System.out.println("\tt33=" + t33+" after t4=" + t4+ " ? " + t33.after(t4) );
        System.out.println("\tt34=" + t34+" after t4=" + t4+ " ? " + t34.after(t4) );
        System.out.println("\tt35=" + t35+" after t4=" + t4+ " ? " + t35.after(t4) );
        System.out.println("\tt35=" + t36+" after t4=" + t4+ " ? " + t36.after(t4) );

        System.out.println("\n\tt3=" + t4+" after t3=" + t3+ " ? " + t4.after(t3) );
        System.out.println("\ttt4=" + t4+" after t33=" + t33+ " ? " + t4.after(t33) );
        System.out.println("\ttt4=" + t4+" after t34=" + t34+ " ? " + t4.after(t34) );
        System.out.println("\ttt4=" + t4+" after t35=" + t35+ " ? " + t4.after(t35) );
        System.out.println("\ttt4=" + t4+" after t36=" + t36+ " ? " + t4.after(t36) );


        System.out.println("\n7. Testing difference method:");
        t1=new Time2(11, 25);
        t2=new Time2(10, 15);
        System.out.println("\tt1=" + t1+"");
        System.out.println("\tt2=" + t2);
        System.out.println("\tThe difference between " + t1 + " and " + t2    +" is : "+ t1.difference(t2)  +" min");
        System.out.println("\tThe difference between " + t4 + " and " + t33   +" is : "+ t4.difference(t33) +" min");
        System.out.println("\tThe difference between " + t4 + " and " + t34   +" is : "+ t4.difference(t34) +" min");
        System.out.println("\tThe difference between " + t4 + " and " + t35   +" is : "+ t4.difference(t35) +" min");
        System.out.println("\tThe difference between " + t4 + " and " + t36   +" is : "+ t4.difference(t36) +" min") ;

        System.out.println("\n8. Testing addMinutes method:");
        System.out.println("\tt1=" + t1);
        System.out.println("\tAdding 10 minutes to t1="+t1.addMinutes(10));
        System.out.println("\tAdding 20 minutes to "+ t4+"= "+t4.addMinutes(20));
        System.out.println("\tAdding 48 hours and -5 min to "+ t4+"= "+t4.addMinutes((48*60)-5));
        System.out.println("\tAdding 48 hours and +5 min to "+ t4+"= "+t4.addMinutes((48*60)+5));
        System.out.println("\tAdding 48 hours to "+ t4+"= "+t4.addMinutes(48*60));
        System.out.println("\tAdding -48 hours to "+ t4+"= "+t4.addMinutes((-48)*60));
        System.out.println("\tAdding -48 hours to "+ t4+"= "+t4.addMinutes((-48)*60));
        t4 = new Time2(0, 05);
        System.out.println("\tAdding -10 minutes to "+ t4+"= "+t4.addMinutes((-10)));
        System.out.println("\tAdding -48 hours and -6 min to "+ t4+"= "+t4.addMinutes((-48)*60 -6));
        System.out.println("\tAdding -48 hours and +6 min to "+ t4+"= "+t4.addMinutes((-48)*60 +6));


        System.out.println("\n********** Test Time2 - Finished **********\n");

    }
}
