package Assignment_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        item item1 = new item(1, "Pencil", 20.00);
        item item2 = new item (2, "Copy", 100.00);
        item item3 = new item (3, "Box", 50.00);

        List<item> orderlist = new ArrayList<item>();
        orderlist.add(item1);
        orderlist.add(item2);
        orderlist.add(item3);

        orders order1 = new orders(1, orderlist);
        order1.getDetails();

    }
}
