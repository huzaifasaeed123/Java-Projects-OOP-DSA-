/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlinkedlist;

/**
 *
 * @author saeed
 */
public class LinkedList {

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;

            head = newNode;
            //Circular Single Link List
            //tail.next=head;
        }

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            //Alternate Way to add at last by moving from head to tail last nnode without using tail
            // But time complexity is O(n)
//            Node temp=head;
//            while(temp!=null)
//            {
//                temp=temp.next;
//            }
//            temp.next=newNode;
            //Circular Single Link List
            //tail.next=head;
        }

    }

    public void add(int index, int data) {
        if (index == 0) {
            this.addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Link List Is Empty");
            return 0;
        } else if (head.next==null) //size==1
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    public int removeLast() {
        if (head==null) //size==0
        {
            System.out.println("LInkList IS Empty");
            return 0;
        } else if (head.next==null)//size==1
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        } else {
            Node temp = head;
//            for (int i = 0; i < size - 2; i++) {
//                temp = temp.next;
//            }
//            int val = tail.data;// if dont want to use tail then use 2 variable as we use in 2nd way
//            tail = temp;
//            size--;
//            temp.next = null;
//            return val;
            // 2nd Way
            //Alternate Way to Access by While loop to access 2nd last Node
            //By Using 2 node
            Node prev=null;
            while(temp.next!=null)
            {
                prev=temp;// 3rd Way ::Alternate Way is to use condition temp.next.next
                temp=temp.next;   
            }
            int val1 =temp.data;
            size--;
            tail=prev;
            prev.next=null;
            return val1;
            //end 2nd And 3rd Way
        }
    }

    public int Search(int key) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (key == temp.data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void ReverseLinkedList() {
        Node current = tail = head;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head = prev;
    }

    public void removeNthFromEnd(int n) {
        Node prev = head;
        int i = 1;

        if (n == size) {
            head = head.next;
            return;
        }
        while (i < size - n) {
            prev = prev.next;
            i++;
        }
        if (n <= size) {
            prev.next = prev.next.next;
        }
    }

    public Node findmid() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return false;
        }
        //find mid
        Node mid = findmid();
        Node current = mid;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    public void zigzagLinkList() {
        if (head == null || head.next == null) {
            return;
        }
        //find mid
        Node mid = findmid();
        Node current = mid;
        Node prev = null;
        Node next;
        //ya code left/1st half ko last index ko null pr khatm krna ka liya ha
        // mtlb ka mid ko 1st half ka andr consider kiya ha or 2nd half mid ka bad consider kar liya
//        current=mid.next;
//        mid.next=null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node right = prev;
        Node left = head;
        // ya code left/1st half ko last index ko null pr khatm krna ka liya ha
//        Node temp=left;
//        while(temp.next!=mid)
//        {
//            temp=temp.next;
//        }
//        temp.next=null;
//      2nd Approach l1st half ka last index ko null krna ka liya
        // mid wali aboove mentioned;
        
        Node leftN, rightN;

        while (right.next != null && left != null) // sb sa easy approach ka condition right half ka last null kiii base pr stop hooo jyaaa
        {
            leftN = left.next;//store val left.next in new variable
            left.next = right;// link 1st element of 1st half to 1st element of 2nd half
            left = leftN;// update left
            rightN = right.next; //val store 
            right.next = leftN; //direct 1st element of 2nd half to 2nd element of 1st half
            right = rightN;//update val

        }

    }

    public static boolean detectCycle() {

        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head;
        Node slow = head; // or equal to head 
        Node fast = head; // or head
        System.out.println("Huzaifa");
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    public void removeCycle() {
        head = new Node(2);
        Node temp = new Node(7);
        head.next = temp;
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = temp;
        //this.printLinkList(); go to infinity because cycle is exist

        Node slow = head; // or equal to head 
        Node fast = head; // or head
        boolean cycle = false;
        System.out.println("Huzaifa");
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }

        }
        if (cycle == false) {
            return;
        }

        Node prev = null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
        //Now Cycle is Remove And Print Now
        this.printLinkList();

    }

    public void printLinkList() {
        if (head == null) {
            System.out.println("Lisnked List IS Empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {

                System.out.println(temp.data);
                temp = temp.next;
            }

        }

    }

}
