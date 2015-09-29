import java.util.ArrayList;


public class Looping {

	public static void main(String[] args) {
		int j = 1;
		while(j<=10){
			System.out.println(j);
			if(j>5){
				j= j +2;
			}
			else{
			j++;
			}
		}
		int k = 1;
		for(;k<=10;){
			System.out.println(k);
			k++;
		}
		for(int i = 1 ; i<=10; i++){
			if(i==5){
				//break; // to exit from a loop
				continue;  // skip the current loop
			}
			System.out.println(i);
		}
		int t =11;
		do
		{
			System.out.println("This Loop Will Run Once");
		}while(t<10);
		
		//Java 5
		// Enhance For Loop (For Array Traverse)
		int x[] = {10,20,30,40,50,88,77,66};
		int e = 10;
		/*for(int p = 0; p<x.length; p++){
			System.out.println(x[p]);
		}*/
		for(int i : x){
			System.out.println(i);
		}
		
		// Java 8 
		int w[] = {10,20,30};
		ArrayList<Integer> l =new ArrayList<>(); // 1.4
		l.add(100);
		l.add(5);
		l.add(300);
		l.add(7);
		l.add(9);
		l.add(8);
		l.add(1,777);
		System.out.println(l);
		/*for(int i = 0; i<l.size(); i++){
			System.out.println(l.get(i));
		}*/
		for(int i : l){
			if(i%2==0){
			System.out.println("Even "+i);
			}
			else{
				System.out.println("Odd "+i);
			}
			
		}
		// Java 8
		l.forEach((i)->{
			if(i%2==0)
				System.out.println("Even "+i);
			else
				System.out.println("Odd "+i);
		});
	}

}
