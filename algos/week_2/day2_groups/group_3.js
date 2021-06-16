// ___ _  _ ____ ____ ___  ____ _   _ 
//  |  |  | |___ [__  |  \ |__|  \_/  
//  |  |__| |___ ___] |__/ |  |   |     

// LAST IN FIRST OUT
// LIFO - STACKS
class ArrayStack {
    constructor(items = []) {
        this.items = items;
    }

    isEmpty() {
        if (this.items.length == 0) {
            return true;
        }
        return false;
    }
    push(value) {
        this.items.push(value);
    }
    pop() {
        return this.items.pop();
    }
    size() {
        return this.items.length;
    }
    peek() {
        return this.items[this.items.length - 1];
        // return top item without removing
    }

}

// QUEUES AND STACKS
class SLNode {
    constructor(value) {
      this.value = value
      this.next = null
    }
}

class SLStack {
    constructor() {
        this.head = null;
        this.length = 0;
    }

    isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // Adds a new node with the given value in front of the head node.
    push(value) {
        let newNode = new SLNode(value);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    // Removes the head node
    // return the popped value -- important!
    pop() {
        var temp = this.head.value;
        this.head = this.head.next;
        size--;
        return temp;
    }

    peek() {

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

    ////  EXTRA  /////
    // Reverses stack with the order of the nodes reversed
    // For this exercise, do NOT try to re-point all the pointers
    // use an extra stack as storage and utilize the pop and push 
    // methods. Hint: you can re-point the head.
    reverse() {
    }
