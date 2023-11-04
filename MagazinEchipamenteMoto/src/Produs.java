
public class Produs {

    private String denumire;            // Numele produsului
    private String descriere;           // O descriere, ceva despre produs
    private String marca;               // Marca produsului
    private String imagine;             // Calea catre o imagine cu produsul
    private float pret;                 // Pretul produsului
    private boolean disponibilitate;    // Se afla sau nu in stoc 
    
    // Setteri si  getteri pentru datele membre
    public String getDenumire(){
        return denumire;
    }
    public void setDenumire(String denumire){
        this.denumire = denumire;
    }
    public String getDesrirere(){
        return descriere;
    }
    public void setDescriere(String descriere){
        this.descriere = descriere;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getImagine(){
        return imagine;
    }
    public void setImagine(String imagine){
        this.imagine = imagine;
    }
    public float getPret(){
        return pret;
    }
    public void setPret(float pret){
        this.pret = pret;
    }
    public boolean getDisponibilitate(){
        return disponibilitate;
    }
    public void setDisponibilitate(boolean disponibilitate){
        this.disponibilitate = disponibilitate;
    }
    
    // Constructori pentru obiecte de tip produs
    public Produs(){
        this.denumire = null;
        this.descriere = null;
        this.marca = null;
        this.imagine = null;
        this.pret = 0;
        this.disponibilitate = false;
    }
    public Produs(String denumire, String descriere, String marca, String imagine, float pret, boolean disponibilitate) {
        this.denumire = denumire;
        this.descriere = descriere;
        this.marca = marca;
        this.imagine = imagine;
        this.pret = pret;
        this.disponibilitate = disponibilitate;
    }
    public Produs(Produs p){
        this.denumire = p.denumire;
        this.descriere = p.descriere;
        this.marca = p.marca;
        this.imagine = p.imagine;
        this.pret = p.pret;
        this.disponibilitate = p.disponibilitate;
    }
}
