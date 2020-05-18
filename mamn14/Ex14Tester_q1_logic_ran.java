public class Ex14Tester_q1_logic_ran {

    public static void main(String[] arr) {
        System.out.println("\n------------------------------------\nTesting Question 1\n------------------------------------\n");
        for (int testNo = 0; testNo < 7; testNo++) {
            int[] coins1 = getArr(testNo);
            printArr(coins1);
            Ex14.win(coins1);
            System.out.println("----- end of test no  " + testNo + "-----");
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("Test for input:  {");
        for (int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ",");
        System.out.println(arr[arr.length - 1] + "}");
    }

    public static int[] getArr(int testNo) {
        switch (testNo) {
            case 0:
                return new int[]{16, 23, 30, 13, 14, 21, 19, 15}; //regular
            case 1:
                return new int[]{1, 1, 1, 1, 2, 1, 1, 1}; // only one in middle
            case 2:
                return new int[]{1, 1, 1, 2, 1, 1, 1, 1}; // only one in middle
            case 3:
                return new int[]{2, 1, 3, 4}; // should be tie or win
            case 4:
                return new int[]{8, 5, 6, 9, 4, 7, 12, 9}; // should be a draw
            case 5:
                return new int[]{1, 1, 1, 9}; // only one at the side
            case 6:
                return new int[]{9, 1, 1, 1}; // only one at the side
            default:
                return new int[]{15, 23, 30, 13, 14, 21, 19, 15};
        }
    }
}
