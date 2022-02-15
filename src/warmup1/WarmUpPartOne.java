package warmup1;

import java.util.Locale;

public class WarmUpPartOne {

    public static void main(String[] args) {

        System.out.println(sleepIn(true, false));
        System.out.println(frontBack("b"));
        System.out.println(stringE("bl"));
        System.out.println(everyNth("omomomom", 2));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        }
        return false;

    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        }
        return  21 - n;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }
    public static boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative && a < 0 && b < 0) {
            return true;
        } else if (!negative && (a < 0 ^ b < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0,n);
        String end = str.substring(n + 1, str.length());
        return front + end;
    }

//    public static String missingChar(String str, int n) {
//
//        char ch = '\0';
//        return str.replace(str.charAt(n),ch);
//
//    }

    public static String frontBack(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return str;
        }
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);

    }

    public static String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        return str.substring(0,3) + str.substring(0,3) +str.substring(0,3);
    }

    public static String backAround(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public static String front22(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        return str.substring(0,2) + str + str.substring(0,2);
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0) && (temp2 > 100)) || ((temp1 > 0) && (temp2 < 0));
    }

    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public static boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }

    public static String delDel(String str) {
        if (str.length() < 3) {
            return str;
        } else if (str.length() > 3 && str.substring(1,4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }

    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.substring(1,3).equals("ix")) {
            return true;
        }
        return false;
    }

    public static String startOz(String str) {
        if (str.startsWith("oz")) {
            return str.substring(0,2);
        } else if (str.length() == 1 && str.charAt(0) == 'o') {
            return str.substring(0,1);
        } else if (str.length() > 1 && str.charAt(0) == 'o' && str.charAt(1) != 'z') {
            return str.substring(0,1);
        } else if (str.length() > 1 && str.charAt(0) != 'o' && str.charAt(1) == 'z') {
            return str.substring(1,2);
        }
        return "";

        // public String startOz(String str) {
        //  String result = "";
        //
        //  if (str.length() >= 1 && str.charAt(0)=='o') {
        //    result = result + str.charAt(0);
        //  }
        //
        //  if (str.length() >= 2 && str.charAt(1)=='z') {
        //    result = result + str.charAt(1);
        //  }
        //
        //  return result;
        //}
    }
    public int intMax(int a, int b, int c) {
        if (b > a && b > c) {
            return b;
        }
        if (c > b && c > a) {
            return c;
        }
        return a;
    }

    public static int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } else if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        }
        return 0;
    }

    public static boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public static int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && ((a > b) || !(b >= 10 && b <= 20))) {
            return a;
        } else if ((b >= 10 && b <= 20) && ((a < b) || !(a >= 10 && a <= 20))) {
            return b;
        }
        return 0;
    }

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return count >=1 && count <=3;
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public String endUp(String str) {
        if (str.length() < 4) {
            return str.toUpperCase();
        }
        return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }

    public static String everyNth(String str, int n) {
        String outcome = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                outcome += str.charAt(i);
            }
        }
        return outcome;
    }

    //public String everyNth(String str, int n) {
    //  String result = "";
    //
    //  // Look at every nth char
    //  for (int i=0; i<str.length(); i = i + n) {
    //    result = result + str.charAt(i);
    //  }
    //  return result;
    //}




}
