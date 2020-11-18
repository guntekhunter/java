package com.pelajaran1;

import java.util.Arrays;
import java.util.Scanner;

public class proyek {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int[] arrayAsli = {1,2,3,4,5,6};
        System.out.println("berikut pilihannya:");
        System.out.println("1. input data");
        System.out.println("2. tampilkan data");
        System.out.println("3. keluar");
        System.out.print("masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                int[] array = new int[arrayAsli.length];
                System.out.println("masukkan nilai arraynya : ");
                for(int i=0; i < arrayAsli.length; i ++){
                    System.out.print("array ke"+i+":");
                    array[i] = input.nextInt();
                }
                System.out.print(Arrays.toString(array));
            case 2:
        }

    }
}
