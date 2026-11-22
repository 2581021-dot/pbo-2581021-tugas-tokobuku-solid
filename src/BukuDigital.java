
public class BukuDigital extends Buku
        implements BisaDiunduh {

    private double ukuranFile;
    private int diskon;

    public BukuDigital(String judul, String penulis,
                       int harga, double ukuranFile,
                       int diskon) {

        super(judul, penulis, harga);
        this.ukuranFile = ukuranFile;
        this.diskon = diskon;
    }

    @Override
    public double getUkuranFileMB() {
        return ukuranFile;
    }

    @Override
    public String getKeterangan() {
        return ukuranFile + " MB, diskon "
                + diskon + "%";
    }

    @Override
    public int getHargaAkhir() {
        return harga * (100 - diskon) / 100;
    }
}
