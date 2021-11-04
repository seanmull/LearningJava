package Streams;

public class Employee {
    
    String name;
    int money;
    int number;

    Employee(int number, String name, int money){
        this.name = name;
        this.money = money;
        this.number = number;
    }

    public int getMoney(){
        return this.money;
    }

    public String getName(){
        return this.name;
    }
}
