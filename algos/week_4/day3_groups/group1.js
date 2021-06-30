/** NEW CLASS!! MIN HEAP *****
 * 
 * Class to represent a MinHeap which is a Priority Queue optimized for fast
 * retrieval of the minimum value. It is implemented using an array but it is
 * best visualized as a tree structure where each 'node' has left and right
 * children except the 'node' may only have a left child.
 * - parent is located at:      Math.floor(index/2)
 * - left child is located at:  parentIdx * 2
 * - right child is located at: parentIdx * 2 + 1
 */
 class MinHeap {
    constructor() {
      /**
       * 0th index not used, so null is a placeholder. Not using 0th index makes
       * calculating the left and right children's index cleaner.
       * This also effectively makes our array start at index 1.
       */
      this.heap = [null];
    }
  
    /**
     * Retrieves the top (minimum number) in the heap without removing it.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {?number} Null if empty.
     */
    getMin() {
    }
  
    /**
     * Inserts a new number into the heap and maintains the heaps order.
     * 1. Push new num to back then.
     * 2. Iteratively swap the new num with it's parent while it is smaller than
     *    it's parent.
     * - Time: O(log n) logarithmic due to shiftUp / iterative swapping.
     * - Space: O(1) constant.
     * @param {number} num The num to add.
     */
    insert(num) {
        this.heap.push(num);
        
        // If heap was empty before
        if (this.heap.length <= 2) {
            return this;
        }

        let currentIdx = this.heap.length - 1;
        let parentIdx = Math.floor(currentIdx/2);

        // If the parent is greater than the current
        // swap
        // keep checking
        // otherwise, do nothing!

        while (this.heap[parentIdx] > num || parentIdx !=0) {
            
            // swap
            // var temp = this.heap[currentIndex];
            // this.heap[currentIndex] = this.heap[parentIdx];
            // this.heap[parentIdx] = temp;

            [this.heap[currentIdx], this.heap[parentIdx]] = [this.heap[parentIdx], this.heap[currentIdx]]

            currentIdx = parentIdx
            parentIdx = Math.floor(currentIdx/2)
        }

        return this;

    }

    //
    /**
     * Extracts the min num from the heap and then re-orders the heap to
     * maintain order so the next min is ready to be extracted.
     * 1. Save the first node to a temp var.
     * 2. Pop last node off and overwrite idx1 with it.
     * 3. Iteratively swap the old last node that is now at idx1 with it's
     *    smallest child IF the smallest child is smaller than it.
     * - Time: O(log n) logarithmic due to shiftDown.
     * - Space: O(1) constant.
     * @returns {?number} The min number or null if empty.
     */
    extract() {
        let firstNode = this.heap[1];
        let parentIdx = Math.floor(current/2);

        while(this.heap[parentIdx] > this.heap[firstNode]) {
          firstNode = parentIdx;
          parentIdx = 
        }
    }

    // [null, 1, 3, 4, 16, 5, 10, 8, 17, 22, 45, 9]
    //                  1
    //          3                4
    //      16       5        10    8
    //   17   22   45  9

    /** BONUS CHALLENGE **/

    /**
     * Given an unsorted array, returns a heap instance version of the array.
     * - Time: ?
     * - Space: ?
     * @returns {MinHeap} a heap with the same numbers as the array.
     */
    // static allows this method to be executed directly on the class itself 
    // rather than needing to be executed on an instance or going through the .prototype
    // converts an array into a new heap
    static heapify(vals) {
    }

}

/** BONUS CHALLENGE **/
// Time: O(n log n) linearithmic because .insert & .extract are O(log n) and both are being done n times
//     note: 2n*log(n) is considered n*log(n) time complexity as any coefficients and constants are disregarded.
function heapSort(nums) {

}

let testHeap = MinHeap.heapify([5, 3, 10, 17, 9, 4, 8, 16, 22, 45, 1]);

console.log(testHeap);

// [null, 1, 3, 4, 16, 5, 10, 8, 17, 22, 45, 9]
//                  1
//          3                4
//      16       5        10    8
//   17   22   45  9

console.log(testHeap.extract());
console.log(testHeap);
// [null, 3, 5, 4, 16, 9, 10, 8, 17, 22, 45]
//                  3
//          5                4
//      16       9        10    8
//   17   22   45

console.log(testHeap.extract());
console.log(testHeap);
// [null, 4, 5, 8, 16, 9, 10, 45, 17, 22]
//                  4
//          5                8
//      16       9        10    45
//   17   22

console.log(testHeap.extract());
console.log(testHeap);
// [null, 5, 9, 8, 16, 22, 10, 45, 17]
//                  5
//           9                8
//      16       22        10    45
//   17      

console.log(testHeap.extract());
console.log(testHeap);
// [null, 8, 9, 10, 16, 22, 17, 45]
//                  8
//           9                10
//      16       22        17    45

console.log(testHeap.extract());
console.log(testHeap.extract());
console.log(testHeap.extract());
console.log(testHeap);
// [null, 16, 22, 17, 45]
//                  16
//           22                17
//      45

console.log(testHeap.extract());
console.log(testHeap.extract());
console.log(testHeap.extract());
console.log(testHeap.extract());
console.log(testHeap.extract()); // Warning
console.log(testHeap); // [null]

let arrayToSort = [7, 11, 23, 4, 99, 56, 13, 2, 8, 77, 41, 38, 5];
heapSort(arrayToSort);
console.log(arrayToSort);