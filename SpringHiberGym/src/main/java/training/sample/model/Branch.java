package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Branch {
	@Id
	int Branch_id;
	String Branch_name;
	String Address;
	
	
	public Branch() {
		super();
	}


	public Branch(int branch_id, String branch_name, String address) {
		super();
		Branch_id = branch_id;
		Branch_name = branch_name;
		Address = address;
	}


	public int getBranch_id() {
		return Branch_id;
	}


	public void setBranch_id(int branch_id) {
		Branch_id = branch_id;
	}


	public String getBranch_name() {
		return Branch_name;
	}


	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "Branch [Branch_id=" + Branch_id + ", Branch_name=" + Branch_name + ", Address=" + Address + "]";
	}
	
	
	
	
}
