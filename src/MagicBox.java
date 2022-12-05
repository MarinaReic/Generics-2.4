import java.util.Random;

public class MagicBox<T> {
    protected int amountItems;
    protected T[] items;

    public MagicBox(int amountItems) {
        this.amountItems = amountItems;
        this.items = (T[]) new Object[amountItems];
    }
}
