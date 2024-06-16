
package testlinkedlist;

import java.util.ArrayList;

/**
 *
 * @author saeed
 */
public class TestLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//          LinkedList l1=new LinkedList();
//        l1.addFirst(1);
//        l1.addLast(2);
//        l1.addLast(3);
//        l1.addLast(4);
//        l1.addLast(5);
//        l1.addLast(6);
//        l1.addLast(7);
//        l1.printLinkList();
//        System.out.println("Size is::"+ l1.size);
////        System.out.println("KEY FOUND at ::"+ l1.Search(10));
//          System.out.println(l1.detectCycle());
//        //l1.printLinkList();

        // For LOOP/CYCLE
       // l1.printLinkList();
        //l1.removeCycle();
//        l1.zigzagLinkList();
//        System.out.println("After");
//        l1.printLinkList();
//         StackWithLinkedList arr=new StackWithLinkedList();
//         arr.push(5);
//         arr.push(6);
//         arr.push(7);
//         System.out.println("Size is::"+arr.size());
//         System.out.println(arr.pop());
//         System.out.println(arr.pop());
//         System.out.println("Peak Val"+arr.peak());
//         System.out.println(arr.pop());
//                  System.out.println("Size is::"+arr.size());
//
//         System.out.println(arr.pop());

         QueueWithLinkList obj=new QueueWithLinkList();
         obj.enqueue(1);
         obj.enqueue(2);
         obj.enqueue(3);
         System.out.println(obj.dequeue());
         System.out.println(obj.dequeue());
         System.out.println(obj.dequeue());
    }
    
}
