public class Casca extends Produs {
    private String tip;         // Integrala, Flip-Up, etc...
    private String culoare;     // Culoarea / Design-ul castii

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
    
    public Casca(String denumire, String descriereFull, String descriereShort, String marca, String imagine, double pret, boolean disponibilitate, String tip, String culoare) {
        super(denumire, descriereFull, descriereShort, marca, imagine, pret, disponibilitate);
        
        this.tip = tip;
        this.culoare = culoare;
    }

    public Casca(Casca casca){
        this.setDenumire(casca.getDenumire());
        this.setDescriereFull(casca.getDescriereFull());
        this.setDescriereShort(casca.getDescriereShort());
        this.setMarca(casca.getMarca());
        this.setImagine(casca.getImagine());
        this.setPret(casca.getPret());
        this.setDisponibilitate(casca.getDisponibilitate());
        this.tip = casca.tip;
        this.culoare = casca.culoare;
    }

    public Casca() {
        super();
        this.tip = "N/A";
        this.culoare = "N/A";
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTip: " + tip + 
                "\nCuloare: " + culoare + "\n";
    }
    
    public String toString(int i) {
        return super.toString(i) + 
                "\nTip: " + tip + 
                "\nCuloare: " + culoare + "\n";
    }
    
}
