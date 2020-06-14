/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.Table;

public class TableOperationImpl implements TableOperation{
    static List<Table> lstTable = new ArrayList<Table>();
    static {
        lstTable.add(new Table( "ул. Радужная, д. 15", "Ремонт крыши",  "По площади", 5.0, "Строители", "Председатель", 30000.0));
    }
    @Override
    public List<Table> getListOfDogovor(){
        return lstTable;
    }
    
     @Override
    public List<Table> addNewDogovor(Table item){
        lstTable.add(item);
        return lstTable;
    }
    
     @Override
    public List<Table> DelDogovor(int n){
        lstTable.remove(n);
        return lstTable;
    }
     @Override
    public int getNumber(String s){
        int t=0;
        for(int i=0; i<lstTable.size(); i++)
        {
            if(lstTable.get(i).getName().equals(s)) t++;
        }
        return t;
    }
}
