package Chris.Chapter14.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class HW14_10_2_1 {

	public static void main(String[] args) throws IOException {
		String str;
		int[] arr = new int[1000];

		FileWriter fw2 = new FileWriter("c:\\test\\rand2.txt");
		FileReader fr = new FileReader("c:\\test\\rand.txt");

		BufferedWriter bfw2 = new BufferedWriter(fw2);
		BufferedReader bfr = new BufferedReader(fr);
		int i = 0;

		while ((str = bfr.readLine()) != null) {

			arr[i] = Integer.parseInt(str);
			i++;

		}

		sort(arr);
		for (i = 0; i < 1000; i++) {
			bfw2.write(Integer.toString(arr[i]));
			bfw2.newLine();
		}
		bfw2.flush();
		bfr.close();
		bfw2.close();
	}

	public static void sort(int a[]) {
		int i, j, temp = 0;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}