
public class TestInstante {

    public static void main(String[] args) {
        Casca c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
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
                "N/A",
                2099,
                true,
                "Integrala",
                "Negru / Marvel Punisher");

        c3 = new Casca(c2);
        c3.setDisponibilitate(false);
        c3.setDenumire("Casca HJC RPHA 11 Nectus");
        c3.setPret(2139);
        c3.setCuloare("Rosu");
        c3.setImagine("N/A");

        c4 = new Casca("Casca Scorpion Exo 520 Evo Air Cover",
                """
                        Noua casca moto Scorpion Exo 520 Evo Air Cover este alegerea optima pentru toti pasionatii de sport/touring, 
                            garantand un confort crescut, multiple dotari tehnice si siguranta superioara. Exo 520 depaseste asteptarile 
                            categoriei din care face parte integrand dotari premium ce se regasesc la modelele de top, Exo 1400/R1 insa la un pret mult mai accesibil. 
                            Printre acestea se numara, mecanismul de inchidere a vizierei, viziera, ghederul de etansare si un sistem airfit mult mai performant.
                        - Carcasa este fabricata in 3 dimensiuni exterioare XS-M, L si XL-XXL iar marimea castii poate fi aleasa de la XS si pana la XXL;
                        - Interior detasabil usor de inlaturat, lavabil si respirabil, tratat antibacterian, marca KWIKWICK 2 ™ ;
                        - Conceptul AIRFIT complet nou si mult mai eficient, brevetat de Scorpion, permite utilizatorul sa-si personalizeze 
                            masura castii prin inflarea obrajilor laterali, astfel, creandu-se o potrivire perfecta si o etansare superioara 
                            chiar si dupa o utilizare indelungata care in mod normal largeste interiorul oricarei casti;
                        - Pinlock 100% Maxivision, In premiera mondiala, sistemul performant antiaburire oferit in dotarea standard. 
                            Se potriveste perfecta in spatiul special destinat din interiorul vizierei si asigura o etansare eficienta;
                        - Casca este prevazuta cu sistemul ELLIP-TEC, mecanism al vizierei testat in numeroase curse de talie mondiala, 
                            pe castile varf de gama EXO 1400/ R1. Sistemul testat in tunelul de vant, asigura o inchidere etansa peste 
                            ghederul castii datorita arcurilor ranforsate si a fortei de compresie si mentinte viziera la loculul ei 
                            chair si in cazul unui accident. Sistemul permite inlocuirea vizierea fara nicio unealta in mai putin de 10 secunde;
                        - Ochelari de soare retractabili, integrati in interiorul castii;
                        - Ventilatii performante la nivelul barbiei si al fruntii ce conduc aerul catre extractorul pozitionat spre ceafa;
                        - Deflector de aer ce previne aburirea vizierei si confera castii o imagine agresiva;
                        - Protectie la barbie ce contribuie la diminuarea nivelului de zgomot;
                        - Sistem de inchidere micrometric pentru o ajustare precisa si o deschidere rapida;
                        - Noua certificare ECE 22-06 ce asigura un nivel ridicat de protectie.;
                        - Casca se vinde cu viziera clara;
                        - Pregatita pentru sistemul de comunicare EXO-COM""",
                """
                        Noua casca moto Scorpion Exo 520 Evo Air Cover este alegerea optima pentru toti pasionatii de sport/touring, 
                            garantand un confort crescut, multiple dotari tehnice si siguranta superioara.""",
                "Scorpion Exo",
                "N/A",
                1170,
                true,
                "Integrala",
                "Argintiu mat");

        c5 = new Casca(c4);
        c5.setCuloare("Negru mat");
        c5.setDisponibilitate(false);

        c6 = new Casca(c2);
        c6.setCuloare("Negru mat");
        c6.setPret(1899);
        c6.setDenumire("HJC RPHA 11 Solid");

        c7 = new Casca(c2);
        c7.setCuloare("Alb mat");
        c7.setPret(1899);
        c7.setDisponibilitate(false);
        c7.setDenumire("HJC RPHA 11 Solid");

        c8 = new Casca(c2);
        c8.setCuloare("Titanium mat");
        c8.setPret(1899);
        c8.setDisponibilitate(false);
        c8.setDenumire("HJC RPHA 11 Solid");

        c9 = new Casca(c2);
        c9.setCuloare("Rosu / Marvel Anti-Venom");
        c9.setPret(2849);
        c9.setDenumire("Casca HJC RPHA 11 Anti Venom Marvel");

