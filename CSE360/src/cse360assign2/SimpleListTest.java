package cse360assign2;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;

class SimpleListTest {

	/**
	 * This test verifies that the counter correctly
	 * increments after calling the .add() method.
	*/
	@Test
	public void testAddingToList() {
		
		SimpleList  testList = new SimpleList();
		
		testList.add(4);
		testList.add(5);
		testList.add(2);
		
		assertEquals(10,testList.size());
		assertEquals(3,testList.count());	
		assertNotNull(testList.toString());
	}
	
	/**
	 * This test verifies that the list will
	 * add past its current limit and increase
	 * the size of the list by 50%.
	*/
	@Test
	public void testListIncreasingSizeBy50Percent() {
		
		SimpleList  testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.add(11);
		testList.add(12);
		
		assertEquals(15,testList.size());
		assertEquals(12,testList.count());	
		assertNotNull(testList.toString());
		
	}
	
	/**
	 * This test checks if the counter decrements 
	 * after removing an element from list.
	 */
	@Test
	public void testRemovingFromList() {
	
		SimpleList  testList = new SimpleList();
		
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.remove(5);
		
		assertEquals(8,testList.size());
		assertEquals(2,testList.count());	
		assertNotNull(testList.toString());
	
	}
	
	/**
	 * There are 16 elements being added. The 16th make the list 
	 * change its size to 22 since 50% of 15 is 7 rounded down. 
	 * So when I remove one element and there are more than 25% 
	 * of empty spaces the list is reduced to 17.
	 */
	@Test
	public void testRemoveListDecreasesLengthWhen25PercentEmptySpacesArePresent() {
		
		SimpleList  testList = new SimpleList();
			
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.add(4);
		testList.add(5);
		testList.add(5);
		testList.add(5);
		testList.add(5);
		testList.add(5);
		testList.add(5);
		testList.remove(5);
		
		assertEquals(17,testList.size());
		assertEquals(15,testList.count());	
		assertNotNull(testList.toString());
	
	}
	
	/**
	 * This test checks that the append() adds
	 * the parameter to the end of the list.
	 */
	@Test
	public void testAppend() {
	
		SimpleList  testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.append(10);
		assertEquals(10,testList.size());
		assertEquals(10,testList.count());	
		assertNotNull(testList.toString());
	
	}
	
	/**
	 * This test checks that the append() will
	 * increase the size of the list and add 
	 * the parameter to the end of the list.
	 */
	@Test
	public void testAppendWhenListAtMax() {
	
		SimpleList  testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.append(20);
		assertEquals(15,testList.size());
		assertEquals(11,testList.count());	
		assertNotNull(testList.toString());

	}
	
	/**
	 * This test checks that the first() will return 
	 * the first element of the list.
	 */
	@Test
	public void testFirst() {
	
		SimpleList  testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		
		assertEquals(4,testList.first());
		assertEquals(10,testList.size());
		assertEquals(4,testList.count());	
		assertNotNull(testList.toString());

	}
	
	/**
	 * This test checks that the first() will
	 * return -1 when there is no first element.
	 */
	@Test
	public void testFirstReturnsNeg1() {
	
		SimpleList  testList = new SimpleList();
		
		assertEquals(-1,testList.first());
		assertEquals(10,testList.size());
		assertEquals(0,testList.count());	
		assertNotNull(testList.toString());

	}
	
	/**
	 * This test checks that the last() will
	 * return the last element in the list.
	 */
	@Test
	public void testLast() {
	
		SimpleList  testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		
		assertEquals(1,testList.last());
		assertEquals(10,testList.size());
		assertEquals(4,testList.count());	
		assertNotNull(testList.toString());

	}
	
	/**
	 * This test checks that the last() will
	 * return -1 when there is no last element.
	 */
	@Test
	public void testLastReturnsNeg1() {
	
		SimpleList  testList = new SimpleList();
		
		assertEquals(-1,testList.last());
		assertEquals(10,testList.size());
		assertEquals(0,testList.count());	
		assertNotNull(testList.toString());

	}
	
	/**
	 * This test checks that the size() will
	 * return the total size of the list.
	 */
	@Test
	public void testSize() {
	
		SimpleList  testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		
		assertEquals(10,testList.size());
		assertEquals(4,testList.count());	
		assertNotNull(testList.toString());

	}
	
	/**
	 * This test checks that the size() will
	 * return the total size of the list after
	 * the list has increased in size.
	 */
	//@Test
	public void testSizeMethodAfterAnIncrease() {
		
		SimpleList  testList = new SimpleList();
			
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.add(4);
		testList.add(5);
		testList.add(5);
		testList.add(5);
		testList.add(5);
		testList.add(5);
		
		assertEquals(15,testList.size());	
	}
	
	/**
	 * This test checks that the size() will
	 * return the total size of the list after
	 * the list has decreased in size.
	 */
	//@Test
	public void testSizeMethodAfterAnDecrease() {
		
		SimpleList  testList = new SimpleList();
			
		testList.add(4);
		testList.add(5);
		testList.add(2);
		testList.add(6);
		testList.remove(6);

		assertEquals(7,testList.size());	
	}
	
	/**
	 * This test checks that the search() will
	 * return the index of the parameter from the list after
	 * the list has increased in size.
	 */
	//@Test
	public void testSearchAfterAnIncrease() {
		
		SimpleList  testList = new SimpleList();
			
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.add(11);
		testList.add(12);
		testList.add(13);
		testList.add(14);
		testList.add(15);
		
		assertEquals(1,testList.search(14));	
	}
	
}
