package ex3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainApp {
    public static void main(String[] args) throws IOException{

        /* ------------Cu citire de la tastatura
        String sir;
        String sir_inserare;
        String pozitie;
        String caractere_de_sters;
        String pozitia_de_stergere;
        int poz;
        int poz_s;
        int nr_sters;
        int poz_sters;

        StringBuffer dupa_inserare;
        StringBuffer dupa_stergere;

        BufferedReader flux_intrare=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Inserare sir intr-un sir initial: ");
        System.out.println("Introduceti sirul initial: ");
        sir=flux_intrare.readLine();

        System.out.println("Introduceti sirul de inserat: ");
        sir_inserare=flux_intrare.readLine();

        System.out.println("Introduceti pozitia de inserare: ");
        pozitie=flux_intrare.readLine();
        poz=Integer.parseInt(pozitie);

        dupa_inserare=new StringBuffer(sir);
        dupa_inserare.insert(poz,sir_inserare);
        System.out.println("Dupa inserare: "+dupa_inserare);

        System.out.println("Dati numaru de caractiere de sters: ");
        caractere_de_sters=flux_intrare.readLine();
        nr_sters=Integer.parseInt(caractere_de_sters);

        System.out.println("Dati poztia de unde sa se stearga: ");
        pozitia_de_stergere=flux_intrare.readLine();
        poz_sters=Integer.parseInt(pozitia_de_stergere);

        dupa_stergere=new StringBuffer(dupa_inserare);
        dupa_stergere.delete(poz_sters, (poz_sters+nr_sters));
        System.out.println("Dupa stergere: "+dupa_stergere);

         */



      // ----------------- Codul vechi unde lucrez si cu fisiere

        StringBuilder text= new StringBuilder();

        BufferedReader flux_intrare= new BufferedReader(new FileReader("src/ex3/input.txt"));
        String line;
        while ((line=flux_intrare.readLine())!= null){

            text.append(line).append("\n");
        }

        System.out.println("Text original: ");
        System.out.println(text);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dati sirul de inserat: ");
        String sir_inserat= reader.readLine();

        System.out.println("Dati pozitia de inserat: ");
        int pozitie=Integer.parseInt(reader.readLine());
        text.insert(pozitie, sir_inserat);
        System.out.println("Sirul dupa inserare: ");
        System.out.println(text);

        //Stergere portiune text

        BufferedReader reader2=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dati poztia de start a stergerii: ");
        int pozitie_sters=  Integer.parseInt(reader2.readLine());
        System.out.println("Dati numarul de caractere de sters: ");
        int nr_caractere_sters=Integer.parseInt(reader2.readLine());
        text.delete(pozitie_sters, pozitie_sters+nr_caractere_sters);
        System.out.println("Sirul dupa stergere: ");
        System.out.println(text);

        //scriere fisier final de iesire
        FileWriter writer=new FileWriter("src/ex3/output.txt");
        writer.write(text.toString());


    }
}
