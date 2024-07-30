//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creati un sistem pentru gestionarea vehiculelor intr-o parcare. Sistemul trebuie sa poata gestiona mai multe tipuri de vehicule: masini si motociclete.
        //Fiecare vehicul are un numar de inmatriculare si un model. Masinile au in plus un numar de usi, iar motocicletele au un tip de ghidon.
        //Sistemul trebuie sa permita adaugarea de vehicule in parcare, afisarea detaliilor fiecarui vehicul si calcularea taxei de parcare bazata pe tipul vehiculului.

        Parcare parcare = new Parcare();

        Masina masina1 = new Masina("ABC 123", "Mercedes", 4);
        Motociclete motocicleta1 = new Motociclete("XYZ 123", "Harley Davidson", "Sport");

        parcare.adaugareVehicule(masina1);
        parcare.adaugareVehicule(motocicleta1);

        parcare.afisareVehicule();
    }
}