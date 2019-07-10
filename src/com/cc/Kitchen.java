package com.cc;

import java.util.LinkedList;
import java.util.Queue;

public class Kitchen
{
    private Queue<Order> orders = new LinkedList<>();

    public Kitchen()
    {

    }

    /**
     * Adds an order to the queue.
     * @param order
     * @return the number of minutes required to prepare the order just added to the queue
     */
    public int addOrder(Order order)
    {
        // TODO: add the order to the queue
        // Then calculate the time it will take to prepare the order
        // Then return the time it will take at the end of this method
        return -1;
    }

    /**
     * Remove the next order from the queue
     * @return the order just removed from the queue
     */
    public Order removeOrder()
    {
        // TODO: remove the next order from the queue
        // Then return the number of orders left to cook
        // NOTE: If no orders left to cook, return an empty order (better than returning null)

        return new Order();
    }

    public int ordersRemaining()
    {
        // return the size of the queue (the number of orders left to prepare)
        return -1;
    }

    /**
     * Calculates the time it will take to prepare the order in the queue
     * @return the time it will take or zero if no orders left in the queue
     */
    public int calculatePrepTime()
    {
        // TODO: calculate the time it will take to prepare the order
        // formula is time = 7 + (size of queue * 3)
        // NOTE: if no orders left in the queue, then return 0
        return -1;
    }
}
