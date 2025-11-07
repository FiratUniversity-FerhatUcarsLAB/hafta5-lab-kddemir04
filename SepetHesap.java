/*
 * Ad Soyad: [Abdulkadir Demir]
 * Ogrenci No: [240541007]
 * Tarih: [8.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

   static final double VAT_RATE = 0.18;
            static final double SHIPPING_FEE = 29.99;

            static double calculateItemTotal(double price, int quantity){//METOT 1: SATIS TOPLAMI

                return price * quantity;
            }

            static double calculateSubTotal(double t1, double t2, double t3){ //METOT 2: ARA TOPLAM (3 URUN FIYATLARININ TOPLAMI)
                return  t1 + t2 + t3;
            }

            static double calculateDiscount(double subTotal, double discountRate){//METOT 3: INDIRIM TUTARI
                return subTotal * (discountRate / 100);
            }
            static double calculateDiscountedTotal(double subTotal, double discountAmount){//METOT 4: INDIRIMLI TOPLAM
                return subTotal - discountAmount;
            }
            static double calculateVAT (double discountedTotal){//METOT 5: KDV TUTARI
               return discountedTotal * VAT_RATE;
            }
            static double calculateGrandTotal(double vat, double discountedTotal){//METOT 6: GENEL TOPLAM

                return vat + discountedTotal + SHIPPING_FEE;
            }

                //girdiler
                static void main() {
                Scanner tara = new Scanner(System.in);
                System.out.println("Birinci ürünün adedini giriniz");
                int qty1 = tara.nextInt();
                System.out.println("Birinci ürün fiyatını giriniz");
                double  price1 = tara.nextDouble();

                System.out.println("Ikinci ürünün adedini giriniz");
                int qty2 = tara.nextInt();
                System.out.println("Ikinci ürün fiyatını giriniz");
                double  price2 = tara.nextDouble();

                System.out.println("Uçüncü ürünün adedini giriniz");
                int qty3 = tara.nextInt();
                System.out.println("Uçüncü ürün fiyatını giriniz");
                double price3 = tara.nextDouble();

                System.out.println("Indirim oranı (%): ");
                double discountRate = tara.nextDouble();

                //HESAPLAMALAR
                double total1 = calculateItemTotal(price1, qty1);
                double total2 = calculateItemTotal(price2, qty2);
                double total3 = calculateItemTotal(price3, qty3);

                double subTotal = total1 + total2 + total3;
                double discount = calculateDiscount(subTotal, discountRate);
                double discountedTotal = calculateDiscountedTotal(subTotal, discount);
                double vat =  calculateVAT(discountedTotal);
                double  grandTotal = calculateGrandTotal(vat, discountedTotal);


                //çıktılar
                System.out.println("===SIPARIS OZETI===");
                System.out.printf("1. ürünün toplam fiyatı: %.2f TL\n", total1);
                System.out.printf("2. ürünün toplam fiyatı: %.2f TL\n", total2);
                System.out.printf("3. ürünün toplam fiyatı: %.2f TL\n", total3);
                System.out.printf("Ara toplam: %.2f TL\n", subTotal);
                System.out.printf("Indırım tutarı: %.0f%% \n", discountRate);
                System.out.printf("Indirimli toplam: %.2f TL\n",  discountedTotal);
                System.out.printf("KDV (%.0f%%) %.2f TL\n", VAT_RATE*100, vat);//KDV %18 90.00 tl
                System.out.printf("Kargo ücreti: %.2f TL\n", SHIPPING_FEE);
                System.out.printf("Genel toplam: %.2f TL\n", grandTotal);
                System.out.println("============================");











        tara.close();

    }


    }




