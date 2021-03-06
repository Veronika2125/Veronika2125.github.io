/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operationClass;
import java.util.List;
import java.util.ArrayList;
import type.Table;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Вероника
 */
public class TableOperationImpl extends UnicastRemoteObject implements TableOperation{
    
    static List<Table> lstTable = new ArrayList<Table>();
    static {
        lstTable.add(new Table( "ул. Радужная, д. 15", "Ремонт крыши",  "По площади", 5.0, "Строители", "Председатель", 30000.0));
    }
    public TableOperationImpl() throws RemoteException{
   }
    @Override
    public List<Table> getListOfDogovor() throws RemoteException{
        return lstTable;
    }
    
     @Override
    public List<Table> addNewDogovor(Table item) throws RemoteException{
        lstTable.add(item);
        return lstTable;
    }
    
     @Override
    public List<Table> DelDogovor(int n) throws RemoteException{
        lstTable.remove(n);
        return lstTable;
    }
     @Override
    public int getNumber(String s) throws RemoteException{
        int t=0;
        for(int i=0; i<lstTable.size(); i++)
        {
            if(lstTable.get(i).getName().equals(s)) t++;
        }
        return t;
    }
}