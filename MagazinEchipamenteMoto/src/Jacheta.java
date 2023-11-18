public class Jacheta extends Produs {

    private String material;        // Piele/Textil
    private String culoare;

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

    public Jacheta(String denumire, String descriereFull, String descriereShort, String marca, String imagine, double pret, boolean disponibilitate, String material, String culoare) {
        super(denumire, descriereFull, descriereShort, marca, imagine, pret, disponibilitate);
        this.material = material;
        this.culoare = culoare;
    }

    public Jacheta(Jacheta j) {
        this.setDenumire(j.getDenumire());
        this.setDescriereFull(j.getDescriereFull());
        this.setDescriereShort(j.getDescriereShort());
        this.setMarca(j.getMarca());
        this.setImagine(j.getImagine());
        this.setPret(j.getPret());
        this.setDisponibilitate(j.getDisponibilitate());

        this.material = j.material;
        this.culoare = j.culoare;
    }

    public Jacheta() {
        super();

        this.material = "N/A";
        this.culoare = "N/A";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nMaterial: " + material
                + "\nCuloare: " + culoare + "\n";
    }
    public String toString(int i) {
        return super.toString(i)
                + "\nMaterial: " + material
                + "\nCuloare: " + culoare + "\n";
    }

}
