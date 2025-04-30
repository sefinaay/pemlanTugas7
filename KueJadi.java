package tugasTujuh;

public class KueJadi extends Kue{

    //mendeklarasi atribut jumlah untuk menyimpan banyak kue 
    private double jumlah;

    //memanggil superclass dan inisialisasi atribut jumlah 
    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);          //memanggil konstruktor dari superclass Kue untuk menginisialisasi atribut nama dan harga karena constructor tidak diizinkan untuk diakses langsung
        this.jumlah = jumlah;
    }

    //getter untuk mengakses atribut jumlah 
    public double getJumlah(){
        return jumlah;
    }

    //method ini mengoverride method hitungHarga() dari superclass Kue untuk menghitung harga kue jadi
    //menggunakan rumus harga * jumlah kue * 2
    @Override
    public double hitungHarga(){
        return getHarga()* jumlah * 2;
    }

    //method ini mengoverride method toString() dari superclass Kue untuk menampilkan informasi khusus yang ada di kue jadi
    @Override
    public String toString(){
        return super.toString() + "\nJenis Kue: Kue Jadi" + "\nJumlah Kue: " + jumlah + " buah" + "\nTotal Harga: " + hitungHarga();
    }
}
