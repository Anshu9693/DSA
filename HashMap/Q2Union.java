import java.util.Arrays;
import java.util.HashSet;

public class Q2Union {

    public static int[] union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int ans[] = new int[set.size()];
        int i = 0;
        for(int key :set){
            ans[i++] = key;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 2, 3, 4, 5 ,11 };
        int[] arr2 = { 4, 5, 6, 7, 8, 5, 10 };
        System.out.println(Arrays.toString(union(arr1, arr2)));

    }
}
