package EuclideanAlgorithm;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Yakup Zengin - yakup [at] designsrich [dot] com
 * http://www.designsrich.com
 * @version 0.0.1
 */

public class EuclideanAlgorithm implements Serializable{
    
    public static void main(String[] args) {
        
	Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Sayıyı gir : ");
        int a = sc.nextInt();
        System.out.println("2. Sayıyı gir : ");
        int b = sc.nextInt();      
        System.out.println("En Büyük Ortak Bölen " +enBuyukOrtakBolenRekursif(a,b));
                       
        }
        public static int enBuyukOrtakBolenIteratif(int sayi1, int sayi2){
		
		while( sayi2 != 0 ){
			int temp = sayi2;
			sayi2 = sayi1 % sayi2;
			sayi1 = temp;
		}
		return sayi1;
	}
        
	public static int enBuyukOrtakBolenRekursif(int sayi1, int sayi2){
		
		if( sayi2 == 0 ) return sayi1;
		
		return enBuyukOrtakBolenRekursif(sayi2, sayi1 % sayi2);	
	}	
    
}
