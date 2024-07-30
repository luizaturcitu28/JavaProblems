public class Masina extends Vehicule{
    private int numarUsi;

    public Masina(String numarInmatriculare, String model, int numarUsi) {
        super(numarInmatriculare, model);
        this.numarUsi = numarUsi;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    @Override
    public double calculareTaxaParcare() {
        return 10.0;
    }

    @Override
    public void afisareDetalii() {
        super.afisareDetalii();
        System.out.println("Numarul de usi al masinii este: " + numarUsi);
    }
}
