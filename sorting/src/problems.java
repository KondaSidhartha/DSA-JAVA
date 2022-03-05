import java.util.Arrays;

public class problems {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k=4;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int l=sort(arr,k);
        System.out.println(l);
    }

    static int sort(int[] arr,int k) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        int index;
        for ( index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                break;
            }
        }
        if (index< arr.length)
        {
            return arr[index-k+1];
        }
        else {
            return arr[index-k];
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
