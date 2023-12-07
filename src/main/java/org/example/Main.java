package org.example;

public class Main {
    public static void main(String[] args) {

       LinkedListDemo listDemo = new LinkedListDemo();

       listDemo.addFirst(10);
       listDemo.addFirst(234);
       listDemo.addFirst(232);
       listDemo.addFirst(23);
       listDemo.addFirst(434);
       listDemo.addFirst(75);
       listDemo.addFirst(55);

       listDemo.display();
    }
}