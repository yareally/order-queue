package com.cc;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class KitchenTest
{
    private Kitchen kitchen;

    @BeforeEach
    void setUp()
    {
        kitchen = new Kitchen();
    }

    @Test
    void addOrder()
    {
        // TODO: add an order, then check to see if the order is in the queue
        // also check to see if the values are what they should be for the order (entree, side, notes)
    }

    @Test
    void removeOrder()
    {
        // TODO: remove an order, then check to see if the order is no longer in the queue
    }

    @Test
    void ordersRemaining()
    {
        // TODO: add a few orders, then remove an order, then check to see if the orders remaining are what you think they should be
    }

    @Test
    void calculatePrepTime()
    {
        // add several orders, then check to see if the preparation time is what it should be

    }
}