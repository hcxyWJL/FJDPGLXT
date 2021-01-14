package IO;

import java.io.*;

public class Rea {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("F:\\Reader.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            FileWriter fileWriter=new FileWriter("F:\\Writer.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String str=null;
            str=bufferedReader.readLine();
            while (str!=null)
            {
                bufferedWriter.write(str);
                System.out.println(str);
                bufferedWriter.newLine();
                str=bufferedReader.readLine();
            }
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
