package br.com.engmoraes.patterns.interfaces.adapter;

public class AdapterXmlRest extends XmlUtil{
	
	private RestUtil restUtil;
	
	public AdapterXmlRest(RestUtil restUtil){
		this.restUtil = restUtil;
	}
	
	public Long retornaCpf(){
		return restUtil.retornaCpfRest();
	}
}
