package bebas3;

//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class mainclass {
    
    //method static
    static void tampilan(){
        
        //scanner input untuk memasukkan input dari user
        Scanner input = new Scanner(System.in);
        
    System.out.println("BADAN USAHA MILIK DAERAH");
    System.out.println("P.T Pembangunan Sejahtera");
    System.out.println("Bersama Kita Bisa Membangun Kesejahteraan");
    System.out.println("Kantor : Jln. Pattimura No 58 Kota Jombang Kode Pos 92828   Telp 02827653425");
    System.out.println("Email : sejahterabersama@gmail.com , Website : www.bersamasejahtera.com ");
    System.out.println("==============================================================================");
    System.out.println("");
     
    System.out.println("Apakah anda ingin sewa gedung? (Ya/Tidak)");
    String jwb = input.nextLine();
        
    System.out.println("");
    System.out.println("=====================================");
    
    //percabangan dan equals string    
    if(jwb.equalsIgnoreCase("Ya")){
    
        System.out.println("Isilah data dibawah ini dengan benar!");
        System.out.println("=====================================");
        System.out.println("");
        
        //objek
        voidclass tampil = new voidclass();
        
        //pemanggilan method void dari kelas voidclass menggunakan objek tampil
        System.out.println(tampil.data1());  //pemanggilan method nonvoid string data1
        tampil.penyewa();                    //pemanggilan method void penyewa
        System.out.println("");
        System.out.println(tampil.data2());  //pemanggilan method nonvoid string data2
        tampil.acara();                      //pemanggilan method void acara
        System.out.println("");
        System.out.println(tampil.data3());  //pemanggilan method nonvoid string data3
        tampil.fasilitas();                  //pemanggilan method void fasilitas
        System.out.println("");
        System.out.println(tampil.data4());  //pemanggilan method nonvoid string data4
        tampil.transaksi();                  //pemanggilan method void transaksi
        System.out.println("=====================================");
        System.out.println("");
        
        System.out.println("Konfirmasi transaksi? (Ya/Tidak)");
        String jawab = input.nextLine();
        
        System.out.println("");
        System.out.println("=================================================================================");
        System.out.println("");
        
        //percabangan dan equals string
        if(jawab.equalsIgnoreCase("Ya")){
            System.out.println("                FORMULIR PENYEWAAN GEDUNG SERBA GUNA");
            System.out.println("                          Jln. Soebrantas         ");
            System.out.println("");
            System.out.println("");
            System.out.println("    Yang Bertanda Tangan Di Bawah Ini: ");
            System.out.println("");
            System.out.println("Nama Lengkap           = "+tampil.nama());         //pemanggilan method nonvoid string nama
            System.out.println("Pekerjaan / Instansi   = "+tampil.kerja());        //pemanggilan method nonvoid string kerja
            System.out.println("Jabatan                = "+tampil.jabatan());      //pemanggilan method nonvoid string jabatan
            System.out.println("Alamat Lengkap         = "+tampil.alamat());       //pemanggilan method nonvoid string alamat
            System.out.println("Nomor Telepon          = "+tampil.telp());         //pemanggilan method nonvoid string telp
            System.out.println("");
            System.out.println("Dengan ini  mengajukan permohonan pengizinan kepada PT. Pembangunan Sejahtera");
            System.out.println("untuk dapat mengizinkan kami memakai / menyewa gedung serba guna dalam rangka");
            System.out.println(tampil.rangka());
            System.out.println("Hari                   = "+tampil.hari());         //pemanggilan method nonvoid string hari
            System.out.println("Tgl / Bln / Thn        = "+tampil.tanggal());      //pemanggilan method nonvoid string tanggal
            System.out.println("Lama Penyewaan         = "+tampil.lama()+" hari"); //pemanggilan method nonvoid integer lama
            System.out.println("Harga Sewa             = Rp."+tampil.harga());     //pemanggilan method nonvoid double harga
            System.out.println("");
            System.out.println("Fasilitas yang didapat untuk "+tampil.tamu()+" tamu undangan adalah : ");
            System.out.println("Juumlah Kursi          = "+tampil.tamu());         //pemanggilan method nonvoid double tamu
            System.out.println("Jumlah Meja            = "+tampil.meja());         //pemanggilan method nonvoid double meja
            System.out.println("");
            System.out.println("Pernyataan Penyewaan Gedung Serba Guna : ");
            System.out.println("  # Membayar sewa Gedung Serba Guna selama "+tampil.lama()+" hari dengan total");   //pemanggilan method nonvoid integer lama
            System.out.println("    biaya sebesar Rp."+tampil.total());            //pemanggilan method nonvoid double total
            System.out.println("");
            System.out.println("Transaksi Pembayaran : ");
            System.out.println("Bayar                  = "+tampil.bayar);          //pemanggilan method nonvoid double bayar
            System.out.println("Kembali                = "+tampil.kembali);        //pemanggilan method nonvoid double kembali
            System.out.println("Keterangan             = LUNAS");
            System.out.println("");
            System.out.println("#Kami bertanggung jawab atas keamanan gedung serba guna selama acara berlangsung");
            System.out.println(" dan siap mengganti atas kerusakan dan kehilangan barang selama pemakaian");
            System.out.println("#Kami tidak bisa mengganti jadwal acara yang telah ditetapkan dalam formulir");
            System.out.println("#Apabila  jadwal  acara  dibatalkan,  uang  sewa  yang  telah  disetor hanya dapat");
            System.out.println(" dikembalikan sebesar 70%");
            System.out.println("");
            System.out.println("");
            System.out.println("       Pemohon,");
            System.out.println("");
            System.out.println(tampil.nama());                                     //pemanggilan method nonvoid string nama
        }
        else if(jawab.equalsIgnoreCase("Tidak")){
            System.out.println("Silahkan Mengulang Kembali!");
        }
    }
    else if(jwb.equalsIgnoreCase("Tidak")){
    System.out.println("Sampai jumpa kembali!");
    }
    }
}

            
        
    
    

