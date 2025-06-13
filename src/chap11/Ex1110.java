package chap11;

import java.util.ArrayList;

public class Ex1110 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("String");
        stack.push("Hello");
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        System.out.println();
        System.out.println(stack.toString());


        System.out.println("/////////");
        MyStack2 stack2 = new MyStack2();
        stack2.add("Hello");
        stack2.add("Hi");
        System.out.println(stack2.toString());
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.getSize());

    }
}

class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}

class MyStack2 extends ArrayList {
    public int getSize() {
        return this.size();
    }

    public Object peek() {
        return this.get(getSize() - 1);
    }

    public Object pop() {
        Object o = this.get(getSize() - 1);
        this.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        this.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}