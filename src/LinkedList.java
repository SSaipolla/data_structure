import java.util.Scanner;

public class LinkedList{
    Node head;

    public void append(int data){
        if (head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void delete(int data){
        if (head == null) return;
        if (head.data == data){
            head = head.next;
        }

        Node current = head;
        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public void insert(int data){
        Scanner scn = new Scanner(System.in);
        int requestData = scn.nextInt();

        if(head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null){
            if (current.next.data == requestData){
                Node insert = new Node(data);
                current.next = insert;
                insert.next = current.next.next;
                return;
            }

            current = current.next;

        }
    }


}


