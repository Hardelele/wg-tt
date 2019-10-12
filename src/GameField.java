
public class GameField {

    public final static int gameFieldHeight = 5;
    public final static int gameFieldWidth = 5;

    private static GameCell[][] cells;

    private static final GameField gameField = new GameField();

    static {
        cells = new GameCell[gameFieldHeight][];

        for (int cornetHeight = 0; cornetHeight < gameFieldHeight; cornetHeight++)
        {
            cells[cornetHeight] = new GameCell[gameFieldWidth];
            System.out.println();
        }
    }

    private GameField() {}

    public static GameCell getCellById(int height, int width) {
        return cells[height][width];
    }

    // TODO:: создать метод, в котором будут заполняться игровые клетки (воможно новый класс)
    public static void setCellById(int height, int width, String type) {
        // TODO:: передать cells[height][width] сборщику мусора
        cells[height][width] = new GameCell(type);
    }

}
