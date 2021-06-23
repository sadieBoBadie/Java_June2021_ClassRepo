///----------MONDAY-----------///
// (Tuesday below!)

class BSTNode {
    constructor(value) {
        this.value = value
        this.left = null
        this.right = null
    }
}
class BST {
    constructor() {
        this.root = null
    }


    insert(val) {

        let newNode = new BSTNode(val);

        if (!this.root) {
            this.root = new BSTNode(val);
            return this;
        }

        let runner = this.root;

        while (
            (runner.left != null && val < runner.value) ||
            (runner.right != null && val >= runner.value)) {

            // Move runner left or right - ternary statement (shortened if block)
            runner = val < runner.value ? runner.left : runner.right;
        }
        if (val < runner.value) {
            runner.left = newNode
        }
        else runner.right = newNode;

        return this;
    }

    /**
     * Determines if this tree is empty.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {boolean} Indicates if this tree is empty.
     */
    isEmpty() {
        return this.root == null;
    }

    ///----------TUESDAY-----------///

    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    min(current = this.root) {
        // moves the current to the left until it breaks
        while (current.left != null) {
            current = current.left;
        }
        // return the value on the last node on the left
        return current.value;
    }

    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    max(current = this.root) {
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    minRecursive(current = this.root) {
    }


    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    maxRecursive(current = this.root) {

    }
}

let testTree = new BST();
testTree.insert(10);
testTree.insert(20);
testTree.insert(15);
testTree.insert(2);
testTree.insert(7);

//
let testTree2 = new BST();
testTree.insert(8);
testTree.insert(3);
testTree.insert(20);
testTree.insert(10);
testTree.insert(15);
testTree.insert(1);
testTree.insert(12);

console.log(testTree);
console.log(testTree2);

// let minOfTree = testTree.min();
// let minOfTree = testTree2.min();
// console.log(min);