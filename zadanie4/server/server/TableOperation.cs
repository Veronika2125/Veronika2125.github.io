using System;
using System.Collections.Generic;

namespace server
{
    public interface TableOperation
    {
        List<Table> getListOfDogovor();
        List<Table> addNewDogovor(Table item);
        List<Table> DelDogovor(int n);
        int getNumber(String s);
    }
}
