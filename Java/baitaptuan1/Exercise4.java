/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nguye_000
 */
public class Exercise4 {

    final int MAX = 100;
    private int n;
    private int m;
    String str;
    char[][] a = new char[MAX][MAX];

    public void read() {
        Scanner scan = new Scanner(System.in);
        FileReader fr = null;
        BufferedReader br = null;
        File file = new File("Exercise4.txt");
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            StringTokenizer split;

            for (int i = 1; i <= n; i++) {
                int j = 0;
                str = scan.nextLine();
                split = new StringTokenizer(str, " ");
                while (split.hasMoreTokens()) {
                    j = j + 1;
                    String str1 = split.nextToken();
                    a[i][j] = str1.charAt(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Read file error!!");
        }
    }

    public void process(Scanner scan) {
        String str1 = scan.nextLine();
        int countHor = 0, countVer = 0, countDiag = 0;
        boolean check;

        // Xet theo hang
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m - str1.length() + 1; j++) {
                check = true;
                for (int k = 0; k < str1.length(); k++) {
                    if (a[i][j + k - 1] != str1.charAt(k)) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    countHor++;
                }
            }
        }
        // Xet theo cot
        for (int i = 1; i <= n - str1.length() + 1; i++) {
            for (int j = 1; j <= m; j++) {
                check = true;
                for (int k = 0; k < str1.length(); k++) {

                    if (a[i + k - 1][j] != str1.charAt(k)) {
                        check = false;
                        break;
                    }
                }

                if (check == true) {
                    countVer++;
                }
            }
        }
        // Xet cheo chinh
        for (int i = 1; i <= n - str1.length() + 1; i++) {
            for (int j = 1; j <= m - str1.length() + 1; j++) {
                check = true;
                for (int k = 0; k < str1.length(); k++) {

                    if (a[i + k - 1][j + k - 1] != str1.charAt(k)) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    countDiag++;
                }
            }
        }
        // Xet cheo phu
        for (int i = 5; i <= n; i++) {
            for (int j = 1; j <= m - str1.length() + 1; j++) {
                check = true;
                for (int k = 0; k < str1.length(); k++) {

                    if (a[i - k][j + k] != str1.charAt(k)) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    countDiag++;
                }
            }
            System.out.println(countHor);
            System.out.println(countVer);
            System.out.println(countDiag);

        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Exercise4 ex4 = new Exercise4();
        ex4.read();
        ex4.process(scan);
        //System.out.println("Nhap vao hang, cot cua ma tran: ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
    }

}
