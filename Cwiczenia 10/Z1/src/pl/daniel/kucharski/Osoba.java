package pl.daniel.kucharski;
import java.time.LocalDate;

public class Osoba implements Cloneable ,Comparable{
    private LocalDate dataurodzenia;
    private String nazwisko;

    public Osoba(String nazw,LocalDate dataur){
        this.dataurodzenia = dataur;
        this.nazwisko = nazw;
    }

    @Override
    public int compareTo(Object o){
        return 0;
    }

    @Override
    public String toString() {
        return "["+getClass().getSimpleName()+"]"+dataurodzenia.toString();
    }
}
