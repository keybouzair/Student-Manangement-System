class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

class DoublyCircularLinkedList {
    Node head = null;

    // Insert at end
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = newNode.prev = newNode;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;
        head.prev = last.next = newNode;
    }

    // Forward display
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Backward display
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node last = head.prev;
        Node temp = last;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != last);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        System.out.print("Forward: ");
        list.displayForward();

        System.out.print("Backward: ");
        list.displayBackward();
    }
}
