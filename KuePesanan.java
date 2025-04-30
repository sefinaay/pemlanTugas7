package tugasTujuh;

public class KuePesanan extends Kue{

    //mendeklarasikan atribut berat untuk menyimpan berat kue
    private double berat;

    //memanggil superclass dan inisialisasi atribut berat
    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    //getter untuk mengakses atribut berat 
    public double getBerat(){
        return berat;
    }

    //method ini mengoverride method hitungHarga() dari superclass kue untuk menghitung harga kue pesanan
    //menggunakan rumus harga * berat 
    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    //method ini mengoverride method toString() dari superclass kue untuk menampilkan informasi khusus yang ada di kue pesanan
    @Override
    public String toString(){
        return super.toString() + "\nJenis Kue: Kue Pesanan" +"\nBerat Kue: " + berat + " Kg" + "\nTotal Harga: " + hitungHarga();
    }
} 
