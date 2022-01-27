package Spillere;

public class Gættespil {

    private int number;

    public Gættespil(int number) {
        this.number = number;
    }

    public boolean tur(Spiller spiller){
        return spiller.gætEtTal(30) ==number;
    }
}
