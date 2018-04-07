
package pl.edu.ur.oopl5;


public class Liczba {

    private String liczba;
    private int[] cyfry;

    Liczba(String liczba) {
        this.liczba = liczba;
        this.cyfry = new int[liczba.length()];

    }

    public void pokaz() {

        for (int i = 0; i < this.cyfry.length; i++) {

            System.out.print(cyfry[i] + "  ");

        }

    }

    public int mnozenie(int a) {

        int wynik = 0, x = 1;

        for (int i = this.cyfry.length - 1; i >= 0; i++) {
            wynik += cyfry[i] * a * x;
            x = x * 10;
        }

        return wynik;
    }

    public int silnia() {
        int silnia = 1, x = 1, wynik = 0;

        for (int i = cyfry.length - 1; i >= 0; i--) {

            wynik += cyfry[i] * x;
            x *= 10;
        }
        for (int i = 1; i <= wynik; i++) {

            silnia *= i;
        }

        return silnia;
    }

    public int[] zamiana() {

        char[] t = this.liczba.toCharArray();
        for (int i = 0; i < t.length; i++) {
            this.cyfry[i] = (int) t[i] - 48;
        }
        return cyfry;
    }

}
