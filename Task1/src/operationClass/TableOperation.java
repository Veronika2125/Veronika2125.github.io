/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operationClass;
import java.util.List;
import type.Table;
/**
 *
 * @author Вероника
 */
public interface TableOperation {
    List<Table> getListOfDogovor();
    List<Table> addNewDogovor(Table item);
    List<Table> DelDogovor(int n);
    int getNumber(String s);
}