        c10 = new Casca("AGV PISTA GP RR E2206 ITALIA CARBONIO FORGIATO",
                """
                        Noul Pista GP RR este omologat conform reglementărilor de curse FIM și noilor reglementări ECE 22.06. 
                        Casca de curse dezvoltată în MotoGP, acum disponibilă tuturor pilotilor. Aceasta este aceeași cască folosită de piloții 
                        profesioniști AGV în Moto GP și Superbike. Carcasa sa exterioară din fibră de carbon 100% oferă linii care minimizează 
                        interferența cu costumul de competiție și interiorul său cu o potrivire adaptabilă, evitând cusăturile în zonele cele mai sensibile. 
                        Are orificii metalice dezvoltate în MotoGP și un spoiler spate pentru a îmbunătăți performanța aerodinamică și stabilitatea 
                        la viteză mare. Fiecare detaliu a fost conceput pentru a asigura performanta maxima.
                        
                        Caracteristici tehnice:
                        -Carcasă externă (structură externă) 100% din fibră de carbon. Disponibil în 4 dimensiuni exterioare 
                            pentru a se adapta la tenul fizic al fiecărui pilot (XS-S), (MS), (ML-L), (XL-XXL). 
                            Interiorul încorporează EPS cu 5 densități (structură internă) pentru o absorbție optimă a șocurilor și a fost fabricat în 4 dimensiuni.
                        -Forma carcasei și structura EPS au fost concepute pentru a minimiza accelerațiile de rotație (aprobat FIM). 
                            Profil inferior conceput pentru a minimiza riscul ca energia generată de un eventual impact să fie transmisă în zona claviculei. 
                            Liniile din spate minimizează interferența cu costumul de curse atunci când pilotul este atașat de motocicleta.
                        -Sistemul de ventilație constă din cinci orificii mari de admisie față de aer și 2 extractoare din spate. 
                            Noile orificii metalice combină rezistența și protecția. Datorită intrării unui flux de aer mare și celor 2 extractoare 
                            din spate ale sale, viteza de circulație a aerului în interiorul căștii este crescută, realizând o răcire interioară ridicată. 
                            Prizele de aer de pe barbie direcționează fluxul de aer către întreaga suprafață a vizierei pentru a preveni aburirea. 
                            Capace de aerisire incluse cu casca.
                        -Noul spoiler spate testat în tunelul de vânt oferă o eficiență aerodinamică ridicată și stabilizează casca la viteze mari. 
                            A fost conceput pentru a se detașa în caz de accident și astfel să mențină structura rotunjită a carcasei exterioare.
                        -Interior renovat cu sistem de adaptare la 360º. A fost conceput pentru a oferi o potrivire stabilă, 
                            învăluitoare și fără presiune, precum și un confort maxim. Are tratament Sanitized (antibacterian), 
                            2Dry (pentru o absorbție excelentă a umezelii) și Microsense (pentru o atingere moale și confortabilă). 
                            Partea gâtului are țesătură respirabilă cu inserții elastice cu tratament rezistent la apă pentru a preveni pătrunderea apei în cască. 
                            Interiorul este complet detasabil si lavabil. Captuseala din zona superioara a fost realizata din material moale 
                            pentru a oferi stabilitate la viteze mari. Tampoane pentru obraji din microfibră elastică și respirabilă. 
                            Cusăturile au fost evitate în zonele cele mai sensibile ale capului pentru un confort maxim. Are o barbie detașabilă și o protecție pentru nas.
                        -Încorporează un sistem de demontare de urgență a căptușelii laterale în caz de accident, pentru a facilita îndepărtarea căștii de către personalul medical.
                        -Sistem de hidratare dezvoltat în MotoGP complet integrat în cască. Tubul are o supapă situată în zona barbiei pentru 
                            o hidratare constantă și confortabilă a călărețului. Sistemul de hidratare este complet detasabil.
                        -Viziera anti-zgârieturi clasa optic 1 conceputa pentru a oferi un câmp vizual vertical de 85 de grade în poziție de competiție 
                            și 190 de grade de vedere orizontală. Vine standard cu o folie anti-aburire Pinlock MaxVision (120) și suporturi Tear-Off. 
                            Un kit Tear-Off este inclus cu casca. Grosimea ecranului este de 5 mm. Are sistem de micro-deschidere.
                        -Mecanismul vizierei permite îndepărtarea acesteia fără utilizarea de unelte și încorporează piese metalice pentru o rezistență mai mare. 
                            Are un sistem de blocare patentat.
                        -Sistem de reținere cu cataramă dublă din titan.
                        -Greutate: 1.450 gr. +/- 50 gr. (în prima dimensiune a cochiliei).""",
                """
                        Noul Pista GP RR este omologat conform reglementărilor de curse FIM și noilor reglementări ECE 22.06. 
                        Casca de curse dezvoltată în MotoGP, acum disponibilă tuturor pilotilor. 
                        Aceasta este aceeași cască folosită de piloții profesioniști AGV în Moto GP și Superbike.""",
                "AGV",
                "N/A",
                7922.26,
                true,
                "Integrala",
                "Negru carbon");

       /* System.out.println("Casca 1: \n" + c1);
        System.out.println("Casca 2: \n" + c2);
        System.out.println("Casca 3: \n" + c3);
*/
        Jacheta j1, j2, j3, j4, j5, j6, j7, j8, j9, j10;
        j1 = new Jacheta();

        j2 = new Jacheta("Rebelhorn Vandal",
                """
                Rebelhorn Vandal este o geaca moto din piele cu un design agresiv ce imbina confortul in zilele toride de vara cu siguranta la cel mai inalt nivel.  
                Este o geaca moto din piele ideala pentru mersul in oras sau in afara lui.
                \u00cempreun\u0103 cu blugii moto Rebelhorn Vandal ai o solutie de design ce imbina confortul cu siguranta pentru iesirile cu motocicleta.
                Vandal este echipat\u0103 cu un set de protectii SAS-TEC de nivel 2 pentru umeri si coate si cu slidere externe pentru umeri.
                Ventilarea eficient\u0103 \u0219i articulatiile elastice extinse garanteaz\u0103 o c\u0103l\u0103torie confortabil\u0103.
                Geaca este foarte tehnica, un pic mai lunga pe spate pentru a mari confortul pe toata durata plimbarii.
                Pe noi romanii ne fereste de curentul care poate sa te traga oricand, mai ales pe motocicleta.""",
                """
                Rebelhorn Vandal este o geaca moto din piele ideala pentru mersul in oras, in afara lui sau la trackday-uri.
                \u00cempreun\u0103 cu blugii moto Rebelhorn Vandal ai o solutie de design ce imbina confortul cu siguranta pentru iesirile cu motocicleta.""",
                "Rebelhorn",
                "N/A",
                1599,
                true,
                "Piele",
                "Negru");

        j3 = new Jacheta(j2);
        j3.setCuloare("Rosu");
        j3.setPret(1649);

        j4 = new Jacheta(j3);
        j4.setCuloare("Fluo");
        j4.setPret(1700);
        j4.setDisponibilitate(false);

