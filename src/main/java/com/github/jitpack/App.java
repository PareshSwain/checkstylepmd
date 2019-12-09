package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{

    public final int BAR = 42;
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
    

}
