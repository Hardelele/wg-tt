public class ConsoleController extends StringReceiver {

    private static String command;

    /*
     TODO:: Написать более понятную инструкцию, написать команды swap, help, exit.

     TODO:: Реализовать парсер команд.
     */

    public static void askCommand() {
        System.out.println("Enter command as: command properties " +
                "- type 'help' to get more info about commands");
        System.out.println("Waiting for command: ");
        command = input();
    }

    public static void handle() {
        if (command.substring(0,4).equals("set")) {
            try {
                int heightId = Integer.parseInt(command.substring(4,5));
                int widthId = Integer.parseInt(command.substring(6,7));
            } catch (Exception e) {
                System.out.println("Произошла ошибка ввода. Повторите попытку.");
                // TODO:: написать алгоритм повторного выполнения
            }
        }
    }



}
