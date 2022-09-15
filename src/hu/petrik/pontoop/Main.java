package hu.petrik.pontoop;

import hu.petrik.pontoop.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1=new Pont();
        Pont p2=new Pont(0,0);
        Pont p3=new Pont(3,4);
        Pont p4=new Pont(100);

        //System.out.println(p1);
        //System.out.println(p2);
        //System.out.println(p3);
        //System.out.println(p4);

        Pont[] pontok = new Pont[10];
        for (int i = 0; i <pontok.length ; i++) {
            pontok[i]=new Pont(10);
        }
        for (Pont p: pontok) {
            System.out.println(p);
        }

        //Origotól legtávolabb eső pont
        int LegtavolabbiPontIndex=0;
        for (int i = 1; i < pontok.length ; i++) {
            if (pontok[LegtavolabbiPontIndex].getOrigotolMertTavolsag()<pontok[i].getOrigotolMertTavolsag()){
                LegtavolabbiPontIndex=i;
            }
        }
        System.out.printf("A legtávolabbi pont az Origótól a(z) %d. pont, koordinátái: %s, Origótól mért távolságra: %.3f"
                ,(LegtavolabbiPontIndex+1),pontok[LegtavolabbiPontIndex],pontok[LegtavolabbiPontIndex].getOrigotolMertTavolsag());
    }
}
