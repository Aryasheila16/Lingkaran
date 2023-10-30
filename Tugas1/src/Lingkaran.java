/**
 * Kelas Lingkaran berisi metode-metode untuk menghitung luas dan keliling lingkaran.
 */
class main {
    private double jariJari;

    /**
     * Konstruktor untuk membuat objek Lingkaran dengan jari-jari tertentu.
     *
     * @param jariJari Jari-jari lingkaran.
     */
    public main(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Metode ini menghitung luas lingkaran.
     *
     * @return Luas lingkaran.
     */
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Metode ini menghitung keliling lingkaran.
     *
     * @return Keliling lingkaran.
     */
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen dari baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        // Contoh penggunaan kelas Lingkaran
        main lingkaran = new main(5.0);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
}
