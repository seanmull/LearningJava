package Interfaces;

public class ByTwos implements SeriesSub {
    
    int num;

    ByTwos(){
        num = 0;
    }

    public int getNext(){

        num += 2;
        
        return num;
    }

    public int getPrev(){

        num -= 2;
        
        return num;
    }

    
}
