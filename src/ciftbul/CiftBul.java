package ciftbul;

import java.util.Scanner;

public class CiftBul {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Kaçıncı Sayıya Kadar Bulmak İstediğinizi Girin : ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        int deger = 0;
        
        
        for(int i = 0; i<=sayi ; i++){
            
            if(i % 3 == 0 || i % 4 == 0){
                toplam += i;
                deger++;
            }
        }
        
        double ortalama = (double) toplam / deger;
        System.out.println("Ortalama: " + ortalama );
        
    }
    
}
