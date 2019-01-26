package HW.MyCollections;

public class MyList_null {


    public void prArray() {

        prArray(null);

    }


    public void prArray(String comment) {


       /* try {
            sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        System.out.println("\n --\\\\\\-- \n");


        System.out.println(this.getClass().getName() + " : \n" + ((comment == null) ? "" : "//" + comment) + "\n"
                + "Size (" + size() + ")");


    }

    //-------------------------------------------------------------------------------------------------------------
    private int size;

    protected boolean size_add(int i) {
        return setSize(size + i);
    }

    protected boolean size_plusOne() {
        return setSize(size + 1);
    }

    protected boolean size_minusOne() {
        return setSize(size - 1);
    }

    public int size() {
        return size;
    }

    protected boolean setSize(int size) {

        if (size < 0 || size > Integer.MAX_VALUE) {
            return false;
        }

        this.size = size;
        return true;
    }

}