        j5 = new Jacheta("Rebelhorn Vandal Air",
                """
                        Rebelhorn Vandal AIR este o geaca moto ce imbina siguranta oferita de pielea de cea mai buna calitate 
                        cu ventilatia oferita de panourile mari de mesh intr-un produs cu un design sportiv si agresiv.   
                        Este o geaca moto din piele si panouri mari de mesh ideala pentru mersul in oras sau in afara lui. 
                        Împreună cu blugii moto Rebelhorn Vandal ai o solutie ce imbina confortul cu siguranta pentru iesirile cu motocicleta.
                        Vandal este echipată cu un set de protectii SAS-TEC de nivel 2 pentru umeri si coate si cu slidere externe pentru umeri. 
                        Ventilarea eficientă și articulatiile elastice extinse garantează o călătorie confortabilă.
                        Geaca este foarte tehnica, un pic mai lunga pe spate pentru a mari confortul pe toata durata plimbarii. 
                        Pe noi romanii ne fereste de curentul care poate sa te traga oricand, mai ales pe motocicleta.""",
                """
                        Rebelhorn Vandal AIR este o geaca moto ce imbina siguranta oferita de pielea de cea mai buna calitate 
                        cu ventilatia oferita de panourile mari de mesh intr-un produs cu un design sportiv si agresiv.""",
                "Rebelhorn",
                "N/A",
                1499,
                true,
                "Piele / Textil",
                "Negru");

        j6 = new Jacheta(j5);
        j6.setCuloare("Rosu");
        j6.setDisponibilitate(false);

        j7 = new Jacheta("Rebelhorn Hunter Vintage",
                """
                        Hunter Vintage este o geaca moto de strada care iti ofera protectia necesara 
                        mersului pe motocicleta insa are un design vintage orientat spre categoriile 
                        cafe racer, chopper, cruiser sau custom bike. Calitatea pielii de capra este de top 
                        si este foarte moale la atingere facand-o in acelasi timp si foarte confortabila de purtat. 
                        MATERIALE
                        Piele de capra de calitate superioara.
                        Mesada fixa termala din bumbac de calitate.
        
                        PROTECTIE
                        Protectii omologate CE Level 2 la umeri si coate.
                        Protectie de spate CE Level 1 inclusa.
                        Cusaturi duble si triple pentru rezistenta sporita.
                        Produsul a fost cusut conform standardelor CE.
        
                        CONFORT
                        Doua fermoare de ventilatie pe piept.
                        Piele moale si confortabila cu aspect casual.
                        Poate fi purtata ca o geaca obisnuita in fiecare zi, dupa inlaturarea protectiilor.
                        2 buzunare interioare si 2 exterioare.
                        Barete de ajustare cu capsa in zona soldurilor.""",
                """
                        Hunter Vintage este o geaca moto de strada care iti ofera protectia necesara 
                        mersului pe motocicleta insa are un design vintage orientat spre categoriile 
                        cafe racer, chopper, cruiser sau custom bike.""",
                "Rebelhorn",
                "N/A",
                1349,
                true,
                "Piele",
                "Maro");

        j8 = new Jacheta("REV'IT! Restless",
                """
                        If we could take a trip back to the early 1940s California, we could experience West Coast moto culture at one of its peaks. 
                        Carefree days of riding along the Pacific Coast Highway and feeling the salty air against our skin. 
                        To recreate that feeling, we designed the Restless motorcycle jacket. An homage to simplicity yet elegance in craft. 
                        While we can’t bring the past to the future (the leathers wouldn’t pass modern CE certifications!) 
                        we can take inspiration from it and enhance it by using modern-day tech.
                            
                        Because of our in-depth knowledge of working with different leather textures (ones that pass CE certification), 
                        we’re able to deliver the worn-in look straight off the rack. This way, it feels like it’s been in your closet for years 
                        yet it’s engineered to be worn for years to come. When placing it beside our other Heritage-inspired styles, 
                        the Restless has, by far, the most sportive influence. Don’t fret, it still has a regular fit that’s comfortable for riding or everyday wear.
                            
                        Combining futureproof and CE-certified armor, a detachable thermal liner, and a timeless look and you’ll have 
                        no problem harnessing the feelings of days past with the Restless motorcycle jacket.""",
                """
                        A stripped-down, detail-oriented, vintage-inspired leather jacket for the stylish urban rider.""",
                "REV'IT!",
                "N/A",
                2099,
                false,
                "Piele",
                "Albastru");

        j9 = new Jacheta(j8);
        j9.setDisponibilitate(true);
        j9.setCuloare("Maro");
        j9.setPret(2199);

        j10 = new Jacheta("Rebelhorn Rebel",
                """
                        Rebelhorn Rebel este o geaca moto din piele ideala pentru mersul in oras sau la circuit. 
                            Fie ca ai o motocicleta sport sau naked, look-ul pe care ti-l confera Rebelhorn este "rebel". 
                            Fetele (si nu numai) isi vor suci gatul dupa tine, garantat. 
                        Rebel este echipată cu un set de protectii SAS-TEC de nivel 2 și intarituri din Kevlar rezistent la abraziune, slidere pe coate si pe umeri.
                        Ventilarea eficientă și articulatiile elastice extinse garantează o călătorie confortabilă.
                        Împreună cu pantalonii moto din piele Rebelhorn Rebel, geaca formează un costum de motocicletă sport 
                            pentru motociclistii care doresc să combine siguranța și confortul cu un design atrăgător și un confort sporit.""",
                """
                        Rebelhorn Rebel este o geaca moto din piele ideala pentru mersul in oras sau la circuit cu un design futuristic.""",
                "Rebelhorn",
                "N/A",
                1699,
                true,
                "Piele",
                "Rosu");

       /* System.out.println("Jacheta 1: \n" + j1);
        System.out.println("Jacheta 2: \n" + j2);
        System.out.println("Jacheta 3: \n" + j3);
*/
        Casca[] casti = new Casca[10];
        Jacheta[] jachete = new Jacheta[10];

        casti[0] = c1;
        casti[1] = c2;
        casti[2] = c3;
        casti[3] = c4;
        casti[4] = c5;
        casti[5] = c6;
        casti[6] = c7;
        casti[7] = c8;
        casti[8] = c9;
        casti[9] = c10;

        jachete[0] = j1;
        jachete[1] = j2;
        jachete[2] = j3;
        jachete[3] = j4;
        jachete[4] = j5;
        jachete[5] = j6;
        jachete[6] = j7;
        jachete[7] = j8;
        jachete[8] = j9;
        jachete[9] = j10;

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
        //instante de tip intercom
        Intercom t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;

