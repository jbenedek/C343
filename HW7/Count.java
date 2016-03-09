import java.util.*;

public class Count{

  int[] array;
  int[] sorted; 
  public static void main(String[] args){
	Count c = new Count();
	c.array = new int[] {0,2,4,3,2,1};
	System.out.print("Before being sorted: ");
	System.out.println(Arrays.toString(c.array));
	System.out.print("After being sorted: ");
	c.countSort();
//	System.out.println(c.getMaxNumb());
	System.out.println(Arrays.toString(c.sorted));
  }

  public void countSort(){
	int m = getMaxNumb();
	int[] c = new int[m+1];
	for(int i = 0; i< array.length ; i++){
		c[array[i]] = c[array[i]] + 1;//	c[array[i]]++;
	}
//	System.out.println(Arrays.toString(c));
	for(int i = 1; i< m; i++){
		c[i] += c[i-1];
	
	}
	sorted = new int [array.length];
	for(int i= array.length-1; i >=0; i--){
		sorted[c[array[1]] -1 ] = array[i];
		c[array[i]] = c[array[i]] -1;	
//	  sorted[--c[array[i]]] = array[i];
	}
  }

  public int getMaxNumb(){
	int max = array[0];
	for(int i = 1; i<array.length; i++){
		if(array[i]>max){
			max = array[i];
		}
	}
	return max;
  }

}
