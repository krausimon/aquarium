import de.hsulm.sote2.ecanvas.EasyCanvas;

public abstract class AbstractFish implements IFisch {
    private int posX;
    private int posY;

    public AbstractFish(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void zeichne(EasyCanvas ec) {
        ec.drawRect(posX, posY, 10,10);
        ec.show();
    }

    public void bewege() {
        posX +=1;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
