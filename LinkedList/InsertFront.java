import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    Node head = null;

    void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteFront() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    void search(int key) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }

        System.out.println("Element not found");
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList list = new SingleLinkedList();

        while (true) {
            System.out.println("1.Insert Front");
            System.out.println("2.Insert End");
            System.out.println("3.Insert Position");
            System.out.println("4.Delete Front");
            System.out.println("5.Delete End");
            System.out.println("6.Search");
            System.out.println("7.Display");
            System.out.println("8.Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    list.insertFront(sc.nextInt());
                    break;

                case 2:
                    list.insertEnd(sc.nextInt());
                    break;

                case 3:
                    int data = sc.nextInt();
                    int pos = sc.nextInt();
                    list.insertPosition(data, pos);
                    break;

                case 4:
                    list.deleteFront();
                    break;

                case 5:
                    list.deleteEnd();
                    break;

                case 6:
                    list.search(sc.nextInt());
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}