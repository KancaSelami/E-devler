/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emetotödev;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Emetotödev {

   
    public static void main(String[] args) {
        
        bilgiler();
       int toplam =topla(5,4,3,2,4);
        System.out.println(toplam);
        
    }
    public static int topla(int... sayilar){
    int toplam = 0;
    for(int sayi:sayilar){
    toplam=toplam+sayi;
    
    }
        return toplam;
    }    
    
    public static void bilgiler(){
    String ad;
    String soyadi = null;
    int yasi;
    String sehir = null;
    Scanner klavye=new Scanner (System.in);
        System.out.println("lutfen adinizi giriniz");
        ad=klavye.next();
        System.out.println("lutfen soyadinizi giriniz");
        soyadi=klavye.next();
        System.out.println("lutfen yasinizi giriniz");
        yasi=klavye.nextInt();
        System.out.println("lutfen yasadiginiz sehiri  giriniz");
        sehir=klavye.next();
        
        String sifre;
        sifre= ad.substring(0, 3)+soyadi.substring(0,2)+yasi+sehir.substring(0, 4);
        System.out.println("sizin icin olusturulan sifre= "+sifre);
        }
    
    
}
