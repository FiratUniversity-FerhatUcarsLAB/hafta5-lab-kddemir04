/*
 * Ad Soyad: [Abdulkadir Demir]
 * Ogrenci No: [240541007]
 * Tarih: [7.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    //Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8;// m/s^2;

    //METOT 1 : Hız hesapla( v = s / t)
    static double calculateVelocity(double distance, double time) {
        //v = mesafe / zaman
        return distance / time;

    }

    //METOT 2 : IVME hesapla(a = DV / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        //a = hiz degisimi / zaman
        return velocityChange / time;
    }


    //METOT 3 : Kuvvet hesapla ( F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        //r = kutle * ivme
        return mass * acceleration;
    }

    //METOT 4: Iş hesapla (W = F * d)
    public static double calculateWork(double f, double d){
    //W = kuvvet * mesafe
        return f *d;

}

    //METOT 5: Güç Hesapla(P = W / t)
    public static double calculatePower(double work, double time){
        //P = İs / zaman
        return work / time;
    }

    //METOT 6: Kinetik Enerji (KE = 0.5 * M * v ^2)
    public static double calculateKineticEnergy(double mass, double velocity){
        //KE = 0.5 * kutle * (hiz * hiz)
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    //METOT 7: Potansiyel Enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height){
        //PE = kutle * yercekimi * yukseklik
        return  mass * gravity * height;
    }

    //METOT 8: Momentum(P = m * v)
    public static double calculateMomentum(double mass, double velocity){
        //p = kutle * hiz
        return mass * velocity;
    }
        static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===\nFIZIK FORMUL ASISTANI===");
        System.out.println();

        //TEMEL OLCUMLER
        System.out.println("TEMEL OLCUMLER");
        System.out.println("Mesafe(m): ");
        double x = input.nextDouble();

        System.out.println("Zaman (s): ");
        double t = input.nextDouble();

        System.out.println("Hiz degisimi (m/s): ");
        double deltaV =  input.nextDouble();

        System.out.println("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.println("Yukseklik (m): ");
        double height = input.nextDouble();
        
        //METOTLAR
        calculateVelocity(x, t);
        calculateAcceleration(deltaV, t);
        calculateVelocity(mass, calculateAcceleration(deltaV, t));
        calculateWork(calculateForce(mass, calculateAcceleration(deltaV, t)), x);
        calculatePower((calculateWork(calculateForce(mass, calculateAcceleration(deltaV, t)),x)),t);
        calculateKineticEnergy(mass, calculateVelocity(x, t));
        calculateMomentum(mass, calculateVelocity(x, t));
        
        // SONUCLARI YAZDIR
            System.out.println("\n==============================");
            System.out.println("      HESAPLAMA SONUCLARI");
            System.out.println("==============================");

            System.out.println("\nHIZ ve HAREKET:");
            System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", calculateVelocity(x, t));
            System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", calculateAcceleration(deltaV, t));


            System.out.println("\nKUVVET ve IS:");
            System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", calculateForce(mass,calculateAcceleration(deltaV, t)));
            System.out.printf("  Is (W = F*d)              : %.2f J\n", calculateWork(calculateForce(mass, calculateAcceleration(deltaV, t)),x));
            System.out.printf("  Guc (P = W/t)             : %.2f W\n", calculatePower(calculateWork(calculateForce(mass, calculateAcceleration(deltaV, t)), x),t));


            System.out.println("\nENERJI:");
            System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", calculateKineticEnergy(mass, calculateVelocity(x, t)));
            System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", calculatePotentialEnergy(mass, GRAVITY, height));
            // Toplam enerji = KE + PE
            System.out.printf("  Toplam Enerji             : %.2f J\n", (calculateKineticEnergy(mass, calculateVelocity(x, t))+ calculatePotentialEnergy(mass, GRAVITY, height)));

            System.out.println("\nMOMENTUM:");
            System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", calculateMomentum(mass, calculateVelocity(x, t)));


            System.out.println("\n========================================");
        }

        input.close();
    }
}
