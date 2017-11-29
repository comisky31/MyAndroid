package com.example.timwu.practice;

import java.io.Serializable;

/**
 * Created by TimWu on 2017/8/31.
 */

public class ObjectForIntent implements Serializable
{
    private int age = 77;
    private String name = "AH MA";

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
