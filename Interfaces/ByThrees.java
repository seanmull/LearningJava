package Interfaces;

public class ByThrees implements Series {
    
    int num;

    ByThrees(){
        num = 0;
    }

    public int getNext(){

        num += 3;
        
        return num;
    }
}
