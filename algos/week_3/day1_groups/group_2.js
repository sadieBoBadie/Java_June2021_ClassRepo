///----------MONDAY-----------///


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
        // have a loop to go through the runner value
        while(this.right != null && this.left != null) {
            
        }

        // 
        if newNode == runner {
            console.log("This is the root node");
        } else {
            if newNode > this.right;
            newNode = this.right.next;
        } else {
            if newNode < this.left;
        }
    }
}

let testTree = new BST();
testTree.insert(10);
testTree.insert(20);
testTree.insert(15);
testTree.insert(2);
testTree.insert(7);