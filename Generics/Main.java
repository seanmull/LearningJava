package Generics;

public class Main {
    
    public static void main(String[] args) {
        MyClass<Integer, Double> obj = new MyClass<>(2, 4.0);


        //obj.showType();
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        


     
    }
}
