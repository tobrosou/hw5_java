package test;

import java.io.BufferedReader;		
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class test1{
	public static void main(String str[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入3個人分數");
		Integer test[] = new Integer[3];
		
		for(int i = 0;i < test.length;i++) {
			String str1 = br.readLine();
			test[i] = Integer.parseInt(str1);
		}
		
		/*for(int i = 0;i < test.length ;i++) {
			for(int z =0;z < test.length-1 ;z++) {
				if(test[z+1]>test[z]) {
					int num = test[z];
					test[z] = test[z+1];
					test[z+1] = num;
				}
			}
		}*/
		
		Arrays.sort(test,Collections.reverseOrder());
		
		for(int i = 0 ;i < test.length ;i++) {
			System.out.println("依次往下排名"+test[i]);
		}
	}
}
