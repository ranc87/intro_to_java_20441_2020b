public class Time2StudentTester
{
    public static void main(String [] args) {
        
        System.out.println("\n********** Test Time2 - Started **********\n");
        System.out.println("\n1. Testing Constructors and toString:");
        Time2 t1 = new Time2(17, 45);
        System.out.println("\tt1=" + t1);
        Time2 t2 = new Time2(t1);
        System.out.println("\tt2=" + t2);
        
        System.out.println("\n2. Testing accessors and mutators:");
        t1.setHour(20);
        t1.setMinute(10);
        System.out.println("\tt1=" + t1);
        System.out.println("\tHour   of t1=" + t1.getHour());
        System.out.println("\tMinute of t1=" + t1.getMinute());
        
        System.out.println("\n3. Testing minFromMidnight method:");
        t1 = new Time2(10, 15);
        System.out.println("\tt1=" + t1);
        System.out.println("\tMinutes from midnight of t1=" + t1.minFromMidnight());
       
        System.out.println("\n4. Testing equals method:");
        Time2 t3=new Time2(12, 34);
        Time2 t4=new Time2(23, 45);
        System.out.println("\tt3=" + t3);
        System.out.println("\tt4=" + t4);
        if(t3.equals(t4))
             System.out.println("\tt3 is the same time as t4");
        else 
             System.out.println("\tt3 isn't the same time as t4");
             
        System.out.println("\n5. Testing before method:");
        if(t3.before(t4))
             System.out.println("\tt3 is before t4");        
        else 
             System.out.println("\tt3 isn't before t1");  
             
        System.out.println("\n6. Testing after method:");
        if(t4.after(t3))
             System.out.println("\tt4 is after t3");
        else 
             System.out.println("\tt4 isn't after t3");     
             
        System.out.println("\n7. Testing difference method:");
        t1=new Time2(11, 25);
        t2=new Time2(10, 15);
        System.out.println("\tt1=" + t1);
        System.out.println("\tt2=" + t2);
        System.out.println("\tThe difference in minutes between times t1 and t2 is : "+t1.difference(t2));
        
        System.out.println("\n8. Testing addMinutes method:");
        System.out.println("\tt1=" + t1);
        System.out.println("\tAdding 10 minutes to t1="+t1.addMinutes(10));
        
        System.out.println("\n********** Test Time2 - Finished **********\n");
    
    }
}
