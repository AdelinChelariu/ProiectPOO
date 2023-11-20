public class SuportTelefonMobil extends Produs {
    private String prindere; //tip prindere: oglinda, ghidon
    private String material; //plastic, metal
    private double diagonalaTelefon; //dimensiunea dispozitivului prins in suport

    public void setPrindere(String prindere) {
        this.prindere = prindere;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDiagonalaTelefon(double diagonalaTelefon) {
        this.diagonalaTelefon = diagonalaTelefon;
    }

    public String getPrindere() {
        return prindere;
    }

    public String getMaterial() {
        return material;
    }

    public double getDiagonalaTelefon() {
        return diagonalaTelefon;
    }

    public SuportTelefonMobil() {
        super();
        this.prindere = null;
        this.material = null;
        this.diagonalaTelefon = 0;
    }

    public SuportTelefonMobil(String prindere, String material, double diagonalaTelefon, String denumire, String descriereFull, String descriereShort, String marca, String imagine, float pret, boolean disponibilitate) {
        super(denumire, descriereFull, descriereShort, marca, imagine, pret, disponibilitate);
        this.prindere = prindere;
        this.material = material;
        this.diagonalaTelefon = diagonalaTelefon;
    }
    
    public SuportTelefonMobil(SuportTelefonMobil s){
        this.setDenumire(s.getDenumire());
        this.setDescriereFull(s.getDescriereFull());
        this.setDescriereShort(s.getDescriereShort());
        this.setMarca(s.getMarca());
        this.setImagine(s.getImagine());
        this.setPret(s.getPret());
        this.setDisponibilitate(s.getDisponibilitate());
        this.diagonalaTelefon = s.diagonalaTelefon;
        this.material = s.material;
        this.prindere = s.prindere;
    }
    
     @Override
    public String toString() {
        return super.toString() + 
                "\nPrindere: " + prindere + 
                "\nMaterial: " + material + 
                "\nDiagonala Telefonului : " + diagonalaTelefon;
    }
}
