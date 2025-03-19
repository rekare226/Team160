package ders40_Varraks;

import java.util.Scanner;

public class C04_KodOkuma {

    public static void main(String[] args) {

        elemanYazdir("Ali",1,2,3,4);//3
        elemanYazdir("Kerim",3,5,7,8,1,0,3,4,5);//4
        
        islem(2,3,4,5,6,7,8,9);//13
    }

    public static void elemanYazdir(String s, int...v) {

        System.out.println(v[s.length()-1]);//3
    }

    public static void islem(int sayi1,int sayi2,int...sayilar){

        System.out.println(sayilar[sayi1]+sayilar[sayi2]); //sayilar[4,5,6,7,8,9]



    }


}
