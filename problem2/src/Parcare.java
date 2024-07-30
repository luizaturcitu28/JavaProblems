import java.util.ArrayList;

public class Parcare {
    private ArrayList<Vehicule> vehicule;

    public Parcare() {
        vehicule = new ArrayList<>();
    }

    public void adaugareVehicule(Vehicule vehicul) {
        vehicule.add(vehicul);
    }

    public void afisareVehicule() {
        for(Vehicule vehicul : vehicule) {
            vehicul.afisareDetalii();
            System.out.println("Taxa de parcare: " + vehicul.calculareTaxaParcare());
            System.out.println("---------------------");
        }
    }
}
