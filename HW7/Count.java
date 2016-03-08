import java.util.*;

public class Count{

  int[] array; 
  public static void main(String[] args){
	Count c = new Count();
	c.array = new int[] {0,2,4,3,2,1};
	System.out.print("Before being sorted: ");
	System.out.println(Arrays.toString(c.array));
	System.out.print("After being sorted: ");
	c.countSort();
	System.out.println(Arrays.toString(c.array));
  }

  public void countSort(){
	int m = getMaxNumb();
	int[] c = new int[m];
  }

}
