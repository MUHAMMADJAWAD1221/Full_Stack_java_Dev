package Collection;
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = next;
        }
    }
        class MylinkedList{
            node head ;
            node tail;
            public void add(int value){
                node newnode = new node(value);
                if (head==null){
                    head = newnode;
                    tail=newnode;
                }
                else {
                    tail.next=newnode;
                    tail = newnode;
                }
            }
        }
      public class LinkedListtest{
        static void main(String[] args) {
           MylinkedList list = new MylinkedList();
           list.add(5);
           Integer a = Integer.valueOf(8);
           list.add(a);
            System.out.println(list.head);
        }

    }



