public class GameCell {

    private boolean blocked;

    private String state;

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
            this.blocked = false;
            this.state = type;
        }

    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
