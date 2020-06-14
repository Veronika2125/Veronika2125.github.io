using System;
using System.Collections.Generic;


namespace server
{
    public class TableOperationImpl : MarshalByRefObject, TableOperation
    {
        public static List<Table> lstTable = new List<Table>();

        public List<Table> getListOfDogovor()
        {
            return lstTable;
        }
        public List<Table> addNewDogovor(Table item)
        {
            lstTable.Add(item);
            return lstTable;
        }
        public List<Table> DelDogovor(int n)
        {
            lstTable.RemoveAt(n);
            return lstTable;
        }
        public int getNumber(String s)
        {
            int t = 0;
            for (int i = 0; i < lstTable.Count; i++)
            {
                if (lstTable[i].getName() == s) t++;
            }
            return t;
        }
    }
}
