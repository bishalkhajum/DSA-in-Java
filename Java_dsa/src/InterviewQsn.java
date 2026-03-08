public class InterviewQsn {
    static void main(String[] args) {
        // find the number of elements in the array whose sum of digits is even
        int[] arr = {22, 4332, 233, 1, 45};
        int numberOfEven = findEven(arr);
        System.out.println(numberOfEven);
    }

    static int findEven(int[] arr) {
        int count = 0;
        for(int element : arr) {
            if(isEvenDigit(element)) count++;
        }
        return count;
    }

    static boolean isEvenDigit(int element) {
        return digits(element) % 2 == 0;
    }

    static int digitsAlternate(int n) {
        if (n==0) return 1;
        return (int) (Math.log10(Math.abs(n))) + 1;
    }

    static int digits(int element) {
        int count = 0;
//        if (element < 0) Math.abs(element);
        element = Math.abs(element);
        while (element > 0) {
            element /= 10;
            count++;
        }
        return count;
    }
}
