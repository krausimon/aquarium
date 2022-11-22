import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Rotfisch extends AbstractFish{
    public Rotfisch(int posX, int posY) {
        super(posX, posY);
    }
    public void zeichne (EasyCanvas ec) {
        ec.setColor(Color.RED);
        super.zeichne(ec);
    }
}
