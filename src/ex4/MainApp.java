package ex4;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati n nr de persoane: ");
        int n=scanner.nextInt();
        scanner.nextLine();

        Persoana[] persoane=  new Persoana[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dati numele persoanelor: ");
            String nume=scanner.nextLine();
            String cnp;
            do {
                System.out.println("Dati cnp: ");
                cnp=scanner.nextLine();
            }while (!validareCNP(cnp));
            persoane[i]=new Persoana(nume,cnp);

        }

        for (Persoana persoana: persoane){
            System.out.println(persoana.getNume()+"  "+persoana.getCnp()+"  "+persoana.getVarsta());
        }
    }

    public static boolean validareCNP(String cnp)
    {
        if (cnp.length()!=13|| cnp.matches("\\d+")){
            System.out.println("Reintroduceti!");
            return false;
        }

        char primaCifra=cnp.charAt(0);
        if (primaCifra!='1'&& primaCifra!='2'&& primaCifra!='5'&& primaCifra!='6')
        {
            System.out.println("Reintroduceti!");
            return false;
        }

        return true;

    }

}
