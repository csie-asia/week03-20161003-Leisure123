package hw;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw04_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入n值:");
		int n = scn.nextInt();
		int x = n;
		int sum = 1;
		while(n > 0){
			sum = sum * n;
			n --;
		}
		System.out.println(x  + "! = " + sum);

	}

}
