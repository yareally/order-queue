package com.cc;

public class Order
{
    private String entree = "";
    private String side = "";
    private String notes = "";

    public Order() {}

    public Order(String entree, String side, String notes)
    {
        this.entree = entree;
        this.side = side;
        this.notes = notes;
    }

    public Order(String entree, String side)
    {
        this.entree = entree;
        this.side = side;
    }

    public String getEntree()
    {
        return entree;
    }

    public String getSide()
    {
        return side;
    }

    public String getNotes()
    {
        return notes;
    }
}
