package EksamensopgaveLønberegning;

public class Main {
    /*
        Skriv et program, som beregner løn for medarbejdere.
    1.  Skriv et interface Betaling med metoden: public double beregnLøn()

    2.  Skriv to klasser, som implementerer interfacet. Klassen TimelønnetMedarbejder har flg. attributter:
        • antal timer
        • timeløn
        Lønberegning er antal timer ganget med timelønnen. Klassen ProvisionsMedarbejder har flg. attributter:
        • grundløn
        • salg
        • provision (procentsats)
        Lønberegning er grundløn plus provision af medarbejderens salg.
        Eksempel: Grundløn 20000 kr. Salg 10000 kr. Provision 20% giver en løn på 22000kr
    */
    public static void main(String[] args) {

        ProvisionsMedarbejder provisionsMedarbejder = new ProvisionsMedarbejder(20000, 70000, 0.20);
        provisionsMedarbejder.beregnLøn();


        TimeLønnetMedarbejder timeLønnetMedarbejder = new TimeLønnetMedarbejder(8, 150);
        timeLønnetMedarbejder.beregnLøn();
    }

}
