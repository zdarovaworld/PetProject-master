package main;

import java.util.ArrayList;
import java.util.Collections;

public class CodeWars {
    private String firstName;
    private String lastName;
    private String fullName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public static void main(String[] args) {
        System.out.println(4123489 % 10);
        System.out.println(sortDesc(0));
        System.out.println(sortDesc(146782379));
        System.out.println("============================================");
        System.out.println(reverseWords("zdarova hello privet"));
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(false, true));
        System.out.println(setAlarm(true, false));
        System.out.println("10".compareTo("9"));
    }

    /**
     * Kata: Descending Order
     * level: 7kyu
     */
    public static int sortDesc(final int num) {
        if (num == 0) {
            return num;
        }
        int res = num;
        ArrayList<Integer> list = new ArrayList<>();
        while (res != 0) {
            list.add(res % 10);
            res /= 10;
        }
        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer);
        }
        return Integer.parseInt(sb.toString());
    }

    /**
     * Kata: Will there be enough space?
     * level: 8kyu
     */
    public static int enough(int cap, int on, int wait){
        int result = cap - on - wait;
        return result > 0 ? 0 : result * -1;
    }

    /**
     * Kata: Count the Monkeys!
     * level: 8kyu
     */
    public static int[] monkeyCount(final int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /**
     * Kata: Correct the mistakes of the character recognition software
     * level: 8kyu
     */
    public static String correct(String string) {
        string = string.replaceAll("5", "S");
        string = string.replaceAll("0", "O");
        string = string.replaceAll("1", "I");
        return string;
    }

    /**
     * Kata: Sum of positive
     * level: 8kyu
     */
    public static int sum(int[] arr){
        int res = 0;
        for (int i : arr) {
            if (i > 0) {
                res += i;
            }
        }
        return res;
    }

    /**
     * Kata: Third Angle of a Triangle
     * level: 8kyu
     */
    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }

    /**
     * Kata: Stringy Strings
     * level: 8kyu
     */
    public static String stringy(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result += "1";
            } else if (i % 2 != 0) {
                result += "0";
            }
        }
        return result;
    }

    /**
     * Kata: Remove First and Last Character
     * level: 8kyu
     */
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Kata: Reversed Words
     * level: 8kyu
     */
    public static String reverseWords(String str){
        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = arr.length - 1; i > -1; i--) {
            result.append(arr[i] + " ");
        }
        return result.toString().trim();
    }

    /**
     * Kata: L1: Set Alarm
     * level: 8kyu
     */
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}
