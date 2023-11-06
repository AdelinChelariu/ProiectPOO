public class Casca extends Produs {
    private char[] dimensiune;  // XXS -> XXL
    private String tip;         // Integrala, Flip-Up, etc...
    private String culoare;     // Culoarea / Design-ul castii

    public char[] getDimensiune() {
        return dimensiune;
    }
    public void setDimensiune(char[] dimensiune) {
        this.dimensiune = dimensiune;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    public Casca(String denumire, String descriereFull, String descriereShort, String marca, String imagine, float pret, boolean disponibilitate, char[] dimensiune, String tip, String culoare) {
        super(denumire, descriereFull, descriereShort, marca, imagine, pret, disponibilitate);
        this.dimensiune = dimensiune;
        this.tip = tip;
        this.culoare = culoare;
    }

    public Casca(Casca c){
        this.setDenumire(c.getDenumire());
        this.setDescriereFull(c.getDescriereFull());
        this.setDescriereShort(c.getDescriereShort());
        this.setMarca(c.getMarca());
        this.setImagine(c.getImagine());
        this.setPret(c.getPret());
        this.setDisponibilitate(c.getDisponibilitate());
        this.dimensiune = c.dimensiune;
        this.tip = c.tip;
        this.culoare = c.culoare;
    }

    public Casca() {
        super();
        this.dimensiune = null;
        this.tip = null;
        this.culoare = null;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nDimensiune: " + dimensiune + 
                "\nTip: " + tip + 
                "\nCuloare: " + culoare;
    }
    
}
