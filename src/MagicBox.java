import java.util.Random;

public class MagicBox<T> {
    protected int amountItems;
    protected T[] items;

    public MagicBox(int amountItems) {
        this.amountItems = amountItems;
        this.items = (T[]) new Object[amountItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < amountItems; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < amountItems; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не заполнена до конца! Осталось заполнить ячеек - " + (amountItems - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(amountItems);
        return items[randomInt];
    }
}
