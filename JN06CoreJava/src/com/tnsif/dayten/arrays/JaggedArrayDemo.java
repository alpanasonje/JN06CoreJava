package com.tnsif.dayten.arrays;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		int m[][]= {{12},{12,34,56,77},{45,78},{2}};
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
				System.out.print(m[i][j]+"\t");
			System.out.println();
		}

	}

}
