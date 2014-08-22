
package com.systemsat.ws.posicao;

import javax.xml.ws.WebServiceRef;
import java.util.*;


public class SystemSatAppClient {
    @WebServiceRef(wsdlLocation = "http://www.globalsearch.com.br/webservice/posicoes.asmx?wsdl")
    private static Posicoes service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	System.out.println("Starting SOAP access ..........");

	ArrayOfPosicao posList = service.getPosicoesSoap().listaUltimasPosicoes("3","devmobile","devmobile");

	Iterator<Posicao> posIt = posList.getPosicao().iterator();
	while (posIt.hasNext()) {

		Posicao pos = posIt.next();
		System.out.println("POS ID : " + pos.getIdPosicao());

	}

    }
}