        t1 = new Intercom();
        t2 = new Intercom("Sena Intercom Moto 10S ",
                "SUNET CRISTALIN ȘI CONTROL AVANSAT AL ZGOMOTULUI"
                + "Chiar și la viteze mari, ascultarea muzicii sau a navigației GPS de pe smartphone este simplă, datorită difuzoarelor îmbunătățite din căștile 10S."
                + " Indiferent dacă vorbiți prin interfon sau răspundeți la un apel telefonic,"
                + " funcția Advanced Noise Control™ de la Sena asigură că zgomotul ambiental nu interferează cu sunetul de intrare și de ieșire."
                + "ASCULTAȚI-VĂ GRUPUL ȘI MUZICA CU AUDIO MULTITASKING™."
                + "Modelul 10S include Audio Multitasking™, care vă permite să ascultați două surse audio în același timp."
                + " Puteți purta conversații prin interfon în timp ce transmiteți muzică, puteți asculta instrucțiunile GPS în același timp și multe altele."
                + "CONECTIVITATE VERSATILĂ CU APLICAȚIILE SENA PENTRU SMARTPHONE"
                + "Conectarea căștii Bluetooth pentru motociclete 10S cu aplicația Sena Utility App (pentru iPhone și Android), ușor de utilizat,"
                + " vă permite să configurați setările dispozitivului și să accesați ghidul nostru rapid.",
                "10S este versiunea îmbunătățită a căștii Bluetooth emblematice Sena pentru căști de motociclist, SMH10."
                + " Vorbiți cu 3 tovarăși de drum prin audio HD, la o distanță de până la 1,6 km (1,0 mile), răspundeți la apeluri, ascultați muzică și multe altele."
                + " Motocicliștii se pot conecta cu toate căștile Bluetooth pentru motociclete Sena și non-Sena utilizând Universal Intercom™.",
                "Sena",
                "indisponibila",
                933,
                true,
                12,
                1.6f,
                true);
        t3 = new Intercom(t2);
        t3.setAutonomie(15);
        t3.setPret(1200);
        t3.setDistanta(200.15f);
        t4 = new Intercom("Midland BTX2 Pro S LR",
                "Datorită noii versiuni este posibil să comunicați cu tovarășii dvs. de călătorie (până la 6 persoane) pe o distanță de până la 1,6 km."
                + " Datorită BTX2 Pro S „Long Range” puteți vorbi cu alți motocicliști prin interfon"
                + " și puteți asculta simultan indicațiile GPS sau muzica preferată în fundal."
                + "BTX2 Pro S LR este primul interfon de nivel mediu cu tehnologie dual chipset Bluetooth 4.2:"
                + " 8 persoane (4 motociclete), cu șofer și pasager în modul Conferință, până la 6 persoane în modul One-to-One."
                + " Toate în modul Full Duplex,"
                + " cu calitate digitală și sistem de suprimare a zgomotului DSP și AGC pentru control automat al volumului pe baza zgomotului de fond (dezactivat și reglabil).",
                "Midland BTX2 Pro S LR este echipat cu 2 conexiuni de interfon universal pentru asocierea cu interfoane de la alte mărci,"
                + " partajare muzică, radio FM cu RDS, 6 canale presetate, mesaje vocale de stare, VOX, posibilitate de conectare a 2 smartphone-uri.",
                "Midland",
                "indisponibila",
                1245.50f,
                false,
                23.5,
                1600,
                true);

        t5 = new Intercom(t4);
        t5.setDenumire("Midland BTX1 PRO S");
        t5.setDistanta(1500.5f);
        t5.setImagine("https://gomagcdn.ro/domains2/asfalt-uscat.ro/files/product/original/sistem-de-comunicatie-midland-btx1-pro-s-458598.jpg");

        t6 = new Intercom(t1);
        t6.setAutonomie(20.5);
        t6.setDistanta(1325.25f);
        t6.setPret(1200);
        t6.setDenumire("Smart hjc 50");

        t7 = new Intercom("Cardo Freecom 2X JBL",
                "LIVE BLUETOOTH INTERCOM - Experience exceptional audio quality with our all new auto-reconnect Bluetooth intercom. 2 riders at a range of 800m / 1/2mi."
                + "SOUND BY JBL - Powerful 40mm high-definition speakers engineered to perfection by JBL experts,"
                + " with specially tuned music processor and three distinctive audio profiles, will make your riding experience exceptional."
                + "PHONE - Answer calls, make calls and control your mobile devices with a touch of a finger or the sound of your voice. No one will ever guess you are talking from your ride."
                + "AUTOMATIC VOLUME - Automatically adjusts your sound volume based on the outside ambient noise. Enjoy Vivaldi at full throttle. Don’t get deaf by AC/DC waiting for the lights turn."
                + "WATERPROOF - No matter what you throw at it, your waterproof FREECOM 2X will take the beating and keep you connected.",
                "World’s best Bluetooth communicator for 2 riders, with Sound by JBL, live intercom and analog jog-dial.",
                "Cardo",
                "https://gomagcdn.ro/domains2/asfalt-uscat.ro/files/product/original/sistem-comunicatie-cardo-freecom-2x-77811-1939.jpg",
                1049.00f,
                true,
                13,
                800,
                false);
        t8 = new Intercom(t6);
        t9 = new Intercom(t7);
        t9.setAutonomie(13);
        t9.setPret(1500.52);
        t9.setDistanta(1200.25f);
        t9.setBluetooth(false);
        t9.setDenumire("Midland");
        t10 = new Intercom(t8);
        t10.setDescriereShort("World’s best Bluetooth communicator for 4 riders, with Sound by JBL, live intercom and analog jog-dial.");
        t10.setAutonomie(14);
        t10.setDisponibilitate(false);
        t10.setDistanta(550.550f);

       /* System.out.println("Intercom 1" + t1);
        System.out.println("Intercom 5" + t5);
        System.out.println("Intercom 10" + t10);
*/
        //creare vector de 10 instante
        Intercom[] sisteme = new Intercom[10];
        sisteme[0] = t1;
        sisteme[1] = t3;
        sisteme[2] = t2;
        sisteme[3] = t4;
        sisteme[4] = t6;
        sisteme[5] = t5;
        sisteme[6] = t7;
        sisteme[7] = t9;
        sisteme[8] = t10;
        sisteme[9] = t8;

