package string2;

import java.util.Locale;

public class StringsPartTwo {


    public static void main(String[] args) {

    }


    public String doubleChar(String str) {
        String outcome = "";
        for (int i = 0; i < str.length(); i++) {
            outcome += str.substring(i, i + 1) +  str.substring(i, i + 1);
        }
        return outcome;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if(str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return dogCount == catCount;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        if (a.length() >= b.length()) {
            return a.toLowerCase(Locale.ROOT).endsWith(b.toLowerCase(Locale.ROOT));
        } else {
            return b.toLowerCase(Locale.ROOT).endsWith(a.toLowerCase(Locale.ROOT));
        }
    }

    public boolean xyzThere(String str) {
        if (str.length() > 2) {
            for (int i = 1; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
                    return true;
                }
            }
            if (str.substring(0,3).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        if (str.isEmpty() || (!str.contains("x"))) {
            return true;
        }
        if (str.charAt(str.length() - 1) != 'x') {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'x' && str.substring(i + 1).contains("y")) {
                    return true;
                }
            }
        }
        return false;
    }

    public String mixString(String a, String b) {
        String outcome = "";
        if (a.length() >= b.length()) {
            for (int i = 0; i < b.length(); i++) {
                outcome = outcome + a.charAt(i) + b.charAt(i);
            }
            outcome = outcome + a.substring(b.length());
        } else {
            for (int i = 0; i < a.length(); i++) {
                outcome = outcome + a.charAt(i) + b.charAt(i);
            }
            outcome = outcome + b.substring(a.length());
        }
        return outcome;
    }

    public String repeatEnd(String str, int n) {
        String outcome = "";
        String ending = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            outcome += ending;
        }
        return outcome;
    }

    public String repeatFront(String str, int n) {
        String outcome = "";
        if (str.length() == 0 || str.length() == 1) {
            outcome = str;
        }
        for (int i = 0; i < n; i++) {
            outcome += str.substring(0, n - i);
        }

        return outcome;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String outcome ="";
        for (int i = 0; i < count; i++) {
            outcome += word + sep;
        }
        return outcome.substring(0, outcome.length() - sep.length());
    }

    public boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0, n));
    }

    public boolean xyzMiddle(String str) {
        if (str.length() > 2 && str.length() % 2 == 0) {
            return str.substring(str.length() / 2 - 2, str.length() / 2 + 2).contains("xyz");
        } else if ((str.length() > 2 && str.length() % 2 != 0)) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2).contains("xyz");
        } else {
            return false;
        }
    }

    public String getSandwich(String str) {
        String outcome = "";
        if (!str.contains("bread")) {
            outcome = "";
        } else {
            int pos = str.indexOf("bread");
            int fin = str.lastIndexOf("bread");
            if (pos == fin) {
                outcome = "";
            } else {
                outcome = str.substring(pos + 5, fin);
            }
        }
        return outcome;
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1 ; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        String outcome = "";
        String unit = "";
        for (int i = 0; i < str.length() - 2; i+=3) {
            unit = String.valueOf(str.charAt(i + 1)) + str.charAt(i + 2) + str.charAt(i);
            outcome += unit;
        }
        return outcome;
    }

    public String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

    // String newS = "";
    //
    //        if (str.length() <= 2) return str;
    //
    //        for (int i = 0; i < str.length() - 2; i++) {
    //            if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) {
    //                newS += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
    //                i += 2;
    //            } else {
    //                newS += str.substring(i, i + 1);
    //            }
    //        }
    //        return newS;

    public String starOut(String str) {
        // WTF??
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && str.substring(i - 1, i).equals("*")) continue;
            if (str.substring(i, i + 1).equals("*")) continue;
            if (i != str.length() - 1 && str.substring(i + 1, i + 2).equals("*")) continue;
            result += str.substring(i, i + 1);
        }
        return result;
    }

    public String plusOut(String str, String word) {
        // ???
        String outcome = "";
        int wordLength = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (i + wordLength <= str.length() && str.substring(i, i + wordLength).equals(word)) {
                outcome += word;
                i += wordLength - 1;
            }
            else {
                outcome += "+";
            }
        }
        return outcome;
    }

    public String wordEnds(String str, String word) {
        String outcome = "";
        if (str.length() == word.length() && str.equals(word)){
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                if (i == 0) {
                    outcome += str.charAt(i + word.length());
                } else if (i == str.length() - word.length()) {
                    outcome += str.charAt(str.length() - word.length() - 1);
                } else {
                    outcome += str.substring(i - 1, i) + str.substring(i + word.length(), i + word.length() + 1);
                }
            }
        }
        return outcome;
    }

}
