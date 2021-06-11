
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
        // If the list is empty just return null
        // since there is nothing to remove
        if (this.head == null) {
            return null;
        }
        // Save the value of the node you
        // are about to remove, so you can
        // return use it in the global scope 
        // if you need to
        let removed = this.head.value;

        // Re-assign the head to the next node in the list.
        this.head = this.head.next;

        // Return the removed value.
        return removed;
    }

    // Using a ternary statement (you will see this syntax in the industry)
    // helps to make code shorter, but is less readable
    removeAtFrontShortVersion() {
        let removed = this.head;
        this.head = this.head ? this.head.next : this.head;
        return removed ? removed.value : null;
    }

    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    printValues() {
        // Just a different way to write it..
        //   start            keep going current node not null       increment runner
        for (let runner = this.head; runner != null; runner = runner.next) {
            console.log(runner.value);
        }
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
        // your code here
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


    /* ******* EXTRAS ******* */

    /**
     * Adds each item of the given array to the back of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    seedFromArr(vals) {
        // your code here
    }

    // EXTRA
    /**
     * Calculates the average of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {number|NaN} The average of the node's data.
     */
    // average() {
    // }


    /**
     * Retrieves the data of the second to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the second to last node or null if there is no
     *    second to last node.
     */
    secondToLast() {
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

    //  EXTRA -- Move to week 4?
    /**
     * Retrieves the data of the kth to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the kth to last node or null if there is no
     *    kth to last node.
     */
    kthToLast(k) {
    }

    /*********** BONUS ************* */
    /* Solve kthToLast in one pass (instead of going through the list 2 times)

    // ====================================================

    /**
     * Inserts a new node before a node that has the given value as its data.
     * - Time: (?).
     * - Space: (?).
     * @param {any} newVal The value to use for the new node that is being added.
     * @param {any} targetVal The value to use to find the node that the newVal
     *    should be inserted in front of.
     */
    prepend(newVal, targetVal) { }


    /**
     * Concatenates the nodes of a given list onto the back of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {SinglyLinkedList} addList An instance of a different list whose
     *    whose nodes will be added to the back of this list.
     * @returns {SinglyLinkedList} This list with the added nodes.
     */
    concat(addList) { }

    /**
     * Finds the node with the smallest number as data and moves it to the front
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    moveMinToFront() { }

    // EXTRA
    /**
     * Splits this list into two lists where the 2nd list starts with the node
     * that has the given value.
     * splitOnVal(5) for the list (1=>3=>5=>2=>4) will change list to (1=>3)
     * and the return value will be a new list containing (5=>2=>4)
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The value in the node that the list should be split on.
     * @returns {SinglyLinkedList} The split list containing the nodes that are
     *    no longer in this list.
     */
    splitOnVal(val) { }
    //  }
}

//==========================//
//         TESTING          //
//==========================//

/* insertAtBack & seedFromArray Test */
let my_list = new SLL();
my_list.insertAtFront(8);
my_list.insertAtFront(9);
my_list.insertAtFront(10);
my_list.insertAtFront(11);
my_list.insertAtFront(12);
my_list.insertAtFront(13);
my_list.printValues();

// let new_list = new SLL();
// new_list.seedFromArr([3, 4, 5, 6, 7, 8, 9]);

// for (let node = new_list.head; node !=null; node=node.next) {
//     console.log(node.value);
// }

// console.log(my_list.removeBack()); // 10
// console.log(my_list.removeBack()); // 9
// console.log(my_list.removeBack()); // 8
// console.log(my_list.removeBack()); // List empty
// console.log(my_list.removeVal(10))
// my_list.printPretty();
// console.log("Second from last: ", my_list.secondToLast());


// console.log("\n4 removed? ", my_list.removeVal(4));
// my_list.printPretty();
// console.log("\n8 removed? ", my_list.removeVal(8));
// my_list.printPretty();
// console.log("\n11 removed? ", my_list.removeVal(11));
// my_list.printPretty();
// console.log("\n13 removed? ", my_list.removeVal(13));
// my_list.printPretty();

// for (var k = -1; k < 7; k++) {
//     console.log(`${k} from last: ${my_list.kthToLast(k)}`);
// }



