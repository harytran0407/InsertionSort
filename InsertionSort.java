/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertionsort;

/**
 *
 * @author ADMIN
 */
public class InsertionSort {

    void insertionSort(int[] a) {
        int n=a.length;
        //bắt đầu từ a[1], sắp xếp từ a[0] -> a[1], rồi tiếp từ a[0] -> a[2],... cái nào nhỏ hơn thì duyệt từ a[0] chèn vào
        for (int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while (j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }

    
}
