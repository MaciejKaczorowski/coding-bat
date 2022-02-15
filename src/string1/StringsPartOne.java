package string1;

public class StringsPartOne {

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "word"));

        System.out.println(extraEnd("lody"));

        System.out.println(firstHalf("mama"));

        System.out.println(withoutEnd("lumbago"));

        System.out.println(comboString("ko", "tututu"));
        System.out.println(comboString("kokoko", "tu"));

        System.out.println(left2("java"));

        System.out.println(right2("Hello"));

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));

        System.out.println(middleTwo("string"));

        System.out.println(endsLy("a"));
        System.out.println(endsLy("bad"));
        System.out.println(endsLy("badly"));

        System.out.println(nTwice("Chocolate", 3));

        System.out.println(lastTwo("coding"));

        System.out.println(frontAgain("edited"));

        System.out.println(minCat("Hello", "Hi"));

        System.out.println(startWord("hippo", "i"));

    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    public static String extraEnd(String str) {
        String ending = str.substring(str.length() - 2, str.length());
        return ending + ending + ending;
    }

    public static String firstTwo(String str) {
        String cutStr;
        if (str.length() >= 2) {
            cutStr = str.substring(0, 2);
        } else {
            cutStr = str;
        }
        return cutStr;
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public static String left2(String str) {
        return str.substring(2, str.length()) + str.charAt(0) + str.charAt(1);
    }

    public static String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

    public static String theEnd(String str, boolean front) {
        return front ? str.substring(0,1) : str.substring(str.length() -1, str.length());
    }

    public static String withouEnd2(String str) {
        return str.length() >= 2 ? str.substring(1, str.length() - 1) : "";
    }

    public static String middleTwo(String str) {
        return str.substring((str.length()/2) - 1, (str.length()/2) + 1);
    }

    public static boolean endsLy(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2, str.length()).equalsIgnoreCase("ly");
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public static String twoChar(String str, int index) {
        return str.length() - 2 >= index && index > 0 ? str.substring(index, index + 2) : str.substring(0,1);
    }

    public static String middleThree(String str) {
        return str.length() > 3 ? str.substring(str.length()/2 - 1, str.length()/2 + 2) : str;
    }
    public static boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.length() == 3 && str.substring(0,3).equalsIgnoreCase("bad")) {
            return true;
        } else if (str.length() > 3 && (str.substring(0,3).equalsIgnoreCase("bad") || str.substring(1,4).equalsIgnoreCase("bad"))) {
            return true;
        }
        return false;
    }

    public static String atFirst(String str) {
        if (str.length() >= 2 ) {
            return str.substring(0,2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    public static String lastChars(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1) {
            return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
        } else if (a.length() == 0 && b.length() >= 1) {
            return "@" + b.substring(b.length() - 1, b.length());
        } else if (a.length() >= 1 && b.length() == 0) {
            return a.substring(0, 1) + "@";
        } else {
            return "@@";
        }
    }

    public static String conCat(String a, String b) {
        if (a.equalsIgnoreCase("")) {
            return b;
        } else if (b.equalsIgnoreCase("")) {
            return a;
        } else if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1, b.length());
        } else {
            return a + b;
        }
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length()) + str.substring(str.length() - 2, str.length() - 1);
        }
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        else if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))){
            return true;
        } else {
            return false;
        }
    }

    public static String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        } else if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(), a.length()) + b;
        } else {
            return a + b.substring(b.length() - a.length(), b.length());
        }
    }

    public static String extraFront(String str) {
        if (str.length() >= 2) {
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        } else {
            return str + str + str;
        }
    }

    public static String without2(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.length() == 2) {
            return "";
        } else if (str.length() > 2 && str.substring(0,2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2, str.length());
        } else {
            return str;
        }


    }
    public static String deFront(String str) {
        if(str.length() == 1 && str.charAt(0) != 'a')
            return "";

        if(str.length() >= 2) {
            if(str.charAt(0) != 'a' && str.charAt(1) != 'b') {
                return str.substring(2);
            } else if(str.charAt(0) != 'a') {
                return str.substring(1);
            } else if(str.charAt(1) != 'b') {
                return "a" + str.substring(2);
            }
        }
        return str;
    }

    public static String startWord(String str, String word) {
        if (word.length() > str.length()) {
            return "";
        } else { if (word.length() == 1) {
            return str.substring(0,1);
        } else if (word.length() > 1 && str.substring(1, word.length()).equals(word.substring(1,word.length()))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }}
    }

    public String withoutX(String str) {
        if (str.length() == 0 || str.length() == 1 && str.equals("x")) {
            return "";
        } else if (str.length() == 1 && !str.equals("x")) {
            return str;
        } else if (str.length() > 1 && str.substring(0,1).equals("x") && str.substring(str.length() - 1,str.length()).equals("x")) {
            return str.substring(1, str.length() - 1);
        } else if (str.length() > 1 && str.substring(0,1).equals("x")) {
            return str.substring(1);
        } else if (str.length() > 1 && str.substring(str.length() - 1).equals("x")) {
            return str.substring(0, str.length()-1);
        } else {
            return str;
        }

        //public String withoutX(String str) {
        //  if (str.length() > 0 && str.charAt(0) == 'x') {
        //    str = str.substring(1);
        //  }
        //
        //  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
        //    str = str.substring(0, str.length()-1);
        //  }
        //
        //  return str;}
    }

    public static String withoutX2(String str) {
        if (str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }

        if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) != 'x') {
            return str.substring(1);
        } else if (str.length() >= 2 && str.charAt(0) != 'x' && str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        } else {
            return str;
        }
    }

}
