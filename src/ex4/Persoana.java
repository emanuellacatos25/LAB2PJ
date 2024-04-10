package ex4;

import java.time.LocalDate;

public class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta(){
        int an=Integer.parseInt(cnp.substring(1,3));

        int luna=Integer.parseInt(cnp.substring(3,5));

        int zi=Integer.parseInt(cnp.substring(5,7));

        LocalDate data_curenta= LocalDate.now();

        int an_curent=data_curenta.getYear()%100;

        int varsta=an_curent-an;

        if (data_curenta.getMonthValue()<luna || data_curenta.getMonthValue()==luna && data_curenta.getDayOfMonth()<zi)
            varsta--;
        return varsta;
    }
}
