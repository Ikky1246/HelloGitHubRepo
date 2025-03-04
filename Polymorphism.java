// Kelas abstrak sebagai superclass
abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
    
    public void tampilkanInfo() {
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
        System.out.println("--------------------");
    }
}

// Kelas Persegi
class Persegi extends BangunDatar {
    double sisi;
    
    Persegi(double sisi) {
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
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {
    double r;
    
    Lingkaran(double r) {
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
}

// Kelas Segitiga
class Segitiga extends BangunDatar {
    double alas, tinggi;
    
    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }
    
    @Override
    double keliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        BangunDatar[] bangunList = {
            new Persegi(4),
            new Lingkaran(7),
            new Segitiga(3, 4)
        };
        
        for (BangunDatar bd : bangunList) {
            bd.tampilkanInfo();
        }
    }
}