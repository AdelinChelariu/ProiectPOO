public class TestInstante {

    public static void main(String[] args) {
        Casca c1, c2, c3 ,c4, c5;
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
                1899,
                true,
                "Integrala",
                "Negru / Marvel Punisher");
        c3 = new Casca(c2);
        c3.setDisponibilitate(false);
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
        System.out.println("Casca 1: \n" + c1);
        System.out.println("Casca 2: \n" + c2);
        System.out.println("Casca 3: \n" + c3);
        System.out.println("Casca 4: \n" + c4);
        System.out.println("Casca 5: \n" + c5);

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
                "N/A",
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
        casti[3] = c4;
        casti[4] = c5;
        jachete[0] = j1;
        jachete[1] = j2;
        jachete[2] = j3;
        
        jachete[3] = new Jacheta(j3);
        jachete[3].setCuloare("Fluo");
        jachete[3].setPret(1700);
        jachete[3].setDisponibilitate(false);
        
        
        
        System.out.println("Afisare vector casti\n");
        for(int i = 0; i < casti.length - 5; i++)
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
        
        
        
        
        Manusi m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
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
                true,"Negru","Piele","Sport");
        
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
        
        
        Incaltaminte i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
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
        
        
        
        System.out.println("Manusi1: \n" + m1);
        System.out.println("Manusi2: \n" + m2);
        System.out.println("Manusi3: \n" + m3);
        
        System.out.println("Incaltaminte1: \n" + i1);
        System.out.println("Incaltaminte2: \n" + i2);
        System.out.println("Incaltaminte3: \n" + i3);
        System.out.println("Incaltaminte4: \n" + i4);
        System.out.println("Incaltaminte5: \n" + i5);
        
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
        
        System.out.println("Vector manusi\n");
        for(int i = 0; i < man.length; i++)
        {
            System.out.println(man[i].toString(1) + "\n");
        }
        System.out.println("\nVector Incaltaminte\n");
        for(int i = 0; i < inc.length; i++)
        {
            System.out.println(inc[i].toString(1) + "\n");
        }
                
 
    }
}
