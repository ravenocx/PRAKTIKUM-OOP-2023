import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    List<Konser> listKonser = new ArrayList<>();

    // TODO: Create Method to insert Konser to Database
    public void insertKonser(Konser konser){
        listKonser.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void showKonser(){
        System.out.println("=================================");
        System.out.println("Daftar Acara Konser yang Tersedia:");
        int noBand = 1;
        for (Konser konser : listKonser) {
            System.out.println("\n"+noBand+". " +konser.getNamaBand());
            System.out.println("Tanggal Konser: " +konser.getTanggal());
            System.out.println("Lokasi: " +konser.getLokasi());
            System.out.println("Harga Tiket: " +konser.getHargaTiket());
            noBand++;
        }
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void beliTiket(int noKonser, int jumlahTiket) {
        if (noKonser < listKonser.size()){
            Konser pilihKonser = listKonser.get(noKonser);
            System.out.println("=======================================================");
            System.out.println("Selamat Anda Berhasil Membeli Tiket Konser "+ pilihKonser.getNamaBand());
            System.out.println("Jumlah Tiket yang dibeli: "+ jumlahTiket);
            System.out.println("Total Harga: "+ jumlahTiket * pilihKonser.getHargaTiket());
        }
        else{
            System.out.println("Konser Tidak Ada!");
        }
    }
}
