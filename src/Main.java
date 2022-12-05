public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxColor = new MagicBox<>(5);
        printResult(magicBoxColor.add("Красный"));
        printResult(magicBoxColor.add("Жёлтый"));
        printResult(magicBoxColor.add("Зелёный"));
        printResult(magicBoxColor.add("Синий"));
        printResult(magicBoxColor.add("Белый"));
        printResult(magicBoxColor.add("Чёрный"));
        System.out.println("Случайно выбранный цвет - " + magicBoxColor.pick());

        MagicBox<Integer> magicBoxInt = new MagicBox<>(3);
        printResult(magicBoxInt.add(123));
        printResult(magicBoxInt.add(456));
        System.out.println("Случайно выбранное число - " + magicBoxInt.pick());
    }

    public static void printResult(boolean result) {
        if (result) {
            System.out.println("Элемент добавлен!");
        } else {
            System.out.println("Не удаётся добавить элемент!");
        }
    }
}
