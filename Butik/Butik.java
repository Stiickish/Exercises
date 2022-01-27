package Butik;
/*
1. Skriv en klasse der hedder Butik.
2. Skriv en metode kaldet køb der tager to heltal (int), der repræsenterer hhv. en vares pris og det betalte
beløb.
Metoden skal returnere hvor mange byttepenge, der skal gives tilbage.
Hverken beløbet eller prisen må være negative tal – hvis det er tilfældet kastes en exception.
Såfremt det betalte beløb er for lille i forhold til prisen, skal der ligeledes kastes en exception
*/

public class Butik { //Skriv en klasse der hedder BUTIK
    public static void main(String[] args) {
        Butik butik = new Butik();
        int change = butik.Køb(1200, 500);
        System.out.println(change);
    }

    public int Køb(int varensPris, int betalt) { //Skriv en metode der hedder KØB med 2 int som PARAMETER.
        try { //Try catch med exception
            if (varensPris < 0 || betalt < 0) { //Hvis der bliver betalt mindre end 0
                throw new IllegalArgumentException("Price can't be less than items price");
            }
            if (varensPris > betalt) { //hvis man betaler mindre end varens pris
                throw new IllegalArgumentException("You didn't pay enough");

            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return betalt - varensPris;
    }

}

