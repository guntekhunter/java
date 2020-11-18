package com.pelajaran1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] agungji = {{1,2},{2,4}};
        System.out.println("memasukkan nilai secara langsung");
        keluarkan(agungji);
        //ini menentukan jumlah baris dan kolom array
        int[][] anjay = new int [5][5];
        System.out.println("dengan memasukkan nilai baris dan kolom");
        keluarkan(anjay);

        //looping manual
//        for(int i = 0; i < anjay.length; i++){
//            System.out.print("[");
//            for(int j = 0; j < anjay[i].length;j++){
//                System.out.print(anjay[i][j] + ",");
//            }
//            System.out.print("]\n");
//        }
        // looping foreach

        int[][] agungji_2 = {
                {31,32,33,34,35},
                {11,12,13,14,15},
                {21,22,23,24,25}
        };
        keluarkan(agungji_2);

    }
    private static void keluarkan (int[][] anjayMabar ){
        System.out.println("ini dia arraynya : ");
        System.out.println("ini looping foreach");
        for (int[] baris: anjayMabar) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
    }
}
