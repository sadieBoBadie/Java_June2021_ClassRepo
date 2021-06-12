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
//      ____ ____ _ ___  ____ _   _                    
    //      |___ |__/ | |  \ |__|  \_/                     
    //      |    |  \ | |__/ |  |   | 

    // Remember to add methods INSIDE the SLL Class.
    /* 
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data to be added to the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBack(data) {
        let newNode = new SLNode(data);

        if (this.head == null) {
            this.head = newNode;
            return this.head;
        }

        let backOfList = this.head;
        while (backOfList.next !== null) {
            backOfList = backOfList.next;
        }
        backOfList.next = newNode;

        return this.head;
    }
    
    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The data to search for in the nodes of this list.
     * @returns {boolean}
     */
    contains(val) {
    }

    /**
     * Removes the last node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the node that was removed.
     */
    removeBack() {
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

let testList1 = SLL();

testList1.insertAtBack(6);
testList1.insertAtBack(7);
testList1.insertAtBack(8);

testList1.printPretty();