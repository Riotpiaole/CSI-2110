[![Build Status](https://travis-ci.org/duereg/js-algorithms.svg)](https://travis-ci.org/duereg/js-algorithms)
[![Dependencies](https://david-dm.org/duereg/js-algorithms.svg)](https://david-dm.org/duereg/js-algorithms)
[![devDependencies](https://david-dm.org/duereg/js-algorithms/dev-status.svg)](https://david-dm.org/duereg/js-algorithms#info=devDependencies&view=table)
[![NPM version](https://badge.fury.io/js/js-algorithms.svg)](http://badge.fury.io/js/js-algorithms)

js-implmentation for any datastructure
=============


# Description

Classic data structures and algorithms (with tests!) written in JavaScript

* Singly Linked List
* Min/Max Binary Heap
* Trie (With Pre-Order Traversal Sorting)
* Stack (push, pop, peek, and isEmpty)
* Queue (add, remove, peek, isEmpty)
* Binary Search Tree
* Hash Table

As well as the following algorithms:

* Breadth First Search
* Depth First Search
* Binary Search
* Merge Sort
* Quick Sort
* Shuffle (Fisher–Yates)
* Smallest Enclosing Circle

##Usage

If you want access to these data structures in your project, include this package.

```shell
> var algorithms: = require('js-algorithms')
> algorithms
{
  dataStructures: {
    binaryHeap: [Function],
    binarySearchTree: [Function: bst],
    linkedList: [Function],
    maxHeap: [Function],
    minHeap: [Function],
    queue: [Function],
    stack: [Function],
    stackQueue: [Function],
    trie: [Function] },
  algorithms: {
    sorting: {
      quickSort: [Function]
      mergeSort: [Function]
    },
    shuffle: [Function],
    enclosingCircle: [Function]
  }}
```
