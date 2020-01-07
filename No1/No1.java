import java.util.Scanner;

public class No1{
	public static void print(Object obj){
			System.out.println(obj);
		}
	public static void main(String[] args){
		for(int b = 1; b <= 100; b++){
			print(b + "kg = "+(b * 2)+ "pon");
		}
	}
}