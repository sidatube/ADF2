package Demo.s2;

public class Generic<K,V> {
    K key;
    V value;
    public <E> void demoGeneric(E ex){
        System.out.println(ex);
    }
    public <E,X,Z> void cc(E ex,X x,Z z){

    }
}
