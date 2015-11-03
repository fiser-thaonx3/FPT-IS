/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

import java.util.Scanner;

/**
 *
 * @author nguye_000
 */
public class StandardChain {
    private String str1;
    private String str2;
    
    Scanner scan = new Scanner(System.in);
    public void chain1(){
        System.out.println("Nhap vao chuoi ban dau: ");
        str1 = scan.nextLine();
        str2= str1;
        System.out.println("Chuoi vua nhap la: " + str2);
        str2 = new StringBuffer(str2).reverse().toString();
        System.out.println("Chuoi nghich dao cua chuoi vua nhap la: " + str2);
    }
    
    public String chain2(){
        System.out.println("Nhap vao chuoi ban dau: ");
        str1 = scan.nextLine();
        str1 = String.valueOf(str1.charAt(0)).toUpperCase() + str1.substring(1, str1.length());
        System.out.println("Chuoi da duoc chuan hoa la: " + str1);
        return str1;
    }
    
    public String chain3(){
        System.out.println("Nhap vao chuoi ban dau: ");
        String input = scan.nextLine();
        input = input.toLowerCase();
        String[] arr = input.split(" ");
        for(String str : arr){
            str1 += String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1) + " ";
        }
        str1 = str1.substring(0, str1.length()-1);
        System.out.println("Chuoi da duoc chuan hoa: " + str1);
        return str1;
    }
    
    public void chain4(){
        System.out.println("Nhap vao chuoi: ");
        str1 = scan.nextLine();
        int i =0;
        System.out.print("Chuoi da duoc chuan hoa: ");
        for(i=0;i<str1.length();i++){
            int value = (int)str1.charAt(i);
            if(value>=65 && value <=90){
                System.out.print(str1.charAt(i));
            }
        }
        System.out.println("");
    }
    
    public void chain5(){
        System.out.println("Nhap chuoi: ");
        str1 = scan.nextLine();
        System.out.println("Chuoi da duoc chuan hoa: ");
        for(int i=0;i<str1.length();i++){
            System.out.print((char)(str1.charAt(i) + 1));
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        StandardChain sc = new StandardChain();
        sc.chain1();
        sc.chain2();
        sc.chain3();
        sc.chain4();
        sc.chain5();
    }
}
