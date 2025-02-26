package datastruct;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class MyUnsortedListTest {
    
    @Test
    public void appendIntTest() {
        MyUnsortedList<Integer> list = MyUnsortedList.of();
        list.append(-10);
        list.append(0);
        list.append(10);
        assertEquals(3, list.size());
    }
    @Test
    public void appendDoubleTest() {
        MyUnsortedList<Double> list = MyUnsortedList.of();
        list.append(-10.9);
        list.append(0.8);
        list.append(10.01);
        assertEquals(3, list.size());
    }
    @Test
    public void insertIntTest() {
        MyUnsortedList<Integer> list = MyUnsortedList.of();
        list.insert(5, 0);
        list.insert(10, 1);
        list.insert(15, 2);
        assertEquals(3, list.size());
    }
    @Test
    public void insertDoubleTest() {
        MyUnsortedList<Double> list = MyUnsortedList.of();
        list.insert(5.5, 0);
        list.insert(10.1, 1);
        list.insert(15.9, 2);
        assertEquals(3, list.size());
    }
    @Test
    public void popTest(){
        MyUnsortedList<Integer> list = MyUnsortedList.of();
        list.append(5);
        list.append(10);
        list.append(15);
        int popped = list.pop();
        assertEquals(5, popped);
        assertEquals(2, list.size());
    }
    @Test(expected = EmptyListException.class)
    public void popFailTest(){
        MyUnsortedList<Integer> list = MyUnsortedList.of();
        list.append(5);
        list.append(10);
        list.append(15);
        int size = list.size();
        for (int i=0; i<size; i++) {
            list.pop();
        }
        list.pop();
    }
    @Test
    public void removeTest(){
        MyUnsortedList <Integer> list = MyUnsortedList.of();
        int size = 5;
        for (int i=0; i<size; i++) {
            list.append(i);
        }
        for (int i=0; i<size; i++) {
            int removed = list.remove(0);
            size--;
            assertEquals("size check", size, list.size());
        }
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void removeFailTest(){
        MyUnsortedList<Integer> list = MyUnsortedList.of();
        list.append(5);
        list.append(10);
        list.remove(3);
    }

    @Test
    public void popLastTest(){
        MyUnsortedList <Integer> list = MyUnsortedList.of();
        int size = 5;
        for (int i=0; i<size; i++) {
            list.append(i);
        }
        for (int i=0; i<size; i++) {
            int popped = list.popLast();
            size--;
            assertEquals("element check", size, popped);
            assertEquals("size check", size, list.size());
        }
    }
}
