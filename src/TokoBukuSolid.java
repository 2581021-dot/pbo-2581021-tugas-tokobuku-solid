
public class TokoBukuSolid {

    public static void main(String[] args) {

        // Membuat objek buku
        Buku buku1 = new BukuCetak(
                "Pemrograman Java",
                "John Doe",
                120000,
                750,
                10000
        );

        Buku buku2 = new BukuCetak(
                "Algoritma Dasar",
                "Jane Smith",
                95000,
                400,
                5000
        );

        Buku buku3 = new BukuDigital(
                "Belajar OOP",
                "Ani Wijaya",
                80000,
                12.5,
                20
        );

        Buku buku4 = new BukuAudio(
                "Kisah Programmer",
                "Budi Santoso",
                60000,
                240,
                10
        );

        // Membuat keranjang pertama
        Keranjang keranjang1 = new Keranjang();

        keranjang1.tambah(buku1);
        keranjang1.tambah(buku2);
        keranjang1.tambah(buku3);
        keranjang1.tambah(buku4);

        // Membuat keranjang kedua
        Keranjang keranjang2 = new Keranjang();

        keranjang2.tambah(buku3);

        // Membuat pilihan metode pembayaran
        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };

        // Membuat objek printer
        StrukPrinter printer = new StrukPrinter();

        // Mencetak keranjang pertama
        printer.cetakKeranjang(
                "KERANJANG PERTAMA",
                keranjang1
        );

        printer.cetakPembayaran(
                keranjang1.hitungTotal(),
                pilihan
        );

        // Mencetak keranjang kedua
        printer.cetakKeranjang(
                "KERANJANG KEDUA",
                keranjang2
        );

        printer.cetakPembayaran(
                keranjang2.hitungTotal(),
                pilihan
        );
    }
}
