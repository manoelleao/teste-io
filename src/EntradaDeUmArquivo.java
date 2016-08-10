import java.io.*;
import java.util.*;

public class EntradaDeUmArquivo {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is = new/*System.in*/FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		System.out.println("Digite sua mensagem:");
		
		while (entrada.hasNextLine()) {
			
		System.out.println(entrada.nextLine());
	}
		
		
		
		/*OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner entrada1 = new Scanner((Readable) osw);
		
		while (entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			bw.write(linha);
			bw.newLine();
			
			bw.close();
			
		entrada.close();
		}os.close();
		osw.close();*/
		}
		}