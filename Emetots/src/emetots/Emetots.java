/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emetots;

import java.util.Scanner;

/**
 *
 * @author selami
 */
public class Emetots {

    public static void main(String[] args) {
      
        sayibilmaca();
        
    }
    public static void sayibilmaca(){
    
      int[] nummers= new int[]{1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("lutfen kontrol edilecek sayiyi giriniz");
        
        Scanner  klavye = new Scanner(System.in);
        int sayim =klavye.nextInt();
       
        
        
        for(int i=0;i<10;i++){
        if (sayim==nummers[i]){
       
            System.out.println("sayi bulundu");
     break;
        }else {
        
            System.out.println("sayi bulunamadi");
        }
        
        }
    }
}
