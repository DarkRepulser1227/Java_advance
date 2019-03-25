package Day06_03_25.Controller;


import Day01_03_15.Day01_03_15_1.pojo.Book;
import Day06_03_25.Model.Books;
import Day06_03_25.View.ConsoleVies;

import java.text.SimpleDateFormat;
import java.util.List;



public class BookControl {
    static public void BookAdd(List<Books> list){
        ConsoleVies.sonsoleOut("请输入需要添加的新图书的书名,书号,数量与价格,中间以回车分隔.");
        Books books = new Books();
        ConsoleVies.sonsoleOut("请输入书名:");
        while (true){
            books.setBookName(ConsoleVies.consoleIn());
            if(books.getBookName() != null){
                break;
            }
            ConsoleVies.sonsoleOut("请重新输入");
        }
        while (true){
            canSetBookId(list,books);
            if(books.getBookId() != null){
                break;
            }
            ConsoleVies.sonsoleOut("请重新输入");
        }
        canSetQuantity(books);
        cansetBookPrice(books);



        books.setAddTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        ConsoleVies.sonsoleOut(books.toString());
        list.add(books);
        Tools.Continue();

    }
    static public void canSetBookId(List<Books> list,Books books){
        /**
         * 成功的添加ID,不成功则反复执行.
         */
        while (true){
            ConsoleVies.sonsoleOut("请输入ID");
            String str=ConsoleVies.consoleIn();
            if (isCanAddBookById(list,str) == true){
                books.setBookId(str);
                break;
            }else{
                ConsoleVies.sonsoleOut("根据ID确定已经存在书号为"+str+"的书,是否修改此书的库存数量? Y/N");
                String flag = ConsoleVies.consoleIn();
                if("Y".equals(flag)){
                    ConsoleVies.sonsoleOut("请输入修改的数量:");
                    String quantity = ConsoleVies.consoleIn();
                    if(Tools.isPositiveIntNum(quantity)){
                        books.setBookQuantity(Integer.parseInt(quantity));
                        break;
                    }else {
                        ConsoleVies.sonsoleOut("请输入正确数量");
                    }

                }else if("N".equals(flag)){
                    break;
                }else {
                    ConsoleVies.sonsoleOut("请重新输入正确数据");
                }
            }
        }
    }
    static public void canSetQuantity(Books books){
        while (true){
            ConsoleVies.sonsoleOut("请输入数量:");
            String str=ConsoleVies.consoleIn();
            if (Tools.isPositiveIntNum(str)){
                if(Integer.parseInt(str) >= 0){
                    books.setBookQuantity(Integer.parseInt(str));
                    break;
                }
            }else {
                ConsoleVies.sonsoleOut("请输入正确的数量");
            }
        }
    }
    static public void cansetBookPrice(Books books){
        while (true){
            ConsoleVies.sonsoleOut("请输入价格:");
            String str=ConsoleVies.consoleIn();
            if (Tools.isDouble(str)){
                books.setBookPrice(Double.parseDouble(str));
                break;
            }else {
                ConsoleVies.sonsoleOut("请输入正确的价格");
            }
        }
    }
    static public boolean isCanAddBookById(List<Books> list,String str){
        for (Books books:list
             ) {
            if (books.getBookId().equals(str)) return false;
        }
        return true;
    }

    static public Books searchBook(List<Books> list,String str){
        for (Books books : list){
            if (books.getBookName().equals(str) || books.getBookId().equals(str)) return books;
        }
        ConsoleVies.sonsoleOut("无法找到此书,请检查是否正确输入,如正确,则库存无此书.");
        Tools.Continue();
        return null;
    }
    static public void UpData(List<Books> list){
        ConsoleVies.sonsoleOut("请输入需要修改的图书名称或ID");
        String str = ConsoleVies.consoleIn();
        ConsoleVies.sonsoleOut(searchBook(list,str).toString());
        ConsoleVies.sonsoleOut("请修改名称:");
        searchBook(list,str).setBookName(ConsoleVies.consoleIn());
        ConsoleVies.sonsoleOut("请修改数量:");
        searchBook(list,str).setBookQuantity(Integer.parseInt(ConsoleVies.consoleIn()));
        ConsoleVies.sonsoleOut("请修改价格:");
        searchBook(list,str).setBookPrice(Integer.parseInt(ConsoleVies.consoleIn()));
        ConsoleVies.sonsoleOut("修改后为\n" + searchBook(list,str).toString());
    }
    static public void Remove(List<Books> list){
        ConsoleVies.sonsoleOut("请输入需要修改的图书ID");
        String str = ConsoleVies.consoleIn();
        ConsoleVies.sonsoleOut(searchBook(list,str).toString());
        list.remove(searchBook(list,str));
    }
}
