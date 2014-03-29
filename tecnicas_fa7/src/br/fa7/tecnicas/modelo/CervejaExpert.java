package br.fa7.tecnicas.modelo;

import java.util.ArrayList;
import java.util.List;

public class CervejaExpert {
	
	public List<String> getByType(String type) {

		List<String> types = new ArrayList<>();
		
		if("trigo".equals(type)) {
			types.add("Weissbier");
			types.add("Weizenbock");
			types.add("American Wheat Beer");
		} else if("bock".equals(type)) {
			types.add("Kaiser Bock");
			types.add("Pietra");
			types.add("Baden Bock");			
		} else {
			types.add("Antartica Cristal");
			types.add("Skol Beats");
		} 
		return types;
	}

}
