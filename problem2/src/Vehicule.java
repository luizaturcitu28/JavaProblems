abstract class Vehicule {
    private String numarInmatriculare;
    private String model;

    public Vehicule(String numarInmatriculare, String model) {
        this.numarInmatriculare = numarInmatriculare;
        this.model = model;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public String getModel() {
        return model;
    }

    public abstract double calculareTaxaParcare();

    public void afisareDetalii() {
        System.out.println("Numar de inmatriculare: " + numarInmatriculare);
        System.out.println("Model: " + model);
    }
}
