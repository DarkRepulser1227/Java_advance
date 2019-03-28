package Day07_03_28.Demo;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        //路径分号
        System.out.println(File.pathSeparator);
        //路径/
        System.out.println(File.separator);
        //创建path对象并赋予路径(并未创建文件)
        File path = new File("d:"+File.separator+"abc"+File.separator+"ttt");
        //调用path的toString方法,返回路径名
        System.out.println(path);
        //path对象是否存在
        System.out.println(path.exists());
        if(!path.exists()){
            //创建path被赋予的路径
            path.mkdirs();
        }
        //创建file对象并赋予文件属性 如果不写.txt为错误文件
        File file = new File(path,"num");
        if (!file.exists()){
            try {
                //文件创建
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //是否是路径
        System.out.println(path.isDirectory());
        //是否是文件
        System.out.println(path.isFile());
        //path路径下创建子文件夹
        File test = new File(path,"test");
        test.mkdirs();


        File path1 = new File("files");
        System.out.println(path1.exists());
        File fileIn = new File(path1,"image.png");
        File fileOut = new File(path1,"copy.png");
        if(!fileIn.exists()){
            System.out.println("文件不存在");
            return;
        }

        try {
            //输入流必须确保文件存在,如果文件不存在,不会自动创建,直接异常
            FileInputStream fis = new FileInputStream(fileIn);
            //输出流会自动创建不存在的文件
            FileOutputStream fos = new FileOutputStream(fileOut);
            int t;
            byte[] buffer = new byte[2048];
            while((t = fis.read(buffer))!=-1){
                System.out.println(t);
                fos.write(buffer,0,t);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
