/**
 * 
 */
package com.personal.innerclasses;

/**
 * @author hpopuri
 *
 */
public class DataStrucutre {
	
	private static final int SIZE = 15;
	private int[] arrayInt = new int[SIZE];
	
	public DataStrucutre() {
		for(int i = 0;i<15;i++) {
			arrayInt[i] = i;
		}
	}
	
	public void printEven() {
		DataStructureIterator iterator = new IterateEven();
		while(iterator.hasNext()) {
			System.out.println("Even number "+iterator.next());
		}
		
	}
	
	interface DataStructureIterator extends java.util.Iterator<Integer>{}
	private class IterateEven implements DataStructureIterator{
		private int index = 0;
 		@Override
		public boolean hasNext() {
			return (index <= SIZE-1);
		}

		@Override
		public Integer next() {
			Integer retVal = Integer.valueOf(arrayInt[index]);
			index +=2;
			return retVal;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataStrucutre dt = new DataStrucutre();
		dt.printEven();
		

	}

}
