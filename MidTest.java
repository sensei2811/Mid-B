/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.test;
import java.util.Scanner;
class variable2 {
    int sqrt,alas,tinggi;
    int alasmiring,keliling;
    public int rumusmiring(){
    return alasmiring=(int)sqrt*(alas*alas+tinggi*tinggi);
    }
    public int rumuskeliling(){
    return keliling=(int)alas+tinggi+alasmiring;    
    }
    
}
/**
 *
 * @author Wahyu Ari Nugroho
 */
public class MidTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        variable2 a=new variable2();
        Scanner input =new Scanner(System.in);
        System.out.println("Menghitung Sisi-sisi Miring dan Keliling");
        System.out.println("Masukkan Sisitegak mendatar :"); a.sqrt=input.nextInt();
        System.out.println("Masukan Alas :"); a.alas=input.nextInt();
        System.out.println("Masukan Tinggi :"); a.tinggi=input.nextInt();
        System.out.println("Sisi Miring :"+a.rumusmiring());
        System.out.println("Rumus Keliling :"+a.rumuskeliling());
    }
    
}
