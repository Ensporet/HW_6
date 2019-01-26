package HW.MyCollections;


public class MyArrayList<T> extends MyList_null {


    public MyArrayList() {


        array = new Object[0];
    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // Function

    @Override
    public void prArray(String comment) {

        super.prArray(comment);

        for (Object obj : getArray()) {

            System.out.println("[" + obj + "]");

        }


    }

    //-------------------------------------------------------------------------------------------------------------
    public T get(int index) {

        if (index < 0 || index >= size()) {
            return null;
        }

        return ((T) getArray()[index]);
    }

    //----------------------------------------------------------------------------------------------------------------
    public void clear() {

        setSize(0);
        setArray(new Object[0]);

    }

    //----------------------------------------------------------------------------------------------------------------
    public T remove(int index) {


        if (index >= size() || size_minusOne()) {


            Object[] obj = new Object[size()];

            int newInd = 0;
            for (int i = 0; i < getArray().length; i++) {

                if (i != index) {

                    obj[newInd] = getArray()[newInd];
                    newInd++;
                }

            }


            Object ret = getArray()[index];
            setArray(obj);
            return (T) ret;

        }
        return null;

    }
    //--------------------------------------------------------------------

    public boolean add(T t[]) {

        if (t == null) return false;


        if (size_add(t.length)) {

            Object obj[] = new Object[size()];

            int i = 0;
            while (i < getArray().length) {

                obj[i] = getArray()[i];
                i++;

            }

            int i0 = 0;
            while (i < size()) {

                obj[i] = t[i0];
                i++;
                i0++;

            }
            setArray(obj);
            return true;
        }
        return false;
    }

    //....................................................
    public boolean add(T t) {


        if (size_plusOne()) {

            Object obj[] = new Object[size()];
            for (int i = 0; i < size() - 1; i++) {

                obj[i] = getArray()[i];

            }

            obj[obj.length - 1] = t;
            setArray(obj);
            return true;
        }

        return false;
    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //Value


    //------------------------------------------------
    private Object[] array;

    protected Object[] getArray() {
        return array;
    }

    protected void setArray(Object[] array) {

        this.array = array;
    }
    //------------------------------------------------------
}