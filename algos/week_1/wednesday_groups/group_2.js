//      _ _ _ ____ ___  _  _ ____ ____ ___  ____ _   _ 
//      | | | |___ |  \ |\ | |___ [__  |  \ |__|  \_/  
//      |_|_| |___ |__/ | \| |___ ___] |__/ |  |   |  

class SLNode {
    constructor(value) {
        this.value = value
        this.next = null
    }
}

class SLL {
    constructor() {
        this.head = null;
    } 

    /**
     * Creates a new node with the given data and inserts that node at the front
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data for the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtFront(data) {
        let newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        return this.head
    }


    /**
     * Removes the first node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the removed node.
     */
    removeAtFront() {
        
    }
}

let myList = new SLL();

let newNode = new SLNode(7);
myList.head = newNode;
let newNode2 = new SLNode(8);

myList.insertAtFront(9);

