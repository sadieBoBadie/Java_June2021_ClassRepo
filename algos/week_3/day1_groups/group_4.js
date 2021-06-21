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
        let runner = this.root;
    }

    /**
     * Determines if this tree is empty.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {boolean} Indicates if this tree is empty.
     */
    isEmpty() {
    }
}

// Hi folks! Here are some test cases:

let testTree = new BST();
testTree.insert(10);
testTree.insert(20);
testTree.insert(15);
testTree.insert(2);
testTree.insert(7);