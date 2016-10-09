package com.tim.pattern;

/**
 * Created by Tim on 16/10/9.
 */
public class Client {

    public static void test(){

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);
        invoker.action();

    }
}
