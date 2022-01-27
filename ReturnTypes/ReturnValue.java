package ReturnTypes;

public class ReturnValue {

    public static void main(String[] args) {

        int eID = returnNumber();
        System.out.println(eID);

    }
    public static int returnNumber(){
        int empID = 201;
        int empID2 = 230;
        int c = empID+empID2;
        return c;
    }


}
