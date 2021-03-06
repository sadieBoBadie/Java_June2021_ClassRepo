//                            _             
//                           | |            
//  _ __ ___   ___  _ __   __| | __ _ _   _ 
// | '_ ` _ \ / _ \| '_ \ / _` |/ _` | | | |
// | | | | | | (_) | | | | (_| | (_| | |_| |
// |_| |_| |_|\___/|_| |_|\__,_|\__,_|\__, |
//                                     __/ |
//                                    |___/ 

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
        let newNode = new SLNode(data);
        newNode.next = this.head;
        this.head = newNode;
        return this;
    }

    /**
     * Removes the node that has the matching given val as it's data.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The value to compare to the node's data to find the
     *    node to be removed.
     * @returns {boolean} Indicates if a node was removed or not.
     */
    removeVal(val) {

    }

    /**
     * Reverses this list in-place without using any extra lists.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    reverse() {

    }

    printPretty() {
        let printString = ""
        let runner = this.head;
        while (runner != null) {
            printString += runner.value + "->";
            runner = runner.next;
        }
        printString += "null";
        console.log(printString);
    }

}

let myList = new SLL();
myList.insertAtFront(5)
.insertAtFront(4)
.insertAtFront(3)
.insertAtFront(2)
.insertAtFront(1);

myList.printPretty(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

myList.removeVal(2);

myList.printPretty(); // 1 -> 3 -> 4 -> 5 -> null

myList.removeVal(1); // 3 -> 4 -> 5 -> null

myList.reverse();

myList.printPretty(); // 5 -> 4 -> 3 -> null