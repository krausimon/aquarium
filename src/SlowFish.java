import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class SlowFish implements IFisch{

    private double posX;
    private double posY;

    public SlowFish(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void zeichne(EasyCanvas ec) {
        ec.setColor(Color.white);
        ec.drawRect(getPosX(), getPosY(), 10,10);
        ec.show();
    }
    public void bewege() {
        posX +=0.4;
    }

    public int getPosX() {
        return (int)posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return (int)posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
