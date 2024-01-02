import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import th.ac.ku.kps.eng.cpe.dao.CustomerDAO;

public class Main {
	public static void main(String[] args) throws JsonProcessingException {
		
		CustomerDAO cus = new CustomerDAO();
		
		ObjectMapper obj = new ObjectMapper();
		
		System.out.println(obj.writeValueAsString(cus.getAllCustomers()));
	}
}
