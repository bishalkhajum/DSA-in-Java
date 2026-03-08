public class BinarySearchAlogrithm {
    static void main(String[] args) {
        int[] arr = {1,2,3,6,8,19,67,70};
        System.out.println(binarySearchTarget(arr,67, 0, arr.length-1));
        System.out.println(search(arr, 6));
        System.out.println(binarySearchUsingLoop(arr, 6));
    }

    static boolean search(int[] arr, int target) {
        return binarySearchTarget(arr, target, 0, arr.length-1);
    }
    static boolean binarySearchTarget(int[] arr, int target, int start, int end) {
        if (start > end) return false;
        int middle;
        middle = (start+end) / 2;
        if (target == arr[middle]) return true;
        if(arr[middle] < target)
            return binarySearchTarget(arr, target, middle+1, end);
        return binarySearchTarget(arr, target, start, middle-1);
    }

    static int  binarySearchUsingLoop(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while (end >= start) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) return middle;
            if (arr[middle] < target) start = middle + 1;
            else end = middle -1;
        }
        return -1;
    }
}
