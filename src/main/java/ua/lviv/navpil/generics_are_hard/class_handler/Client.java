package ua.lviv.navpil.generics_are_hard.class_handler;

public class Client {
    public void doSomething(Class<? extends Handler> handler) {
        System.out.println("I'm instantiating the class and calling methods of a " + handler);
    }
}