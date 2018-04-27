package Chris.Chapter14.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import jdk.nashorn.internal.runtime.arrays.ArrayData;

public class HW14_10_1 {

	public static void main(String[] args) throws IOException  {
	String str;
int[]	arr =new int[1000];
	
		BufferedReader bfr=new BufferedReader(new FileReader("c:\\test\\rand.txt"));
		int i=0;int max=0;int min=99999;long sum=0;
		while((str=bfr.readLine())!=null ) {
		
		
		sum+=arr[i]=Integer.parseInt(str);
		
		if(max<arr[i])
			max=arr[i];
		
		if(min>arr[i])
			min=arr[i];
		i++;
		}
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);
		System.out.println("AVG="+sum/1000);
		bfr.close();
	}

}
