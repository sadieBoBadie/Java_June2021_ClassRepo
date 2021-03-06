// SLL Advanced

class Node {
    constructor(val) {
        this.value = val;
        this.next = null;
    }
}


class SLL {
    constructor() {
        this.head = null;
    }

    // REVIEW ADD A NEW NODE TO THE FRONT OF THE LIST AT THE HEAD
    push(val) {
        // create a new node with a name
        let new_node = new Node(val);

        // connect the new node to the head node
        // re-assign new_node's next to the head
        new_node.next = this.head;

        //Re-assign head to new node
        this.head = new_node; 
        return this;
    }

    /**
     * Retrieves the data of the kth to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the kth to last node or null if there is no
     *    kth to last node.
     */
    kthToLast(k) {
        let counter = 0;
        let runner = this.head;
        let runner2 = this.head;
        while (this.next != null) {
            runner = runner.next;
            runner2 = runner.next.next; // need a way to write this without write .next.next.next
            counter ++;
        }
        //idea: to assign an index in the while loop but it does not account for a remove function
        // having two runners allows us to reference the runner behind one
        let newCounter = counter - k;
       
        for(let i =1; i = newCounter; i++){
            runner2 = runner2.next;
        }

        


        return runner2.value;
        

    }


    /**
     * Determines whether the list has a loop in it which would result in
     * infinitely traversing unless otherwise avoided. A loop is when a node's
     * next points to a node that is behind it.
     * - Time: (?).
     * - Space: (?).
     * @returns {boolean} Whether the list has a loop or not.
     */
    hasLoop() {

    }

    /**
     * Removes all the nodes that have a negative integer as their data.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list after the negatives are removed.
     */
    removeNegatives() {
        
    }
}

var myList = new SLL();
myList.push(5).push(4).push(3).push(2).push(1)
myList.kthToLast(2);
// .push("and one more for even number of nodes");

// // Uncomment to test when it does have a loop ////
// let runner = myList.head;
// while(runner.next) {
//     runner=runner.next;
// }
// runner.next = myList.head.next; //

// console.log(myList.hasLoop());