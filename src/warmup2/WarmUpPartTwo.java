package warmup2;

public class WarmUpPartTwo {

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 3));
        System.out.println(countXX("xxabxxxa"));
        System.out.println(altPairs("kitten"));
        System.out.println(stringX("xxannaxx"));
        System.out.println(altPairs("kittenss"));
    }
    public static String stringTimes(String str, int n) {
        String outcome = "";
        for (int i = 0; i < n; i++) {
            outcome += str;
        }
        return outcome;
    }

    public String frontTimes(String str, int n) {
        String outcome = "";
        for (int i = 0; i < n; i++) {
            if (str.length() < 3) {
                outcome += str;
            } else {
                outcome += str.substring(0,3);
            }
        }
        return outcome;
    }

    public static int countXX(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && str.charAt(i - 1) == 'x') {
                count++;
            }
        }
        return count;
    }
    public static boolean doubleX(String str) {
        int pos = 0;
        if (str.length() >= 2) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'x') {
                    pos = i;
                    break;
                }
            }
            return str.charAt(pos + 1) == 'x';
        }
        return false;
    }

    public static String stringBits(String str) {
        String outcome = "";
        if (str.equals("")) {
            return str;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    outcome += str.charAt(i);
                }
            }
            return outcome;
        }

    }
    public static String stringSplosion(String str) {
        String outcome = "";
        for (int i = 0; i < str.length(); i++) {
            outcome += str.substring(0, i + 1);
        }
        return outcome;
    }

    public static int last2(String str) {
        int count = 0;
        if (str.length() < 3) {
            return 0;
        }
        else {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(str.substring(str.length()-2, str.length()))) {
                    count++;
                }
            }
            return count;
        }
    }
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9){
                count++;
            }

        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        if (nums.length <= 4) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        }
        return false;
    }
    public int stringMatch(String a, String b) {
        int count = 0;
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < b.length() - 1; i++) {
                if (b.substring(i, i + 2).equals(a.substring(i, i + 2))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String stringX(String str) {
        String outcome = "";
        if (str.length() > 2) {
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) != 'x') {
                    outcome += str.charAt(i);
                }
            }
            return str.charAt(0) + outcome + str.charAt(str.length() - 1);
        }
        return str;
    }

    // String result = "";
    //  for (int i=0; i<str.length(); i++) {
    //    // Only append the char if it is not the "x" case
    //    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
    //      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
    //    }
    //  }
    //  return result;

    public static String altPairs(String str) {
        String outcome = "";
        if (str.length() > 2 && (str.length() - 1) % 4 == 0) {
            for (int i = 0; i < str.length() - 1; i+= 4) {
                outcome += str.substring(i, i + 2);
            }
            return outcome + str.charAt(str.length() - 1);
        } else if (str.length() > 2) {
            for (int i = 0; i < str.length() - 1; i += 4) {
                outcome += str.substring(i, i + 2);
            }
            return outcome;
        }

        return str;
    }

    // String result = "";
    //
    //  // Run i by 4 to hit 0, 4, 8, ...
    //  for (int i=0; i<str.length(); i += 4) {
    //    // Append the chars between i and i+2
    //    int end = i + 2;
    //    if (end > str.length()) {
    //      end = str.length();
    //    }
    //    result = result + str.substring(i, end);
    //  }
    //
    //  return result;

    public String stringYak(String str) {
        String outcome = "";
        int index = 0;
        if (!str.contains("yak")) {
            outcome = str;
        } else {
            outcome = str.replaceAll("yak", "");
            }
        return outcome;
    }

    // for (int i=0; i<str.length(); i++) {
    //    // Look for i starting a "yak" -- advance i in that case
    //    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
    //      i =  i + 2;
    //    } else { // Otherwise do the normal append
    //      result = result + str.charAt(i);
    //    }
    //  }
    //
    //  return result;
    //}

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums [i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums [i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] - nums[i + 1] == -5 && (nums[i] - nums[i + 2] <= 3 && nums[i] - nums[i + 2] >= - 1)){
                return true;
            }
        }
        return false;
    }


}
