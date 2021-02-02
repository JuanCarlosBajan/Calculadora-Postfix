import java.util.Vector;

public class StackVector<E> implements Stack<E>{

    Vector<E> vec;

    public  StackVector(){
        vec = new Vector<E>();
    }

    public void push(E item){
        vec.add(item);
    }
    public E pop(){
        return vec.remove(size()-1);
    }
    public boolean empty(){
        return size() == 0;
    }
    public E peek(){
        return vec.get(size() - 1);
    }
    public int size(){
        return vec.size();
    }

}
