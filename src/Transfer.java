public class Transfer implements MetodeBayar {

    @Override
    public String nama() {
        return "Transfer";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja + 2500;
    }
}