package Day06_03_25.Controller;

import Day06_03_25.Model.Books;
import Day06_03_25.Model.SaleRecord;
import Day06_03_25.Model.Store;
import Day06_03_25.View.ConsoleVies;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Repertory {
    static void SellBook(List<Books> list,List<SaleRecord> saleRecords, Store store){
        while (true){
            ConsoleVies.sonsoleOut("请输入图书信息或图书编号.");
            while (true){
                String str = ConsoleVies.consoleIn();
                Books books = BookControl.searchBook(list,str);
                ConsoleVies.sonsoleOut("请输入售出数量");
                int num = Integer.parseInt(ConsoleVies.consoleIn());
                if (books == null){
                    Tools.Continue();
                    break;
                }else if(books.getBookQuantity() - num < 0){
                    ConsoleVies.sonsoleOut("无足够库存,请进货.");
                    Tools.Continue();
                    break;
                }else {

                    books.setBookQuantity(books.getBookQuantity() - num);
                    store.setAsset(store.getAsset() + (books.getBookPrice() * num));

                    SaleRecord saleRecord = new SaleRecord();
                    saleRecord.setId(books.getBookId());
                    saleRecord.setNum(num);
                    saleRecord.setDate(new Date());
                    saleRecords.add(saleRecord);

                    ConsoleVies.sonsoleOut("已卖出" + num + "本,现在总资产为:" + store.getAsset());
                    Tools.Continue();
                    break;
                }

            }
            break;
        }
    }
    static public void ShowRepertory(List<Books> list){
        for (Books books:
             list) {
            ConsoleVies.sonsoleOut("书名:" + books.getBookName() + "\t\t书号:" + books.getBookId() + "\t\t库存余量" + books.getBookQuantity());
        }
        Tools.Continue();
    }
    static public void ShowSomeRepertory(List<Books> list,List<SaleRecord> saleRecords){
        ConsoleVies.sonsoleOut("请输入书名或ID");
        String str = ConsoleVies.consoleIn();
        for (Books books:list
             ) {
            if(books.getBookName().equals(str) || books.getBookId().equals(str)) {
                ConsoleVies.sonsoleOut("书名为:" + books.getBookName() + "\t\t书号为:" + books.getBookId() + "\t\t库存为" + books.getBookQuantity());
                for (SaleRecord saleRecord:saleRecords
                     ) {
                    if(books.getBookId().equals(saleRecord.getId())){
                        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss:sss");
                        String D = sdf.format(saleRecord.getDate());
                        ConsoleVies.sonsoleOut("销售情况为:" + saleRecord.getNum() + "本" + "时间为" + D );
                    }
                }
            }
        }
        Tools.Continue();
    }
}
