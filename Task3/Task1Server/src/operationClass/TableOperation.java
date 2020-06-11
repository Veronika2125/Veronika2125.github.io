/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operationClass;
import java.util.List;
import type.Table;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Вероника
 */
public interface TableOperation extends Remote{
    List<Table> getListOfDogovor() throws RemoteException;
    List<Table> addNewDogovor(Table item) throws RemoteException;
    List<Table> DelDogovor(int n) throws RemoteException;
    int getNumber(String s) throws RemoteException;
}
