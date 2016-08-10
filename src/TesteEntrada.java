import java.io.*;

public class TesteEntrada {
	
	
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
					new FileInputStream("arquivo.txt")));
					String linha = br.readLine();
		
		while (linha != null) {
		System.out.println(linha);
		 linha = br.readLine();
		}
		br.close();
		}
		 

}
