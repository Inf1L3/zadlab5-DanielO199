
package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Pracownik {

    private int wiek;
    private String imie;
    private String nazwisko;
    private String stanowisko;
    Scanner input = new Scanner(System.in);

    public Pracownik(int wiek, String imie, String nazwisko, String stanowisko) {

        this.wiek = wiek;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;

    }

    public void Dodaj() {

        System.out.println("Wprowadz wiek ");
        int a = input.nextInt();
        System.out.println("Wprowadz imie ");
        String b = input.next();
        System.out.println("Wprowadz nazwisko ");
        String c = input.next();
        System.out.println("Wprowadz stanowisko ");
        String d = input.next();
    }

    public void Poka() {
        System.out.println("wiek: " + this.wiek);

        System.out.println("imie: " + this.imie);

        System.out.println("nazwisko: " + this.nazwisko);

        System.out.println("stanowisko: " + this.stanowisko);

    }

}
