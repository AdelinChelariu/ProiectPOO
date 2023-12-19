public class Intercom extends Produs {
    private double autonomie;  //numar de ore pana la incarcare
    private float distanta;  //distanta maxima intre doua dispozitive
    private boolean bluetooth;  //conectivitate la telefon mobil
    

    public void setAutonomie(double autonomie) {
        this.autonomie = autonomie;
    }

    public void setDistanta(float distanta) {
        this.distanta = distanta;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    

    public double getAutonomie() {
        return autonomie;
    }

    public float getDistanta() {
        return distanta;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

   

    public Intercom() {
        super();
        this.autonomie = 0;
        this.distanta = 0f;
        this.bluetooth = true;
        
    }

    public Intercom(String denumire, String descriereFull, String descriereShort, String marca, String imagine, double pret, boolean disponibilitate,double autonomie, float distanta, boolean bluetooth) {
        super(denumire, descriereFull, descriereShort, marca, imagine, pret, disponibilitate);
        this.autonomie = autonomie;
        this.distanta = distanta;
        this.bluetooth = bluetooth;
       
    }

    public Intercom(Intercom i) {
        this.setDenumire(i.getDenumire());
        this.setDescriereFull(i.getDescriereFull());
        this.setDescriereShort(i.getDescriereShort());
        this.setMarca(i.getMarca());
        this.setImagine(i.getImagine());
        this.setPret(i.getPret());
        this.setDisponibilitate(i.getDisponibilitate());
        this.autonomie=i.autonomie;
        this.bluetooth=i.bluetooth;
        this.distanta=i.distanta;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nAutonomie: " + autonomie + 
                "\nDistanta: " + distanta + 
                "\nBluetooth: " + bluetooth;
    }
    public String toString(int i) {
        return super.toString(i) + 
                "\nAutonomie: " + autonomie + 
                "\nDistanta: " + distanta + 
                "\nBluetooth: " + bluetooth;         
    }
    
}
