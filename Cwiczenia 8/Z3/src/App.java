import java.time.LocalDate;
import java.util.ArrayList;

import Instruments.*
;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        orkiestra.add(new Fortepian("Jakub", LocalDate.now()));
        orkiestra.add(new Flet("Patryk", LocalDate.now()));
        orkiestra.add(new Skrzypce("Andrzej", LocalDate.now()));
        orkiestra.add(new Skrzypce("Michał", LocalDate.now()));
        orkiestra.add(new Skrzypce("Wojtek", LocalDate.now()));

        for(int i = 0; i <= orkiestra.size()-1; i++)
            orkiestra.get(i).dzwiek();
    }
}
