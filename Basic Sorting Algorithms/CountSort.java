public class CountSort {

    public static void count(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int counts[] = new int[largest + 1];
        for(int i=0 ; i<arr.length ; i++) {
            counts[arr[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0 ; i<counts.length ; i++) {
            while (counts[i] > 0) {
                arr[j] = i;
                j++;
                counts[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};

        count(arr);
        printArr(arr);
    }
}
