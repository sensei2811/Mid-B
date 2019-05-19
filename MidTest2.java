/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest2;
import java.util.Scanner;
class a{
    String nama;
    int hargamotor,lamakredit,hargapokok;
    Double bunga,cicilan,totalhargamotor;
    double untung;
    public int rumus1(){
        return hargapokok=hargamotor/lamakredit;
    }
    public double rumus2(){
        return bunga=hargapokok*0.1;
    }
    public double rumus3(){
        return cicilan=hargapokok+bunga;
    }
    public double rumus4(){
        return totalhargamotor=cicilan*lamakredit;
    }
    public double rumus5(){
        return untung=totalhargamotor-hargapokok;
    }
    public void cetak(){
        System.out.println("Nama :"+nama);
        System.out.println("Hargamotor :"+hargamotor);
        System.out.println("Lama Kredit :"+lamakredit);
        System.out.println("Harga Pokok :"+hargapokok);
        System.out.println("Bunga :"+bunga);
        System.out.println("Cicilan :"+cicilan);
        System.out.println("Total Harga Motor :"+totalhargamotor);
        System.out.println("Keuntungan Dealer :"+untung);
    }
}
/**
 *
 * @author Wahyu Ari Nugroho
 */
public class MidTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        a A=new a();
        System.out.println("PEMBAYARAN SEPEDA MOTOR KREDIT");
        System.out.println("Masukan Nama :"); A.nama=input.nextLine();
        System.out.println("Masukan Harga Motor :"); A.hargamotor=input.nextInt();
        System.out.println("Masukan Lama Kredit bulanan :"); A.lamakredit=input.nextInt();
        System.out.println("===================================");
        A.rumus1();
        A.rumus2();
        A.rumus3();
        A.rumus4();
        A.rumus5();
        A.cetak();
    }
    
}
