public class Produs {

    protected String nume;
    protected int pret;

    public Produs(){

    }

    public Produs(String nume, int pret){
        this.nume = nume;
        this.pret = pret;
    }

    public int getPret() {
        return pret;
    }
    public String getNume(){
        return nume;
    }
}
