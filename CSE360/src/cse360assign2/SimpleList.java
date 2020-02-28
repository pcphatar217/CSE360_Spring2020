
/**
 * @author Piyapot Charles Phataraphruk
 * @ClassID 217
 * @Assignment 2
 * @since 2020-02-27
 * This is a simple list program that can input up to 10 integers into an array,
 * remove an integer from the array, print the array as a string, and locate
 * the index of an integer in the array.
 * This program is for assignment 2.
 * URL to repository: https://github.com/pcphatar217/CSE360_Spring2020
*/ 
package cse360assign2;
/**
 * The SimpleList class contains two private variables of an integer array list 
 * and integer counter. There is a constructor that initializes the two private 
 * variables. The program contains five methods which are add(), remove(), 
 * count(), toString(), search(),append(), first(), last(), and size().
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
	 * List is full then a copy array will be 
	 * made but with 50% more spaces. The original
	 * values will be shifted by 1 to the right when
	 * copied so the new parameter can be added at 
	 * index 0. The main list will then be set equal
	 * to the copy list which mean the main list is now
	 * updated.
	 * @param integer
	 */
	public void add(int integer) 
	{														
	int arrayLength = list.length; //arrayLength tells the current length of the array list.
	
		if (count < arrayLength) 										//Instance where the array is not full
		{														
			for(int shift = count;shift > 0;shift--) 			
			{													
				list[shift]= list[shift - 1];					
			}													
			list[0]=integer;									
			this.count++;										
		}														
		else 
		{													//An instance where the array is full.
			int increaseList50Percent = 0;		  				 //Used to help in increasing the size of the array list
			increaseList50Percent=arrayLength+arrayLength/2;	//Value of the length when increased by 50%.
			int[] copyList = new int[increaseList50Percent];	//Creates a new array that will be the increase of the original list. 
			for(int copy = 0;copy < count;copy++) 				//Loop that copies the contents of the original list to the new.
			{													
				copyList[copy+1] = list[copy];					//Leave the initial index empty for the new element. 
			}		
			list = copyList;									//Copies the new list to the original which makes it larger
			list[0]=integer;									//Inputs the new value
			this.count++;										//Increase the count.
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
	 * The remove method now check to see if more 
	 * than 25% of the list are empty spaces and 
	 * if so it will remove the empty spaces, unless
	 * if there is only one element in the list, by
	 * making a copy of the original list but 
	 * without the empty spaces. The original list 
	 * will then be set equal to the copy which means
	 * the list has been updated and the rest of the 
	 * remove method will execute.
	 * 
	 * @param integer
	 */
	public void remove(int integer) 
	{									
		int arrayLength = list.length;			//arrayLength tells the current length of the array list.
		int decreasedList25Percent = 0;			//Used to help in decreasing the size of the array list
		int emptySpace = 0;						
		int twentyFivePercentLength = 0;
		twentyFivePercentLength = arrayLength / 4;
		emptySpace = arrayLength - count;
		
		for(int scan = 0;scan < count;scan++) 
		{														
			if (list[scan]==integer) 
			{	
				if(emptySpace > twentyFivePercentLength && arrayLength > 1)
				{
					decreasedList25Percent=arrayLength - twentyFivePercentLength;	//Value of the length when decreased by 25%.
					int[] copyList = new int[decreasedList25Percent];				//Creates a new array that will be the decrease of the original list. 
					for(int copy = 0;copy < count;copy++) 							//Loop that copies the contents of the original list to the new.
					{													
						copyList[copy] = list[copy];					
					}		
					list = copyList;												//Copies the new list to the original which makes it smaller
					for(int shift = scan;shift < count-1;shift++) 
					{ 												
						list[shift] = list[shift+1];				
					}
					list[count-1]=0;								
					this.count--;
					
				}
				else
				{
					for(int shift = scan;shift < count-1;shift++) 
					{ 												
						list[shift] = list[shift+1];				
					}
					list[count-1]=0;								
					this.count--;	
				}
				break;
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
	
	/**
	 * This method works similarly as add() however,
	 * it places the parameter at the end of the list. 
	 * The method will check if the list is full and 
	 * if that is the case, the list size
	 * will increase by 50%.
	 * @param integer
	 */
	public void append(int integer)
	{
		int arrayLength = list.length; 							//arrayLength tells the current length of the array list.
		
		if (count < arrayLength) 								//Instance where the array is not full
		{																											
			list[count]=integer;									
			this.count++;										
		}														
		else {													//An instance where the array is full.
			int increaseList50Percent = 0;		   				//Used to help in increasing the size of the array list
			increaseList50Percent=arrayLength+arrayLength/2;	//Value of the length when increased by 50%.
			int[] copyList = new int[increaseList50Percent];	//Creates a new array that will be the increase of the original list. 
			for(int copy = 0;copy < count;copy++) 				//Loop that copies the contents of the original list to the new.
			{													
				copyList[copy] = list[copy];					//Leave the initial index empty for the new element. 
			}		
			list = copyList;									//Copies the new list to the original which makes it larger
			list[count]=integer;								//Inputs the new value
			this.count++;										//Increase the count.
		}
	}
	
	/**
	 * This method returns the first value in the list.
	 * If there isn't then return -1.
	 * @return
	 */
	public int first()
	{
		if(count>0)
		{
			return list[0];	
		}
		else
		{
			return -1;
		}
		
	}
	
	/**
	 * This method returns the last value in the list.
	 * If there isn't then return -1.
	 * @return
	 */
	public int last()
	{
		if(count>0)
		{
			return list[count-1];	
		}
		else
		{
			return -1;
		}
	}
	
	/**
	 * This method returns the length of the list.
	 * @return
	 */
	public int size() 
	{															
		return this.list.length;										
	}
	
}
