package tugasTujuh;

public class MainKue {

    public static void main(String[] args) {

        //membuat array jenisKue untuk menyimpan 20 objek kue 
        Kue[] jenisKue = new Kue[20];

        //mengisis array jenisKue dengan objek kue jadi dan kue pesanan
        jenisKue[0] = new KuePesanan("Nastar", 7500, 0.5);
        jenisKue[1] = new KueJadi("onde-onde", 3000, 10);
        jenisKue[2] = new KuePesanan("Almond cookies", 160000, 0.121);
        jenisKue[3] = new KueJadi("Putu", 2500, 6);
        jenisKue[4] = new KuePesanan("Kastengel", 90000, 0.5);
        jenisKue[5] = new KueJadi("Kue Lumpur", 5000, 5);
        jenisKue[6] = new KuePesanan("Lidah Kucing", 20000, 0.25);
        jenisKue[7] = new KueJadi("Pandan Cake", 74000, 7);
        jenisKue[8] = new KuePesanan("Bika Ambon", 150000, 0.9);
        jenisKue[9] = new KueJadi("Bolu Gulung", 3500, 7);
        jenisKue[10] = new KuePesanan("Bingka", 34590, 0.52);
        jenisKue[11] = new KueJadi("Klepon", 5000, 12);
        jenisKue[12] = new KuePesanan("Lapis Legit", 450999, 0.7);
        jenisKue[13] = new KueJadi("Kue pukis", 3000, 6);
        jenisKue[14] = new KuePesanan("Sagu Keju", 98000, 0.62);
        jenisKue[15] = new KueJadi("Kue Nagasari", 2590, 9);
        jenisKue[16] = new KuePesanan("Cheesecake", 680000 , 0.16);
        jenisKue[17] = new KueJadi("Banana Roll Cake", 71000, 4);
        jenisKue[18] = new KuePesanan("Tiramisu", 98000, 0.7);
        jenisKue[19] = new KueJadi("Croissant", 42000, 4);

        //menampilkan daftar semua kue yang ada dalam array jenisKue dan detail informasi kue 
        System.out.println("=======Daftar Kue=======");
        for(Kue kue : jenisKue){        //digunakan untuk mengakses setiap elemen dalam array jenisKue
            System.out.println(kue);
            System.out.println();
        }

        //variable untuk menghitung dan menyimpan statistika kue, membantu menampilkan hasil akhir, dan sebagai tempat penyimpanan sementara 
        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargajadi = 0;
        double totalBeratJadi = 0;
        Kue kueTermahal = jenisKue[0];

        //menghitung total harga semua kue, menggunakan for loop untuk mengakses setiap elemen dalam array jenisKue
        for(Kue kue : jenisKue){
            double harga = kue.hitungHarga();       //memanggil method hitungHarga() untuk mendapatkan harga total kue 
            totalHargaSemua += harga;

            //membedakan jenis kue jadi dan kue pesanan menggunakan instanceof, instanceof mengecek tipe objek pada runtime
            if(kue instanceof KuePesanan){
                KuePesanan pesanan = (KuePesanan) kue;      //melakukan casting objek kue menjadi kuePesanan untuk mengakses atribut berat
                //menghitung total harga dan berat kue pesanan
                totalHargaPesanan += harga;
                totalBeratPesanan += pesanan.getBerat();
            }else if(kue instanceof KueJadi){
                KueJadi jadi = (KueJadi) kue;           //melakukan casting objek kue menjadi KueJadi untuk mengakses atribut jumlah
                //menghitung total harga dan jumlah kue jadi
                totalHargajadi += harga;
                totalBeratJadi += jadi.getJumlah();
            }

            //mencari dan menyimpan kue dengan harga akhir terbesar dari semua kue dalam array jenisKue
            //menggunakan operator > untuk membandingkan harga kue saat ini dengan harga kue termahal yang sudah ada sebelumnya
            if(harga > kueTermahal.hitungHarga()){
                kueTermahal = kue;      //jika harga kue saat ini lebih besar dari harga kue termahal, maka kue saat ini menjadi kue termahal 
            }
        }

        //menampilkan hasil akhir dari mana kue yang sudah dipesan dan kue jadi
        System.out.println("==========Informasi Kue==========");
        System.out.println("Total Harga Semua Kue: " + totalHargaSemua);
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + String.format("%.2f", totalBeratPesanan) + " Kg");          //menggunakan String.format untuk membatasi 2 angka dibelakang koma       
        System.out.println("Total Harga Kue Jadi: " + totalHargajadi);
        System.out.println("Total Berat Kue Jadi: " + String.format("%.2f", totalBeratJadi) + " buah");                 //menggunakan String.format untuk membatasi 2 angka dibelakang koma
        System.out.println("Kue Termahal: ");
        System.out.println(kueTermahal);

    }

}
