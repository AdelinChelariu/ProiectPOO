public class Manusi extends Produs {
    private  String culoare;
    private String material;
    private String tip;
    
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial(String material){
        this.material = material;
    }
    
    public String getCuloare(){
        return culoare;
    }
    
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    
    public String getTip(){
        return tip;
    }
    public void setTip(String tip){
        this.tip = tip;
    }
    
    public Manusi(){
        super();
        this.culoare = "";
        this.material = "";
        this.tip = "";
                
    }
    
    public Manusi(String denumire,String descriereFull,String descriereShort, String marca,String imagine,double pret,boolean disponibilitate,String culoare, String material, String tip){
        super(denumire,descriereFull,descriereShort,marca,imagine,pret,disponibilitate);
        
        this.culoare = culoare;
        this.material = material;
        this.tip = tip;
    }
    
    public Manusi(Manusi m){
        this.setDenumire(m.getDenumire());
        this.setDescriereFull(m.getDescriereFull());
        this.setDescriereShort(m.getDescriereShort());
        this.setMarca(m.getMarca());
        this.setImagine(m.getImagine());
        this.setPret(m.getPret());
        this.setDisponibilitate(m.getDisponibilitate());
        
        
        this.culoare = m.culoare;
        this.material = m.material;
        this.tip = m.tip;
               
    }
@Override
    public String toString(){
        return super.toString()
                +"\nculoaRe " + culoare
                +"\nmaterial " + material
                +"\ntip " + tip + "\n";
    } 
    public String toString(int i){
        return super.toString(i)
                +"\nculoare " + culoare
                +"\nmaterial " + material
                +"\ntip " + tip + "\n";
    } 
    
}
