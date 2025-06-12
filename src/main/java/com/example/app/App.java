package com.example.app;

/**
 * Kelas utama untuk menjalankan aplikasi.
 */
public class App {

    // Private constructor to prevent instantiation
    private App() {
        // Utility class
    }

    /**
     * Entry point aplikasi.
     *
     * @param args parameter dari command line
     */
    public static void main(final String[] args) {
        final int x = 2;
        final int y = 3;
        System.out.println(add(x, y));
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
