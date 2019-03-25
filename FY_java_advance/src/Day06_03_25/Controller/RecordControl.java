package Day06_03_25.Controller;



import Day06_03_25.Model.SaleRecord;
import Day06_03_25.View.ConsoleVies;

import java.util.List;

public class RecordControl {
    static public void showSaleRecord(List<SaleRecord> list) {
        for (int i = 0; i < list.size(); i++) {
            ConsoleVies.sonsoleOut(list.get(i).toString());
        }
    }
}
