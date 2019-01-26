package HW.MyCollections;


public class MyHashMap<K, V> extends MyList_null {


    @Override
    public void prArray(String comment) {
        super.prArray(comment);

        if (getTable() == null) {
            System.out.println("MyHashMap is empty...");
        } else {


            Nod<K, V> nod = getTable();
            while (nod != null) {


                System.out.println(

                        "[key : " + nod.getKey() + " :: "
                                + "value : " + nod.getObject() + "]"


                );
                nod = nod.getNext();

            }


        }


    }

    //----------------------------
    public V get(K key) {

        Nod<K, V> n;
        return ((n = getNode(key)) == null) ? null : n.getObject();

    }

    //-----------------------------------------
    public void clear() {

        setTable(null);
        setSize(0);

    }

//---------------------------------

    public V remove(K key) {


        if (getTable() == null) {
            return null;
        }

        Nod<K, V>
                tek = getTable(),
                last = null;


        do {


            if ((tek.getKey() == null && key == null) || tek.getKey().equals(key)) {

                V val = tek.getObject();

                if (last == null) {
                    setTable(tek.getNext());

                } else {

                    last.setNext(tek.getNext());

                }


                size_minusOne();
                return val;

            }

            last = tek;
            tek = tek.getNext();


        } while (tek != null);

        return null;


    }

    //--------------------------------
    public V put(K key, V value) {

        Nod<K, V> n = getNode(key);
        V v = null;

        if (n == null) {

            addNode(key, value);
            size_plusOne();


        } else {


            v = n.getObject();
            n.setObject(value);


        }

        return v;
    }

    //---------------------------------------------------


    protected boolean addNode(K key, V value) {


        setTable(new Nod<K, V>(key, value, getTable()));


        return true;
    }

    //----------------------------------------------
    protected Nod<K, V> getNode(K key) {

        if (table == null) {
            return null;
        }

        Nod<K, V> tek = getTable();
        do {

            if ((tek.getKey() == null && key == null) || (tek.getKey() != null && tek.getKey().equals(key))) {
                return tek;
            }

            tek = tek.getNext();

        } while (tek != null);

        return tek;

    }


    //-----------------------------------------------------

    private Nod<K, V> table;

    protected Nod<K, V> getTable() {
        return table;
    }

    protected void setTable(Nod<K, V> table) {
        this.table = table;
    }

    //--------------------------------
    private static class Nod<K, V> {

        Nod(K key, V value, Nod<K, V> next) {

            this.Key = key;
            this.Object = value;
            this.next = next;

        }


        //--------------------------
        private Nod<K, V> next;

        public Nod<K, V> getNext() {
            return next;
        }

        public void setNext(Nod<K, V> next) {
            this.next = next;
        }

        //--------------------------------------
        private K Key;

        public K getKey() {
            return Key;
        }

        public void setKey(K key) {
            Key = key;
        }

        //------------------------------------
        private V Object;

        public V getObject() {
            return Object;
        }

        public void setObject(V object) {
            Object = object;
        }
    }


}
