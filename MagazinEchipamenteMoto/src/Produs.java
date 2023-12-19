import java.io.*;

public class Produs implements Serializable {

    private String denumire;            // Numele produsului
    private String descriereFull;       // O descriere completa a produsului
    private String descriereShort;      // O descriere scurta a produsului, pentru pagina principala
    private String marca;               // Marca produsului
    private String imagine;             // Calea catre o imagine cu produsul
    private double pret;                // Pretul produsului
    private boolean disponibilitate;    // Se afla sau nu in stoc 

    // Setteri si  getteri pentru datele membre
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDescriereFull() {
        return descriereFull;
    }

    public void setDescriereFull(String descriereFull) {
        this.descriereFull = descriereFull;
    }

    public String getDescriereShort() {
        return descriereShort;
    }

    public void setDescriereShort(String descriereShort) {
        this.descriereShort = descriereShort;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImagine() {
        return imagine;
    }

    public void setImagine(String imagine) {
        this.imagine = imagine;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public boolean getDisponibilitate() {
        return disponibilitate;
    }

    public void setDisponibilitate(boolean disponibilitate) {
        this.disponibilitate = disponibilitate;
    }

    // Constructori pentru obiecte de tip produs
    public Produs() {
        this.denumire = "N/A";
        this.descriereFull = "N/A";
        this.descriereShort = "N/A";
        this.marca = "N/A";
        this.imagine = "N/A";
        this.pret = 0;
        this.disponibilitate = false;
    }

    public Produs(String denumire, String descriereFull, String descriereShort, String marca, String imagine, double pret, boolean disponibilitate) {
        this.denumire = denumire;
        this.descriereFull = descriereFull;
        this.descriereShort = descriereShort;
        this.marca = marca;
        this.imagine = imagine;
        this.pret = pret;
        this.disponibilitate = disponibilitate;
    }

    public Produs(Produs p) {
        this.denumire = p.denumire;
        this.descriereFull = p.descriereFull;
        this.descriereShort = p.descriereShort;
        this.marca = p.marca;
        this.imagine = p.imagine;
        this.pret = p.pret;
        this.disponibilitate = p.disponibilitate;
    }

    @Override
    public String toString() {
        return "Denumire: " + denumire + "\nDescriere completa: \n\t" + descriereFull + 
                "\n\nDescriere scurta: \n\t" + descriereShort + "\n\nMarca: " + marca + 
                "\nPret: " + pret + " RON \n" + (disponibilitate?"Disponibil":"Indisponibil");
    }
    public String toString(int i) {
        return "Denumire: " + denumire + 
                "\nMarca: " + marca + 
                "\nPret: " + pret + " RON \n" + (disponibilitate?"Disponibil":"Indisponibil");
    }
}
