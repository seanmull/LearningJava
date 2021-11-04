package Interfaces;

class Main{

    public static void main(String[] args) {
        
        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();
        
        /*for(int i = 0; i < 5; i++){

            byTwos.getNext(); System.out.println("ByTwos is : " + byTwos.num);
            byThrees.getNext();
            System.out.println("ByThrees is : " + byThrees.num);

        }*/
        
        Series ob;
        ob = byTwos;   
        System.out.println(ob.getNext());
 

        Series.printStuff();
    }

}