package HW.MyCollections;

public class MyQueueList<T> extends My_Linket<T> {


    public T peek() {


        return (getFirst() == null) ? null : getFINode().getObj();

    }

    //------------------------------------------------------------------------------------------------------------------
    protected MyNode getFINode() {


        MyNode myNode = getFirst();
        while (myNode != null) {

            if (myNode.getLast() == null) {
                return myNode;
            } else {


                myNode = myNode.getLast();
            }


        }

        return myNode;
    }
    //------------------------------------------------------------------------------------------------------------------

    public T pool() {


        if (getFirst() == null) {
            return null;
        }

        return remove(0);


    }


}
