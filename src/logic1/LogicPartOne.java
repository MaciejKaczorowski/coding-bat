package logic1;

public class LogicPartOne {
    public static void main(String[] args) {

        System.out.println(old35(9));
        System.out.println(nearTen(-20));
        System.out.println(fizzString2(7));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars >= 40 && cigars <= 60) && !isWeekend) {
            return true;
        } else if (cigars <= 40 && isWeekend) {
            return true;
        }
        return false;
    }

    public static int dateFashion(int you, int date) {
        if ((you >= 8 && !(date <= 2)) || (date >= 8 && !(you <= 2))) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    // if (you <= 2 || date <= 2) {
    //    return 0;
    //  }
    //  else if (you >= 8 || date >= 8) {
    //    return 2;
    //  }
    //  else {
    //    return 1;
    //  }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return ((!isSummer && temp >= 60 && temp <= 90) || ((isSummer) && temp >= 60 && temp <=100));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum < 20) {
            return 20;
        }
        return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if(!vacation) {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        return ((a == 6 || b == 6) || (a + b == 6) || (Math.abs(a - b) == 6));
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            return n >= 1 && n <= 10;
        } else {
            return n <= 1 || n >= 10;
        }
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0) || (n - 1) % 11 == 1;
    }

    public static boolean more20(int n) {
        return (n - 1) % 20 == 0 || ((n - 2) % 20) == 0;
    }

    public static boolean old35(int n) {
        return (n % 3 == 0 ^ n % 5 == 0);
    }

    public static boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    public static boolean nearTen(int num) {
        return Math.abs(num - 1) % 10 == 0 || Math.abs(num - 2) % 10 == 0 || num % 10 == 0 || Math.abs(num + 1) % 10 == 0 || Math.abs(num + 2) % 10 == 0;
    }

    public static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else {
            return !isMorning || isMom;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else {
            if (tea / candy >= 2 || candy / tea >= 2) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }

    }

    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n) + "!";
        }
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (!bOk && b > a && c > b) || (bOk && c > b);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (!equalOk && b > a && c > b) || (equalOk && b >= a && c >= b);
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
    }

    public boolean lessBy10(int a, int b, int c) {
        return (a - b >= 10 || a - c >= 10) || (b - a >= 10 || b - c >= 10) || (c - a >= 10 || c - b >= 10);
    }
    // public boolean lessBy10(int a, int b, int c) {
    //  return (Math.abs(a - b) >= 10 ||
    //          Math.abs(b - c) >= 10 ||
    //          Math.abs(a - c) >= 10);

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (!noDoubles) {
            return die1 + die2;
        } else {
            if (die1 != 6 && die1 == die2) {
                return die1 + die2 + 1;
            } else if (die1 == 6 && die1 == die2) {
                return die1 + die2 - 5;
            } else {
                return die1 + die2;
            }
        }
    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            if (a % 5 == b % 5) {
                return Math.min(a, b);
            } else {
                return Math.max(a, b);
            }
        }
    }

    public int redTicket(int a, int b, int c) {
        if (a == b && b == c && a == 2) {
            return 10;
        } else if (a == b && b == c && a != 2) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        } else if ((a + b) - (b + c) == 10 || (a + b) - (a + c) == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        return (a / 10 == b / 10 || a / 10 == b % 10) || (a % 10 == b / 10 || a % 10 == b % 10);
    }

    public int sumLimit(int a, int b) {
        if (String.valueOf(a).length() == String.valueOf(a + b).length()) {
            return a + b;
        } else {
            return a;
        }
    }



}
