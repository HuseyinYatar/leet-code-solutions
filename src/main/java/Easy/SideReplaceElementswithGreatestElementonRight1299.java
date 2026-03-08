package Easy;

import java.util.Arrays;

public class SideReplaceElementswithGreatestElementonRight1299 {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1}))
        );
    }

    static public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i]=arr[i+1];
            for (int j = i + 1; j < arr.length; j++) {
                arr[i] = Math.max(arr[i], arr[j]);
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

}
