
/**
 * @author Piyapot Charles Phataraphruk
 * @ClassID 217
 * @Assignment 1
 * @since 2020-02-10
 * The purpose of this program is to test the various methods 
 * that are contained in Simplelist.java using junit testing. 
*/ 
package assign1;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class SimpleListTest {

	/**
	 * This test verifies that the counter correctly
	 * increments after calling the .add() method.
	*/
	@Test
	public void testCountIncrementsWhenAddingToList() {
		
		SimpleList  testList1 = new SimpleList();
		
		testList1.add(4);
		testList1.add(5);
		testList1.add(2);
		
		assertEquals(3,testList1.count());	
	}
	
	/**
	 * This test checks if the counter decrements 
	 * after removing an element from list.
	 */
	@Test
	public void testCountDecrementsWhenRemovingFromList() {
	
		SimpleList  testList2 = new SimpleList();
		
		testList2.add(4);
		testList2.add(5);
		testList2.add(2);
		testList2.remove(5);
		
		assertEquals(2,testList2.count());	
	}
	
	/**
	 * This test ensures that the toString() method
	 * can convert the elements of the list into a
	 * string.
	 */
	@Test
	public void testPrintList() {
		
		SimpleList  testList3 = new SimpleList();
		
		testList3.add(4);
		testList3.add(5);
		testList3.add(1);
		testList3.add(9);
		testList3.add(8);
		testList3.add(7);
		testList3.add(0);
		testList3.add(2);
		testList3.add(3);
		testList3.add(6);
		
		assertNotNull(testList3.toString());
	}

	/**
	 * This test checks that the .add() method will
	 * not increment past 10 when the array list is 
	 * full and the element in the last index is 
	 * overridden when the elements shift.
	 */
	@Test
	public void testCountIncrementsStopsWhenReachingMaxSizeOfList() {
		
		SimpleList  testList4 = new SimpleList();
		
		testList4.add(4);
		testList4.add(5);
		testList4.add(1);
		testList4.add(9);
		testList4.add(8);
		testList4.add(7);
		testList4.add(0);
		testList4.add(2);
		testList4.add(3);
		testList4.add(6);
		testList4.add(11);
		
		assertEquals(10,testList4.count());
	}
	
	/**
	 * This test verifies that the .search() method is 
	 * able to locate the index location that contains 
	 * the parameter value.
	 */
	@Test
	public void testSeachForIntegerInListAndReturnsTheIndexLocation() {
		
		SimpleList  testList5 = new SimpleList();
		
		testList5.add(4);
		testList5.add(5);
		testList5.add(1);
		testList5.add(9);
		testList5.add(8);
		testList5.add(7);
		testList5.add(0);
		testList5.add(2);
		testList5.add(3);
		testList5.add(6);
		
		assertEquals(4,testList5.search(7));
	}
	
	/**
	 * This test checks that the .search() method returns a 
	 * negative one when the parameter does not exist in the array list.
	 */
	@Test
	public void testSeachForIntegerInListThatDoesNotExist() {
		
		SimpleList  testList5 = new SimpleList();
		
		testList5.add(4);
		testList5.add(5);
		testList5.add(9);
		testList5.add(8);
		testList5.add(7);
		testList5.add(0);
		testList5.add(2);
		testList5.add(3);
		testList5.add(6);
		
		assertEquals(-1,testList5.search(1));
	}
	
	

}
