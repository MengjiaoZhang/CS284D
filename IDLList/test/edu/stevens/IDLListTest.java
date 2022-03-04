package edu.stevens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IDLListTest {

    @Test
    public void testAddIntE() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 1; i < 10; i++) {
            dll.add(2*i);
        }

        dll.add(3, 5);
        assertEquals(Integer.valueOf(5), dll.get(3));

        dll.add(0, 4);
        assertEquals(Integer.valueOf(4), dll.get(0));

        IDLList<String> dlls = new IDLList<>();

        for (int i = 1; i < 10; i++) {
            dlls.add(String.valueOf(i));
        }

        dlls.add(3, "5");
        assertEquals("5", dlls.get(3));

        dlls.add(0, "4");
        assertEquals("4", dlls.get(0));

        // An exception should be thrown here
        try {
            dll.add(-6, 0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testAddE() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 1; i < 10; i++) {
            dll.add(i);
        }

        dll.add(100);
        assertEquals(Integer.valueOf(100), dll.get(0));
        assertTrue(dll.add(100));

        dll.add(200);
        assertEquals(Integer.valueOf(200), dll.get(0));
        assertTrue(dll.add(200));

        dll.add(300);
        assertEquals(Integer.valueOf(300), dll.get(0));
        assertTrue(dll.add(300));

    }

    @Test
    public void testAppend() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 1; i < 10; i++) {
            dll.add(i);
        }

        dll.append(10);
        assertEquals(Integer.valueOf(10), dll.get(dll.size() - 1));
        assertTrue(dll.append(10));

        dll.append(15);
        assertEquals(Integer.valueOf(15), dll.get(dll.size() - 1));
        assertTrue(dll.append(15));

        IDLList<String> dlls = new IDLList<>();

        for (int i = 1; i < 10; i++) {
            dlls.add(String.valueOf(i));
        }

        dlls.append("10");
        assertEquals("10", dlls.get(dlls.size() - 1));
        assertTrue(dlls.append("10"));

        dlls.append("15");
        assertEquals("15", dlls.get(dlls.size() - 1));
        assertTrue(dlls.append("15"));

    }

    @Test
    public void testGet() {

        IDLList<Integer> dll = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        assertEquals(Integer.valueOf(9), dll.get(0));

        assertEquals(Integer.valueOf(0), dll.get(dll.size() - 1));

        IDLList<String> dlls = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dlls.add(String.valueOf(i));
        }

        assertEquals(Integer.valueOf("9"), dll.get(0));

        assertEquals(Integer.valueOf("0"), dll.get(dll.size() - 1));
    }

    @Test
    public void testGetHead() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        assertEquals(dll.get(0), dll.getHead());

        IDLList<Integer> dll2 = new IDLList<>();

        for (int i = 10; i > -1; i--) {
            dll2.add(i);
        }

        assertEquals(dll2.get(0), dll2.getHead());

        IDLList<String> dll3 = new IDLList<>();

        for (int i = 10; i > -1; i--) {
            dll3.add(String.valueOf(i));
        }

        assertEquals(dll3.get(0), dll3.getHead());
    }

    @Test
    public void testGetLast() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        assertEquals(dll.get(dll.size() - 1), dll.getLast());

        IDLList<Integer> dll2 = new IDLList<>();

        for (int i = 10; i > -1; i--) {
            dll2.add(i);
        }

        assertEquals(dll2.get(dll2.size() - 1), dll2.getLast());

        IDLList<String> dll3 = new IDLList<>();

        for (int i = 10; i > -1; i--) {
            dll3.add(String.valueOf(i));
        }

        assertEquals(dll3.get(dll3.size() - 1), dll3.getLast());
    }

    @Test
    public void testSize() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        assertEquals(10, dll.size());

        dll.add(200);

        assertEquals(11, dll.size());

        dll.removeLast();
        dll.remove(200);
        dll.removeAt(3);
        dll.remove(5);


        assertEquals(7, dll.size());
    }

    @Test
    public void testRemove() {
        IDLList<Integer> dll = new IDLList<>();

        // An exception should be thrown here
        try {
            dll.remove();
            fail();
        } catch (IllegalStateException e) {
            assertEquals(1, 1);
        }

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        assertEquals(dll.get(0), dll.remove());

        dll.remove();
        assertEquals(dll.get(0), dll.remove());

    }

    @Test
    public void testRemoveLast() {
        IDLList<Integer> dll = new IDLList<>();

        // An exception should be thrown here
        try {
            dll.removeLast();
            fail();
        } catch (IllegalStateException e) {
            assertEquals(1, 1);
        }

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        assertEquals(dll.get(dll.size() - 1), dll.removeLast());

        dll.removeLast();
        assertEquals(dll.get(dll.size() - 1), dll.removeLast());
    }

    @Test
    public void testRemoveAt() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        // An exception should be thrown here
        try {
            dll.removeAt(100);
            fail();
        } catch (IllegalStateException e) {
            assertEquals(1, 1);
        }

        assertEquals(dll.get(0), dll.removeAt(0));

        assertEquals(dll.get(dll.size() - 1), dll.removeAt(dll.size() - 1));

        assertEquals(dll.get(5), dll.removeAt(5));
    }

    @Test
    public void testRemoveE() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        dll.remove(100);
        assertFalse(dll.remove(100));

        assertTrue(dll.remove(0));

        dll.remove(0);
        assertNotEquals(dll.get(dll.size() - 1), Integer.valueOf(0));

        dll.append(9);
        dll.append(9);
        assertEquals(dll.get(dll.size() - 1), Integer.valueOf(9));
    }

    @Test
    public void testToString() {
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 0; i < 10; i++) {
            dll.add(i);
        }

        assertEquals("9,8,7,6,5,4,3,2,1,0", dll.toString());
    }
}