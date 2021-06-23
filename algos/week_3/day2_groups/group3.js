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



    /**
 * Retrieves the smallest integer data from this tree.
 * - Time: O(?).
 * - Space: O(?).
 * @param {Node} current The node that is currently accessed from the tree as
 *    the tree is being traversed.
 * @returns {number} The smallest integer from this tree.
 */
    min(current = this.root) {
        if (this.root.left == null) {
            return current;
        }

        while (this.left != null) {
            current = current.left;
        }

        return current;






    }
}

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










}

