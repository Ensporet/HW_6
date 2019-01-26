package HW.MyCollections;

public class MyLinkedList<T> extends My_Linket<T> {

    //----------------------------------------------------------------


    protected MyNode getNod(int index) {

        if (index < 0 || index >= size()) {
            return null;
        }


        int i = size() - 1;

        MyNode node = getFirst();
        while (i > index) {

            node = node.getLast();
            i--;
        }


        return node;
    }

    //-------------------------------------------------
    public T get(int index) {

        MyNode node = getNod(index);


        return (node == null) ? null : node.getObj();
    }


}
