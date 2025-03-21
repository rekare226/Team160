package ders12_String_Manipulations;

public class C10_endsWith {

    public static void main(String[] args) {

String str="Java ogrenmek guzel";

        System.out.println(str.endsWith("Java"));//false
        System.out.println(str.endsWith("guzel"));//true
        System.out.println(str.endsWith("zel"));
        System.out.println(str.endsWith(""));


        System.out.println("=======================");

        System.out.println(str.endsWith("Java ogrenmek guzel"));//truve
        System.out.println(str.startsWith("Java ogrenmek guzel"));//true
        System.out.println(str.equals("Java ogrenmek guzel"));//true
        System.out.println(str.contains("Java ogrenmek guzel"));//true
        System.out.println(str.equalsIgnoreCase("Java ogrenmek guzel"));//true


        System.out.println(str.endsWith("Java"));//false
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.equals("Java"));//false
        System.out.println(str.contains("Java"));//true
        System.out.println(str.equalsIgnoreCase("Java"));//false



        System.out.println(str.endsWith("guzel"));//true
        System.out.println(str.startsWith("guzel"));//false
        System.out.println(str.equals("guzel"));//false
        System.out.println(str.contains("guzel"));//true
        System.out.println(str.equalsIgnoreCase("guzel"));//false

    }
}
