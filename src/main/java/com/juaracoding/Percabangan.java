package com.juaracoding;

public class Percabangan {
    public static void main(String[] args) {

        //if-majemuk
        int ang = 10;
        if (ang % 2 == 0){
            System.out.println("angka genap");
        }
        else {
            System.out.println("angka ganjil");
        }

        //if majemuk
        String size = "XL";
        int harga = 0;
        if (size == "S"){
            System.out.println("ukuran baju S");
            harga = 30000;
        } else if (size == "M") {
            System.out.println("ukuran baju M");
            harga = 50000;
        } else if (size == "L") {
            System.out.println("ukuran baju L");
            harga = 70000;
        } else {
            System.out.println("ukuran baju XL");
            harga = 90000;
        }
        System.out.println("Size: "+size+"\nHarga: "+harga);

        //nested if

    }
}
