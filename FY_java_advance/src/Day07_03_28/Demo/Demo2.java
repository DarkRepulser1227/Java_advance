package Day07_03_28.Demo;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) {
        File path = new File("files");
        File fileIn = new File(path,"notepad.txt");
        // File fileOut = new File(path,"copy.txt");

        try {
            FileInputStream fin = new FileInputStream(fileIn);
//            FileOutputStream fout = new FileOutputStream(fileOut);
//            byte[] buffer = new byte[1024];
//            int t;
//            while((t = fin.read(buffer))!=-1){
//                fout.write(buffer,0,t);
//            }t
            // fin.close();
            // fout.close();
            InputStreamReader isr = new InputStreamReader(fin,"UTF8");
            BufferedReader br = new BufferedReader(isr);
            String str;
            // System.out.println(fileIn.length());
            //  System.out.println(br.readLine());
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
            fin.close();
            isr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
