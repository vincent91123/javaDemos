package com.panpan.Package;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author panpan
 * @create 2024-08-30-上午 10:20
 */
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("panpan1");
        list.add("panpan2");
        list.add("panpan3");
        list.add("panpan4");
        list.add("panpan5");
        System.out.println(list);
        list.add("123");
        list.add(50.154);
        list.addFirst("hello");
        list.addLast("baiabi");
        list.offer("offer");
        list.offerFirst("offerFirst");
        list.offerLast("offerLast");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list.pop());
        System.out.println(list.remove());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.removeFirstOccurrence("panpan1"));
        System.out.println(list.removeLastOccurrence("panpan1"));
        System.out.println();

        System.out.print("forI的打印流程：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }

        System.out.println("------------------");
        System.out.print("forEach的打印流程：");
        for (Object o:list){
            System.out.print(o+"\t");
        }
        System.out.println("------------------");
        System.out.print("iterator的打印流程：");
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println("------------------");
        System.out.print("iterator的打印流程22：");
        for (Iterator it2=list.iterator(); it2.hasNext();) { //这种方式好，节约内存
            System.out.println(it2.next()+"\t");
        }
        System.out.println("------------------");



    }
}
