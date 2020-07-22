package com.github.junlong;

/**
 * Created with IntelliJ IDEA.
 * User: longjun
 * Date: 13-6-23
 * Time: 上午1:42
 * To change this template use File | Settings | File Templates.
 */
public class Helloworld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}
