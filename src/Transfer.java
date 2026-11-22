public class Transfer implements MetodeBayar {

    @Override
    public String nama() {
        return "Transfer";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        // Biaya administrasi transfer sebesar Rp2.500.
        return totalBelanja + 2500;
    }
}