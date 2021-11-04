package Interfaces;

public interface Series {

    int MAX = 10;
    String ERRORMSG = "This is an error";

    int getNext();

    static void printStuff(){
        System.out.println("Blah blah");
        printMoreStuff();
    }

    private static void printMoreStuff(){
        System.out.println("Blah blah2");
    }
    
}
