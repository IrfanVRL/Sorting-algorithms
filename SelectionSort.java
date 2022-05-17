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
public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kac adet sayi girmek istersiniz");
        int size = sc.nextInt();
        int dizi[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". sayiyi giriniz : ");
            dizi[i] = sc.nextInt();
        }
        selectionSort(dizi, size);
        System.out.println("Siralama Tamamlandii ");

        for (int i = 0; i < size; i++) {
            System.out.print(dizi[i] + " -> ");
        }
        System.out.print("null");
    }

    private static void selectionSort(int[] dizi, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i; j < size; j++) {
                if (dizi[min] > dizi[j]) {
                    min = j;
                }
                int temp = dizi[min];
                dizi[min] = dizi[i];
                dizi[i] = temp;
            }
        }
    }
}
