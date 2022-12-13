package test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

    }

}

class DemoList {
    int data;
    DemoList prev;
    DemoList next;
}

class ListOperations {
    List<Integer> li = new ArrayList<>();
    static DemoList dList ;
    public static void addElement(DemoList dl) {
        if(dList == null) {
            dList = new DemoList();
            dList.prev = null;
            dList.next = null;
            dList.data = dl.data;
        } else {
            dList.prev = dList;
            dList.next = dl;
            dList = dList.next;
           // dList.data = dl.data;
           // 1-2-3    4
        }
        printList(dList);
        printList(dList);
    }
    public static void removeElement(int position) {

    }
    public static void printList(DemoList dl) {
        while(dl != null) {
            System.out.println(dl.data);
            dl = dl.prev;
        }
    }
}
