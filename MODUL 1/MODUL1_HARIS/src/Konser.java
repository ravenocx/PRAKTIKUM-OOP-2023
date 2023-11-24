public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String namaBand;
    private String tanggal;
    private String lokasi;
    private double hargaTiket;

    public void setNamaBand(String namaBand){
        this.namaBand = namaBand;
    }

    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }

    public void setHargaTiket(double hargaTiket){
        this.hargaTiket = hargaTiket;
    }

    public String getNamaBand(){
        return namaBand;
    }

    public String getTanggal(){
        return tanggal;
    }

    public String getLokasi(){
        return lokasi;
    }

    public double getHargaTiket(){
        return hargaTiket;
    }

}