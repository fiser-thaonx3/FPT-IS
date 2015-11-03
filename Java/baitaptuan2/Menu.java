/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

import java.awt.Event;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nguye_000
 */
public class Menu {
    private final String account = "FIS";
    private final String password = "123";
    
    public void logIn(){
        String acc, pass;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Login: ");
        do{
        System.out.print("Input your account: ");
        acc = scan.nextLine();
        System.out.print("Input your password: ");
        pass = scan.nextLine(); 
        if(!(acc.equals(account)) || !(pass.equals(password)))
        {
            System.out.println("Login fail: " + ++count );
        
        if(count == 3){
            System.out.println("Login fail too much! You must wait in 1 minute!");
            waiting();
        }
        }
        }while(!(acc.equals(account)) || !(pass.equals(password)));
        System.out.println("Login sucessfully!");
    }
    public void waiting(){
        for(int i=60;i>0;i--){
            System.out.println("Waiting ..." + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error!!!");
            }
        }
        
    }
    public void step2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Move to step 2");
        System.out.println("Please choose only one:");
        System.out.print("1. Nhap kho\n");
        System.out.print("2. Xuat kho\n");
        System.out.print("3. Quan ly gia\n");
        System.out.print("4. In hoa don\n");
        System.out.print("5. Thoat\n");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Nhap kho");
                break;
            case 2:
                System.out.println("Xuat kho");
                break;
            case 3:
                System.out.println("Quan ly gia");
                break;
            case 4:
                System.out.println("In hoa don");
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Error!");
        }
    }
    
    public void step3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("3. Nhap kho menu:");
        int choose=scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Nhap so luong mot don vi");
                break;
            case 2:
                System.out.println("Nhap theo thung 20 don vi");
                break;
            case 3:
                System.out.println("Nhap theo ta 12 don vi");
                break;
            case 4:
                System.out.println("Chin sua so luong");
                break;
            case 5: 
                step2();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void step4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("4. Xuat kho menu:");
        int choose =scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Xuat theo mot don vi");
                break;
            case 2:
                System.out.println("Xuat theo thung");
                break;
            case 3:
                System.out.println("Xuat theo ta");
                break;
            case 4:
                System.out.println("Chinh sua so luong");
                break;
            case 5:
                System.out.println("Kiem tra so luong");
                break;
            case 6:
                step2();
                break;
            default:
                throw new AssertionError();
        }
    }
   
    public void step5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("5. Quan ly gia menu: ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Hien thi gia");
                break;
            case 2:
                System.out.println("Sua gia");
                break;
            case 3:
                System.out.println("Tong tien hang");
                break;
            case 4:
                step2();
                break;
            default:
                throw new AssertionError();
        }
    }
    public void step6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("6. In hoa don");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("In theo luong hang");
                break;
            case 2:
                System.out.println("In theo gia");
                break;
            case 3:
                System.out.println("In theo ca hang va gia");
                break;
            case 4:
                step2();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void step7() throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure to exit now? ");
        try{
        char answer = (char)System.in.read();
        if(answer == 'Y'){
            System.exit(0);
        }else
        if(answer == 'N'){
            step2();
        }
        }catch(Exception e){}
    }
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.logIn();
        menu.step2();
        menu.step3();
        menu.step4();
        menu.step5();
        menu.step6();
    }
    
}
