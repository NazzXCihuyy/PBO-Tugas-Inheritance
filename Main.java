package Inheritance;


public class Main {
    public static void main(String[] args) {

        Persegi p = new Persegi(5);
        System.out.println("-Persegi");
        System.out.println("Luas: " + p.luas());
        System.out.println("Keliling: " + p.keliling());

        Lingkaran lingkar = new Lingkaran(7);
        System.out.println("\n-Lingkaran");
        System.out.println("Luas: " + lingkar.luas());
        System.out.println("Keliling: " + lingkar.keliling());

        PersegiPanjang pp = new PersegiPanjang(8, 4);
        System.out.println("\n-Persegi Panjang");
        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());

        Segitiga s = new Segitiga(6, 8);
        System.out.println("\n-Segitiga");
        System.out.println("Luas: " + s.luas());
        System.out.println("Keliling: " + s.keliling());
    }
}

//parent 
class BDatar {

    public float luas() {
        return 0;
    }

    public float keliling() {
        return 0;
    }
}

//child 
class Persegi extends BDatar {

    float sisi;

    public Persegi(float s) {
        this.sisi = s;
    }

    //Override
    public float luas() {
        return sisi * sisi;
    }

    //Override
    public float keliling() {
        return 4 * sisi;
    }
}

//child class
class Lingkaran extends BDatar {

    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    //Override
    public float luas() {
        return 3.14f * r * r;
    }

    //Override
    public float keliling() {
        return 2 * 3.14f * r;
    }
}

//child 
class PersegiPanjang extends BDatar {

    float panjang;
    float lebar;

    public PersegiPanjang(float p, float l) {
        this.panjang = p;
        this.lebar = l;
    }

    //Override
    public float luas() {
        return panjang * lebar;
    }

    //Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

//child 
class Segitiga extends BDatar {

    float alas;
    float tinggi;

    public Segitiga(float a, float t) {
        this.alas = a;
        this.tinggi = t;
    }

    //Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    //Override
    public float keliling() {
        float m = (float) Math.sqrt(
            alas * alas + tinggi * tinggi
        );
        return alas + tinggi + m;
    }
}