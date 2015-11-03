/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nguye_000
 */
public class Exercise2 {

    final int MAX = 100;
    private int n, m;
    private int[] arr = new int[n];

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
        Arrays.sort(arr);
    }

    public void process() {
        int countSum = 0;
        int countSub = 0;
        int countMul = 0;
        int countDiv = 0;
        int check;
        for (int k = 1; k <= arr.length; k++) {
            int[] combitation = new int[k]; // Khoi tao cac mang k phan tu la tap hop con cua mang arr

            for (int i = 0; i < k; i++) {
                combitation[i] = i;
            }

            do {
                int sum = 0, mul = 1;
                for (int i = 0; i < k; i++) {
                    sum += arr[combitation[i]];
                    mul *= arr[combitation[i]];
                    if (sum == m) {
                        countSum++;
                    }
                    if (mul == m) {
                        countMul++;
                    }
                    int sub = combitation[i];
                    int div = combitation[i];
                    for (int j = 0; j < i; j++) {
                        if (j != i) {
                            sub -= arr[combitation[j]];
                            div /= arr[combitation[j]];
                        }
                    }
                    if (sub == m) {
                        countSub++;
                    }
                    if (div == m) {
                        countDiv++;
                    }
                }

                int i = k-1; // Xet tu cuoi day len tim combitation[i] chua dat gioi han tren n-k+i
                while ((i > -1) && (combitation[i] == arr.length - k + i)) {
                    i--;
                }
                if (i > -1) {
                    combitation[i]++; // Tang combitation[i] len 1
                    for (int j = i + 1; j < i; j++) { // Dat cac phan tu sau combitation[i] bang gioi han duoi cua no
                        combitation[j] = combitation[j - 1] + 1;
                    }
                }
                check = i;
            } while (check > -1);
        }
        System.out.println(countSum);
        System.out.println(countSub);
        System.out.println(countMul);
        System.out.println(countDiv);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        
        Exercise2 ex2 = new Exercise2();
        ex2.setArr(arr);
        ex2.setM(m);
        ex2.process();

    }
}
