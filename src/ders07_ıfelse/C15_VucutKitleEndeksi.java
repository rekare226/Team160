package ders07_ıfelse;

import java.util.Scanner;

public class C15_VucutKitleEndeksi {

    public static void main(String[] args) {

// Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Vücüt kitle endeksini hesaplamak için \n kg olarak kilonuzu ve cm olarak boyunuzu");
        System.out.print("kilonuz : ");
        double kilo = scanner.nextDouble();
        System.out.print("boyunuz :");
        int boy = scanner.nextInt();
        double vke = kilo * 1000 / (boy * boy);

        if (vke > 30) {

            System.out.println("obez");
        } else if (vke > 25) {
            System.out.println("kilolu");


        } else if (vke > 20) {
            System.out.println("normal");
        } else {

            System.out.println("zayıf");
        }

/*



        if (vke < 20) {

            System.out.println("zayıf");
        } else if (vke > 25) {
            System.out.println("kilolu");


        } else if (vke < 30) {
            System.out.println("normal");
        } else {

            System.out.println("obez");
        }


 */



    }
}
