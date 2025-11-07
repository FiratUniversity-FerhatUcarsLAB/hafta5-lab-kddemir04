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

    //METOT 2 : IVME hesapla(a = Δv / t)
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
        double velocity = calculateVelocity(x, t);
        double acceleration = calculateAcceleration(deltaV, t);
        double force = calculateForce(mass, acceleration);
        double work = calculateWork(force, x);
        double power = calculatePower(work, t);
        double kineticEnergy = calculateKineticEnergy(mass, velocity);
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);
        double totalEnergy = kineticEnergy + potentialEnergy;
        double momentum = calculateMomentum(mass, velocity);

        // SONUCLARI YAZDIR
            System.out.println("\n==============================");
            System.out.println("      HESAPLAMA SONUCLARI");
            System.out.println("==============================");

            System.out.println("\nHIZ ve HAREKET:");
            System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
            System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);


            System.out.println("\nKUVVET ve IS:");
            System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
            System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
            System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);


            System.out.println("\nENERJI:");
            System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
            System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
            // Toplam enerji = KE + PE
            System.out.printf("  Toplam Enerji             : %.2f J\n", totalEnergy);

            System.out.println("\nMOMENTUM:");
            System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);


            System.out.println("\n========================================");

            input.close();
        }




}
