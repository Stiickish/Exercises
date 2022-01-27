package EksamensopgaveLønberegning;

public class ProvisionsMedarbejder implements Betaling{

    private double grundløn;
    private double salg;
    private double provision;

    public ProvisionsMedarbejder(double salg, double provision){
        this.salg = salg;
        this.provision = provision;
    }

    public ProvisionsMedarbejder(double grundløn, double salg, double provision) {
        this.grundløn = grundløn;
        this.salg = salg;
        this.provision = provision;
    }



    @Override
    public double beregnLøn() {
        double lønMedProvision  = grundløn +(salg*provision);
        System.out.println("Løn som provisionsmedarbejder er på " + lønMedProvision);
        return lønMedProvision;
    }
}
