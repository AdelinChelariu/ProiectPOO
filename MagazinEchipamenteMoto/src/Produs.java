
public class Produs {

    private String denumire;            // Numele produsului
    private String descriereFull;       // O descriere completa a produsului
    private String descriereShort;      // O descriere scurta a produsului, pentru pagina principala
    private String marca;               // Marca produsului
    private String imagine;             // Calea catre o imagine cu produsul
    private float pret;                 // Pretul produsului
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

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
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
        this.denumire = null;
        this.descriereFull = null;
        this.descriereShort = null;
        this.marca = null;
        this.imagine = null;
        this.pret = 0;
        this.disponibilitate = false;
    }

    public Produs(String denumire, String descriereFull, String descriereShort, String marca, String imagine, float pret, boolean disponibilitate) {
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
        return "Denumire=" + denumire + "\nDescriere completa: " + descriereFull + 
                "\nDescriere scurta: " + descriereShort + "\nMarca: " + marca + 
                "\nPret: " + pret + (disponibilitate?"Disponibil":"Indisponibil");
    }
}
