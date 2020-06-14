using System;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;

namespace server
{
    class Program
    {
        static void Main()
        {
            // Register channel
            TcpChannel channel = new TcpChannel(9000);
            ChannelServices.RegisterChannel(channel, false);
            TableOperationImpl lstTable = new TableOperationImpl();
            lstTable.addNewDogovor(new Table("ул. Радужная, д. 15", "Ремонт крыши", "По площади", 5.0, "Строители", "Председатель", 30000.0));
            // Register MyRemoteObject
            RemotingConfiguration.RegisterWellKnownServiceType(
                typeof(TableOperationImpl),
                "TalkIsGood",
                WellKnownObjectMode.Singleton);
            // Также можно зарегестрировать не тип, а неоходимый объект:
            //RemotingServices.Marshal(lstTovar, "TalkIsGood");
            //lstTovar – объект, который необходимо передать, "TalkIsGood" - параметр, который //используется клиентом для активизации объекта (унифицированный идентификатор ресурса)
            Console.WriteLine("Press enter to stop this process.");
            Console.ReadLine();
        }
    }
}

