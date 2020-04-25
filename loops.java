import java.util.Scanner;

public class Loops {
    public static final int PASS = 55;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        println("\n\nex1:");
//        ex1();
//        println("\n\nex2:");
//        ex2();
//        println("\n\nex3:");
//        ex3();
//        println("\n\nex4:");
//        ex4();
//        println("\n\nex5:");
//        ex5();
//        println("\n\nex6:");
//        ex6();
//        println("\n\nex7:");
//        ex7();
//        println("\n\nex8:");
//        ex8();
//        println("\n\nex9:");
//        ex9();
//        println("\n\nex10:");
//        ex10();
//        println("\n\nex11:");
//        ex11();
//        println("\n\nex12:");
//        ex12();
//        println("\n\nex13:");
//        ex13();
//        println("\n\nex14:");
//        ex14();
//        println("\n\nex15:");
//        ex15();
//        println("\n\nex16:");
//        int[] arr = {1, 2, 3, 4, 9, 5, 7};
//        println("" + ex16(arr));
//        println("\n\nex17:");
//        ex17(arr);
        int[] arr1 = {1, 2, -3, 4, -9, 5, -7};
        println("\n\nex18:");
        ex18(arr1);

//        for (int i=1;i<19;i++) {
////            System.out.println("//public static void ex"+i + "() {}");
//            System.out.println("//println(\"\\n\\nex" + i + ":\");");
//            System.out.println("//ex" + i + "();");
//        }
    }


    public static void ex1() {
        //1. כתוב תכנית המדפיסה את המספרים בין 1 ל-100 עם רווח tab בין אחד לשני (“\t”).
        for (int i = 0; i <= 100; i += 1)
            System.out.print(i + "\t");
    }


    public static void ex2() {
        //2. כתוב תכנית המדפיסה את המספרים הזוגיים בין 1 ל-100 .
        for (int i = 0; i <= 100; i += 2)
            System.out.print(i + "\t");
    }

    public static void ex3() {
        //3. כתוב תכנית הקולטת שני מספרים ומדפיסה את כל המספרים בינם
        // (שים לב שאינך יודע מי הקטן מבין מספרי הקלט).

        System.out.print("enter tow numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = Math.min(a, b); i <= Math.max(b, a); i++)
            System.out.print(i + "\t");
    }

    public static void ex4() {
        /*
            4.כתוב תכנית הקולטת סיסמה (מחרוזת). קלוט את הסיסמה פעם נוספת.
            אם הסיסמה הנוספת אינה זהה לראשונה –
            הדפס הודעה מתאימה ובקש את הקלדת הסיסמא פעם נוספת,
            כך עד אשר שתי הסיסמאות יהיו זהות.
         * */
        String passFirstTime, passSecondTime;
        do {
            System.out.println("enter your Password for the First time:");
            passFirstTime = scan.next();
            System.out.println("enter your Password for the Second time:");
            passSecondTime = scan.next();
            if (!passFirstTime.equals(passSecondTime))
                System.out.println("the passwords not match - please try again\n\n");
        }
        while (!passFirstTime.equals(passSecondTime));
        System.out.println("the password has been saved");

    }

    public static void ex5() {
        //5. כתוב תכנית הקולטת 10 מחירים ומדפיסה את הסכום לתשלום.
        int sum = 0;
        System.out.println("pleas enter 10 numbers");
        for (int i = 0; i < 10; i++)
            sum += scan.nextInt();
        System.out.println(sum);
    }

    public static void ex6() {
        //6. כתוב תכנית הקולטת מחירים עד אשר המחיר הכולל עובר את הערך 100, ומדפיסה כמה מוצרים נרכשו ובאיזה סכום סופי.
        int sum = 0, items = 0;
        do {
            System.out.println("enter item price");
            sum += scan.nextInt();
            items++;
        }
        while (sum < 100);
        System.out.println("you take items amount:" + items + "\nand the final price is:" + sum);
    }

    public static void ex7() {
        //7. כתוב תכנית המקבלת מספר N ומדפיסה את N! (N! = 1*2*3*...*N) .
        long factorial = 1;
        int num;
        System.out.println("enter number to factorial:");
        num = scan.nextInt();
        for (int i = 1; i <= num; i++)
            factorial *= i;
        System.out.println("the factorial of:\t" + num + "\tis :\t" + factorial);
    }

    public static void ex8() {
        //8. כתוב תכנית הקולטת 10 ציונים ומדפיסה את הממוצע של העוברים (מעל 55).
        double scoreSum = 0;
        int temp, cntPass = 0;
        System.out.println("enter 10 scores:");
        for (int i = 0; i < 10; i++) {
            temp = scan.nextInt();
            if (temp >= PASS) {
                scoreSum += temp;
                cntPass++;
            }
        }
        System.out.println((scoreSum / cntPass));
    }

    public static void ex9() {
        //9. כתוב תכנית הקולטת 10 ציונים ומדפיסה את הציון הגבוה ביותר והנמוך ביותר.
        int maxScore = -1, minScore = -1, temp;
        System.out.println("enter 10 scores:");
        for (int i = 0; i < 10; i++) {
            temp = scan.nextInt();
            if (maxScore == -1 && minScore == -1) {
                maxScore = temp;
                minScore = temp;
            }
            if (temp > maxScore)
                maxScore = temp;
            if (temp < minScore)
                minScore = temp;
        }
        System.out.println("max: " + maxScore + "\tmin: " + minScore);
    }


    public static void ex10() {
        //10. כתוב תכנית הקולטת 10 ציונים ומדפיסה את  הציון הנמוך ביותר מבין העוברים.
        //10 40 80 60 30 70 95 100 85 59
        int minScore = -1, temp;
        System.out.println("enter 10 scores:");
        for (int i = 0; i < 10; i++) {
            temp = scan.nextInt();
            if (minScore == -1 && temp >= PASS)
                minScore = temp;

            if (temp < minScore && temp >= PASS)
                minScore = temp;
        }
        if (minScore != -1)
            System.out.println("\tmin out of pass: " + minScore);
        else
            System.out.println("\tthere's no pass score");
    }


    public static void ex11() {
        //11. כתוב  תכנית הקולטת 10 ציונים ומדפיסה את  המספר הסידורי של הציון הגבוה
        //input: 10 40 80 60 30 70 95 100 85 59
        //output: max: 100	index: 8
        int maxScore = -1, maxIndex = -1, temp;
        System.out.println("enter 10 scores:");
        for (int i = 1; i <= 10; i++) {
            temp = scan.nextInt();
            if (maxScore == -1 && maxIndex == -1) {
                maxScore = temp;
                maxIndex = i;
            }
            if (temp > maxScore) {
                maxScore = temp;
                maxIndex = i;
            }
        }
        System.out.println("max: " + maxScore + "\tindex: " + maxIndex);
    }

    public static void ex12() {
        //12.כתוב תכנית הקולטת מספר ומדפיסה את סכום ספרותיו הזוגיות.
        //input:12345678
        //output: the sum of the even numbers out of the number is:20
        long num, temp;
        int sum = 0;
        System.out.println("enter a number:");
        num = scan.nextInt();
        while (num != 0) {
            temp = num % 10;
            if (temp % 2 == 0)
                sum += temp;
            num /= 10;
        }
        System.out.println("the sum of the even numbers out of the number is:" + sum);

    }

    public static void ex13() {
        //13. כתוב תכנית הקולטת מספר ומדפיסה האם הוא מספר מושלם.
        System.out.println("enter a number:");
        int num, sum = 0;
        num = scan.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (num == sum)
            println("the number is perfect!!!");
        else
            println("the number us not perfect :(");
    }

    public static void ex14() {
        //14.כתוב תוכנית המגדירה מערך בגודל 10,
        // קולטת מהמשתמש 10 מספרים למערך ומדפיסה את האיברים במקומות הזוגיים
        // ואח"כ את האיברים שמכילים מספרים זוגיים.

        //input: 10 40 80 60 30 70 95 100 85 59
        //output: the numbers in the even place:	10	80	30	95	85
        //the even numbers are:	10	40	80	60	30	70	100

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            printEnter();
            arr[i] = scan.nextInt();
        }
        print("the numbers in the even place:");
        for (int i = 0; i < 10; i += 2)
            print("\t" + arr[i]);
        print("\nthe even numbers are:");
        for (int i = 0; i < 10; i += 1)
            if (arr[i] % 2 == 0)
                print("\t" + arr[i]);
    }

    public static void ex15() {
        //15. כתוב תוכנית המגדירה מערך בגודל שהמשתמש מבקש , קולטת לתוך המערך מספרים שלמים, ומדפיסה את 2 המספרים הקטנים ביותר במערך.
        //input: 5 1 2 5 -1 -2
        //output : -2,-1
        int[] arr;
        int smallestNum1, smallestNum2, arrSize, greatest = 0;
        println("enter your array range:");
        arrSize = scan.nextInt();
        arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            printEnter();
            arr[i] = scan.nextInt();
            if (arr[i] > greatest)
                greatest = arr[i];
        }
        smallestNum1 = greatest;
        smallestNum2 = greatest;
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] < smallestNum1) {
                smallestNum2 = smallestNum1;
                smallestNum1 = arr[i];
            } else if (arr[i] < smallestNum2)
                smallestNum2 = arr[i];
        }
        println(smallestNum1 + "," + smallestNum2);
    }

    public static int ex16(int[] arr) {
        // 16. כתוב שיטה המקבלת מערך ומחזירה את מספר האיברים שמתחלקים ב-3.
        int countOfDividedBy3 = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 3 == 0)
                countOfDividedBy3++;
        return countOfDividedBy3;
    }

    public static void ex17(int[] arr) {
        //17. כתוב שיטה סטטית שמקבלת מערך והופכת את סדר האיברים שבו, ללא שימוש במערך עזר.
        int a, b;
        for (int i = 0; i < (arr.length / 2); i++) {
            a = arr[i];
            b = arr[(arr.length - i - 1)];
            arr[i] = b;
            arr[arr.length - i - 1] = a;
        }

        for (int i = 0; i < (arr.length); i++)
            print(arr[i] + ",");
    }

    public static void ex18(int[] arr) {
        //18. כתוב שיטה סטטית שמקבלת מערך ומסדרת את האיברים שבו, כך שכל המספרים החיוביים ימצאו בצידו הימני, וכל השליליים בצידו השמאלי, ללא שימוש במערך עזר.

        int temp;
        for (int i = 0; i < (arr.length); i++)
            for (int j = 0; j < (arr.length); j++)
                if (arr[i]<arr[j]) {
                    temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
        for (int i = 0; i < (arr.length); i++)
            print(arr[i] + ",");

    }


    public static void printPrimes() {
        for (int i = 1; i < 100; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void print(String txt) {
        System.out.print(txt);
    }

    public static void println(String txt) {
        System.out.println(txt);
    }

    public static void printEnter() {
        System.out.println("enter a number:");
    }


}

