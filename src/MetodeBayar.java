
public interface MetodeBayar {

    String nama();

    // Kontrak:
    // Hasil totalBayar tidak pernah negatif.
    int totalBayar(int totalBelanja);
}
