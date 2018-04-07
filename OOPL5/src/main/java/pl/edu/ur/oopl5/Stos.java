package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Stos {

    Scanner input = new Scanner(System.in);
    private int[] tab = new int[6];
    private int wsk=0;

    public void Stos(int rozmiar) {
        System.out.println("Podaj liczby do stosu");
        for (int i = 0; i <= tab.length - 1; i++) {

            this.tab[i] = input.nextInt();
            this.wsk = tab[i];

        }
        for (int i = tab.length-1; i >= 0; i--){
        
        System.out.println(tab[i]);
        
        }
        System.out.println("Wskaznik to: "+wsk);
        
    }



public int pop(){
        int t=0;
        if(wsk<=0){
            
             t=tab[wsk-1];
            wsk--;
            
        }
       return t;
        }
    
        public void  push(int E){
            
            if(wsk<tab.length){
            tab[wsk]=E;
            wsk++;
            }
            
            
        }
    
}
