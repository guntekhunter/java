package com.pelajaran1;
import java.util.Arrays;
public class  pembagian_matrix {
    public static void main (String[] args){
        int[][] matrix_1 = {
                {10,12},
                {14,16},
        };
        int[][] matrix_2 = {
                {5,6},
                {7,8},
        };
        keluarkan(matrix_1);
        keluarkan(matrix_2);
        int[][] bagi = pembagian(matrix_1,matrix_2);
        keluarkan(bagi);
    }
    private static int[][] pembagian (int[][] matrix_a,int[][] matrix_b){
        double buffer;
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;

        int[][] hasilBagi = new int[baris_a][kolom_b];

        for (int i = 0; i < baris_a; i++ ){
            for (int j = 0; j < kolom_b; j++){
                buffer = 0;
                for (int k = 0; k < kolom_a; k++){
                    buffer += matrix_a[i][k] % matrix_b[k][j];

                }
            }
        }
        return hasilBagi;

    }
    private static void keluarkan(int[][] matrix){
        int baris = matrix.length;
        int kolom = matrix[0].length;
        for (int i = 0; i < baris; i++){
            System.out.print("[");
            for (int j = 0; j < kolom; j++){
                System.out.print(matrix[i][j]);
                if (j < kolom-1){
                    System.out.print(",");
                }else
                    System.out.print("]");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
