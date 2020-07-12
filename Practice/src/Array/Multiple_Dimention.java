package Array;

public class Multiple_Dimention {
public static void main(String[] args) {
	int [][] sandy= {{1,2,3},{3,2,1},{2,3,4}};
	for (int i = 0; i < sandy.length; i++) {
		for (int j = 0; j < sandy.length; j++) {
			if (sandy[i][j]>3) {
				continue;
			}
			System.out.print(sandy[i][j]+" ");
		}
		System.out.println(" ");
		
	}
}
}