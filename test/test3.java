package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
	public static void main(String str[])throws IOException {
		System.out.println("請輸入數字:");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		int x = 4;
		for(int i = 0;i <= 9;i++) {
			if(num==i) continue;
			//System.out.println("輸出"+i);
			int z = (i==x)?10:5;
			System.out.println(z);
		}
	}
}
