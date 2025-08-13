package chap13.ex1308;

import java.util.ArrayList;

public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(list.size() - 1);
    }

    public Object pop() {
        Object o = list.get(list.size() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n").append("___").append("\n");
        }
        return sb.toString();
    }

    @Override
    public MyStack clone() {
        MyStack newStack = new MyStack();
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            newStack.push(o);
        }
        return newStack;
    }
}
