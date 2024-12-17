public class LinkedListLL {

    Node head;

    private int size;

    LinkedListLL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

        //Insert element in starting
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        //Insert element at last
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while(currNode.next != null)
               currNode = currNode.next;
            
            currNode.next = newNode;
        }

        public void printList(){
            if(head == null){
               System.out.println("List is empty");
               return;
            }

            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }

        public void deleteFirst() {
            if(head == null){
                System.out.println("List is empty");
            }

            size--;
            head = head.next;
        }

        public void deleteLast() {
            if(head == null){
                System.out.println("List is empty");
            }

            size--;
            if(head.next == null){
                head = head.next;
            }

            Node secondLastNode = head;
            Node lastNode = head.next;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondLastNode = secondLastNode.next;
            }

            secondLastNode.next = null;
        }

        public int getSize() {
            return size;            
        }

        public void reverseIterate(){
            if(head == null || head.next == null)
            return;
            Node prevNode = head;
            Node currNode = head.next;
            while(currNode != null){
                Node nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }

            head.next = null;
            head = prevNode;
        }

        public Node reverseRecursive(Node head){
            if(head.next == null || head == null)
              return head;

            Node newHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        }

        public void deleteNthNode(int n){
            if(head == null)
              return;
            Node dummyNode = head;
            int x = 1;
            while(dummyNode.next!= null){
                dummyNode = dummyNode.next;
                x++;
                System.out.println(dummyNode.data + " " + x);
            }
            Node prevNode = head;
            for(int i = 1; i <= x; i++){
                if(prevNode.next == null)
                    return;
                else if(prevNode.next.next == null){
                    prevNode.next = null;
                }
                else if(i == x-n+1){
                    prevNode.next = prevNode.next.next;
                    return;
                }
                else{
                    prevNode = prevNode.next;
                    prevNode.next = prevNode.next.next;
                }
            }
        }

        public void swapPairs(){

                Node temp = head;
                while(temp.next != null ){
                    String str = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = str;
                    if(temp.next.next == null)
                    return;
                    temp = temp.next.next;
                }
            }
               
        public static void main(String[] args) {
           LinkedListLL list = new LinkedListLL();
           list.addFirst("a");
           list.addFirst("is");
           list.addFirst("This");
           list.addLast("dick");
        //    list.printList();
        //    list.deleteFirst();
        //    list.printList();
        //    list.deleteLast();
           list.printList();
        //    System.out.println(list.getSize());
        //    list.head = list.reverseRecursive(list.head);
        //    list.swapPairs();
        //    list.printList(); 
           list.deleteNthNode(1);
           list.printList(); 
        }
}