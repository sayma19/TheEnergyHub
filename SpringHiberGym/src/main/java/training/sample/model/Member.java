package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Member {
	@Id
	int Member_id;
	String Member_name;
	String Address;
	String DOB ;
	double weight;
	int height;
	String Blood_Group;
	String Gender;
	String health_issue;
	String Package;
	String Trainer_Name;
	int Batch_id;
	int Branch_id;
	int payment_id;
	String Mobile_no;
	
	
	
	
	public Member() {
		super();
	}


	public Member(int member_id, String member_name, String address, String dOB, double weight, int height,
			String blood_Group, String gender, String health_issue, String package1, String trainer_Name, int batch_id,
			int branch_id, int payment_id, String mobile_no) {
		super();
		Member_id = member_id;
		Member_name = member_name;
		Address = address;
		DOB = dOB;
		this.weight = weight;
		this.height = height;
		Blood_Group = blood_Group;
		Gender = gender;
		this.health_issue = health_issue;
		Package = package1;
		Trainer_Name = trainer_Name;
		Batch_id = batch_id;
		Branch_id = branch_id;
		this.payment_id = payment_id;
		Mobile_no = mobile_no;
	}


	public int getMember_id() {
		return Member_id;
	}


	public void setMember_id(int member_id) {
		Member_id = member_id;
	}


	public String getMember_name() {
		return Member_name;
	}


	public void setMember_name(String member_name) {
		Member_name = member_name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getBlood_Group() {
		return Blood_Group;
	}


	public void setBlood_Group(String blood_Group) {
		Blood_Group = blood_Group;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getHealth_issue() {
		return health_issue;
	}


	public void setHealth_issue(String health_issue) {
		this.health_issue = health_issue;
	}


	public String getPackage() {
		return Package;
	}


	public void setPackage(String package1) {
		Package = package1;
	}


	public String getTrainer_Name() {
		return Trainer_Name;
	}


	public void setTrainer_Name(String trainer_Name) {
		Trainer_Name = trainer_Name;
	}


	public int getBatch_id() {
		return Batch_id;
	}


	public void setBatch_id(int batch_id) {
		Batch_id = batch_id;
	}


	public int getBranch_id() {
		return Branch_id;
	}


	public void setBranch_id(int branch_id) {
		Branch_id = branch_id;
	}


	public int getPayment_id() {
		return payment_id;
	}


	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}


	public String getMobile_no() {
		return Mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}


	@Override
	public String toString() {
		return "Member [Member_id=" + Member_id + ", Member_name=" + Member_name + ", Address=" + Address + ", DOB="
				+ DOB + ", weight=" + weight + ", height=" + height + ", Blood_Group=" + Blood_Group + ", Gender="
				+ Gender + ", health_issue=" + health_issue + ", Package=" + Package + ", Trainer_Name=" + Trainer_Name
				+ ", Batch_id=" + Batch_id + ", Branch_id=" + Branch_id + ", payment_id=" + payment_id + ", Mobile_no="
				+ Mobile_no + "]";
	}
	
	
	
	
	
	
	
}

