package ap1;

import java.util.ArrayList;
import java.util.List;

public class Ap1 {
    public static void main(String[] args) {
//        System.out.println(average(new int[]{5, 7, 9}, 0, 2));
//        System.out.println(scoresAverage(new int[]{2, 2, 2, 6, 5, 4}));
        //System.out.println(wordsCount(new String[]{"a", "ddd", "bb", "bbb", "ccc"}, 3));
        // System.out.println(wordsFront(new String[]{"a", "b", "c", "d"}, 2));

        System.out.println(hasOne(1));

    }

    public static boolean scoresIncreasing(int[] scores) {
        for ( int i = 0; i < scores.length - 1; i++ )
        {
            if ( scores[i + 1] < scores[i] )
            {
                return false;
            }
        }

        return true;
        // DLACZEGO TO NIE DZIALA ?
//        boolean match = false;
//        for (int i = 0; i < scores.length - 1; i++) {
//            if (scores[i + 1] >= scores[i]) {
//                match = true;
//            }
//            else {
//                match = false;
//            }
//        }
//        return match;
    }
    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i <= scores.length - 3; i++) {
            if (scores[i+2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public static int scoresAverage(int[] scores) {
        int part1 = average(scores, 0, scores.length/2 - 1);
        int part2 = average(scores, scores.length/2, scores.length - 1);
        if (part1 > part2) {
            return part1;
        } else {
            return part2;
        }

    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public List wordsWithoutList(String[] words, int len) {
        List list = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if ( words[i].length() != len) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public static boolean hasOne(int n) {
        int number = 0;
        int count = 0;
        while (n > 0) {
            number = n % 10;
            n = n / 10;
            if (number == 1) {
                count++;
            }
        }
        return count > 0;
    }

    //public boolean hasOne(int n) {
    //    while(n != 0) {
    //        if(n % 10 == 1)
    //            return true;
    //
    //        n /= 10;
    //    }
    //
    //    return false;
    //}
    public boolean dividesSelf(int n) {
        int rightMostDigit = 0;
        int newN = n;
        while(newN>0){
            rightMostDigit = newN%10;
            if(rightMostDigit == 0 || n%rightMostDigit != 0)
                return false;
            newN = newN/10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int [] arr = new int[count];
        int a = 0;
        for (int i = 0; a < count; i++) {
            if (nums[i] % 2 == 0) {
                arr[a] = nums[i];
                a++;
            }
        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count) {
        int [] arr = new int[count];
        int a = 0;
        for (int i = 0; a < count; i++) {
            if (isEndy(nums[i])) {
                arr[a] = nums[i];
                a++;
            }
        }
        return arr;

    }

    public boolean isEndy(int n) {
        return ((n >= 0 && n <= 10) || (n >= 90 & n <= 100));
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((!b[i].isEmpty() && !a[i].isEmpty()) && (a[i].charAt(0) == b[i].charAt(0))){
                count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int count = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals(key[i])) {
                count = count + 4;
            } else if (!answers[i].equals(key[i]) && !answers[i].equals("?")) {
                count--;
            }
        }
        return count;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])){
                count++;
            }
        }
        String [] arr = new String[words.length - count];
        int a = 0;

        for (int i = 0; a < words.length - count; i++) {
            if (!target.equals(words[i])) {
                arr[a] = words[i];
                a++;
            }
        }
        return arr;
    }
    public int scoresSpecial(int[] a, int[] b) {
        return findLargestScore(a) + findLargestScore(b);
    }

    public int findLargestScore (int [] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end ; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end ; i++) {
            if (heights[i + 1] > heights[i]) {
                sum += Math.abs((heights[i] - heights[i + 1]) * 2);
            } else {
                sum += Math.abs(heights[i] - heights[i + 1]);
            }
        }
        return sum;
    }
    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end ; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.equals(bName)) {
            if (aId < bId) {
                return -1;
            } else if (aId > bId) {
                return 1;
            } else {
                return 0;
            }
        } else if (aName.compareTo(bName) < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String [] arr = new String[n];
        int ai = 0;
        int bi = 0;

        for (int i = 0; i < n; i++) {
            if (a[ai].compareTo(b[bi]) < 0) {
                arr[i] = a[ai];
                ai++;
            } else if (a[ai].compareTo(b[bi]) > 0) {
                arr[i] = b[bi];
                bi++;
            } else {
                arr[i] = a[ai];
                ai++;
                bi++;
            }
        }
        return arr;
    }
    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int aIndex = 0;
        int bIndex = 0;

        if(a[0].equals(b[0])) {
            count++;
            aIndex++;
            bIndex++;
        } else if(a[0].compareTo(b[0]) < 0) {
            aIndex++;
        } else {
            bIndex++;
        }

        while(aIndex < a.length && bIndex < b.length) {
            if(aIndex > 0 && a[aIndex-1].equals(a[aIndex])) {
                aIndex++;
            } else if(a[aIndex].equals(b[bIndex])) {
                count++;
                aIndex++;
                bIndex++;
            } else if(a[aIndex].compareTo(b[bIndex]) < 0) {
                aIndex++;
            } else {
                bIndex++;
            }
        }

        return count;
    }

}
