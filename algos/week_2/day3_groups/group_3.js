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
        let newNode = new SLQueue;
        if(head == null){
            this.head = value; 
            this.tail = value;
        }else{
            this.tail = value;
        }
    }

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