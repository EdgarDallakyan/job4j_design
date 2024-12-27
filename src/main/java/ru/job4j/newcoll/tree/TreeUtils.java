package ru.job4j.newcoll.tree;

import ru.job4j.collection.SimpleQueue;
import ru.job4j.collection.SimpleStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TreeUtils<T> {

    public int countNode(Node<T> root) {
        return findAllValues(root).size();
    }

    public Iterable<T> findAll(Node<T> root) {
        return findAllValues(root);
    }

    private List<T> findAllValues(Node<T> root) {
        SimpleQueue<Node<T>> queue = new SimpleQueue<>();
        List<T> listOfNodes = new ArrayList<>();
        if (root == null) {
            throw new IllegalArgumentException();
        }
        queue.push(root);
        while (!queue.isEmpty()) {
            Node<T> tempNode = queue.poll();
            listOfNodes.add(tempNode.getValue());
            for (Node<T> oneChild : tempNode.getChildren()) {
                queue.push(oneChild);
            }
        }
        return listOfNodes;
    }

    public boolean add(Node<T> root, T parent, T child) {
        boolean success = false;
        Optional<Node<T>> result = findByKey(root, parent);
        if (result.isPresent()) {
            List<Node<T>> children = result.get().getChildren();
            Node<T> newChild = new Node<>(child);
            if (!children.contains(newChild)) {
                success = children.add(newChild);
            }
        }
        return success;
    }

    public Optional<Node<T>> findByKey(Node<T> root, T key) {
        return findOrDivideByKey(root, key, false);
    }

    public Optional<Node<T>> divideByKey(Node<T> root, T key) {
        return findOrDivideByKey(root, key, true);
    }

    private Optional<Node<T>> findOrDivideByKey(Node<T> root, T key, boolean needDelete) {
        SimpleStack<Node<T>> stack = new SimpleStack<>();
        Optional<Node<T>> result = Optional.empty();
        int count = 0;
        boolean wasFound = false;
        if (root == null) {
            throw new IllegalArgumentException();
        }
        if (root.getValue().equals(key)) {
            result = Optional.of(root);
        } else {
            stack.push(root);
            count++;
            while (count != 0) {
                Node<T> tempNode = stack.pop();
                count--;
                List<Node<T>> children = tempNode.getChildren();
                if (children.size() > 0) {
                    for (Node<T> oneChild : children) {
                        if (oneChild.getValue().equals(key)) {
                            result = Optional.of(oneChild);
                            if (needDelete) {
                                children.remove(oneChild);
                            }
                            wasFound = true;
                            break;
                        }
                        stack.push(oneChild);
                        count++;
                    }
                    if (wasFound) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}