/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {2,8,5,3,9,4,1};

        System.out.println("=== Insertion Sort Demo ===");
        System.out.println("Before sorting: " + Arrays.toString(arr));

        InsertionSort ins = new InsertionSort();
        ins.insertionSort(arr);

        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
    
}
