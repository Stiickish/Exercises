package Test;

public class Butik {

    public static void main(String[] args) {

        Butik butik = new Butik();
int change = butik.køb(500,600);
        System.out.println(change);

    }

    public int køb(int cost, int payed) {
        try {
            if (cost < 0 || payed < 0) {
                throw new IllegalArgumentException("Bla bla");
            }
            if (cost > payed) {
                throw new IllegalArgumentException("blabla");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return payed - cost;
    }

}
