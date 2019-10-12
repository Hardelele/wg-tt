public class GameCell {

    private boolean blocked;

    private String color;

    /*
     TODO:: Выяснить нужен ли коструктор без параметров, если да, то применить его.
     */

    public GameCell() {
        this.blocked = false;
    }

    public GameCell(String type) {
        if (type.equals("blocked")) {
            this.blocked = true;
        } else {
            this.color = type;
        }
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
