/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Bài 1: Cho một dãy số n chữ số cho trước. Hãy:
+ Tìm GTLN, NN của dãy số
+ Sắp xếp theo thứ tự tăng, giảm dần
 */
package baitaptuan1;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author nguye_000
 */
public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Nhap so phan tu cua mang
        int n = scan.nextInt();
        int a[] = new int[n]; // Khai bao mang gom n phan tu
        // Nhap cac phan tu cua mang
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a); // Sap xep mang theo thu tu tang dan
        // In ra phan tu lon nhat va nho nhat cua day so
        System.out.println("---------------------------");
        System.out.println(a[n-1] + " " + a[0]);
        // In mang theo thu tu tang dan
        for(int i =0;i<n;i++){
            System.out.print(a[i] + " ");
        } 
        System.out.println();
        // In mang theo thu tu giam dan
        for (int i = n-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
}
