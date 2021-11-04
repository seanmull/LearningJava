package Generics;

public class NumericFns<T extends Number> {

    T num;

    NumericFns(T ob){
        this.num = ob;
    }

    /*double square(){
        return ob.intValue() * ob.intValue();
    }*/

    boolean absEqual(NumericFns<T> ob ){
        if(Math.abs(num.doubleValue()) == 
           Math.abs(ob.num.doubleValue())){
               
            return true;
        }
        return false;
    }

    
}