        //creare instante de tip SuportTelefonMobil
        SuportTelefonMobil s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
        s1 = new SuportTelefonMobil();
        s2 = new SuportTelefonMobil("Quad Lock PRO",
                "Suport telefon Quad Lock PRO prindere ghidon"
                + "compatibil cu toate husele Quad Lock sau orice suport universal adeziv"
                + "compatibil cu amortizorul de vibrații (QLA-VDM)"
                + "Conținut pachet:"
                + "1x suport telefon Quad Lock PRO prindere ghidon"
                + "4x adaptoare pentru diametre de ghidon diferite"
                + "cheie hexagonală"
                + "1x șurub M5 x 35",
                "Suportul de telefon Quad Lock PRO cu prindere pe ghidon."
                + " Spre deosebire de modelul standard, varianta PRO este confecționat din aluminiu anodizat și oțel inoxidabil.",
                "Quad Lock",
                "indisponibil",
                296.65f,
                true,
                "ghidon",
                "plastic",
                10);
        s3 = new SuportTelefonMobil(s2);
        s4 = new SuportTelefonMobil("Ram Mounts XGrip U-Bolt",
                "Construcție din oțel inoxidabil acoperit cu pulbere de aluminiu de înaltă calitate"
                + "nclude o bilă de cauciuc și sistem de prindere cu opțiuni de ajustare la ambele capele al brațiului intermediar, iar prin răsucirea brațului se permite poziționarea X-Grip-ului (sistemul care susține telefonul) în poziția cu vizibilitate maximă"
                + "Suportul X cu arcuri se extinde și se strânge după mărimea dispozitivului"
                + "Brațurile acoperite cu cauciuc vor menține ferm dispozitivul"
                + "Kitul include șurubul în forma literei U care se potrivește pentru ghidoanele cu un diametru între 12,7 și 31.75 mm",
                "Cel mai bun suport de telefon mobil din lume",
                "RAM MOUNTS",
                "indisponibil",
                356.15f,
                false,
                "ghidon",
                "plastic",
                11);
        s5 = new SuportTelefonMobil(s4);
        s5.setPrindere("oglinda");
        s5.setPret(300);
        s5.setMaterial("fier");
        s6 = new SuportTelefonMobil(s1);
        s6.setDenumire("Ram Mount");
        s6.setDiagonalaTelefon(15.25);
        s7 = new SuportTelefonMobil("Smart Clip S920M",
                "Compatibil pentru telefoane cu dimensiunile cuprinse intre 112x52 mm si 148x75 mm"
                + "Compatibil si pe suprafete ne rotunjite"
                + "Designul produsului nu obtureaza camera la majoritatea camerelor de smart phone ."
                + "Potrivire cu majoritatea telefoanelor"
                + "Prindere/Demontare rapida ",
                "Suport fixare telefon universal . Montare pe motociclete , scutere , biciclete . ",
                "Smart",
                "https://gomagcdn.ro/domains/motomus.ro/files/product/original/suport-fixare-telefon-smart-clip-4359-220127.jpg",
                290.87f,
                true,
                "ghidon",
                "textil",
                12);
        s8 = new SuportTelefonMobil(s6);
        s8.setMaterial("aluminiu");
        s8.setPret(350.12);
        s9 = new SuportTelefonMobil("Suport telefon universal Givi",
                "Clemă universală pentru smartphone/navigator pentru fixare pe motociclete, scutere, biciclete, trotinete și quad-uri. Dedicat dispozitivelor cu lățimi cuprinse între 52 și 86 mm."
                + "S921 este compatibil cu majoritatea smartphone-urilor de pe piață, cu lățimi între 52 mm și 85 mm"
                + "Designul a fost studiat pentru a vă permite să fotografiați în mișcare, lăsând zona camerei liberă."
                + "Materialele folosite sunt de înaltă calitate pentru a garanta longevitatea produsului și o aderență sporită în zona în contact cu dispozitivul, datorită inserțiilor de cauciuc antiderapante."
                + "În dotare găsim și o bandă suplimentară de siguranță de cauciuc (păianjen), destinată utilizării pe drumuri denivelate.",
                "Ramai permanent in contact vizual cu telefonul tau, mai mult deatat cu acest suport poti filma in timp ce te deplasezi datorita constructiei  si designului special conceput care nu optureaza camera.",
                "Givi",
                "indisponibila",
                147.05f,
                false,
                "oglinda",
                "otel",
                13);
        s10 = new SuportTelefonMobil(s9);
        s10.setDenumire("Givi S921");
        s10.setPrindere("ghidon");
        s10.setPret(148.14);

        /*System.out.println("Suport 7" + s7);
        System.out.println("Suport 3" + s3);
        System.out.println("Suport 6" + s6);
*/
        //vector Suport Telefoane
        SuportTelefonMobil[] suport = new SuportTelefonMobil[10];
        suport[0] = s10;
        suport[1] = s9;
        suport[2] = s8;
        suport[3] = s7;
        suport[4] = s6;
        suport[5] = s5;
        suport[6] = s4;
        suport[7] = s3;
        suport[8] = s2;
        suport[9] = s1;

        Manusi m1, m2, m3, m4, m5, m6, m7, m8, m9, m10;
        m1 = new Manusi();
        m2 = new Manusi("Manusi Ozone Town II",
                """
                Ozone Town II sunt manusi moto din piele cu desing sport perfecte pentru plimbarile pe o motocicleta de viteza in oras sau in afara lui in zilele calduroase de vara. 
                Sunt facute din cea mai calitativa piele de capra, combinata cu piele de vaca. Au perforatii pe toata lungimea degetelor ce asigura o ventilatie buna in zilele calduroase. 
                                               
                 FABRIC:                                            
                -Piele calitativa de vaca (split leather).
                                               
                -Cea mai caltitativa piele de capra. 
                                               
                -Cea mai calitativa piele de capra perforata. 
                                               
                -Mesh
                                               
                -Poliester
                                               
                 VENTILATII:                                              
                -Interior comfortabil si aerisit.
                                               
                -Partea de sus a manusii (dinspre incheietura) este din mesh si asigura ventilarea.
                                               
                -Perforatiile de pe partea (din piele) de sus a manusii asigura aerisirea ideala. 
                                               
                -Perforatiile din palma asigura airflow-ul (circuitul aerului). 
                                               
                -Perforatii pe zona degetelor. 
                                               
                                               
                 SIGURANTA                                             
                Acest produs respecta normale de sigurata impuse de directiva CE (EN 13594:2015)""",
                """
                Ozone Town II sunt manusi moto din piele cu desing sport perfecte pentru plimbarile pe o motocicleta de viteza in oras sau in afara lui in zilele calduroase de vara.""",
                "OZONE",
                "N/A",
                199,
                true, "Negru", "Piele", "Sport");

