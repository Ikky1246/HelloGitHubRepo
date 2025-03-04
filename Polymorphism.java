// Kelas induk (superclass) abstrak
abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();

    public void tampilkanInfo() {
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
        System.out.println("-----------");
    }
}

// Kelas Persegi
class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Persegi ===");
        super.tampilkanInfo();
    }
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {
    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Lingkaran ===");
        super.tampilkanInfo();
    }
}

// Kelas Segitiga
class Segitiga extends BangunDatar {
    double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        return 3 * alas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Segitiga ===");
        super.tampilkanInfo();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        BangunDatar[] bangunDatar = {
            new Persegi(4),
            new Lingkaran(7),
            new Segitiga(6, 8)
        };

        for (BangunDatar bd : bangunDatar) {
            bd.tampilkanInfo();
        }
    }
}