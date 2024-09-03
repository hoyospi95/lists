package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

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
		assertEquals("lola", iterator.next());
		

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
		ArrayList<String> namesToRetain = new ArrayList<>();
		namesToRetain.add("lola");
		list.retainAll(namesToRetain);
		assertEquals(true, list.get(0).equals("lola"));
	}

	@Test
	void testClear() {
		list.clear();
		assertEquals(0, list.size());
	}

	@Test
	void testGet() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("juan");
		names.add("lola");
		names.add("juanita");
		names.add("tony")

		assertEquals("tony", names.get(3))
	}

	@Test
	void testSet() {
		list.set(0, "pedro");
		assertEquals("pedro", list.get(0));
	}

	@Test
	void testAddIntT() {
		list.add(2, "diana");
		assertEquals("diana", list.get(2));
	}

	@Test
	void testRemoveInt() {
		list.remove(1);
		assertFalse(list.contains("lola"));
	}

	@Test
	void testIndexOf() {
		assertEquals(0, list.indexOf("juan"));
	}

	@Test
	void testLastIndexOf() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("juan");
		names.add("carlos");
		names.add("sara");
		names.add("fernando");
		names.add("juan");

		assertEquals(4, names.lastIndexOf("juan"));
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
		fail("Not yet implemented");
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
