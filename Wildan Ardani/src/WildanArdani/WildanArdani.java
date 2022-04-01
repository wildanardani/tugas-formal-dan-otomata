package WildanArdani;
import java.util.Scanner;

public class WildanArdani {
     static Scanner input = new Scanner (System.in);
     String kata;
   
    public static void main(String[] args) {
        String b;
        WildanArdani c = new WildanArdani();
        
         System.out.println(" Stemmer Kata Sederhana ");
         System.out.println("---------------------------");
         System.out.println("---Klik Enter Untuk Menjalankan Program Stemming---");
         System.out.print("Masukkan Kata :");
         b = input.nextLine();
         
         b = c.hapuspartikel(b);
         b = c.hapuspp(b);
         b = c.hapusawalan1(b);
         b = c.hapusawalan2(b);
         b = c.hapusakhiran(b);
         
         System.out.println("---------------------------");
         System.out.println("Hasil Stemming: "+b);
         
    }
    
    public int panjangkata(String kata){
        int n = kata.length();
        return n;
    }
    public String hapuspartikel(String kata){
        kata = kata.toLowerCase();
	if("kah".equals(kata.substring(panjangkata(kata)-3)) ||"lah".equals(kata.substring(panjangkata(kata)-3)) ||"pun".equals(kata.substring(panjangkata(kata)-3)) ){
	kata = kata.substring(0,panjangkata(kata)-3);		
	}
	return kata; 
    }
    
    public String hapuspp(String kata){
        kata = kata.toLowerCase();
        
        
        if("ku".equals(kata.substring(panjangkata(kata)-2)) || "mu".equals(kata.substring(panjangkata(kata)-2))){
            kata = kata.substring(0, panjangkata(kata)-2);
        }else if("nya".equals(kata.substring(panjangkata(kata)-3))){
            kata = kata.substring(0, panjangkata(kata)-3);
        }
        return kata;
    }
    
    public String hapusawalan1(String kata){
        kata = kata.toLowerCase();
        if("meng".equals(kata.substring(0,4)) ){
            kata = kata.substring(4);
			if("e".equals(kata.substring(0,1))||"u".equals(kata.substring(0,1))||"i".equals(kata.substring(0,1))){
				kata = "k"+kata.substring(0, panjangkata(kata));
			}else{
				kata = kata;
			}
		}
		else if("meny".equals(kata.substring(0,4))){
			kata = "s"+kata.substring(4);
		}
		else if("men".equals(kata.substring(0,3))){
			kata = "t"+kata.substring(3);
		}
		else if("mem".equals(kata.substring(0,3))){
                    kata = kata.substring(3);
                    if("a".equals(kata.substring(0,1)) || "i".equals(kata.substring(0,1)) || "e".equals(kata.substring(0,1)) || "u".equals(kata.substring(0,1)) || "o".equals(kata.substring(0,1))){
			kata = "p"+kata.substring(0, panjangkata(kata));
			}
                    else{
			kata = kata;
                    }
		}
		else if("me".equals(kata.substring(0,2))){
			kata = kata.substring(3);
		}
		else if("peng".equals(kata.substring(0,4))){
                        kata = kata.substring(4);
			if("e".equals(kata.substring(0,1)) || "a".equals(kata.substring(0,1))){
				kata = "k"+kata.substring(0, panjangkata(kata));;
			}else{
				kata = kata;
			}
		}
		else if("peny".equals(kata.substring(0,4))){
			kata = "s"+kata.substring(4);
		}
		else if("pen".equals(kata.substring(0,3))){
			if("a".equals(kata.substring(3,1)) || "i".equals(kata.substring(3,1)) || "e".equals(kata.substring(3,1)) || "u".equals(kata.substring(3,1)) || "o".equals(kata.substring(3,1))){
				kata = "t"+kata.substring(3);
			}else{
				kata = kata.substring(3);
			}
		}
		else if("pem".equals(kata.substring(0,3))){
                    kata = kata.substring(3);
			if("a".equals(kata.substring(0,1)) || "i".equals(kata.substring(0,1)) ||"e".equals(kata.substring(0,1)) || "u".equals(kata.substring(0,1)) || "o".equals(kata.substring(0,1))){
				kata = "p"+kata.substring(0, panjangkata(kata));;
			}else{
				kata = kata;
			}
		}
		else if("di".equals(kata.substring(0,2))){
			kata = kata.substring(2);
		}
		else if("ter".equals(kata.substring(0,3))){
			kata = kata.substring(3);
		}
		else if("ke".equals(kata.substring(0,2))){
			kata = kata.substring(2);
		}
		return kata;
    }
    
    public String hapusawalan2(String kata){
		kata = kata.toLowerCase();
		if("ber".equals(kata.substring(0,3))){
			kata = kata.substring(3);
		}else if("bel".equals(kata.substring(0,3))){
			kata = kata.substring(3);
		}else if("be".equals(kata.substring(0,2))){
			kata = kata.substring(2);
		}else if("per".equals(kata.substring(0,3)) && panjangkata(kata) > 5){
			kata = kata.substring(3);
		}else if("pe".equals(kata.substring(0,2))  && panjangkata(kata) > 5){
			kata = kata.substring(2);
		}else if("pel".equals(kata.substring(0,3))  && panjangkata(kata) > 5){
			kata = kata.substring(3);
		}else if("se".equals(kata.substring(0,2))  && panjangkata(kata) > 5){
			kata = kata.substring(2);
		}
		return kata;
	}
	public String hapusakhiran(String kata){
		kata = kata.toLowerCase();
//                kata = kata.substring(0,panjangkata(kata)-3);
                
		if ("kan".equals(kata.substring(panjangkata(kata)-3)) ){
			kata = kata.substring(0,panjangkata(kata)-3);
		}
		else if("i".equals(kata.substring(panjangkata(kata)-1)) ){
			kata = kata.substring(0,panjangkata(kata)-1);
		}else if("an".equals(kata.substring(panjangkata(kata)-2))){
			kata = kata.substring(0,panjangkata(kata)-2);
		}
		return kata;
	}   
}