        m3 = new Manusi(m2);
        m3.setCuloare("Rosu");
        m3.setDisponibilitate(false);
        m3.setPret(210);

        m4 = new Manusi("Manusi Helstons Sun Air",
                """
        Manusi Helstons Sun Air sunt manusi moto barbatesti de vara fabricate din piele moale perforata de capra. . 
        
        Atat pielea perfoarata cat si protectiile de pumn exterioare si pielea din palma dublata 
        cu fibre de aramida fac din ele manusile perfecte pentru o zi calduroasa de vara, 
        atat in oras cat si pentru calatoriile scurte in jurul orasului.
     
        MATERIALE
        
        Manusi moto din piele moale de capra de calitate superioara 
        Fibre de aramida in palma
        
        AERISIRI
        
        Piele perforata pe degete si pe partea superioara a palmei    
         
        PROTECTIE
        
        Pielea din palma este intarita cu fibre de aramida
        Protectii de pumn exterioare
        Manusi aprobate CE 
        
        ERGONOMIE
        
        Design creat special pentru confort in utilizare pe motocicletă
        
        Functie tactilă integrată pe degetul aratator
        
        Inchidere cu baretă cu arici ce se poate ajusta pe incheietură""",
                """
        Manusi Helstons Sun Air sunt manusi moto barbatesti de vara fabricate din piele moale perforata de capra. 
        Au protectii de pumn exterioare si pielea din palma este intarita cu fibre de aramida. 
        Sunt masnusi moto ce confera protectie si iti dau un aer retro.""",
                "Helstons",
                "N/A",
                289,
                true,
                "Negru",
                "Piele",
                "Chopper/Retro");

        m5 = new Manusi(m4);
        m5.setCuloare("Bej");
        m5.setPret(319);
        m5.setDisponibilitate(false);

        m6 = new Manusi("Manusi REV'IT! Volcano",
                """
        Manusi REV'IT! Volcano manusi moto de primavara-toamna, usoare, confortabile, cu mansete scurte.
        Manusile Volcano sunt cea mia usoara pereche de manusi de primavara-toamna adventure din colectia REV’IT! (in afara coletiei DIRT).
        Acestea ofera un amestec perfect de confort si protectie, indiferent unde alegeti sa calatoriti.
        
        Toate manusile REV’IT! sunt concepute pentru a mentine simtul tactil natural, 
        avand grija in acelasi timp ca mainile sa aiba parte de confort pe tot parcursul calatoriei.
        Pentru a crea cele mai usoare manusi moto din gama, REV’IT! au folosit o tesatura din microfibra aderanta in zona palmei, 
        combinata cu mesh in exterior, pentru a mentine mainile racoroase si uscate.
        
        Protectiile moi si comode de la nivelul degetelor, articulatiile TPR si protectiile Temperfoam® 
        de la nivelul palemi si degetului mare asigura nu doar siguranta ci si confort. Punerea si fixarea 
        manusilor este foarte usoara datorita gaicii de la nivelul mansetei si a curelei cu Velcro.
        
        Cu tehnologia Connect Finger integrata puteti utiliza dispozitivele cu ecran tactil 
        fara a mai fi nevoie sa va scoateti manusile. Fiind disponibile intr-o gama larga de culori,
        REV’IT! s-au asigurat ca aceste manusi se potrivesc echipamentului tau moto.""",
                """
        Manusi REV'IT! Volcano manusi moto de primavara-toamna, usoare, confortabile, cu mansete scurte.""",
                "REV'IT!",
                "N/A",
                325,
                true,
                "Negru",
                "Piele/Plasa 3D aerisita",
                "Sport/Street");
        m7 = new Manusi(m6);
        m7.setCuloare("Fluo");
        m8 = new Manusi(m6);
        m8.setCuloare("Maro");
        m9 = new Manusi(m6);
        m9.setCuloare("Gri");
        m9.setPret(330);
        m10 = new Manusi("Manusi O'Neal Element",
                """
        DETALII TEHNICE:  
            Palma este fabricata din piele sintetică. Este dublata in podul palmei,
        in zona unde ai priza cea mai buna si la degetul mare pentru protectie, confort si aderenta sportita.   
            Vârful degetelor nu care cusaturi care sa creeze un disconfort pe toata durata purtarii.      
            Pe partea interioara a degetelor aratator si mijlociu avem imprimeurile cu silicon care aduc o aderență 
        îmbunătățită și control mult mai bun al frânării.        
            Pe degete gasim protectii din elastomer termoplastic.         
            Manusi precurbate din constructie pentru o potrivire perfecta pe mainile dvs.   
            Grafică îndrăzneață, foarte colorata.       
            Materiale rezistente la uzura și flexibile pentru o potrivire perfectă pe mana dvs.     
            Panourile laterale ale degetelor sunt facute din material Stretch Lycra® elastic si expandabil pentru a spori 
        confortul si flexibilitatea.       
            Căptușeala ergonomică și cusăturile din palmă sporesc confortul si dexteritatea.       
            Închiderea cu velcro este reglabilă pentru o fixare sigură si o potrivire perfecta.        
            In zona degetului mare, materialul este dublat pentru a mari gradul de protectie si confort.        
            Nu acoperă încheietura mâinii.        
        42% piele sintetica, 35% nylon, 15% TPR, 8% poliester""",
                """
        O'Neal Element sunt manusi de enduro, cross, ATV sau downhill ce iti ofera confort,
        protectie si o priza ferma pe mansoane chiar si in cele mai dure conditii din off-road.""",
                "O'Neal",
                "N/A",
                89,
                true,
                "Portocaliu",
                "Piele sintetica",
                "MX/Enduro");

