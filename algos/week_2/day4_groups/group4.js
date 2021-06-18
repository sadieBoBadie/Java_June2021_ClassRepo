// QUEUES AND STACKS
class SLNode {
    constructor(value) {
        this.value = value
        this.next = null
    }
}


// FIFO - QUEUES
class SLQueue {
    constructor() {
        this.head = null;
        this.tail = null;
    }

    enqueue(value) {
        let newNode = new SLNode(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        return this;
    }

    // THURS &/or WED EXTRA
    dequeue() {
        //edge case account for only one node
        let lastNode = new SLNode(value)
        if (this.tail == null) {
            this.head = lastNode; // both are null because this.next is pointing to null
            this.tail == lastNode;
        }
        else {
            
        }
    }

    printPretty() {
        let runner = this.head;
        let printString = "~ SLQueue ~ HEAD--(";
        while (runner && runner.next) {
            printString += runner === this.tail ? "TAIL " : "";
            printString += `${runner.value})->(`;
            runner = runner.next;
        }
        printString += runner === this.tail ? "TAIL " : "";
        printString += `${runner.value})->null\n`;
        console.log(printString);
    }

}

let q = new SLQueue();
q.enqueue(1).enqueue(2).enqueue(3).enqueue(4);
q.printPretty();

let poppedVal = q.dequeue(); // 1
console.log(poppedVal); // 1
q.printPretty(); // 2 - 3 - 4 - null

q.dequeue(); // 3 - 4 - null
q.dequeue(); // 4 - null
q.dequeue(); // head null
q.dequeue(); // Warning: dequeue failed. Queue is empty.