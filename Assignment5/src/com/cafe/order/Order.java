package com.cafe.order;

import java.util.ArrayList;
import java.util.List;



public class Order {
    private List<OrderItem> items = new ArrayList<>();

    private static int orderCounter = 1;
    private int orderNo ;


    private Order.PickUp delivery;

    public String menus()
    {
        String ret = "";




        ret += String.format("[");
        for(int i=0;i<items.size(); i++)
        {

            ret += items.get(i).toString();

            if(i != items.size()-1)
            {
                ret += ", ";
            }

        }
        ret += "]\n";

        return ret;

    }
    public void completed() {

        delivery.handle(this);

    }

    public void setPickUp(PickUp pickUp) {
        delivery = pickUp;
    }

    public void addItem(OrderItem item) {

        items.add(item);
        orderCounter += 1;
    }

    public void setOrderNo(int no)
    {
        orderNo = no;
    }

    public int getOrderNo()
    {
        return orderNo;
    }

    public static interface PickUp {
        public abstract void handle(Order o);
    }

   //

}

/*
public class Order {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public boolean setSize(String name, String size) {

        for(OrderItem item : items) {
            if (item.beverage.name.equals(name)) {
                return item.beverage.setSize(size);
            }
        }
        return false;
    }

    public int cost() {

        int totalCost = 0;
        for(OrderItem item : items) {
            totalCost += item.beverage.basePrice * item.quantity;
        }
        return totalCost;

    }
    public void add(OrderItem item) {
        items.add(item);
    }
    public void print() {
        for(OrderItem item : items)
        {
            System.out.println(item.toString());
        }
        System.out.printf("Total: %,d%n", this.cost());
    }
}
 */
