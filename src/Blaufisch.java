import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Blaufisch extends AbstractFish{

    public Blaufisch(int posX, int posY) {

        super(posX, posY);
    }
    public void zeichne (EasyCanvas ec) {
        ec.setColor(Color.blue);
        super.zeichne(ec);
    }

    @Override
    public void bewege() {
        setPosX(getPosX()-1);
    }
}
