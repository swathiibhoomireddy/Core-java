package ArraysLearn;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArayLearn {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,8,2,4,90};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }

        System.out.println("sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
