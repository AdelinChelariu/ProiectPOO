public class TestInstante {

    public static void main(String[] args) {
        Casca c1, c2, c3;
        c1 = new Casca();
        c2 = new Casca("HJC RPHA 11 Punisher Marvel",
                """
                Carcasa exterioara este facuta din P.I.M, un mix de fibra de carbon si fibra de sticla, un material de ultima generatie, 
                ce iti ofera nu numai un nivel de protectie foarte ridicat, ci si o greutate scazuta. Au redus greutatea cu 170 grame fata de ultimul model. 
                Mult mai rafinata si cu un look mai agresiv RPHA 11 este "veninul" din catergoria de viteza. 
                Vine in trei dimensiuni ale carcasei exterioare XS-S, M-L si XL-XXL, si cu sase marimi la interior. Poti alege de la XS si pana la XXL. 
                O daca ce scoti interiorul vei observa pe partea din spuma o multitudine de canale si gauri 3D. 
                Toate acestea iti asigura o ventilatie extrema, nu vei da cu motocicleta in conditii de strada sau circuit cu capul ud, 
                luandu-ti la propriu un disconfort de pe cap si ajutandu-te sa te concentrezi la conditiile de drum sau de pista.
                Daca te uiti la casca din lateral o sa observi ca au ingustat-o in partea de jos. La ce ajuta asta? 
                In cazul unui accident, multe rupturi de clavicula sunt cauzate de impactul cu casca. Acum clavicula ta are mai mult spatiu de flexie, 
                reducand sansele de rupere in caz de soc. Un avantaj bun, fie ca o vei folosi pe circuit sau doar pe strada.
                Este o casca cu AIRFLOW, ce in zilele toride de vara va asigura ventilatia de care aveti nevoie prin cele ZECE prize generoase de aer 
                situate pe barbie, frunte si in spatele castii. Aceast nou model de RPHA 11 vine cu trei prize de aer pe barbie, cele dinspre laterale se 
                actioneaza din interiorul castii, pe cand cea clasica (de pe mijloc) se inchide sau deschide din exterior. 
                Ventilatiile din partea din spate acum actioneaza exact ca si un spoiler la masinile sport datorita gaurii din centrul deflectorului spate. 
                Ventilatiile din partea superioara a castii au primit si ele un upgrade. Rotitele care le actioneaza au o banda de cauciuc in plus fata de modelul vechi. 
                Aceasta le face foarte usor de folosit chiar si cu manusi.""",
                """
                HJC RPHA 11 este una dintre cele mai rafinate si mai agresive casti moto din segmentul sport sau circuit.
                HJC ridica miza jocului cu aceasta casca la care s-au folosit numai materiale si gadget-uri premium. 10 canale de
                ventilatie si camp vizual foarte larg, design unic!""",
                "HJC",
                null,
                1899,
                true,
                "Integrala",
                "Negru / Marvel Punisher");
        c3 = new Casca(c2);
        c3.setDisponibilitate(false);
        c3.setImagine("N/A");
        System.out.println("Casca 1: \n" + c1);
        System.out.println("Casca 2: \n" + c2);
        System.out.println("Casca 3: \n" + c3);

        Jacheta j1, j2, j3;
        j1 = new Jacheta();
        j2 = new Jacheta("Rebelhorn Vandal",
                """
                Rebelhorn Vandal este o geaca moto din piele cu un design agresiv ce imbina confortul in zilele toride de vara cu siguranta la cel mai inalt nivel.  
                Este o geaca moto din piele ideala pentru mersul in oras sau in afara lui.
                \u00cempreun\u0103 cu blugii moto Rebelhorn Vandal ai o solutie de design ce imbina confortul cu siguranta pentru iesirile cu motocicleta.
                Vandal este echipat\u0103 cu un set de protectii SAS-TEC de nivel 2 pentru umeri si coate si cu slidere externe pentru umeri.
                Ventilarea eficient\u0103 \u0219i articulatiile elastice extinse garanteaz\u0103 o c\u0103l\u0103torie confortabil\u0103.
                Geaca este foarte tehnica, un pic mai lunga pe spate pentru a mari confortul pe toata durata plimbarii.Pe noi romanii ne fereste de curentul care poate sa te traga oricand, mai ales pe motocicleta.""",
                """
                Rebelhorn Vandal este o geaca moto din piele ideala pentru mersul in oras, in afara lui sau la trackday-uri.
                \u00cempreun\u0103 cu blugii moto Rebelhorn Vandal ai o solutie de design ce imbina confortul cu siguranta pentru iesirile cu motocicleta.""",
                "Rebelhorn",
                null,
                1599,
                true,
                "Piele",
                "Negru");
        j3 = new Jacheta(j2);
        j3.setCuloare("Rosu");
        j3.setPret(1649);

        System.out.println("Jacheta 1: \n" + j1);
        System.out.println("Jacheta 2: \n" + j2);
        System.out.println("Jacheta 3: \n" + j3);
        
        Casca[] casti = new Casca[10];
        Jacheta[] jachete = new Jacheta[10];
        casti[0] = c1;
        casti[1] = c2; 
        casti[2] = c3;
        jachete[0] = j1;
        jachete[1] = j2;
        jachete[2] = j3;
        
        jachete[3] = new Jacheta(j2);
        jachete[3].setCuloare("Fluo");
        jachete[3].setDisponibilitate(false);
        
        
        
        System.out.println("Afisare vector casti\n");
        for(int i = 0; i < casti.length - 7; i++)
        {
            System.out.println(casti[i].toString(1) + "\n");
        }
        System.out.println("\nAfisare vector jachete\n");
        for(int i = 0; i < jachete.length - 6; i++)
        {
            System.out.println(jachete[i].toString(1) + "\n");
        }
        
        /*System.out.println("Afisare casti din vector cu conditie\n");
        for(int i = 0; i < casti.length - 7; i++)
        {
            if(casti[i].getDisponibilitate() == true) {
                System.out.println(casti[i].toString(1) + "\n");
            }
        }
        System.out.println("\nAfisare jachete din vector cu conditie\n");
        for(int i = 0; i < jachete.length - 6; i++)
        {
            if(jachete[i].getDisponibilitate() == true) {
                System.out.println(jachete[i].toString(1) + "\n");
            }
        }*/
    }
}
