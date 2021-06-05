class TrieNode {
    constructor(letter = null) {
      this.letter = letter;
      // children will be TrieNodes as well
      this.children = {};
      // if 
      this.endWord = false;
    }
}
  
class Trie {
    constructor() {
        this.root = new TrieNode("");
    }

    add(word) {
    }

    /**
     * Returns an array with any complete words beginning
     * with the given starting substring.
     * - Time: O(?)
     * - Space: O(?)
     * @returns {array} of strings
     */
    autoComplete(startingSubstring) {

    }

    // Finds the last letter node of the given substring
    getLastOfSubstring(substring) {

    }

    // RECURSIVE CALL TO GET WORD COMBINATIONS
    getCompletions(prepend="", branchString="", node=this.root, completions=[]) {

    }
}

let searchHistory = new Trie();
searchHistory.add("cat").add("can").add("candy").add("apple").add("a").add("an").add("and");
console.log(searchHistory);

console.log(searchHistory.autoComplete("a"));
console.log(searchHistory.autoComplete("ca"));