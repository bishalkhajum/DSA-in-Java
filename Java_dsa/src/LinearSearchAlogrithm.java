
public class LinearSearchAlogrithm {
//Time complexity:
//Best case = O(1)
//Worst Case = O(n) where n = size of array
static void main(String[] args) {
    int[] arr = {2,3,44,0,41};
    int target = 0;
    System.out.println(isAvailable(arr,target));
}
static boolean isAvailable(int[] arr, int target) {
    for (int j : arr) {
        if (j == target) return true;
    }
    return false;
}
}
