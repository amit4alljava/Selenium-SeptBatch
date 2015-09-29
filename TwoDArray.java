
public class TwoDArray {

	public static void main(String[] args) {
		int x[]=new int[3];
		//int w[][]= new int[3][4];
		int w[][]= new int[3][];
		w[0] = new int[3];
		w[1]= new int [10];
		w[2]= new int [20];
		for(int i = 0 ; i<w.length; i++){
			for(int j = 0 ; j<w[i].length; j++){
				System.out.println(w[i][j]);
			}
		}
		
		for(int i[] : w){
			for(int j : i){
				System.out.println(j);
			}
		}

	}

}
