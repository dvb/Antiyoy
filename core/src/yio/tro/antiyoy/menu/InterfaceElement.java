package yio.tro.antiyoy.menu;

import yio.tro.antiyoy.RectangleYio;
import yio.tro.antiyoy.factor_yio.FactorYio;

public abstract class InterfaceElement {

    public int id;
    public static final int SPAWN_TYPE = 2;
    public static final double SPAWN_SPEED = 2;
    public static final int DES_TYPE = 2;
    public static final double DES_SPEED = 2;


    public InterfaceElement(int id) {
        this.id = id;
    }


    public abstract void move();


    public abstract FactorYio getFactor();


    public abstract void destroy();


    public abstract void appear();


    public abstract boolean isVisible();


    public abstract boolean checkToPerformAction();


    public abstract boolean isTouchable();


    public abstract boolean touchDown(int screenX, int screenY, int pointer, int button);


    public abstract boolean touchDrag(int screenX, int screenY, int pointer);


    public abstract boolean touchUp(int screenX, int screenY, int pointer, int button);


    public abstract void setTouchable(boolean touchable);


    public abstract boolean isButton();


    boolean isTouchInsideRectangle(float touchX, float touchY, RectangleYio rectangleYio, float offset) {
        return isTouchInsideRectangle(touchX, touchY, (float)rectangleYio.x, (float)rectangleYio.y, (float)rectangleYio.width, (float)rectangleYio.height, offset);
    }


    boolean isTouchInsideRectangle(float touchX, float touchY, float x, float y, float width, float height, float offset) {
        if (touchX < x - offset) return false;
        if (touchX > x + width + offset) return false;
        if (touchY < y - offset) return false;
        if (touchY > y + height + offset) return false;
        return true;
    }
}
