package com.pelajaran1;
import java.util.Arrays;
public class belajar_perkalian {
    public static void main (String[]args){
        int[][] array_a = {
                {1,2},
                {2,3},
        };
        int[][] array_b = {
                {2,3},
                {3,4},
        };
        keluarkan(array_a);
        keluarkan(array_b);

        int[][] hasil_kali = perkalian(array_a,array_b);
        keluarkan(hasil_kali);

    }
    public static int[][]perkalian (int[][] array_1, int[][] array_2 ){
        int baris_a = array_1.length;
        int kolom_a = array_1[0].length;

        int baris_b = array_2.length;
        int kolom_b = array_2.length;

        int[][] hasil = new int[baris_a][baris_b];
        int buffer;
        for (int i=0; i<baris_a; i++){
            buffer = 0;
            for (int j=0; j<kolom_b; j++){
                for (int k=0; k<baris_a; k++){
                    buffer =+ array_1[i][k]*array_2[k][j];

                }
                    hasil[i][j] = buffer;
            }
        }
        return hasil;
    }
    public static void keluarkan (int[][] matrix){
        int baris = matrix.length;
        int kolom = matrix[0].length;

        for(int i=0; i<baris; i++){
            System.out.print("[");
            for(int j=0; j<kolom; j++){
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
