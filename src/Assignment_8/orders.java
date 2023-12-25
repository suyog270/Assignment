package Assignment_8;

import java.util.ArrayList;
import java.util.List;
public class orders {


    int order_id;
    List<item> items = new ArrayList<item>();

    public orders(int order_id, List<Assignment_8.item> item) {
        this.order_id = order_id;
        this.items = item;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<Assignment_8.item> getItem() {
        return items;
    }

    public void setItem(List<Assignment_8.item> item) {
        this.items = item;
    }
    public void getDetails(){
        System.out.println("ID" + "   " + "Name" + "   "+ "Price");
        System.out.println("-------------------------------------");
        double total_price = 0 ;
        for (item i : items){
            total_price = total_price + i.getPrice();

            System.out.println(i.getId()+ ")   "+ i.getName()+ "   " + i.getPrice());

        }
        System.out.println("--------------------------------------");
        System.out.println("Total Price: " + total_price);
    }
}
