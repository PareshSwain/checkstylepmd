package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{
Integer number1 = new Integer(123);
Integer number2 = Integer.valueOf(123); 
System.out.println("number1 =  " + number1);
System.out.println("number2 =  " + number2);
    
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
    

}
