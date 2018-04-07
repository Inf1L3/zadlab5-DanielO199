
package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Firma {

    private Pracownik[] t = new Pracownik[100];
    Scanner input = new Scanner(System.in);

    public void Firma() {

        for (int i = 0; i < 100; i++) {

            t[i] = new Pracownik(0, "", "", "");

        }


}
}