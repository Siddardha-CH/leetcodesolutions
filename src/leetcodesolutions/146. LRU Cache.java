Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.





        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-09-02                                             #
        #                                                                       #
        #########################################################################
        */
public class Node {
    int val;
    int key;
    Node prev;
    Node next;
    Node(int key, int val) {
        this.val = val;
        this.key = key;
        this.prev = null;
        this.next = null;

    }

}
class LRUCache {
    int size;
    Map<Integer, Node> map;
    Node left;
    Node right;
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.size = capacity;
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            remove(node);
            insert(node);
        }
        else {
            if (map.size() == size) {
                Node last = right.prev;
                remove(last);
                map.remove(last.key);
            }
            Node nn = new Node(key, value);
            map.put(key, nn);
            insert(nn);
        }
    }

    public void remove (Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert (Node node) {
        node.next = left.next;
        node.prev = left;
        left.next.prev = node;
        left.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
