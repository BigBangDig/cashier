package model;

public class Barang extends Model{
    private String kodeBarang;
    private  String namaBarag;
    private  int hargaBarang;

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarag() {
        return namaBarag;
    }

    public void setNamaBarag(String namaBarag) {
        this.namaBarag = namaBarag;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", namaBarag='" + namaBarag + '\'' +
                ", hargaBarang=" + hargaBarang +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                ", createdBy='" + createdBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
