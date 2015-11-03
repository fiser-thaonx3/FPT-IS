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
public class SoPhuc {

    private double pt, pa;

    public SoPhuc() {
    }

    public SoPhuc(double pt1, double pa1) {
        pt = pt1;
        pa = pa1;
    }

    public void inSoPhuc() {
        System.out.println(pt + " +  " + pa + "i");
    }

    public void nhapSoPhuc() {
        Scanner input = new Scanner(System.in);
        System.out.print("phan thuc: ");
        pt = input.nextDouble();
        System.out.print("Phan ao: ");
        pa = input.nextDouble();
    }

    public SoPhuc congSoPhuc(SoPhuc sp) {
        SoPhuc spTong = new SoPhuc();
        spTong.pt = pt + sp.pt;
        spTong.pa = pa + sp.pa;
        return spTong;
    }
    
    public SoPhuc truSoPhuc(SoPhuc sp){
        SoPhuc spTru = new SoPhuc();
        spTru.pt = pt-sp.pt;
        spTru.pa = pa-sp.pa;
        return spTru;
    }

    public SoPhuc nhanSoPhuc(SoPhuc sp){
        SoPhuc spNhan = new SoPhuc();
        spNhan.pt = (pt*sp.pt - pa*sp.pa);
        spNhan.pa = (pt*sp.pa + pa*sp.pt);
        return spNhan;
    }
    
    public SoPhuc chiaSoPhuc(SoPhuc sp){
        SoPhuc spChia = new SoPhuc();
        spChia.pt = (pt*sp.pt + pa*sp.pa)/(sp.pt*sp.pt + sp.pa*sp.pa);
        spChia.pa = (pa*sp.pt - pt*sp.pa)/(sp.pt*sp.pt + sp.pa*sp.pa);
        return spChia;
    }
    
    public static void main(String[] args) {
// TODO code application logic here
        SoPhuc sp1 = new SoPhuc(1, 2);
        SoPhuc sp2 = new SoPhuc(3, 4);
        System.out.println("Nhap vao So phuc thu 1: ");
        sp1.nhapSoPhuc();
        System.out.print("- So phuc thu 1: "); 
        sp1.inSoPhuc();
        System.out.println("Nhap vao So phuc thu 2: ");
        sp2.nhapSoPhuc();
        System.out.print("- So phuc thu 2: ");
        sp2.inSoPhuc();
        System.out.println("-------------------------------");
        System.out.print("Tong cua 2 So phuc: ");
        SoPhuc tong = sp1.congSoPhuc(sp2);
        tong.inSoPhuc();
        System.out.print("Hieu cua 2 So phuc: ");
        SoPhuc hieu = sp1.truSoPhuc(sp2);
        hieu.inSoPhuc();
        System.out.print("Tich cua 2 So phuc: ");
        SoPhuc tich = sp1.nhanSoPhuc(sp2);
        tich.inSoPhuc();
        System.out.print("Thuong cua 2 So phuc: ");
        SoPhuc thuong = sp1.chiaSoPhuc(sp2);
        thuong.inSoPhuc();
    }
}
