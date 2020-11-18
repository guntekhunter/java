package com.tutorial;
import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner input1 = new Scanner (System.in);
        System.out.println("masukkan pilihan anda: ");
        System.out.println("1. menginput nilai array");
        System.out.println("2. penjumlahan 2 buah array");
        int pil = input1.nextInt();
        switch (pil){
            case 1:
                int[] array = {1,2,3,4,5,6,7,8};
                keluarkan(array,"awal");
                hasilnya(array);
                return;
            case 2:
                int[] arrayL = {1,2,8,6,5,3,7,4};
                int[] arrayU = {0,0,0,0,0,0,0,0};
                keluarkan(arrayL,"pertama");
                keluarkan(arrayU,"kedua");
                arrayPertama(arrayL);
                arrayKedua(arrayU);
                int[] arrayHasil = tambah(arrayL,arrayU);
                keluarkan(arrayHasil,"anjay");

        }

    }
    private static int[] arrayPertama (int[] arrayLama){
        Scanner jumlah = new Scanner (System.in);
        int[] array1 = new int[arrayLama.length];
        for(int i = 0 ; i< arrayLama.length ; i++){
            System.out.print("masukkan nilai array pertama ke-"+i+" : ");
            array1[i] = jumlah.nextInt();
        }
        System.out.println("array 1 yang baru = ");
        System.out.println("==================================");
        System.out.println(Arrays.toString(array1));
        return array1;
    }
    private static int[] arrayKedua (int[] arrayLama2){
        Scanner jumlah = new Scanner (System.in);
        int[] ArrayBaru2 = new int [arrayLama2.length];
        for(int i = 0; i<arrayLama2.length ; i++){
            System.out.println("masukkan nilai array pertama ke-"+i+" : ");
            ArrayBaru2[i] = jumlah.nextInt();
        }
        System.out.print("array 2 yang baru = ");
        System.out.println("==================================");
        System.out.println(Arrays.toString(ArrayBaru2));
        return ArrayBaru2;
    }
    private static int[] tambah (int[] array1, int[] array2){
        int[] hasilnya = new int[array1.length];
        for(int i = 0; i< array1.length; i++){
            hasilnya[i] = array1[i] + array2 [i];
        }
        return hasilnya;
    }
    private static int[] hasilnya(int[] inputArray){
        Scanner input = new Scanner (System.in);
        int[] arrayHasil = new int[inputArray.length];
        for(int i = 0; i< inputArray.length; i++){
            System.out.print("masukkan array ke- "+ i+" : ");
            arrayHasil[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arrayHasil));
        Arrays.sort(arrayHasil);

        return arrayHasil;

    }
    private static void keluarkan (int[] arraynya,String   message){
        System.out.println("ini array yang lama : "+Arrays.toString(arraynya));

    }
}
