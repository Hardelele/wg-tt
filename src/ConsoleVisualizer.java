
/*
 TODO:: Технический долг в методе checkGameCellTypeAndPrint - printSomeCellInConsole(width); Избавиться от передачи with в метод.

 TODO:: Написать методы для red, blue и purple в checkGameCellTypeAndPrint.
 */

public class ConsoleVisualizer {

    public void printGameField() {
        clearConsole();
        printHeaderOfTable();
        printTableOfGameCells();
        ConsoleController.askCommand();
    }

    private void checkGameCellTypeAndPrint(int height, int width) {

        if (GameField.getCellById(height,width).isBlocked()) {
            printBlockedCellInConsole(width);
        } else {

            switch (GameField.getCellById(height,width).getColor()) {

                case "red":
                    break;

                case "blue":
                    break;

                case "purple":
                    break;

                default:
                    break;
            }

        }
    }

    private void printBlockedCellInConsole(int width) {
        if (width+1 == GameField.gameFieldWidth) {
            System.out.print("| XXXXXX |");
        } else {
            System.out.print("| XXXXXX ");
        }
    }

    private void clearConsole() {
        for (int counter = 0; counter<50; counter++) {
            System.out.println();
        }
    }

    private void printHeaderOfTable() {
        printBorderLine();
        System.out.print("|  red   |        |  blue  |        | purple |");
        printBorderLine();
    }

    private void printBorderLine() {
        System.out.print("\n|--------|--------|--------|--------|--------|\n");
    }

    private void printTableOfGameCells() {
        for (int cornetHeight = 0; cornetHeight < GameField
                .gameFieldHeight; cornetHeight++) {
            for (int cornetWidth = 0; cornetWidth < GameField
                    .gameFieldWidth; cornetWidth++) {
                this.checkGameCellTypeAndPrint(cornetHeight,cornetWidth);
            }
            printBorderLine();
        }
    }

}
