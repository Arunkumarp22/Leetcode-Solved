class LFUCache {
    HashMap<Integer, Linkedlist> freqMap;
    HashMap<Integer, Node> nodeMap;
    int cap, freq, size;

    public LFUCache(int capacity) {
        //Initializing variables
        this.freqMap = new HashMap<>();
        this.nodeMap = new HashMap<>();
        this.cap = capacity;
        this.size = 0;
        this.freq = 1;    
    }
    
    public int get(int key) {

        if(!nodeMap.containsKey(key)) {
            return -1;
        }
        
        Node node = nodeMap.get(key);

        Linkedlist ll = freqMap.get(node.freq);
        
        ll.remove(node, false);

        
        int newFreq = ++node.freq;

        if(ll.front == null && this.freq == node.freq - 1) {
            this.freq = newFreq;
        }
        
        if(freqMap.containsKey(newFreq)) {
            ll = freqMap.get(newFreq);
        } else {
            ll = new Linkedlist();
            freqMap.put(newFreq, ll);
        }
        ll.insert(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(this.cap == 0) {
            return;
        }

        if(nodeMap.containsKey(key)) {

            Node node = nodeMap.get(key);
            
            node.value = value;
            
            Linkedlist ll = freqMap.get(node.freq);
            ll.remove(node, false);

            int newFreq = ++node.freq;

            if(ll.front == null && this.freq == node.freq - 1) {
                this.freq = newFreq;
            }
            
            if(freqMap.containsKey(newFreq)) {
                ll = freqMap.get(newFreq);
            } else {
                ll = new Linkedlist();
                freqMap.put(newFreq, ll);
            }
            ll.insert(node);
            return;

        } else if(this.size == this.cap) {
          
            Linkedlist ll = freqMap.get(this.freq);

            Node removed = ll.remove(new Node(-1,-1,-1), true);
            nodeMap.remove(removed.key);

            this.size--;
        } 

        Node node = new Node(key, value, 1);
        nodeMap.put(key, node);
        Linkedlist ll;
        this.freq = 1;
        if(freqMap.containsKey(1)) {
            ll = freqMap.get(1);
        } else {
            ll = new Linkedlist();
            freqMap.put(1, ll);
        }
        ll.insert(node);
        this.size++;
    }
}

class Node {
    int key, value, freq;
    Node prev, next;
    Node(int _key, int _value, int _freq) {
        this.key = _key;
        this.value = _value;
        this.freq = _freq;
        this.next = null;
        this.prev = null;
    }
}
class Linkedlist {
    Node front, rear;

    public void insert(Node newNode) {
        if(front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    public Node remove(Node nodeToRemove, boolean fromLast) {
        if(fromLast || nodeToRemove == rear) {
            return removeFromRear();
        }
        if(nodeToRemove == front) {
            return removeFromFront();
        }
        return removeFromMiddle(nodeToRemove);
    }

    private Node removeFromFront() {
        Node toReturn = front;
        if(front == rear) {
            front = rear = null;
        } else {
            Node nextFront = front.next;
            nextFront.prev = null;
            front.next = null;
            front = nextFront;
        }
        return toReturn;
    }

    private Node removeFromRear() {
        Node toReturn = rear;
        if(front == rear) {
            front = rear = null;
        } else {
            Node nextRear = rear.prev;
            nextRear.next = null;
            rear.prev = null;
            rear = nextRear;
        }
        return toReturn;
    }

    private Node removeFromMiddle(Node nodeToRemove) {

        Node prev = nodeToRemove.prev;
        Node next = nodeToRemove.next;

        prev.next = next;
        next.prev = prev;

        nodeToRemove.next = nodeToRemove.prev = null;

        return nodeToRemove;
    }
}
/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */