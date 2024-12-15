package test;

public class test2 {
	public static void main(String str[]) {
		int test[][] = {{20,40,30,40,50},{50,70,20,40,70}};
		
		for(int i = 0;i <= 1;i++) {
			for(int z = 0;z < test[0].length;z++) {
				System.out.println("分數"+test[i][z]);
			}
		}
		int test2[]= {50,40,30};
		System.out.println(test2[2]);
	}
}
