package ders13_String_manipulations;

import java.util.Scanner;

public class C15_KullanımSayisiniBulmaSoru {
    public static void main(String[] args) {


        // kullanıcıdan bir cümle ve cümlede aratılacak bir metin isteyin
        //girilen cümle ve metin e göre asagidaki 3 sonucdan uygun olanı yazdırın
        //1- cümle aranan metni içermiyor yazsın
        //2-cümle aranan metni sadece 1 adet içeriyor yazsın
        //3- cümle aranan metni 1 den fazla içeriyor yazsın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenCumle=scanner.nextLine();
        System.out.println("lütfen aranacak metni giriniz");
        String aranacakMetin=scanner.nextLine();
        int count=0;
        int metinIlkIndeksi=girilenCumle.indexOf(aranacakMetin);
        int metinIkinciIndeksi=girilenCumle.indexOf(aranacakMetin,metinIlkIndeksi+1);
        if (!girilenCumle.contains(aranacakMetin)){
            System.out.println("cümlede aranan metin yok");
        }

        if (metinIkinciIndeksi>metinIlkIndeksi)
            System.out.println("aranan metin birden fazla var");
        else {
            System.out.println("aranan metin bir tanecik var");
        }











    }
}
