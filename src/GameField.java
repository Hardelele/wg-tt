
public class GameField {

    public final static int gameFieldHeight = 5;
    public final static int gameFieldWidth = 5;

    private static GameCell[][] cells;

    private static final GameField gameField = new GameField();

    // TODO:: Сделать отдельный метод для инициализации двумерного массива cells[][]

    static {
        cells = new GameCell[gameFieldHeight][];

        for (int cornetHeight = 0; cornetHeight < gameFieldHeight; cornetHeight++)
        {
            cells[cornetHeight] = new GameCell[gameFieldWidth];
            System.out.println();
        }

        fillAllCellsAsEmpty();
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

    public static void fillAllCellsAsEmpty() {
        for (int cornetHeight = 0; cornetHeight < gameFieldHeight; cornetHeight++)
        {
            for (int cornetWidth = 0; cornetWidth < gameFieldWidth; cornetWidth++)
            {
                cells[cornetHeight][cornetWidth] = new GameCell("empty");
            }
        }

    }


    // TODO:: реализовать метод setGameFieldSettings() реализует класс GameFieldGenerator, оснащая его нужными параметрами.
    public void setGameFieldSettings() {
        GameFieldGenerator.setBlockedCount(6);
    }

    //TODO:: реализовать метод startGenerateGameFieldWithCornetSetting().
    public void startGenerateGameFieldWithCornetSetting() {

    }

}
