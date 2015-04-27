package cn.huangk.stuck;

public class StuckX  implements StuckInterface{
  private int MaxSize =10;
  private Object[] data;
  private int top =-1;
  
  public StuckX(){
      data = new Object[MaxSize];
  }
    @Override
    public Object pop() {
        // TODO Auto-generated method stub
        Object obj = data[top];
        top--;
        return obj;
    }

    @Override
    public void push(Object obj) throws OutOfSizeException {
        // TODO Auto-generated method stub
        ++top;
        if(isFull()){
            top = 9;
            throw new OutOfSizeException();     
        }
        data[top] = obj;
   
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        Object obj = data[top];
        return obj;
    }
    
    public boolean isEmpty(){
        return top==-1?true:false;
    }

    public boolean isFull(){
        return top>MaxSize-1?true:false;
    }
}
