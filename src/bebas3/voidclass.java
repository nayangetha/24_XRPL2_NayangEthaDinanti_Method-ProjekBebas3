package bebas3;

//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class voidclass {
    
//scanner input untuk memasukkan input dari user
Scanner input = new Scanner(System.in);
    
    //deklarasi variabel lokal
    String nama, alamat,kerja, jabatan, telp, rangka, hari, tanggal;
    int lama;
    double harga = 100000;
    double total, tamu, meja, bayar, kembali;
    
    //method nonvoid string data pertama
    String data1(){
        return " Data Diri Penyewa " ;
    }
    
    //method void penyewa untuk input user
    void penyewa(){
        
        System.out.println("");
        
        System.out.print("Nama Lengkap              : ");
        nama = input.nextLine();
        
        System.out.print("Pekerjaan / Instansi      : ");
        kerja = input.nextLine();
        
        System.out.print("Jabatan                   : ");
        jabatan = input.nextLine();
        
        System.out.print("Alamat Lengkap            : ");
        alamat = input.nextLine();

        System.out.print("No Telp                   : ");
        telp = input.nextLine();
    }
    
    //method nonvoid string data pkedua
    String data2(){
        return " Keterangan Acara ";
    }
    
    //method void acara berisikan input user untuk pengisian data acara
    void acara(){
        
        System.out.println("");
        
        System.out.print("Acara                     : ");
        rangka = input.nextLine();
        
        System.out.print("Hari                      : ");
        hari = input.nextLine();
        
        System.out.print("Tgl /Bln / Thn            : ");
        tanggal = input.nextLine();
        
        System.out.print("Lama Penyewaan (hari)     : ");
        lama = input.nextInt();
        
        System.out.println("Harga Sewa                : "+harga);
        
        total = lama*harga;
        System.out.println("Total Harga Sewa selama "+lama+" hari adalah Rp."+total);
        
    }
    
    //method nonvoid string data ketiga
    String data3(){
        return " Fasilitas ";
    }
    
    //method void fasilitas berisikan input user untuk data fasilitas
    void fasilitas(){
        
        System.out.println("");
        
        System.out.print("Jumlah Tamu Undangan (500/1000/1500/2000): ");
        tamu = input.nextInt();
        
        System.out.println("Jumlah Kursi         : "+tamu);
        
        meja = tamu/4;
        System.out.println("Jumlah Meja          : "+meja);
        
    }
    
    //method nonvoid string data keempat
    String data4(){
        return " Pembayaran ";
    }
    
    //method void transaksi berisikan input user untuk data transaksi
    void transaksi(){
        System.out.println("");
        
        System.out.print("Bayar                  : Rp.");
        bayar = input.nextInt();
        
        //percabangan untuk menghitung kembalian
        if (bayar>=total){
            kembali = bayar-total;
            System.out.println("Kembali                : Rp."+kembali);
        }
        else if(bayar<total){
            System.out.print("Uang anda tidak cukup, silahkan mengulang kembali!");
        }
    }
    
    //method nonvoid string untuk mengembalikan nilai nama yang telah di input user
    String nama(){
        return nama;
    }
    //method nonvoid string untuk mengembalikan nilai kerja yang telah di input user
    String kerja(){
        return kerja;
    }
    //method nonvoid string untuk mengembalikan nilai jabatan yang telah di input user
    String jabatan(){
        return jabatan;
    }
    //method nonvoid string untuk mengembalikan nilai alamat yang telah di input user
    String alamat(){
        return alamat;
    }
    //method nonvoid string untuk mengembalikan nilai telp yang telah di input user
    String telp(){
        return telp;
    }
    //method nonvoid string untuk mengembalikan nilai rangka yang telah di input user
    String rangka(){
        return rangka;
    }
    //method nonvoid string untuk mengembalikan nilai hari yang telah di input user
    String hari(){
        return hari;
    }
    //method nonvoid string untuk mengembalikan nilai tanggal yang telah di input user
    String tanggal(){
        return tanggal;
    }
    //method nonvoid integer untuk mengembalikan nilai lama yang telah di input user
    int lama(){
        return lama;
    }
    //method nonvoid double untuk mengembalikan nilai harga
    double harga(){
        return harga;
    }
    //method nonvoid double untuk mengembalikan nilai total yang telah dihitung
    double total(){
        return total;
    }
    //method nonvoid double untuk mengembalikan nilai tamu yang telah di input user
    double tamu(){
        return tamu;
    }
    //method nonvoid double untuk mengembalikan nilai meja yang telah dihitung
    double meja(){
        return meja;
    }
    //method nonvoid double untuk mengembalikan nilai bayar yang telah di input user
    double bayar(){
        return bayar();
    }
    //method nonvoid double untuk mengembalikan nilai kembali yang telah dihitung
    double kembali(){
        return kembali;
    }
}



    
    

