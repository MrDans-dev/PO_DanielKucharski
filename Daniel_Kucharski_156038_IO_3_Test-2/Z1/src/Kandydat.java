
public class Kandydat implements Cloneable , Comparable<Kandydat>{
    private String nazwa;
    private int wiek;
    private String wyksztalcenie;
    private int latadoswiadczenia;

    public Kandydat(String nazwa, int wiek, String wyksztalcenie, int latadoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcenie = wyksztalcenie;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    @Override
    public int compareTo(Kandydat o){
        int result =0;
        if(this.wiek == o.wiek) result+=1;
        if(this.wyksztalcenie == o.wyksztalcenie) result+=3;
        if(this.latadoswiadczenia == o.latadoswiadczenia) result+=5;
        return result;
    }

    @Override
    public String toString(){
        return "Nazwa: "+this.nazwa+"\nWiek"+this.wiek+"\nWykształcenie: "+this.wyksztalcenie+"\nLata Doświadczenie:"+this.latadoswiadczenia;
    }

    public String getnazwa() {
        return nazwa;
    }

    public int getwiek() {
        return wiek;
    }

    public String getwyksztalcenie() {
        return wyksztalcenie;
    }

    public int getlatadoswiadczenia() {
        return this.latadoswiadczenia;
    }
}
