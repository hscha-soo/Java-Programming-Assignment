package com.cafe.order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class OrderRepository implements Iterator<Order> {
    List<Order> orders = new ArrayList<>();
    private int curIdx = 0;

    @Override
    public boolean hasNext() {
        return orders.size() > curIdx;
    }

    @Override
    public Order next() {
        curIdx += 1;
        return orders.get(curIdx-1);
    }

    /*
    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Order> consumer) {
        Iterator.super.forEachRemaining(consumer);
    }
*/



    public void add(Order order)
    {
        order.setOrderNo(orders.size()+1);
        orders.add(order);
    }

    public String toString()
    {
        String ret = String.format("--- 주문 관리자 화면 ---\n현재 주문수는 총 %d 입니다.\n\n", orders.size()-curIdx);;

        ret += "< 주문 내역 >\n";

        for(int i=curIdx;i<orders.size();i++)
        {
            ret += String.format("주문번호: %d - ", orders.get(i).getOrderNo()) + orders.get(orders.get(i).getOrderNo()-1).menus();
        }

        return ret;

    }
    // your code here

}