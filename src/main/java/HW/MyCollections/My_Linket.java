package HW.MyCollections;

public class My_Linket<T> extends MyList_null {


    @Override
    public void prArray(String comment) {
        super.prArray(comment);


        if (getFirst() == null) {
            System.out.println("Array is empty....");

        } else {

            MyNode myNode = getFirst();
            while (myNode != null) {

                System.out.println("[" + myNode.getObj() + "]");
                myNode = myNode.getLast();

            }


        }


    }

    //--------------------------
    protected class MyNode {


        public MyNode(T obj, MyNode myNode) {

            this.last = myNode;
            this.obj = obj;


        }

        private T obj;

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }

        //--------------
        private MyNode last;

        public MyNode getLast() {
            return last;
        }

        public void setLast(MyNode last) {
            this.last = last;
        }


    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //Function


    //----------------------------------------------------------------
    public void clear() {

        setFirst(null);
        setSize(0);

    }

    //------------------------------------

    public T remove(int index) {

        if (index < 0 || index >= size() || size() == 0) {
            return null;
        }


        if (index == size() - 1) {

            size_minusOne();
            T obj = getFirst().getObj();
            setFirst(getFirst().getLast());
            return obj;

        } else {


            MyNode node = getNod(index + 1);

            T obj = node.getLast().getObj();

            node.setLast(node.getLast().getLast());

            size_minusOne();
            return obj;

        }


    }

//------------------------------------------------------------

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


    //-----------------------------------

    public boolean add(T value) {


        if (size_plusOne()) {


            setFirst(new MyNode(value, getFirst()));
            return true;

        }
        return false;
    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //Value


    //------------------------------------------------------------------------------
    private MyNode first;

    protected MyNode getFirst() {
        return first;
    }

    protected void setFirst(MyNode first) {
        this.first = first;
    }
}




