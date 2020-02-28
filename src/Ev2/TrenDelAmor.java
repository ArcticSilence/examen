package Ev2;

import java.util.Scanner;

public class TrenDelAmor {
	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		
		int parejas=0;
		int h=0;
		int m=0;
		
		String vagon="H.M..ass...M@M-...--,,H";
		
		for(int i=0; i<vagon.length(); i++){
			if(vagon.charAt(i)=='@'){
				h=0;
				m=0;
			}else if(vagon.charAt(i)=='H'){
				h++;
			}
			else if(vagon.charAt(i)=='M'){
				m++;
			}
			
			if(h==m && h!=0 && m!=0){
				parejas++;
				h--;
				m--;
			}
		}
		
		System.out.println(parejas);
	}
}
