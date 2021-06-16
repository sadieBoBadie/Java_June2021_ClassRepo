// ___ _  _ ____ ____ ___  ____ _   _ 
//  |  |  | |___ [__  |  \ |__|  \_/  
//  |  |__| |___ ___] |__/ |  |   |     

// LAST IN FIRST OUT
// LIFO - STACKS
}
class ArrayStack {
    constructor(items = []) {
      this.items = items;

isEmpty() {
    if(this.items == []) {
        return true;
    }
}

push(value) {
    this.items.push(value);
}

pop() {
    return this.items.pop();
}

size() {
    return this.items.length();
}

peek() {
    let pointer = this.items.length() - 1;
    return items[pointer];
    // return top item without removing
}

}

  class SLStack {
    constructor() {
      this.head = null;
      this.length = 0;
    }
  
    isEmpty() {
        if(this.head = null){
            return true;
        }
    }
  
    // Adds a new node with the given value in front of the head node.
    push(value) {
        let pointer = null;
        newNode = SLNode(value);
        if (this.head == null) {
            this.head = newNode;
            this.length += 1;
            let pointer = this.head;
        }
        else {
            pointer.next = newNode;
        }
        
    }
  
    // Removes the head node
    // return the popped value -- important!
    pop() {

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
