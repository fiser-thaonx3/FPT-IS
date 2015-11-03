/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye_000
 */
public class Dictionary {
    ArrayList<Words> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public void menu(){
        System.out.println("Dictionary Menu: ");
        System.out.print("1. Them tu\n");
        System.out.print("2. Tra tu\n");
        System.out.print("3. Chinh sua\n");
        System.out.print("4. Thoat\n");
        System.out.println("Your choise: ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                addWord();
                break;
            case 2:
                findWord();
                break;
            case 3:
                editWord();
                break;
            case 4: 
        {
            try {
                askQ();
            } catch (IOException ex) {
                Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void addWord(){
        System.out.println("Nhap tu: ");
        String word = scan.nextLine();
        System.out.println("Nhap nghia: ");
        String mean = scan.nextLine();
        list.add(new Words(word,mean));
        menu();
    }
    public void findWord(){
        System.out.println("Nhap tu can tim: ");
        String word = scan.nextLine();
        for(int i=0; i<list.size();i++){
            if(list.get(i).getWord().equals(word)){
                System.out.println(list.get(i).getValue());
            }
        }
        menu();
    }
    public void editWord(){
        System.out.println("Nhap tu: ");
        String word = scan.nextLine();
        for(int i=0; i<list.size();i++){
            if(list.get(i).getWord().equals(word)){
                list.get(i).setValue(word);
            }
        }
        menu();
    }
    public void askQ() throws IOException{
        System.out.println("Ban muon thoat hay ko?");
        char ch = (char)System.in.read();
        try {
            if(ch == 'Y'){
                System.exit(0);
            }else
            if(ch == 'N'){
                menu();
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
    
    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        dic.menu();
    }
}
