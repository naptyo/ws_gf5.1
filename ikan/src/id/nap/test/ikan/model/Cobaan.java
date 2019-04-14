package id.nap.test.ikan.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "percobaan")
public class Cobaan {
	private String kata;
	
	public Cobaan() {
		super();
	}

	public Cobaan(String kata) {
		super();
		this.kata = kata;
	}
	
	public String getKata() {
		return kata;
	}

	public void setKata(String kata) {
		this.kata = kata;
	}
}
