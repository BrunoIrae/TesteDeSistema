package systemTest;

public class Node {
    private Pessoa pessoa;
    private Node next;

    public Node(Pessoa pessoa, Node next) {
        this.pessoa = pessoa;
        this.next = next;
    }

    public Pessoa getPerson() {
        return pessoa;
    }

    public void setPerson(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Node){
            Node other = (Node) obj;
            return this.pessoa.getCpf().equals(other.pessoa.getCpf());
        }
        return false;
    }
}
