package jancok.agung;
import java.util.Arrays;
public class array_multidimensi {
    public static void main (String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {2, 3, 4, 5}};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));

        char[] array_1 = {'a','d','b','g'};
        char[] array_2 = {'f','g','y','k'};

        char[][] array_3 = {
                array_1,
                array_2};
        System.out.println(Arrays.deepToString(array_3));
    }
}
