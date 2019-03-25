package Day06_03_25.Controller;


import Day06_03_25.Model.Books;
import Day06_03_25.Model.SaleRecord;
import Day06_03_25.Model.Store;
import Day06_03_25.View.ConsoleVies;


import java.util.ArrayList;
import java.util.List;


public class BookSellingSystem {
    static List<Books> list = new ArrayList<>();
    static List<SaleRecord> listSale = new ArrayList<>();
    static Store store = new Store();
    int choice;
    public BookSellingSystem(){
        while (true){
            ConsoleVies.showMenu();
            choice = Tools.isNum(choice);
            if (choice == 0) break;
                switch (choice){
                    case 1:
                        BookControl.BookAdd(list);
                        break;
                    case 2:
                        Repertory.SellBook(list,listSale,store);
                        break;
                    case 3:
                        Repertory.ShowRepertory(list);
                        break;
                    case 4:
                        Repertory.ShowSomeRepertory(list,listSale);
                        break;
                    case 5:
                        RecordControl.showSaleRecord(listSale);
                        break;
                    case 6:
                        BookControl.UpData(list);
                        break;
                    case 7:
                        BookControl.Remove(list);
                        break;
                    case 8:
                        break;
                }
            }

    }

}

