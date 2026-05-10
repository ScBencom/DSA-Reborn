//Connections are from parent to child node
//We have 2 main types: Binary and heap trees

//Binary trees have a maximum of 2 child nodes per parent node
//

// We create a class for each node within the tree
class Node{
    // Each node has three properties, its value, a pointer that indicates the node to its left and a pointer that indicates the node to its right
    constructor(value){
        this.value = value
        this.left = null
        this.right = null
    }
}
// We create a class for the BST
class BinarySearchTree {
    // The tree has only one property which is its root node
    constructor(){
        this.root = null
    }
    // The insert method takes a value as parameter and inserts the value in its corresponding place within the tree
    insert(value){
        const newNode = new Node(value)
        if(this.root === null){
            this.root = newNode
            return this
        }
        let current = this.root
        while(true){
            if(value === current.value) return undefined
            if(value < current.value){
                if(current.left === null){
                    current.left = newNode
                    return this
                }
                current = current.left
            } else {
                if(current.right === null){
                    current.right = newNode
                    return this
                } 
                current = current.right
            }
        }
    }
    // The find method takes a value as parameter and iterates through the tree looking for that value
    // If the value is found, it returns the corresponding node and if it's not, it returns undefined
    find(value){
        if(this.root === null) return false
        let current = this.root,
            found = false
        while(current && !found){
            if(value < current.value){
                current = current.left
            } else if(value > current.value){
                current = current.right
            } else {
                found = true
            }
        }
        if(!found) return undefined
        return current
    }
    // The contains method takes a value as parameter and returns true if the value is found within the tree
    contains(value){
        if(this.root === null) return false
        let current = this.root,
            found = false
        while(current && !found){
            if(value < current.value){
                current = current.left
            } else if(value > current.value){
                current = current.right
            } else {
                return true
            }
        }
        return false
    }
}


//implementation of a graph using an adjacency list
class Graph{
    // The graph has only one property which is the adjacency list
    constructor() {
        this.adjacencyList = {}
    }
    // The addNode method takes a node value as parameter and adds it as a key to the adjacencyList if it wasn't previously present
    addNode(node) {
        if (!this.adjacencyList[node]) this.adjacencyList[node] = []
    }
    // The addConnection takes two nodes as parameters, and it adds each node to the other's array of connections.
    addConnection(node1,node2) {
        this.adjacencyList[node1].push(node2)
        this.adjacencyList[node2].push(node1)
    }
    // The removeConnection takes two nodes as parameters, and it removes each node from the other's array of connections.
    removeConnection(node1,node2) {
        this.adjacencyList[node1] = this.adjacencyList[node1].filter(v => v !== node2)
        this.adjacencyList[node2] = this.adjacencyList[node2].filter(v => v !== node1)
    }
    // The removeNode method takes a node value as parameter. It removes all connections to that node present in the graph and then deletes the node key from the adj list.
    removeNode(node){
        while(this.adjacencyList[node].length) {
            const adjacentNode = this.adjacencyList[node].pop()
            this.removeConnection(node, adjacentNode)
        }
        delete this.adjacencyList[node]
    }
}

const Argentina = new Graph()
Argentina.addNode("Buenos Aires")
Argentina.addNode("Santa fe")
Argentina.addNode("Córdoba")
Argentina.addNode("Mendoza")
Argentina.addConnection("Buenos Aires", "Córdoba")
Argentina.addConnection("Buenos Aires", "Mendoza")
Argentina.addConnection("Santa fe", "Córdoba")

console.log(Argentina)
// Graph {
//     adjacencyList: {
//         'Buenos Aires': [ 'Córdoba', 'Mendoza' ],
//         'Santa fe': [ 'Córdoba' ],
//         'Córdoba': [ 'Buenos Aires', 'Santa fe' ],
//         Mendoza: [ 'Buenos Aires' ]
//     }
// }
