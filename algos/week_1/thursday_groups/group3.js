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
    }

    //    ___ _  _ _  _ ____ ____ ___  ____ _   _        
    //     |  |__| |  | |__/ [__  |  \ |__|  \_/         
    //     |  |  | |__| |  \ ___] |__/ |  |   | 

    // Remember to add methods INSIDE the SLL Class.
    /**
     * Removes the first node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the removed node.
     */
    removeAtFront() {
        this.head = this.next;
    }

    
    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    printValues() {
        // your code here
        for (let index = 0; index < namesList.length; index++) {
            console.log(namesList[index]);
            
        }
        for ( name in namesList) {
            console.log(name)
            }
        }
    }
    
    /** Stretch NINJA BONUS We'll do this one tomorrow as well 
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data to be added to the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBack(data) {
        // your code here
    }

}

let namesList = new SLL();
namesList.insertAtFront("Ciara");
namesList.insertAtFront("Istvan");
namesList.insertAtFront("Israel");
namesList.insertAtFront("Shota");
namesList.printValues();
namesList.removeAtFront();
namesList.removeAtFront();
namesList.removeAtFront();
namesList.removeAtFront();
namesList.removeAtFront();