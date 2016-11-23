package br.com.engmoraes.patterns.interfaces.facade;

public class XmlFacade {

	private XmlObject xmlObject = null;
	private XmlRead xmlRead = null;
	
	public static void main(String[] args) {

	}

	/** Abstrai a complexidade **/
	
	public XmlFacade(XmlObject xmlObject, XmlRead xmlRead){
		
		this.xmlObject = xmlObject;
		this.xmlRead = xmlRead;
	}
	
	public void lerXml(){
		xmlObject.carregar();
		xmlRead.leArquivo(xmlObject);
	}
	
}
