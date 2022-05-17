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
public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kac adet sayi girmek istersiniz");
        int size = sc.nextInt();
        int dizi[] = new int[size];    
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". sayiyi giriniz : ");
            dizi[i ]  = sc.nextInt();
        }
        bubbleSorting(dizi,size);
        System.out.println("Siralama yapildi");
         for (int i = 0; i < size; i++) {
            System.out.print( dizi[i] + " -> ");
        }
        System.out.print("null");
    }

    private static void bubbleSorting(int[] dizi, int size) {
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j <size-i-1 ; j++) {
                if (dizi[j] > dizi[j +1]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }
    }
    
}
