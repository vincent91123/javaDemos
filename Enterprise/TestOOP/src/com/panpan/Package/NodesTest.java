package com.panpan.Package;


/**
 * @author panpan
 * @create 2024-08-30-上午 11:23
 */
public class NodesTest {

    Node first;
    Node last;
    int count=0;

    public void NodesTest(){

    }

    public void add(Object o){
        if (first==null) {
            Node  n = new Node();
            n.setPrefix(null);
            n.setValue(o);
            n.setNext(null);
            first=n;
            last=n;

        }else {
            Node  n = new Node();
            n.setPrefix(last);
            n.setValue(n);
            n.setNext(null);
            last.setNext(n);
            last=n;
        }
        count++;
    }

    public int getSize(){
        return count;
    }

    public Object get(int index){
        Node n = first;
        for (int i = 0; i < index; i++) {
            n=n.getNext();
        }
        return n.getValue();
    }


}


class Testss{
    public static void main(String[] args) {
        NodesTest nt = new NodesTest();
        nt.add("aa");
        nt.add("bb");
        nt.add("cc");
        System.out.println(nt.getSize());
        System.out.println(nt.toString());

        System.out.println(nt.get(1));
    }
}
