package com.chenhf.test.bean;

import java.io.Serializable;

/**
 * Created by chenhf on 2017/6/1.
 */
public class Account implements Serializable{
    private int id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
