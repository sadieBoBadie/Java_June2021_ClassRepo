// QUEUES AND STACKS
class SLNode {
  constructor(value) {
    this.value = value
    this.next = null
  }
}
           
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
  }
  push(value) {
  }
  pop() {
  }
  size() {
  }
  peek() {
    // return top item without removing
  }

}

class SLStack {
  constructor() {
    this.head = null;
    this.length = 0;
  }

  isEmpty() {
  }

  // Adds a new node with the given value in front of the head node.
  push(value) {
  }

  // Removes the head node
  // return the popped value -- important!
  pop() {
  }

  size() {
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

  // Week 2 Friday 
// ____ ____ _ ___  ____ _   _                    
// |___ |__/ | |  \ |__|  \_/                     
// |    |  \ | |__/ |  |   | 
//
  // (note these days are listed out of order to keep the class code together)
  // Stacks/Queues Continued

  /** Methods will be in the STACK class
   * Returns a new stack that is copy of the original stack.
   * Retain the original order. You may create extra temp 
   * SLStacks and/or SLQueues 
   * as storage.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {SLStack} Copy of the original stack
   */
  copy() {
  }

  /**
   * Rearranges the stack so that numbers > 0 are 
   * on the top and any negatives are on the bottom
   * Retain the order of the positives and negatives
   * Use extra stacks and/or queues as storage.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {any} The removed item.
   */
  partitionPositives() {
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
new_stack.copy();
new_stack.printPretty();
new_stack.partitionPositives();
new_stack.printPretty();
// head (8)->(2)->(1)->(-10)->(-7)->(-5)->(-3)->null



// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// _ _ _ ____ ___  _  _ ____ ____ ___  ____ _   _ 
// | | | |___ |  \ |\ | |___ [__  |  \ |__|  \_/  
// |_|_| |___ |__/ | \| |___ ___] |__/ |  |   |   

// FIFO - QUEUES
class SLQueue {
  constructor() {
    this.head = null;
    this.tail = null;
  }

  enqueue(value) {

  }

  // WED &/or TUES EXTRA
    dequeue() {

    }
  /////////

  // MON Continued
  isEmpty() {
    return !this.head;
  }
  // Note:
  // Attributes and methods should have different names.
  getSize() {
    // YOUR CODE HERE
  }
  // Ternary statement!
  front() {
    return this.head ? this.head.value : null;
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

  ///// TUES EXTRA /////
  
  // equals
  // Write a method on the Queue class that, given another queue, 
  // will return whether they are equal (same items in same order).
  // Do not use any extra array or objects as storage.
  // Do not alter (pop from or push into) either queue.
  equals(secondQ) {

  }

// ___ _  _ _  _ ____ ____ ___  ____ _   _        
//  |  |__| |  | |__/ [__  |  \ |__|  \_/         
//  |  |  | |__| |  \ ___] |__/ |  |   |  
  ////   WED  * Do dequeue first * ////

  // findMid
  /*
   Find and return the middle node. If is an even number of nodes
   return the node just before the mid point. 
   For example, if there are 5 nodes, return the 3rd node
   if there are 8 nodes return the 4th node. 
   You do not need extra storage apart from pointers

   * - Time: O(?).
   * - Space: O(?).
   * @returns {SLNode} The removed item.
   */

  findMid() {
    
  }
  // NINJA BONUS (after solving) -- can you do it in one pass? 

  // isPalindrome
  // Write a method on the Queue class that returns whether or not the queue is a palindrome
  // Use only 1 stack as additional storage (no additional arrays / objects).
  isPalindrome() {
  }
  //  NINJA BONUS (after solving) -- can you do it in one pass? 
  

}
let q = new SLQueue();
q.enqueue(1).enqueue(2).enqueue(3).enqueue(4);
q.printPretty();
// WEDNESDAY EXTRA
// Extra: MinStack
// Design a stack that supports push, pop, top, and min methods where the min method retrieves the minimum int in the stack
// Bonus: retrieve min element in constant time (no looping).


// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

