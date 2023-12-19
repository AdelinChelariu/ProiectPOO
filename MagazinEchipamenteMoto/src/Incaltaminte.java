
public class Incaltaminte extends Produs {
    String culoare;
    String material;
    String tip;
    int marime;

    public String getCuloare() {
        return culoare;
    }

    public String getMaterial() {
        return material;
    }

    public String getTip() {
        return tip;
    }

    public int getMarime() {
        return marime;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }
    
    
    public Incaltaminte(){
        super();
        this.culoare = "";
        this.material = "";
        this.tip = "";
        this.marime = 0;
    }
    
    public Incaltaminte(String denumire,String descriereFull,String descriereShort, String marca,String imagine,double pret,boolean disponibilitate,String culoare,String material,String tip,int marime){
        super(denumire,descriereFull,descriereShort,marca,imagine,pret,disponibilitate);
        
        this.culoare = culoare;
        this.material = material;
        this.tip = tip;
        this.marime = marime;
                
    }
    
    public Incaltaminte(Incaltaminte i){
        this.setDenumire(i.getDenumire());
        this.setDescriereFull(i.getDescriereFull());
        this.setDescriereShort(i.getDescriereShort());
        this.setMarca(i.getMarca());
        this.setImagine(i.getImagine());
        this.setPret(i.getPret());
        this.setDisponibilitate(i.getDisponibilitate());
        
        this.culoare = i.culoare;
        this.material = i.material;
        this.tip = i.tip;
        this.marime = i.marime;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nculoare " + culoare
                +"\nmaterial " + material
                +"\ntip " + tip
                +"\nmarime " + marime + "\n";
    }
     public String toString(int i){
        return super.toString(i)
                +"\nculoARe " + culoare
                +"\nmaterial " + material
                +"\ntip " + tip
                +"\nmarime " + marime + "\n";
    }
    
}
