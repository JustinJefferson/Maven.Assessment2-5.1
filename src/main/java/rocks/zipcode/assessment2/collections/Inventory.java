package rocks.zipcode.assessment2.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    private List<String> list;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        list = new LinkedList<>();
        list.addAll(strings);
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        list = new LinkedList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        list.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        list.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return list.size();
    }
}
