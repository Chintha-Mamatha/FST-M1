package Activities;

import java.util.Arrays;

public class Activity4 {

	
    static void descendingSort(int array[]) {
   int size = array.length, i;
		        
  for (i = 1; i < size; ++i) {
int key = array[i];
int j = i - 1;
		            
  while (j >= 0 && key < array[j]) {
 array[j + 1] = array[j];
  --j;
		            }
  array[j + 1] = key;
		        }
		    }
		    
 public static void main(String args[]) {
 int[] data = { 107, 5765, 1, 249, 3 };
		        descendingSort(data);
		        System.out.println("Sorted Array in Descending Order: ");
		        System.out.println(Arrays.toString(data));
		    }
		}