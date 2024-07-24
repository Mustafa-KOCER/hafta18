package org.rd;

public class Main {
    public static void main(String[] args) {
        Muhasebe Hasan = new Muhasebe();
        Muhasebe Mustafa = new Muhasebe();
        Muhasebe Omer = new Muhasebe();

        Hasan.isim = "Hasan";
        Mustafa.isim = "Mustafa";
        Omer.isim = "Omer";

        Hasan.calisma_gun = 20;
        Mustafa.calisma_gun = 25;
        Omer.calisma_gun = 30;

        Hasan.Maas();
        Mustafa.Maas();
        Omer.Maas();
    }
}

class Muhasebe {
    String isim;
    int calisma_gun = 0;
    int maas = 100;
    int prim = 1000;

    public void Maas() {
        String prim_hakki = (calisma_gun > 25) ? "Prim Hakki Kazandiniz." : "Prim Hakki Kazanamadiniz";

        if(calisma_gun >=25) {
            System.out.println("\n"+ prim_hakki + " Maas =  " + ((maas*25) + ((calisma_gun-25)*prim)));
        }
        else {
            System.out.println("\n"+ prim_hakki + " Maas =  " + (calisma_gun * maas));
        }
    }
}
