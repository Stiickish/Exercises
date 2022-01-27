package EksamensopgaveLønberegning;

public class TimeLønnetMedarbejder implements Betaling {

    private double antalTimer;
    private double timeløn;

    public TimeLønnetMedarbejder(double antalTimer, double timeløn) {
        this.antalTimer = antalTimer;
        this.timeløn = timeløn;
    }

    @Override
    public double beregnLøn() {
        double løn = antalTimer * timeløn;
        System.out.println("Timelønnet arbejde: " + løn);
        return løn;
    }

}
