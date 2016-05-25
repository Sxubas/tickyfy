import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String leido="test";
		while(leido!=null){
				leido=in.nextLine();
		String[] spliteado=leido.split("<");
		if(leido.contains("&amp;")){
			leido.replace("&amp;", "&");
		}
		System.out.println(spliteado[0]);
		
	}
}
}


//SPLITEAR PALABRAS
//	String[] spliteado=leido.split(" ");
//	System.out.println(spliteado[0] + " es la primera palabra");
//	System.out.println(spliteado[1] + " es la segunda palabra");
//	for(int i=2;i<spliteado.length;i++){
//		System.out.print(spliteado[i]);
//	}	
//}


//VERIFICAR ANAGRAMAS
//	char[] caractereLeido=leido.toCharArray();
//	boolean anagrama=true;
//	for(int i=0, j=caractereLeido.length-1; i<caractereLeido.length && anagrama && j>=0;i++, j--){
//		if(caractereLeido[i]!=caractereLeido[j]){
//			anagrama=false;
//		}
//	}
//	if(anagrama){
//		System.out.println(leido + " sí es un anagrama");
//	}
//	else{
//		System.out.println(leido + " no es un anagrama");
//	}
//}