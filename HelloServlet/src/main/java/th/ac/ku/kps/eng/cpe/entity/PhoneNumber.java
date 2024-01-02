package th.ac.ku.kps.eng.cpe.entity;

import java.util.List;

public class PhoneNumber {
	private List<String> number;
	
	public PhoneNumber(List<String> number) {
		this.number = number;
	}
	
	public List<String> getNumber(){
		return number;
	}
}
