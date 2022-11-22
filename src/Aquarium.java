import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private EasyCanvas ec;
    private int breite;
    private int hoehe;
    private List<IFisch> fische;

    public Aquarium(int breite, int hoehe) {
        ec = new EasyCanvas(breite, hoehe);
        ec.show();
        this.breite = breite;
        this.hoehe = hoehe;
        fische = new ArrayList<>();
    }
    public void addFisch (IFisch fisch){
        fische.add(fisch);
    }

    public void zeichne() {
        ec.clear();
        for (IFisch fisch:fische) {
            fisch.zeichne(this.ec);
        }
    }

    public void bewege(){
        for (IFisch fisch:fische) {
            if (fisch.getPosX()>breite) {
                fisch.setPosX(0);
            } else if (fisch.getPosX()<0) {
                fisch.setPosX(breite);
            }
            fisch.bewege();
        }
    }
}
