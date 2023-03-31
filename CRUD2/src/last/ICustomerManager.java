package last;

public interface ICustomerManager {
	
	void insertCustomerData();
	Customer selectCustomerData();
	void readCustomerData(Customer cus);
	void updateCustomerData(Customer cus);
	void deleteCustomerData(Customer cus);	
	void writeCustomerData();
	void loadCustomerData();
	
}
