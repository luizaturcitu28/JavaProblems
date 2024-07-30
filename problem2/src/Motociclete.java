public class Motociclete extends Vehicule {
    private String ghidon;

    public Motociclete(String numarInmatriculare, String model, String ghidon) {
        super(numarInmatriculare, model);
        this.ghidon = ghidon;
    }

    public String getGhidon() {
        return ghidon;
    }

    @Override
    public double calculareTaxaParcare() {
        return 5.0;
    }

    @Override
    public void afisareDetalii() {
        super.afisareDetalii();
        System.out.println("Tipul ghidonului motocicletei este: " + ghidon);
    }
}
