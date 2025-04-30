package tugasTujuh;

//Menggunakan abstract class untuk mendefinisikan konsep umum kue
public abstract class Kue {

    //mendeklarasi atribut nama dan harga dengan private mencegah manipulasi data yang tidak diinginkan 
    private String nama;
    private double harga;

    //inisialisasi nama dan harga 
    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    //methodn abstract untuk menghitung harga kue yang harus diimplementasikan subclass
    public abstract double hitungHarga();

    //method untuk menampilkan informasi kue dan akan digunakan oleh subclass 
    public String toString(){
        return "Nama Kue: " + nama + "\nHarga Kue: " + harga;
    }

    //getter agar kelas lain bisa mengakses atribut nama dan harga, karena atribut tersebut private 
    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }

}
