package th.ac.ku.kps.eng.cpe.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty
	private String name;

	public Customer(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(List<String> number) {
		number = number;
	}
}
