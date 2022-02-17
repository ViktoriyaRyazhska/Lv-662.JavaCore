package hw11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


	public class Hw4 {
	    public static void main(String[] args) {
	        String MyText = "src/hw11/text1.txt";
	        BufferedReader br = null;
	        int ArrCount = 0;
	        String LongLine= "";
	        String MyInform = "Александра 09.04.04 ";
	        try{
	            br = new BufferedReader((new FileReader(MyText)));
	            String s;
	            for (int i = 0 ;(s = br.readLine())!= null;i++ ){
	            	ArrCount ++ ;
	            }
	            String []arr = new String[ArrCount];
	            br = new BufferedReader((new FileReader(MyText)));
	            for (int i = 0 ; i<arr.length ; i++){
	             arr[i] = br.readLine();
	             LongLine = (LongLine.length() < arr[i].length())?arr[i] :LongLine;
	            }
	            br.close();
	        }catch (FileNotFoundException e){
	            System.err.println(e.getMessage());
	        }catch (IOException e){
	            System.err.println(e.getMessage());
	        }
	        String fileN = "src/hw11/text2.txt";
	        FileWriter fw = null;
	        BufferedWriter bw = null;
	       
	       try{
	           fw = new FileWriter(fileN);
	           bw = new BufferedWriter(fw);
	           bw.write("Колличество строк: "+ArrCount);
	           bw.write("\n"+LongLine);
	           bw.write("\n"+MyInform);
	           bw.close();
	       }catch (Exception e){
	           System.err.println(e.getMessage());
	       }

	    }
}
