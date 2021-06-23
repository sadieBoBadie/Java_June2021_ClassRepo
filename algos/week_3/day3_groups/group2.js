class BSTNode{
    constructor(value){
        this.value = value
        this.left = null
        this.right = null
    }
}
class BST{
    constructor(){
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
                // runner = val < runner.value ? runner.left: runner.right;

                if (val < runner.value) {
                    runner = runner.left;
                }
                else {
                    runner = runner.right;
                }
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

    ///----------WEDNESDAY-----------///

    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    minRecursive(current = this.root) {
        if(current.left == null) {
            return current.value;
        }
        return this.minRecursive(current.left);
    }

    // Predict the output, then rename the function
    // based on the outcome.
    inOrderPrint(node=this.root) {
        if (!node) {
            return;
        }
        this.sortedOrder(node.left);
        console.log(node.value);
        this.sortedOrder(node.right);
    }

        /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    contains(searchVal) {}

    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    containsRecursive(searchVal, current = this.root) {}

    // Extra for those hungry for more BST practice:
    /**
     * Calculates the range (max - min) from the given startNode.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} startNode The node to start from to calculate the range.
     * @returns {number|null} The range of this tree or a sub tree depending on      * if the start Node is the root or not.
     */
     range(startNode = this.root) {

     }
}

let tree = new BST();
let testVals = [10, 5, 7, 20, 15, 15, 12, 13, 23, 2, 1];
/*
              10
             /   \
           5      20
          / \    /  \
         2   7  15   23
        /      /  \
       1      12   15
                \
                13
*/      
for (let val of testVals) {
    tree.insert(val);
}

console.log(tree.minRecursive());
// console.log(tree.contains());
// console.log(tree.toArrInorder());

// Consider running this code in your browser through the inspect console.
// Chrome dev tools will log to the console nested objects that you can expand
// to see the whole t