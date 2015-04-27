package cn.huangk.stuck;

public interface StuckInterface {

    public Object pop();
    public void push(Object obj)throws OutOfSizeException;
    public Object peek();
}
