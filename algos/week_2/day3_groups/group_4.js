// QUEUES AND STACKS
class SLNode {
    constructor(value) {
        this.value = value
        this.next = null
    }
}


// FIFO - QUEUES
class SLQueue {
    constructor(value) {
        this.head = null;
        this.tail = null;
    }

    enqueue(value) {
        let newNode = new SLNode(value);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }

    }
}

newNode.enqueue(Steven);

    // THURS &/or WED EXTRA
    dequeue() {

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