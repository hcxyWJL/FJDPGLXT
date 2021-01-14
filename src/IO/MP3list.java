package IO;

import java.io.*;

public class MP3list {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("F:\\mp3list.txt");
        File file = new File("F:\\");
        File files[]=file.listFiles();
        for (File f:files)
        {
            if (f.getName().endsWith(".mp3"))
            {
                fw.write(f.getName());
                fw.write(13);
                fw.write(10);
            }
        }
        fw.close();
        byte b[]=new byte[1024];
        FileOutputStream fos=new FileOutputStream("F:\\c.mp3");
        FileReader f=new FileReader("F:\\mp3list.txt");
        BufferedReader bfr=new BufferedReader(f);
        String mp3Name="";
        while ((mp3Name=bfr.readLine())!=null)
        {
            FileInputStream fis=new FileInputStream("F:\\"+mp3Name);
            int a=0;
            while((a=fis.read(b))!=-1){
                fos.write(b,0,a);
            }
        }
        fos.close();
    }
}
