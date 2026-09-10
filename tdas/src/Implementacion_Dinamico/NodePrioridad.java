package Implementacion_Dinamico;

public class NodePrioridad {

    private int data;
    private NodePrioridad next;
    private int priority;

    public NodePrioridad(int data,int priority, NodePrioridad next) {
        this.data = data;
        this.next = next;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodePrioridad getNext() {
        return next;
    }

    public void setNext(NodePrioridad next) {
        this.next = next;
    }
}
