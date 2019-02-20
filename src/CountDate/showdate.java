package CountDate;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class showdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls input your month:");
        int month = sc.nextInt();
        if (checkMonth(month)) {
            checkDateOfMonths(month);
        } else {
            System.out.println("Are you sure your input is correct");
        }

    }

    static boolean checkMonth(int month) {
        boolean flag = false;
        if (0 < month && month < 12) {
            flag = true;
        }
        return flag;
    }

    static void checkDateOfMonths(int month) {
        /*Trong một năm, tháng 2 có thể có 28 hoặc 29 ngày, các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày, các tháng còn lại có 30 ngày.*/
        switch (month) {
            case 2: {
                System.out.println("This month have 28 or 29 days");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("This month have 31 days");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("This month have 30 days");
            }

        }
    }
}
