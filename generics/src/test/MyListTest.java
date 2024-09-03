package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.UnaryOperator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uptc.structures.MyList;

class MyListTest {
	private MyList<String> list;
	
	@BeforeEach
	void setUpBeforeEach() throws Exception {
		list = new MyList<String>();
		list.add("juan");
		list.add("lola");
	}

	@Test
	void testSize() {
		assertEquals(2, list.size());
	}

	@Test
	void testIsEmpty() {
		MyList<String> list2 = new MyList<String>();
		assertEquals(true, list2.isEmpty());
	}

	@Test
	void testContains() {
		assertEquals(true, list.contains("lola"));
	}

	@Test
	void testIterator() {
		Iterator<String> iterator = list.iterator();
		assertEquals(true, iterator.hasNext());
		assertEquals("juan", iterator.next());
	}

	@Test
	void testToArray() {
		Object[] array = list.toArray();
		assertEquals("juan", array[0]);
	}

	@Test
	void testToArrayTArray() {
		String[] array = list.toArray(new String[list.size()]);
		assertEquals("lola", array[1]);
	}

	@Test
	void testAddT() {
		list.add("laura");
		assertEquals(true, list.contains("laura"));
		assertEquals(3, list.size());
	}

	@Test
	void testRemoveObject() {
		list.remove("lola");
		assertEquals(false, list.contains("lola"));
	}

	@Test
	void testContainsAll() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("juan");
		names.add("lola");
		boolean actual = list.containsAll(names);
		assertEquals(true, actual);
		names.add("lulu");
		actual = list.containsAll(names);
		assertEquals(true, actual);
	}

	@Test
	void testAddAllCollectionOfQextendsT() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("juanita");
		names.add("lolita");
		list.addAll(names);
		assertEquals(true, list.contains("lolita"));
	}

	@Test
	void testAddAllIntCollectionOfQextendsT() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("juanita");
		names.add("lolita");
		list.addAll(1, names);
		assertEquals(true, list.get(1).equals("juanita"));
	}

	@Test
	void testRemoveAll() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("juan");
		list.removeAll(names);
		assertEquals(true, list.get(0).equals("lola"));
	}

	@Test
	void testRetainAll() {
		fail("Not yet implemented");
	}

	@Test
	void testClear() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testSet() {
		fail("Not yet implemented");
	}

	@Test
	void testAddIntT() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveInt() {
		fail("Not yet implemented");
	}

	@Test
	void testIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	void testLastIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	void testListIterator() {
		fail("Not yet implemented");
	}

	@Test
	void testListIteratorInt() {
		fail("Not yet implemented");
	}

	@Test
	void testReplaceAll2() {
		UnaryOperator<String>changeToUpperCase = x -> x.toUpperCase();
		list.replaceAll2(changeToUpperCase);
		assertEquals("JUAN", list.get(0));
	}

	@Test
	void testSubList() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
