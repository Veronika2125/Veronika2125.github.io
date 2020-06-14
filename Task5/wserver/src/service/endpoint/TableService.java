/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.endpoint;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import operation.TableOperationImpl;
import types.ListOfTable;
import types.Table;

@WebService()
public class TableService {
    static TableOperationImpl obj = new TableOperationImpl();
    
    @WebMethod()
    public ListOfTable getAllTovar(){
        ListOfTable lstRet = null;
                
        List<Table> lst = obj.getListOfDogovor();
        if(lst != null){
            lstRet = new ListOfTable();
            lstRet.setItem(lst);
        }
        return lstRet; 
    }
    
    @WebMethod()
    public ListOfTable setNewDogovor(Table table){
        ListOfTable lstRet = null;
        
        List<Table> lst = obj.addNewDogovor(table);
        if(lst != null){
            lstRet = new ListOfTable();
            lstRet.setItem(lst);
        }
        return lstRet; 
    }
    
    @WebMethod()
    public ListOfTable delDogovor(int n){
        ListOfTable lstRet = null;
        
        List<Table> lst = obj.DelDogovor(n);
        if(lst != null){
            lstRet = new ListOfTable();
            lstRet.setItem(lst);
        }
        return lstRet; 
    }
    
    @WebMethod()
    public int getNumber(String s){
        int n = obj.getNumber(s);
        return n;
    }
}
