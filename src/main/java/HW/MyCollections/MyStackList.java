package HW.MyCollections;

public class MyStackList<T> extends My_Linket<T> {


    public T peek() {


        return (getFirst() == null) ? null : getFirst().getObj();


    }

    public T pop() {


        return remove(size() - 1);


    }

}
