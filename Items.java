/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacheTech.products;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author murerc
 */



@SessionScoped
@ManagedBean(name="item")
public class Items 
{
    private String name;
    private String itemtype;
    private int price;

    public Items() {
    }

    public Items(String name, String itemtype, int price) {
        this.name = name;
        this.itemtype = itemtype;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String add()
    {
        return "Sucess";
    }
}
