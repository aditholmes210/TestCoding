public class No2{
	public static void print(Object obj){
			System.out.println(obj);
		}
	public static void main(String[] args){
		for(int i=1; i<=100; i++){
			String num;
			if(i%2 == 0 && i%3 == 0){
				num = "INDONESIA";
			}
			else if(i%2 == 1){
				num = "Ganjil";
			}
			else{
				num = String.valueOf(i);
			}
			print(num);
		}	
	}
}