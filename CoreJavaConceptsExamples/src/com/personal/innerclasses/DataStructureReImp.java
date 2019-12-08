package com.personal.innerclasses;

import java.util.Iterator;

public class DataStructureReImp {
	
	//interface DataStrctureIterator extends java.util.Iterator<Integer>{}
	private static final Integer SIZE =15;
	private int[] arrayInt = new int[SIZE];
	
	private class IterateEven implements Iterator<Integer>{
		
		int index =0;

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
	
	public DataStructureReImp() {
		for(int i=0;i<SIZE;i++) {
			arrayInt[i] = i;
		}
	}
	
	public void printEven() {
		Iterator<Integer> itr = new IterateEven();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}


	public static void main(String[] args) {
		DataStructureReImp reImp =new DataStructureReImp();
		reImp.printEven();
	}

}
