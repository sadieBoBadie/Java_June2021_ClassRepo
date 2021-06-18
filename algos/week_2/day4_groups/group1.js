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
      if (this.head == null) {
        console.log("Warning: Dequeue failed. Queue is empty.")

      } else if(this.head == this.tail) {
        this.head = null;
        this.tail = null;
      } else {
        this.head = this.head.next;
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
        if (runner != null) {
          printString += `${runner.value})->null\n`;
        }
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
q.printPretty()
q.dequeue(); // 4 - null
q.dequeue(); // head null
q.dequeue(); // Warning: dequeue failed. Queue is empty.
q.printPretty();

class SLStack {
    constructor() {
      this.head = null;
      this.length = 0;
    }
    // Adds a new node with the given value in front of the head node.
    push(value){
      var new_node = new SLNode(value);
      new_node.next = this.head;
      this.head = new_node;
      this.length++;
    }
  
    // Removes the head node
    // return the popped value -- important!
    pop(){
      if (!this.head) {
        return null;
      }
      var removed = this.head.value;
      this.head = this.head.next;
      this.length--;
      return removed;
    }
  
    size(){
      return this.length;
    }
  
    peek(){
      // Note: If this looks weird, look up ternary statements.
      // They are another way to re-write a very simple 
      // if statement variable assignment.
      return this.head? this.head.value: null;
      // return top value without removing
    }
  
    printPretty() {
      let runner = this.head;
      let printString = "~ SLStack ~ HEAD--(";
      while (runner && runner.next) {
        printString += `${runner.value})->(`;
        runner = runner.next;
      }
      printString += `${runner.value})->null\n`;
      console.log(printString);
    }
    
     // Reverses stack with the order of the nodes reversed
     // For this exercise, do NOT try to re-point all the pointers
     // use an extra stack as storage and utilize the pop and push 
     // methods. Hint: you can re-point the head.
    reverse() {
      var reversedStack = new SLStack();

      while (this.head.next != null) {
        var newNode = this.head.pop();

        reversedStack.push(newNode);
        this.head = this.head.next;
      }
    }
    
    /** Returns a new stack that is copy of the original stack.
     * Retain the original order. You may create extra temp 
     * SLStacks and/or SLQueues 
     * as storage.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {SLStack} Copy of the original stack
     */
    copy() {
    }
  }
  
  var new_stack = new SLStack();
  new_stack.push(-3);
  new_stack.push(1);
  new_stack.push(2);
  new_stack.push(-5);
  new_stack.push(-7);
  new_stack.push(8);
  new_stack.push(-10);
  // head (-10)->(8)->(-7)->(-5)->(2)->(1)->(-3)->null
  console.log(new_stack.copy());
  new_stack.printPretty();
  new_stack.reverse();
  new_stack.printPretty();