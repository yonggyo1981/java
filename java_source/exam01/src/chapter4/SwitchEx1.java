package chapter4;

public class SwitchEx1 {
	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		/*
		if (rank == 1) {
			medalColor = 'G';
		} else if (rank == 2) {
			medalColor = 'S';
		} else if (rank == 3) {
			medalColor = 'B';
		} else {
			medalColor = 'A';
		}
		*/
		switch(rank) {
			case 1 :  
			case 2 : 
				medalColor = 'S';
				break;
			case 3 : 
				medalColor = 'B';
				break;
			default :
				medalColor = 'A';
		}
		
		System.out.println("�޴� ������ ? " + medalColor);
	}
}
