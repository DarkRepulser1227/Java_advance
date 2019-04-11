package Day07_03_28.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //字符流的使用
        File path = new File("files");
        File file = new File(path, "text.txt");
        if (!path.exists()) {
            path.mkdirs();
        }

//        try {
//            FileWriter fw = new FileWriter(file,true);
//            System.out.println("please input a string:");
//            String  str = sc.next();
//            fw.write(str);
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("文件中的数据");
//        try {
//            FileReader fr = new FileReader(file);
//            int t;
//            StringBuffer buffer = new StringBuffer();
//
//            while((t = fr.read()) != -1){
//                buffer.append((char)(t));
//
//            }
//            System.out.println(buffer.toString());
//            fr.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //


        //使用缓冲流 bufferedReader和BufferedWriter
//        try {
//            FileWriter fw = new FileWriter(file,true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            String str= sc.next();
//            bw.write(str+"\n");
//            //缓冲流必须加上flush和close
//
//            bw.flush();
//            fw.close();
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("---------------");
//        try {
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String str;
//            while ((str = br.readLine())!=null){
//                System.out.println(str);
//            }
//            fr.close();
//            br.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //RandomAceessFile
        File file1 = new File(path,"text1.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file1,"rw");
//            raf.writeUTF("今天天气不错");
//            raf.seek(0);
//            String t = raf.readUTF();
//            System.out.println(t);
            int[] a = new int[]{1,2,3,4,5};
            for(int t :a ){
                raf.writeInt(t);
            }
            for(int i=a.length-1;i>=0;i--){
                raf.seek(i*4);
                System.out.println(raf.readInt());
            }
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
