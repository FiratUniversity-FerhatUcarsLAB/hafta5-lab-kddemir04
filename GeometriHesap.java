/*
 * Ad Soyad: [Abdulkadir Demir]
 * Ogrenci No: [240541007]
 * Tarih: [7.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

     //kare
    static double calculateSquareArea(double n){//METOT1: KARENIN ALANI
        return n*n;
        //alan = kenar * kenar
    }
    static double calculateSquareCircumference(double kenar){//METOT2: KARENIN CEVRESI
        return 4 * kenar;
        //cevre = 4 * kenar
    }

    static double calculateRectangleArea(double a, double b){//METOT3: DIKDORTGENIN ALANI
       return a * b;
       //alan = kisakenar * uzunkenar
    }

    static double calculateRectangleCircumference(double x, double y){//METOT4: DIKDORTGENIN CEVRESI
       return 2 * (x + y);
       //cevre = 2(kisakenar + uzunkenar)
    }

    static double calculateCircleArea(double radius){//METOT5: CEMBERIN ALANI
       return Math.PI * Math.pow(radius,2);
       //alan = pi * r * r
    }

    static double calculateCircleCircumference(double yari_cap){//METOT6: CEMBERIN CEVRESI
       return 2 * Math.PI * yari_cap;
       //cevre = 2 pi * r
    }

    static double calculateTriangleArea(double h, double first_side){//METOT7: UCGENIN ALANI
       return first_side * h / 2;
       //alan = taban * yukseklik / 2
    }

    static double calculateTriangleCircumference(double a, double b, double c){//METOT8: UCGENIN CEVRESI
       return a + b + c;
       //cevre = birincikenar + ikinci kenar + ucuncukenar
    }



   static void main() {
       Scanner scan = new Scanner(System.in);
       System.out.println("Bir değer giriniz");
       double side = scan.nextDouble();

       //girdiler
       System.out.println("Dikdörtgenin kısa kenarını giriniz");
       double short_side = scan.nextDouble();
       System.out.println("Uzun kenarını giriniz");
       double long_side = scan.nextDouble();
       System.out.println("Dairenin yarıçapını giriniz");
       double yaricap = scan.nextDouble();
       System.out.println("Üçgenin yüksekliğini giriniz");
       double yukseklik =  scan.nextDouble();
       System.out.println("Üçgenin tabanını giriniz");
       double taban =  scan.nextDouble();
       System.out.println("Üçgenin birinci değerini giriniz");
       double birinci = scan.nextDouble();
       System.out.println("Üçgenin ikinci değerini giriniz");
       double ikinci = scan.nextDouble();

       //çıktılar
       System.out.printf("Karenin Alan: %.2f", calculateSquareArea(side));
       System.out.printf("\nKarenin çevresi: %.2f", calculateSquareCircumference(side));
       System.out.printf("\nDikdörtgenin alanı: %.2f", calculateRectangleArea(short_side, long_side));
       System.out.printf("\nDikdörtgenin çevresi: %.2f", calculateRectangleCircumference(short_side, long_side));
       System.out.printf("\nÇemberin alanı: %.2f", calculateCircleArea(yaricap));
       System.out.printf("\nÇemberin çevresi: %.2f", calculateCircleCircumference(yaricap));
       System.out.printf("\nÜçgenin alanı: %.2f", calculateTriangleArea(yukseklik, taban));
       System.out.printf("\nÜçgenin çevresi: %.2f", calculateTriangleCircumference(taban, birinci, ikinci));


       scan.close();
  
    }
}
