package EksamensopgaveMenuValg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> menu = new ArrayList<>();
        menu.add("Tomat");
        menu.add("Salat");
        menu.add("Agurk");

        MinBrugerDialog dialog = new MinBrugerDialog();
        dialog.menuValg(menu);
    }

}