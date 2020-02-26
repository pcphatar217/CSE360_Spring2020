
/**
 * @author Piyapot Charles Phataraphruk
 * @ClassID 217
 * @Assignment 1
 * @since 2020-02-10
 * This is a simple list program that can input up to 10 integers into an array,
 * remove an integer from the array, print the array as a string, and locate
 * the index of an integer in the array.
*/ 
package assign1;
/**
 * The SimpleList class contains two private variables of an integer array list 
 * and integer counter. There is a constructor that initializes the two private 
 * variables. The program contains five methods which are add(), remove(), 
 * count(), toString(), and search().
 */
public class SimpleList 
{ 

	private int list[]; 										//Creates a private array variable
	private int count;  										//Creates a private integer count variable
		
	public SimpleList() 
	{															//Constructor
		this.list = new int[10];								//Sets the size of the array to 10 elements
		this.count = 0; 										//Sets the initial value of count to zero
	}
	/**
	 * This method adds and integer to the array list.
	 * If the array is not full then the method will
	 * shift the elements to the right starting from
	 * index location equal to the counter value. 
	 * The current index will be overridden by the 
	 * value in the previous index. The new value 
	 * will then be placed in index zero and 
	 * the counter will increment. But if the 
	 * List is full then the shift will begin at 
	 * the final index where that value will be 
	 * overridden and thus removed. The counter
	 * will not increment when adding an integer
	 * to a full list.
	 * @param integer
	 */
	public void add(int integer) 
	{														
	
		if (count < 10) 										//Instance where the array is not full
		{														
			for(int shift = count;shift > 0;shift--) 			
			{													
				list[shift]= list[shift - 1];					
			}													
			list[0]=integer;									
			this.count++;										
		}														
		else {													//An instance where the array is full
			for(int shift = 9;shift > 0;shift--) 
			{													
				list[shift] = list[shift - 1];					
			}
			list[0]=integer;									
		}
	}
	
	/**
	 * This method removes an element from the list. 
	 * The method will scan the list for the 
	 * parameter. If it is found, the method will 
	 * start shifting elements from the parameter 
	 * index and shift the elements from the right 
	 * to the left. Once the elements have shifted,
	 * the method will override the last element 
	 * with a zero and the counter will decrement.
	 * @param integer
	 */
	public void remove(int integer) 
	{															
		for(int scan = 0;scan < 10;scan++) 
		{														
			if (list[scan]==integer) 
			{													
				for(int shift = scan;shift < count-1;shift++) 
				{ 												
					list[shift] = list[shift+1];				
				}
				list[count-1]=0;								
				this.count--;									
			}
		}
	}
	
	/**
	 * This method returns the current
	 * integer value of count. Which is
	 * the current size of the array list.
	 * @return
	 */
	public int count() 
	{															
		return this.count;										
	}
	
	/**
	 * This method converts the contents
	 * of the list into a string variable
	 * and spaces the elements apart. The
	 * method will then return a string 
	 * of the elements in the list.
	 * @return
	 */
	public String toString() 
	{															
		String listString = "";									
		for(int increment = 0; increment < count; increment++) 
		{//
			listString += list[increment] + " ";
		}
		return listString;
	}
	
	/**
	 * This method searches for the index
	 * of the value specified by the parameter.
	 * If the value is in the list then it will
	 * return the index location. If not then the
	 * method will return a negative one. 
	 * @param integer
	 * @return
	 */
	public int search(int integer) 
	{
		for(int scan = 0;scan < 10;scan++) 
		{
			if (list[scan] == integer) 
			{
				return scan;
			}
		}
		return -1;
	}
	
}
