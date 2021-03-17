package Demo.s2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Generic g = new Generic();
        g.demoGeneric("Cuong-cung");
        Generic<String,Integer> g2 = new Generic<>();
        g2.key = "GG";
        g2.value= 19;
        Generic<Integer,Integer> g3 = new Generic<>();
        g3.key = 15;
        g3.value = 12;
        Actor<Integer>aVn = new Actor<>();
        Actor<String > ad = new Actor<>();
        ActorUS u = new ActorUS();
        u.id="ASC55";
        ArrayList<? super Number> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(1.5);
        numbers.add(1.6);

    }
}