        Incaltaminte i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
        i1 = new Incaltaminte();
        i2 = new Incaltaminte("Cizme Rebelhorn Trip ST",
                """
        Rebelhorn Trip ST sunt cizme moto concepute pentru plimbări pe motociclete de viteza, naked sau touring.
        
        Au cel mai înalt grad de protecție și durabilitate asigurat de talpa dura, dar comoda atat in mers cat si pe motor, intariturile din calcai, varful cizmei și din dreptul gleznei. In dreptul schimbatorului este o protectie suplimentara pentru a preveni uzura prematura a cizmei. 
        
        Au cusaturi certificate CE, duble și triple. Confortul la utilizare este asigurat de o căptușeală moale și respirabilă, ce permite picioarelor dvs. sa "respire" in zilele calduroase de vara. 
        
        Fermoarul lung, cat si inchiderea cu velcro permit echiparea rapida a cizmelor. Posibilitatea de a schimba sliderele garantează că cimele noastre vă vor servi cat mai multe sezoane.
        
        Insertiile de piele elastica in zonele de stres va asigura confortul atat in mers, cat si pe motor.""",
                """
        Rebelhorn Trip ST sunt cizme moto concepute pentru plimbări pe motociclete de viteza, naked sau touring.""",
                "Rebelhorn",
                "N/A",
                649,
                true,
                "Negru",
                "Piele/Cauciuc",
                "Sport",
                40);
        i3 = new Incaltaminte(i2);
        i3.setMarime(45);
        i3.setDisponibilitate(false);
        i4 = new Incaltaminte("Cizme Falco Avantour 2",
                """
        Falco Avantour 2 sunt cizme de top ale producatorul italian in ceea ce priveste protectia pe motociclete de adventure. Chiar daca este plina de protectii dure, aceasta cizma are mobilitate datorita tehnologiei “Eso-Motion 2 MX” ce o face o alegere ideala pentru ca in enduro si motocross ai nevoie de maximul de mobilitate pentru a controla vitezele si frana spate.
        
        Exteriorul este construit din piele de cea mai buna calitate tratata hydrophobic si ABS, iar protectiile premium D3O® inserate in zona gleznei te protejeaza in caz de impact.
        In sectiunea VIDEO ti-am lasat un scurt material in care aceasta tehnologie este descrisa. Pe scurt, acest D3O este moale si flexibil pentru a avea maximul de confort, iar in momentul impactului devine rigid pentru a o feri cea mai buna protectie. 
        
        Membrana interioara “High-Tex” este impermeabila, dar in acelasi timp permite piciorului tau sa "respire" pe durata zilelor calduroase de vara. 
        
        Varful, calcaiul, partea din spate, cat si zona tibiei sunt intarite si protejate suplimentar.
        Pe partea interioara aceasta cizma are niste panouri termice care te protejeaza de caldura degajata de motor. 
        
        Talpa Vibram este ranforsata si constuita din material ce ofera un maxim de aderenta. 
        
        Are multiple zone elastice ce faciliteaza confortul atat in mers, cat si pe motor.
        
        Cataramele metalice sunt foarte calitative, se pot regla si se pot inlocui. 
        
        Aceste ghete moto au omologare CE EN-13634. 
        
        Compania Gianni Falco Srl confecționează cizme de motocicletă de peste 20 de ani și acest lucru se arată în măiestria și designul tehnic al produselor finite.
        Falco Srl este unul dintre producătorii de cizme care folosește armură D3O la majoritatea cizmelor lor, oferind unele dintre cele mai bune protecții de pe piață. 
        Toate cizmele Falco îndeplinesc omologarea CE pentru cizmele de motocicletă. Fie că mergi pe drum sau in off-road, fie ca ai o motocicleta adventure/touring sau un cross/enduro,
        gama de cizme Falco este un element necesar al echipamentului tau moto.
        """,
                """
        Liderul gamei adventure.
        Italienii de la Falco au inglobat ultimele tehnologii disponibile in aceste cizme premium dual use certificate CE: 
        exterior din piele tratata hydrophobic full grain, membrana High-Tex la interior pentru rezistenta la apa si respirablitate,
        sistem articulat de sustinere a gleznei si piciorului Eso-Motion 2 si cele mai bune protectii disponibile la ora actuala pe piata - D3O® inserate in zona gleznei.
        Totodata, botul cizmei este intarit pentru rezistenta la impact in off road, calcaiul iti este protejat de o carcasa rezistenta de plastic iar 
        inchiderea cu velco beneficaza de asemenea in zona frontala de o protectie de plastic dur. 
        Pentru confort avem integrate zone elastice ce iti permit sa te misti pe motocicleta iar zona de sus este inchisa cu o bareta de cauciuc pentru a proteja interiorul de apa.
        Talpa lipita dual-compound, aderenta pe scarite si in timpul mersului, impreuna cu cataramele metalice Black-Alu, complet inlocuibile, completeaza caracterul practic al varfului de gama Avantour. """,
                "Falco",
                "N/A",
                1349,
                true,
                "Negru",
                "Full Grain Lether",
                "Adventure",
                44);
        i5 = new Incaltaminte(i4);
        i5.setCuloare("Maro");
        i5.setMarime(48);
        i5.setDisponibilitate(false);

        i6 = new Incaltaminte("Cizme O'Neal RSX",
                """
        The perfect all-round Boot for off-road riding and entry level Motocross
        Optimum balance of flexibility and stability
        Internal protection for your ankle, front of underfoot and gear shift zone
        High grip rubber outsole
        Robust plastic quick-action buckles for a perfect fit,replaceable
        Technical microfiber upper
        Lined with air mesh for better ventilation
        Nylon inner sole with steel shank
        Removable footbed
        Meets EN 13634:2017 standard
        35% textile, 25% rubber, 24% PVC, 12% TPU, 4% microfibre PU""",
                """
        The perfect all-round Boot for off-road riding and entry level Motocross""",
                "O'Neal",
                "N/A",
                599,
                true,
                "Negru",
                "Microfiber/Rubber/Plastic",
                "Enduro/Cross/ATV",
                44);
        i7 = new Incaltaminte(i6);
        i7.setCuloare("Rosu");
        i7.setPret(749);
        i8 = new Incaltaminte(i6);
        i8.setCuloare("Fluo");

