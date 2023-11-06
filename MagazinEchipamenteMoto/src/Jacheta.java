public class Jacheta extends Produs {
    private char[] dimensiune;
    private String material;        // Piele/Textil
    private String culoare;

    public char[] getDimensiune() {
        return dimensiune;
    }
    public void setDimensiune(char[] dimensiune) {
        this.dimensiune = dimensiune;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Jacheta(String denumire, String descriereFull, String descriereShort, String marca, String imagine, float pret, boolean disponibilitate, char[] dimensiune, String material, String culoare) {
        super(denumire, descriereFull, descriereShort, marca, imagine, pret, disponibilitate);
        this.dimensiune = dimensiune;
        this.material = material;
        this.culoare = culoare;
    }
    
    public Jacheta(Jacheta j){
        this.setDenumire(j.getDenumire());
        this.setDescriereFull(j.getDescriereFull());
        this.setDescriereShort(j.getDescriereShort());
        this.setMarca(j.getMarca());
        this.setImagine(j.getImagine());
        this.setPret(j.getPret());
        this.setDisponibilitate(j.getDisponibilitate());
        this.dimensiune = j.dimensiune;
        this.material = j.material;
        this.culoare = j.culoare;
    }

    public Jacheta() {
        super();
        this.dimensiune = null;
        this.material = null;
        this.culoare = null;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nDimensiune: " + dimensiune + 
                "\n Material: " + material + 
                "\nCuloare: " + culoare;
    }
    
    
}
