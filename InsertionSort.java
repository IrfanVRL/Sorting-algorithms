/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithms;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dizi[];
        System.out.println("Kaç adet sayi girmek istersiniz? ");
               
        int size = sc.nextInt();
        dizi = new int[size];
        for (int i = 0;  i < size; i++) {
            System.out.println(i + ". sayiyi giriniz : ");
            dizi[i] = sc.nextInt();
        }
        
        insertSort(dizi , size);
        System.out.println("Siralama Tamamlandii ");
        
        for (int i = 0; i < size; i++) {
            System.out.print( dizi[i] + " -> ");
        }
        System.out.print("null");
        
    }

    private static void insertSort(int[] dizi, int size) {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (dizi[j] < dizi[j-1]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[j-1];
                    dizi[j-1] = temp;
                 }
            }
        }
        
    }

            
    
}
