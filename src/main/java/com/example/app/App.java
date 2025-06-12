package com.example.app;

/**
 * Kelas utama untuk menjalankan aplikasi.
 */
public class App {

    /**
     * Entry point aplikasi.
     *
     * @param args parameter dari command line
     */
    public static void main(final String[] args) {
        System.out.println(add(2, 3));
    }

    /**
     * Menjumlahkan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penjumlahan
     */
    public static int add(final int a, final int b) {
        return a + b;
    }
}
