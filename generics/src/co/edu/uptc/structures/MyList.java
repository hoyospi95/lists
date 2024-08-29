package co.edu.uptc.structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyList<T> implements List<T> {
    private Node<T> head;
    private Node<T> last;

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public boolean contains(Object o) {
        Node<T> aux = head;
        while (aux != null) {
            if (aux.getData().equals(o)) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node<T> aux = head;
        for (int i = 0; i < size(); i++) {
            array[i] = aux;
            aux = aux.getNext();
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean add(T e) {
        Node<T> newNode = new Node<T>(e);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> aux = this.head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<T> temp = head;
        Node<T> prev = null;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                if (prev == null) {
                    head = temp.getNext();
                } else {
                    prev.setNext(prev.getNext());
                }
            }
            prev = temp;
            temp = temp.getNext();
        }

        return false;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean add = false;
       for (T t : c) {
        if (add(t )) {
            add = true;
        }
       }
       return add;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        this.head=null;
    }

    @Override
    public T get(int index) {
        Node<T> aux = head;
        T data = null;
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                data = aux.getData();
            } else {
                aux = aux.getNext();
            }
        }
        return data;
    }

    @Override
    public T set(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        Node<T> aux = head;
        Node<T> previous = null;
        T recovered = null;

        if (index == 0 && head != null) {
            recovered = head.getData();
            head = head.getNext();
            return recovered;
        }

        for (int i = 0; i < index; i++) {
            previous = aux;
            aux = aux.getNext();
        }

        if (aux != null) {
            recovered = aux.getData();
            previous.setNext(aux.getNext());
        }

        return recovered;
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ListIterator<T>() {
            private Node<T> currentNode = head;
            private Node<T> previousNode = null;
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                currentIndex++;
                return previousNode.getData();
            }

            @Override
            public boolean hasPrevious() {
                return previousNode != null;
            }

            @Override
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                if (currentIndex == 1) {
                    currentNode = head;
                } else {
                    currentNode = head;
                    for (int i = 0; i < currentIndex - 1; i++) {
                        currentNode = currentNode.getNext();
                    }
                    previousNode = currentNode;
                    currentIndex--;

                }
                return currentNode.getData();
            }

            @Override
            public int nextIndex() {
                return currentIndex;
            }

            @Override
            public int previousIndex() {
                return currentIndex - 1;
            }

            @Override
            public void remove() {
                if (previousNode == null) {
                    throw new IllegalStateException();
                }
                MyList.this.remove(previousNode.getData());
                previousNode = null;
            }

            @Override
            public void set(T e) {
                if (previousNode == null) {
                    throw new IllegalStateException();
                }
                previousNode.setData(e);
            }

            @Override
            public void add(T e) {
                MyList.this.add(currentIndex, e);
                previousNode = null;
                currentIndex++;
            }

        };

    }
    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

    public Iterator<T> descendingIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'descendingIterator'");
    }

    @Override
    public boolean equals(Object o) {
        // No es necesario.
        throw new UnsupportedOperationException("Unimplemented method 'equals'");
    }
}
