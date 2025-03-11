public abstract class Shape {
    protected String color; // Atribut warna (dapat diakses oleh subclass)

    // Konstruktor
    public Shape(String color) {
        this.color = color;
    }

    // Method abstrak untuk menghitung luas
    // (wajib di-override oleh kelas turunan)
    public abstract double getArea();

    // Method aksesori (getter) untuk color
    public String getColor() {
        return color;
    }
}

public class Triangle extends Shape {
    private double base;
    private double height;

    // Konstruktor
    public Triangle(String color, double base, double height) {
        super(color);      // Memanggil konstruktor kelas induk (Shape)
        this.base = base;
        this.height = height;
    }

    // Override method abstrak getArea() dari kelas Shape
    @Override
    public double getArea() {
        return 0.5 * base * height;  // Rumus luas segitiga = ½ × alas × tinggi
    }
}

public class Circle extends Shape {
    private double radius;

    // Konstruktor
    public Circle(String color, double radius) {
        super(color);     // Memanggil konstruktor kelas induk (Shape)
        this.radius = radius;
    }

    // Override method abstrak getArea() dari kelas Shape
    @Override
    public double getArea() {
        return Math.PI * radius * radius;  // Rumus luas lingkaran = π × r²
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek segitiga dan lingkaran
        Shape segitiga = new Triangle("Merah", 4.0, 3.0);
        Shape lingkaran = new Circle("Biru", 2.5);

        // Menampilkan informasi segitiga
        System.out.println("Warna Segitiga  : " + segitiga.getColor());
        System.out.println("Luas Segitiga   : " + segitiga.getArea());

        // Menampilkan informasi lingkaran
        System.out.println("Warna Lingkaran : " + lingkaran.getColor());
        System.out.println("Luas Lingkaran  : " + lingkaran.getArea());
    }
}