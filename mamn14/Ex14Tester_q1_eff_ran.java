// *************   remove all print befor running!!!!!!!!!!!!!! ******************


import java.util.Random;
import java.util.Arrays;
public class Ex14Tester_q1_eff_ran {

    public static void main(String[] arr) {
        Random rand = new Random();
        long[] timeScore = new long[20];
        long[] x = new long[20];
        int cnt = 0;
        for (int j = 0; j < 10000; j += 500) {
//            System.out.print(j + "\t");
            int[] arrT = new int[j];
            for (int i = 0; i < arrT.length; i++)
                arrT[i] = i;//( rand.nextInt(90) + 10) ;
            long startTime = System.nanoTime();
            Ex14.win(arrT);
            long stopTime = System.nanoTime();
            x[cnt] = j;
            timeScore[cnt++] = (stopTime - startTime);
        }

        for (int j = 0; j < 20-1; j++)
            System.out.print(x[j] + "\t");
        System.out.println(x[20-1]);
        for (int j = 0; j < 20-1; j++)
            System.out.print(timeScore[j] + "\t");
        System.out.println(timeScore[20-1]);

        System.out.print("\nslope:\t");
        long[] slops1 =new long[20];
        for (int j = 0; j < 20-1; j++) {
            long[] newArray = Arrays.copyOfRange(timeScore, j, timeScore.length);
            long[] newx = Arrays.copyOfRange(x, j, timeScore.length);
            slops1[j] = (long)(getSlope(newx, newArray));
            System.out.print(slops1[j] + "\t");
        }
        System.out.print("\npoly1:\t");
        long[] slops2 =new long[20];
        for (int j = 0; j < 20-1; j++) {
            long[] newArray = Arrays.copyOfRange(slops1, j, timeScore.length);
            long[] newx = Arrays.copyOfRange(x, j, timeScore.length);
            slops2[j] = (long)(getSlope(newx, newArray));
            System.out.print(slops2[j] + "\t");
        }
        long[] slops3 =new long[20];
        System.out.print("\npoly2:\t");
        for (int j = 0; j < 20-1; j++) {
            long[] newArray = Arrays.copyOfRange(slops2, j, timeScore.length);
            long[] newx = Arrays.copyOfRange(x, j, timeScore.length);
            slops3[j] = (long)(getSlope(newx, newArray));
            System.out.print(slops3[j] + "\t");
        }
        long[] slops4 =new long[20];
        System.out.print("\npoly3:\t");
        for (int j = 0; j < 20-1; j++) {
            long[] newArray = Arrays.copyOfRange(slops2, j, timeScore.length);
            long[] newx = Arrays.copyOfRange(x, j, timeScore.length);
            slops4[j] = (long)(getSlope(newx, newArray));
            System.out.print(slops4[j] + "\t");
        }
        System.out.println();

//            int[] myIntArray = {15, 19, 21, 13, 14, 30, 23, 16};
//        Ex14.win(myIntArray);
//
//        long startTime = System.nanoTime();
//        Ex14.win(myIntArray);
//        long stopTime = System.nanoTime();
//        System.out.println("The time :" + (stopTime - startTime));
    }


    public static double getSlope(long[] x_values, long[] y_values) {
        double slope = 0;
        int cntX = x_values.length - 1;
        double xy = 0, sum_x = 0, sum_y = 0, xx = 0;
        for (int i = 0; i < (x_values.length - 1); i++) {
            xy += x_values[i] * y_values[i];
            xx += x_values[i] * x_values[i];
            sum_x += x_values[i];
            sum_y += y_values[i];
        }
        slope = (int)((cntX * xy - sum_x * sum_y) / (cntX * xx - sum_x * sum_x));
        return slope;
    }

}
