package eclasses;

public class Eclasses {

    public static void main(String[] args) {
        CustomerManager customerManeger = new CustomerManager();
        customerManeger.Add();
        customerManeger.Remove();
        customerManeger.Update();

        int sayi1 = 10;
        int sayi2 = 30;
        sayi2 = sayi1;
        sayi1 = 34;
        System.out.println(sayi2);
        int[] sayilar = new int[]{2, 3, 4, 5, 6};
        int[] sayilar2 = new int[]{6, 7, 8, 9, 4};
        sayilar2 = sayilar;
        sayilar[3] = 5;
        System.out.println(sayilar[3]);
        String[] sinifA = new String[]{"ahmet", "sema", "ali", "veli"};
        String[] sinifB = new String[]{"ayse", "fatma", "sami","esma"};
        sinifB = sinifA;
       sinifA[3]="kerem";
        for (String sinif : sinifB) {
            System.out.println(sinif);
      }
        
        
               
        

    }

}
