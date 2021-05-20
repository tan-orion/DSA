package list;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private  static final  int DEFAULT_CAPACITY=10;
    private Object element[];


    public MyList() {
        this.element = new Object[DEFAULT_CAPACITY];

    }
    public void ensureCape(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    //
    public void add (E e ){
        if(size== element.length){
            ensureCape();
        }
        element[size++]=e;
    }
    // method get() return element  that is at position(i) in the list
    public E get(int i){
if(i >=size || i <0){
    throw  new IndexOutOfBoundsException("Index: " + i + ", Size " + i );

}
return (E) element[i];
    }
}
