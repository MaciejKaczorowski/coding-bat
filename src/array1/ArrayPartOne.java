package array1;

public class ArrayPartOne {
    public static void main(String[] args) {
        System.out.println(rotateLeft3(new int[] {1,2,3}));
    }

    public static boolean firstLast6(int[] nums) {
        return  (nums[0] == 6 || nums [nums.length - 1] == 6);
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public static int[] makePi() {
        return new int[] {3, 1, 4};
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
    }

    public int sum3(int[] nums) {
        return nums[0] + nums [1] + nums[2];
    }

    public static int[] rotateLeft3(int[] nums) {
        return new int [] {nums[1], nums[2], nums[0]};
    }

    public static int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }
    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            return new int[] {nums[0], nums[0], nums[0]};
        } else {
            return new int[] {nums[2], nums[2], nums[2]};
        }
    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3);
    }

    public int[] makeLast(int[] nums) {
        int[] arr2 = new int[nums.length * 2];
        arr2[arr2.length - 1] = nums[nums.length - 1];
        return arr2;
    }

    public boolean double23(int[] nums) {
        return (nums.length == 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)));
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
            return nums;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
            return nums;
        } else {
            return nums;
        }
    }

    public int start1(int[] a, int[] b) {
        if ((a.length > 0 && b.length > 0) && (a[0] == 1 && b[0] == 1)) {
            return 2;
        } else if ((a.length > 0 && b.length > 0) && a[0] == 1 ^ b[0] == 1) {
            return 1;
        } else if((a.length > 0 && b.length == 0) && (a[0] == 1)){
            return 1;
        } else if ((a.length == 0 && b.length > 0) && (b[0] == 1)){
            return 1;
        } else {
            return 0;
        }
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (b[0] + b[1] > a[0] + a[1]) {
            return b;
        }
        return a;
    }

    public int[] makeMiddle(int[] nums) {
        return new int[] {nums[(nums.length / 2) - 1], nums[nums.length / 2]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[] {a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        int a = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = a;
        return nums;
    }

    public int[] midThree(int[] nums) {
        return new int [] {nums[(nums.length/2) - 1], nums[nums.length/2], nums[(nums.length/2) + 1]};
    }

    public int maxTriple(int[] nums) {
        if (nums[0] >= nums[nums.length/2] && nums[0] >= nums[nums.length - 1]) {
            return nums[0];
        } else if (nums[nums.length/2] >= nums[0] && nums[nums.length/2] >= nums[nums.length - 1]) {
            return nums[nums.length/2];
        } else {
            return nums[nums.length - 1];
        }
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[] {nums[0], nums[1]};
        }
        return nums;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length >= 2) {
            return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length >= 2) {
            return new int [] {a[0], a[1]};
        } else if (a.length == 1) {
            return new int[] {a[0], b[0]};
        } else {
            return new int[] {b[0], b[1]};
        }
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length  == 0){
            return a;
        } else if (a.length == 0) {
            return new int[] {b[0]};
        } else if (b.length == 0) {
            return new int[] {a[0]};
        } else {
            return new int[] {a[0], b[0]};
        }
    }


}
