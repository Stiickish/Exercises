package EksamensopgaveReturPenge;

public class Butik {

    public int køb(int varensPris, int betalt) {

        if (varensPris < 0 ){
            throw new IllegalArgumentException("Varens pris kan ikke være et minus tal");
        }if(betalt <varensPris){
            throw new IllegalArgumentException("Du har betalt for lidt");
        }else{
            System.out.println("Du skal have " + (betalt - varensPris) + " kr retur");
        }
        return varensPris - betalt;
    }
}
