import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Gelbfisch extends AbstractFish{
    public Gelbfisch(int posX, int posY) {
        super(posX, posY);
    }
    public void zeichne (EasyCanvas ec) {
        ec.setColor(Color.yellow);
        super.zeichne(ec);
    }
}
