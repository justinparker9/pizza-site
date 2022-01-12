package com.techelevator.dao;

import com.techelevator.model.CustomPizza;
import com.techelevator.model.MenuItem;
import com.techelevator.model.Order;

import java.awt.*;
import java.util.List;


public interface OrderDao {

        List<Order> getAllPendingOrders();

        List<Order> getAllHistoricalOrders();

        List<Order> getIncompleteOrdersByOrderId();

        List<MenuItem> getMenuItemsByOrderId(int orderId);

        List<CustomPizza> getCustomPizzasByOrderId(int orderId);

        void setOrderToComplete(int orderId);

        void setOrderToNotComplete(int orderId);

        int createOrder(Order order);

}
