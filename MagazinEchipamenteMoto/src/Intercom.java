public class Intercom extends Produs {
    private double autonomie;  //numar de ore pana la incarcare
    private float distanta;  //distanta maxima intre doua dispozitive
    private boolean bluetooth;  //conectivitate la telefon mobil
    private int numarDispozitiveConectate;  //numar maxim de dispozitive interconectate
    private String microfon;  //integrat in casti, separat

    public void setAutonomie(double autonomie) {
        this.autonomie = autonomie;
    }

    public void setDistanta(float distanta) {
        this.distanta = distanta;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setNumarDispozitiveConectate(int numarDispozitiveConectate) {
        this.numarDispozitiveConectate = numarDispozitiveConectate;
    }

    public void setMicrofon(String microfon) {
        this.microfon = microfon;
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

    public int getNumarDispozitiveConectate() {
        return numarDispozitiveConectate;
    }

    public String getMicrofon() {
        return microfon;
    }

    public Intercom() {
        super();
        this.autonomie = 0;
        this.distanta = 0f;
        this.bluetooth = true;
        this.numarDispozitiveConectate = 0;
        this.microfon = null;
    }

    public Intercom(double autonomie, float distanta, boolean bluetooth, int numarDispozitiveConectate, String microfon, String denumire, String descriereFull, String descriereShort, String marca, String imagine, float pret, boolean disponibilitate) {
        super(denumire, descriereFull, descriereShort, marca, imagine, pret, disponibilitate);
        this.autonomie = autonomie;
        this.distanta = distanta;
        this.bluetooth = bluetooth;
        this.numarDispozitiveConectate = numarDispozitiveConectate;
        this.microfon = microfon;
    }

    public Intercom(Intercom i) {
        this.autonomie=i.autonomie;
        this.bluetooth=i.bluetooth;
        this.distanta=i.distanta;
        this.microfon=i.microfon;
        this.numarDispozitiveConectate=i.numarDispozitiveConectate;
        this.setDenumire(i.getDenumire());
        this.setDescriereFull(i.getDescriereFull());
        this.setDescriereShort(i.getDescriereShort());
        this.setMarca(i.getMarca());
        this.setImagine(i.getImagine());
        this.setPret(i.getPret());
        this.setDisponibilitate(i.getDisponibilitate());
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nAutonomie: " + autonomie + 
                "\nDistanta: " + distanta + 
                "\nBluetooth: " + bluetooth+
                "\nMicrofon: " + microfon+
                "\nNumarDispozitiveConectate: "+numarDispozitiveConectate;
    }
    public String toString(int i) {
        return super.toString(i) + 
                "\nAutonomie: " + autonomie + 
                "\nDistanta: " + distanta + 
                "\nBluetooth: " + bluetooth+
                "\nMicrofon: " + microfon+
                "\nNumarDispozitiveConectate: "+numarDispozitiveConectate;
    }
    
}
