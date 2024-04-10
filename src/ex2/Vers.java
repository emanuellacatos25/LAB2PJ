/*
Fișierul cantec_in.txt conține versurile unui cântec la alegere. Să se scrie un
program care creează fișierul cantec_out.txt, care conține versurile cântecului original dar în
plus în dreptul fiecărui rând sunt afișate numărul de cuvinte de pe rând şi numărul de vocale
de pe fiecare rând. În dreptul rândurilor care se încheie cu o grupare de litere aleasă se va
pune o steluță (*). Rândurile pentru care un număr generat aleator este mai mic decât 0.1 vor
fi scrise cu majuscule (se vor genera aleator numere între 0 şi 1).
Se va defini o clasă Vers, care are o variabilă membră privată un șir de caractere
reprezentând versul și se va dezvolta câte un operator pentru fiecare cerință de mai sus (o
metodă care returnează numărul de cuvinte, o metodă care returnează numărul de vocale, etc).
Se va crea un vector de obiecte de tip Vers care va conține informația preluată din fișierul de
intrare.
 */

package ex2;

class Vers
{
    private String vers;

    public Vers(String v)
    {
        vers = v;
    }

    public String getVers() {
        return vers;
    }

    public void random(){
        double x=Math.random();
        if (x<0.1){
            vers=vers.toUpperCase();
        }
    }

    public boolean cautare(String grupare){
        return vers.endsWith(grupare);
    }

    public int numar_cuvinte(){
        String[] s= vers.split(" ");

        return s.length;
    }

    public int numar_vocale(){
        int nr=0;
        String vocala= "aeiouAEIOU";

        for (int i = 0; i < vers.length(); i++) {
            if (vocala.indexOf(vers.charAt(i))>=0)
                nr++;

        }

        return nr;
    }
}
