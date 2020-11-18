package com.pelajaran1;
import java.util.Arrays;
public class
operasi_matrix {
    public static void main (String[]args) {
        int[][] matrix_a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix_b = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };

        keluarkan(matrix_a);
        keluarkan(matrix_b);

        int[][] hasilTambah = tambah(matrix_a, matrix_b);
        keluarkan(hasilTambah);

        int[][] matrix_c = {
                {1, 2},
                {3, 4},
        };
        int[][] matrix_d = {
                {11, 12},
                {13, 14},
        };
        int[][] hasilKali = kali(matrix_c,matrix_d);
        keluarkan(hasilKali);

    }
    private static int[][] kali (int[][] matrix_3, int [][] matrix_4){
        int baris_c = matrix_3.length;
        int kolom_c = matrix_3[0].length;

        int baris_d = matrix_4.length;
        int kolom_d = matrix_4[0].length;
// kolom akan mengikuti matrix 4 dan baris mengikuti matrix 3 jika dalam perkalian
        int[][] hasilKali = new int[baris_c][kolom_d];
        int buffer;
        for (int i = 0; i < baris_c; i++) {
            for (int j = 0; j < kolom_d; j++) {
                buffer = 0;
                for (int k = 0; k < kolom_c; k++) {
                    buffer += matrix_3[i][k] * matrix_4[k][j];

                }
                hasilKali[i][j] = buffer;
            }
        }
        return hasilKali;
    }
    private static int[][] tambah (int[][] matrix_1,int[][] matrix_2){
        int baris_b = matrix_1.length;
        int kolom_b = matrix_1.length;

        int[][] hasil = new int[baris_b][kolom_b];
        for (int i=0; i<baris_b; i++){
            for (int j = 0; j < kolom_b; j++){
                hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        return hasil;

    }
    private static void keluarkan (int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray.length;

        for(int i = 0; i < baris; i++){
            System.out.print("[");
            for(int j=0; j<kolom;j++){
                System.out.print(dataArray[i][j]);
                if (j<(kolom-1)){
                    System.out.print(",");
                }else{
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
