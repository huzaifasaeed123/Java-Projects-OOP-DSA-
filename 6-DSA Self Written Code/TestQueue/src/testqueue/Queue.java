/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testqueue;

/**
 *
 * @author saeed
 */
public class Queue <T>
{
    public T[] arr;
    public int head;
    public int tail;

    public Queue(int size) {
        arr = (T[]) new Object[size];
        head = -1;
        tail = -1;
    }



    public boolean isFull() {
        return tail == arr.length - 1;
    }

    public boolean isEmpty() {
        return head == -1;
    }


    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return tail - head + 1;
    }



public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            head =tail= 0;
        }
        tail++;
        arr[tail] = item;
    }

    
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T item = arr[head];
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head++;
        }
        return item;
    }
    

}