package registration;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import operationClass.TableOperationImpl;

public class Run {
    
  public static void main (String[] argv) {
    try {
                        // создание экземпляров классов для регистрации
			TableOperationImpl tableOperationImpl = new TableOperationImpl();
			
			// создаём реестр
			Registry registry = LocateRegistry.createRegistry(1199);
			
			// регистрация классов
			registry.bind("rmiTest01", tableOperationImpl); 
        
      System.out.println ("Message Server is ready.");
    } catch (Exception e) {
      System.out.println ("Message Server failed: " + e);
    }
  }
}
