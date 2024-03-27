package com.tnsif.dayseventeen;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T>{
	T arr[];
	
	public MinMaxImpl(T arr[])
	{
		this.arr=arr;
	}
	
	@Override
	public T getMin() {
		T min;
		min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if (min.compareTo(arr[i])>0)
				min=arr[i];
		}
			
		return min;
	}

	@Override
	public T getMax() {
		T max;
		max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if (max.compareTo(arr[i])<0)
				max=arr[i];
		}
			
		return max;
	}

	
}
