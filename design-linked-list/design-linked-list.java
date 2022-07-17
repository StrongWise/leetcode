class MyLinkedList {
    class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    private Node head;

    public MyLinkedList() {
        head = new Node(-1);
    }
    
    public int get(int index) {
        if(index < 0){
            return -1;
        }
        
        Node cur = head;
        int i=0;
        while(i < index && cur.next != null){
            cur = cur.next;
            i++;
        }
        if(cur.next == null){
            return -1;
        }
        return cur.next.val;
    }
    
    public void addAtHead(int val) {
        Node cur = new Node(val);
        
        cur.next = head.next;
        head.next = cur;
    }
    
    public void addAtTail(int val) {
        Node cur = new Node(val);
        Node find = head;
        
        while(find.next != null){
            find = find.next;
        }
        find.next = cur;
    }
    
    public void addAtIndex(int index, int val) {
        Node cur = new Node(val);
        Node find = head;
        
        int i=0;
        while(i < index && find.next != null){
            find = find.next;
            i++;
        }
        
        if(i != index){
            return;
        }
        cur.next = find.next;
        find.next = cur;
        
    }
    
    public void deleteAtIndex(int index) {
        Node find = head;
        int i=0;
        
        while(i < index && find.next != null) {
            find = find.next;
            i++;
        }
        
        if(find.next == null){
            return;
        }
        
        find.next = find.next.next;
    }
}