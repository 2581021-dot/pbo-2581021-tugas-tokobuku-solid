public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        // Voucher tidak boleh membuat total pembayaran menjadi negatif.
        return Math.max(0, totalBelanja - nilai);
    }
}