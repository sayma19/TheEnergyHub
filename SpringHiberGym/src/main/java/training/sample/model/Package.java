package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Package {

	@Id
	int Package_id;
	String Package_name;
	String Duration;
	String Amount;
	
	
	public Package() {
		super();
	}


	public Package(int package_id, String package_name, String duration, String amount) {
		super();
		Package_id = package_id;
		Package_name = package_name;
		Duration = duration;
		Amount = amount;
	}


	public int getPackage_id() {
		return Package_id;
	}


	public void setPackage_id(int package_id) {
		Package_id = package_id;
	}


	public String getPackage_name() {
		return Package_name;
	}


	public void setPackage_name(String package_name) {
		Package_name = package_name;
	}


	public String getDuration() {
		return Duration;
	}


	public void setDuration(String duration) {
		Duration = duration;
	}


	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}


	@Override
	public String toString() {
		return "Package [Package_id=" + Package_id + ", Package_name=" + Package_name + ", Duration=" + Duration
				+ ", Amount=" + Amount + "]";
	}
	
	
}
