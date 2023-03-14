// Classic Generic stack From STL;
// deletion O(1)
// Push amortized  O(1)
// pop O(1)

import java.util.Arrays;
public class Stack<T>{
    int logLen;
    private Object[] elems;

    public Stack(){
        elems = new Object[5];
        logLen = 0;
    }

    public void push(T elem){
        if (logLen == elems.length){
            elems = Arrays.copyOf(elems,2*logLen);
        }
        elems[logLen] = elem;
        logLen++;
    }
    public void pop(){
        if (logLen == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        logLen--;
    }
    public  T top(){
        if (logLen == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T)elems[logLen-1];
    }
    public int size(){
        return logLen;
    }

}