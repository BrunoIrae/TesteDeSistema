package systemTest;

public class Lista {
    private Node head;

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addList(Pessoa pessoa){
        Node newTail = new Node(pessoa, null);
        if(isEmpty()){
            this.head = newTail;
            return;
        }else{
            Node oldTail = this.head;
            while (oldTail.getNext() != null){
                oldTail = oldTail.getNext();
            }
            oldTail.setNext(newTail);
        }
    }

    public int size(){
        Node current = this.head;
        int size = 0;
        while(current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }
}
