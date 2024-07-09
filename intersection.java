import java.util.*;

public class intersection {
    public static void main(String[] args) {
        int ar1[]={1,23,22,4,534,53,5,346,56,4,2,34,1,43,1,2,31,1,321,453,124,34,24,325,356,4,7,568678,3};
        int ar2[]={1,23,21,3,4235,34,534,5,34,5645,7564,243,52,34,24,23,342,4,1,432,4,23,423,5,35,34,53,2};
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int i = 0, j = 0;
        System.out.println("INTERSECTION ARRAY : ");
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] < ar2[j]) {
                i++;
            } else if (ar1[i] > ar2[j]) {
                j++;
            } else {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
