package codeSignal;

import java.util.ArrayList;
import java.util.Collections;

public class Lucky {
		
		boolean isLucky(int n) {
		    int temp = n;
		    ArrayList<Integer> arr = new ArrayList<Integer>();
		    do{
		        arr.add(temp % 10);
		        temp /= 10;
		    } while  (temp > 0);
		    Collections.reverse(arr);
		    int sum1 = 0, sum2 = 0;
		    for(int i = 0, j = arr.size() - 1; i < arr.size() / 2; i++, j--){
		        sum1 += arr.get(i);
		        sum2 += arr.get(j);
		    }
		    if(sum1 == sum2){
		        return true;
		    }else{
		        return false;
		    }
		}
		
		
		
		/*int[] numArr = new int[String.valueOf(number).length()];
		
		int sum = 0;
		int sum1 = 0;
		
		
		for (int i = 0, j=numArr.length -1;  i < numArr.length / 2; i++,j--) {
			
				sum  += numArr[i];
				sum1 += numArr[j];
		}
			if (sum == sum1) {
				return true ;
			} else {
		return false;
	}
	}*/
	public static void main(String[] args) {

		Lucky luck = new Lucky();
		System.out.println(luck.isLucky(344556678));

	}

}