        i9 = new Incaltaminte("Cizme Falco Atlas 2",
                """
        Falco Atlas 2 sunt o pereche de cizme moto touring cu un design modern construite cu varful tehnologiei de protectie pentru ca tu sa te poti bucura de plimbarea pe motocicleta in deplina siguranta. 
        Fabricate din piele, cu membrana interioara High-Tex si tehnologia Air-Tech, cizmele vin cu varful si calcaiul intarite, ambele din piele de cea mai buna calitate.
        
        Glezna este intarita cu o protectie din D3O. La sectiunea video, am incarcat un material unde iti este descrisa aceasta tehnologie si avantajele ei. 
        
        Inchiderea cu fermoar si velcro faciliteaza echiparea rapida.
        Talpa din cauciuc vulcanizat este comoda si rezistenta.
        Nervurile elastice din piele amplasate in zone de stres iti dau un confort deplin atat in mers, cat si pe motor. 
        Aceste cizme moto au omologare CE EN-13634. 
        
        Compania Gianni Falco Srl confecționează cizme de motocicletă de peste 20 de ani și acest lucru se arată în măiestria și 
        designul tehnic al produselor finite. Falco Srl este unul dintre producătorii de cizme care folosește armură D3O 
        la majoritatea cizmelor lor, oferind unele dintre cele mai bune protecții de pe piață. 
        Toate cizmele Falco îndeplinesc omologarea CE pentru cizmele de motocicletă. 
        Fie că mergi pe drum sau pe circuit, fie ca ai un cruiser sau o motocicleta off road, 
        gama de bocanci Falco este un element necesar al echipamentului tau moto. """,
                """
        Falco Atlas 2 sunt o pereche de cizme moto touring cu un design modern 
        construite cu varful tehnologiei de protectie pentru ca tu sa te poti bucura de plimbarea pe motocicleta in deplina siguranta.
        Cizme moto touring din piele, interior protejat de membrana impermeabila High Tex, protectii D3O in zona gleznei,
        varf si calcai intarit, talpa confortabila la mers si pe motor, omologare CE EN-13646.""",
                "Falco",
                "N/A",
                899,
                true,
                "Negru",
                "Piele Naturala de calitate/Captuseala Polyester",
                "Touring",
                41);

        i10 = new Incaltaminte("Ghete Alpinestars Faster-3",
                "---",
                """
        Featuring new performance innovations adapted from decades of R&D experience in the highest level of motorsports,
        the Faster-3 Shoe utilizes a seamless knitted construction to create a riding shoe that is extremely lightweight 
        and breathable and also boasts class-leading protective features, both inside and outside.""",
                "Alpinestars",
                "N/A",
                675,
                true,
                "Alb",
                "Piele",
                "Urban",
                43);

        /*System.out.println("Manusi1: \n" + m1);
        System.out.println("Manusi2: \n" + m2);
        System.out.println("Manusi3: \n" + m3);

        System.out.println("Incaltaminte1: \n" + i1);
        System.out.println("Incaltaminte2: \n" + i2);
        System.out.println("Incaltaminte3: \n" + i3);
        System.out.println("Incaltaminte4: \n" + i4);
        System.out.println("Incaltaminte5: \n" + i5);
*/
        Manusi[] man = new Manusi[10];
        Incaltaminte[] inc = new Incaltaminte[10];
        man[0] = m1;
        man[1] = m2;
        man[2] = m3;
        man[3] = m4;
        man[4] = m5;
        man[5] = m6;
        man[6] = m7;
        man[7] = m8;
        man[8] = m9;
        man[9] = m10;

        inc[0] = i1;
        inc[1] = i2;
        inc[2] = i3;
        inc[3] = i4;
        inc[4] = i5;
        inc[5] = i6;
        inc[6] = i7;
        inc[7] = i8;
        inc[8] = i9;
        inc[9] = i10;

       /* System.out.println("Afisare vector casti\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Casca " + (i + 1) + " \n" + casti[i].toString(1) + "\n");
        }
        System.out.println("\nAfisare vector jachete\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Jacheta " + (i + 1) + " \n" + jachete[i].toString(1) + "\n");
        }

        System.out.println("Afisare vector intercom\n");
        for (int i = 0; i < sisteme.length - 0; i++) {
            System.out.println(sisteme[i].toString(2) + "\n");
        }
        System.out.println("\nAfisare vector SuportTelefonMobil\n");
        for (int i = 0; i < suport.length - 0; i++) {
            System.out.println(suport[i].toString(1) + "\n");
        }

        System.out.println("Vector manusi\n");
        for (int i = 0; i < man.length; i++) {
            System.out.println(man[i].toString(2) + "\n");
        }
        System.out.println("Vector incaltaminte\n");
        for (int i = 0; i < inc.length; i++) {
            System.out.println(inc[i].toString(1) + "\n");
        }
*/
        System.out.println("---------------------------------");
        boolean boolSuport = false;
     for(SuportTelefonMobil i : suport){
            if(i.getPret()<2000 && i.getMaterial().equals("plastic")){
                 System.out.println(i.toString(2)+"\n");
                 boolSuport = true;
            }
         }
        if (!boolSuport) {
    System.out.println("Niciun produs nu este eligibil conform conditiilor.");
}
        System.out.println("\nAfisari vector cu conditie clasa Intercom\n\n");
        boolean boolIntercom = false;
        for(Intercom i : sisteme){
            if(i.getPret()<2000 && i.isBluetooth()!=true){
                 System.out.println(i.toString(2)+"\n");
                 boolIntercom = true;
            }
         }
        if (!boolIntercom) {
    System.out.println("Niciun produs nu este eligibil conform conditiilor.");
        }
    }
}
