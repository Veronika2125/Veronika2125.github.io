/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import javax.xml.ws.Endpoint;
import service.endpoint.TableService;

public class PublicWS {
    public static void main (String[] argv) {
        Endpoint.publish("http://localhost:8080/wserver/TableService",
				new TableService());
    }
}
