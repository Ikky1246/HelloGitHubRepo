// Kelas induk (superclass) abstrak
abstract class Kendaraan {
    abstract void jalan();
    
    public void tampilkanInfo() {
        jalan();
        System.out.println("--------------------");
    }
}

// Kelas Mobil
class Mobil extends Kendaraan {
    @Override
    void jalan() {
        System.out.println("Mobil berjalan dengan empat roda.");
    }
}

// Kelas Motor
class Motor extends Kendaraan {
    @Override
    void jalan() {
        System.out.println("Motor berjalan dengan dua roda.");
    }
}

// Kelas Sepeda
class Sepeda extends Kendaraan {
    @Override
    void jalan() {
        System.out.println("Sepeda dikayuh untuk berjalan.");
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Array dari tipe Kendaraan untuk menyimpan berbagai jenis kendaraan
        Kendaraan[] kendaraanList = {
            new Mobil(),
            new Motor(),
            new Sepeda()
        };

        // Loop untuk menampilkan info setiap kendaraan tanpa mengetahui tipenya
        for (Kendaraan k : kendaraanList) {
            k.tampilkanInfo();
        }
    }
}