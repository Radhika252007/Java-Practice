package com.radhika.Lecture24;

public class SingleLinkedList {
    private int size=0;
    private Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    int insertNodeLast(int val){
        if(head==null){
            Node node = new Node(val);
            head = node;
            size++;
            return val;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            Node node = new Node(val);
            curr.next = node;
            size++;
        }
        return val;
    }
    int insertNodeFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
        return val;
    }
    int insertAtIndex(int val,int index){
        if(index==0){
            insertNodeFirst(val);
            return val;
        }
        else if(index>size){
            System.out.println("Invalid Index");
            return 0;
        }
        else if(index==size){
            insertNodeLast(val);
            return val;
        }
        Node node = new Node(val);
        int i=0;
        Node curr = head;
        Node prev = null;
        while(i<index){
            prev = curr;
            curr = curr.next;
            i++;
        }
        if(prev!=null) {
            prev.next = node;
            node.next = curr;
            size++;
        }
        return val;

    }
    void deleteFirst() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    void deleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
        } else {
            Node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
        size--;
    }
    void deleteAtIndex(int index) {
        if (index < 0 || index >= size || head == null) return;

        if (index == 0) {
            deleteFirst();
            return;
        } else if (index == size - 1) {
            deleteLast();
            return;
        }

        Node curr = head;
        Node prev = null;
        int i = 0;

        while (i < index) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        if (prev != null) {
            prev.next = curr.next;
            size--;
        }
    }

    void displayList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    void emptyList(){
        head = null;
        size=0;
    }
    int size(){
        return size;
    }

    public static void main(String[] args) {
        // Question 1
        SingleLinkedList l1 = new SingleLinkedList();
        l1.insertNodeLast(1);
        l1.insertNodeLast(2);
        l1.insertNodeLast(3);
        l1.displayList();

        // Question 2
        l1.emptyList();
        l1.insertNodeLast(3);
        l1.insertNodeLast(5);
        l1.insertNodeLast(7);
        l1.displayList();
        l1.insertNodeFirst(10);
        l1.displayList();

        //Question 3
        System.out.println(l1.size());

//        l1.insertNodeLast(25);
//        l1.insertNodeLast(32);
//        l1.displayList();
//        l1.deleteNode(4);
//        l1.displayList();
//        l1.insertAtIndex(3,2);
//        l1.displayList();
//        l1.insertNodeFirst(29);
//        l1.displayList();
//        System.out.println(l1.size());
    }

}
