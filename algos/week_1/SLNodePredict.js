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

// myList.head = newNode2;
// newNode.next = newNode2;

// myList.head.next = newNode2;

// myList.next = newNode2;

myList.insertAtFront(9);
//         _                  _ _   _                   
//        | |                (_) | | |                  
//    __ _| | __ _  ___  _ __ _| |_| |__  _ __ ___  ___ 
//   / _` | |/ _` |/ _ \| '__| | __| '_ \| '_ ` _ \/ __|
//  | (_| | | (_| | (_) | |  | | |_| | | | | | | | \__ \
//   \__,_|_|\__, |\___/|_|  |_|\__|_| |_|_| |_| |_|___/
//            __/ |                                     
//           |___/                                         
class SLNode{
    constructor(thing){
        this.value = thing
        this.next = null
    }
}

// Part I  - Intro to Singly Linked Lists Nodes

let a = new SLNode(7);
let b = new SLNode(3);
let c = new SLNode(1);
a.next = b;
b.next = c;

console.log('A:', a.val);
console.log('B:', b.val);
console.log('C:', c.val);
console.log(a.next.val);
console.log(a.next.next.val);
console.log(a.next.next.next.val);

// Part II 
// Note: Later the head variable shown here will be part of the SLL class

let head = new SLNode(1);
let runner_temp = head;
for (let i of [7,3,5,2]) {
    let new_node = new SLNode(i);

    runner_temp.next = new_node;
    runner_temp = new_node;
}

console.log(head.val);
console.log(head.next.val);
console.log(head.next.next.next.val);

