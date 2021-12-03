package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE=10;
    private Object[] data;
    private int size=0;

    public GenericList()
    {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T t)
    {
        data[size] = t;
        size++;
    }

    public Object get(int i)
    {
        return data[i];
    }
    public void clear()
    {
        for(int i=0;i<size;i++)
            data[i] = null;
        size=0;
    }
    public int size()
    {
        return size;
    }



}
