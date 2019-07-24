package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Trainer {
	@Id
	int Trainer_id;
	String Trainer_name;
	String Address;
	String DOB ;
	String Gender;
	String Email_id;
	String Mobile_no;
	String Specialization;
	String Experience;
	String Batch_time;
	
	public Trainer() {
		super();
	}

	public Trainer(int trainer_id, String trainer_name, String address, String dOB, String gender, String email_id,
			String mobile_no, String specialization, String experience, String batch_time) {
		super();
		Trainer_id = trainer_id;
		Trainer_name = trainer_name;
		Address = address;
		DOB = dOB;
		Gender = gender;
		Email_id = email_id;
		Mobile_no = mobile_no;
		Specialization = specialization;
		Experience = experience;
		Batch_time = batch_time;
	}

	public int getTrainer_id() {
		return Trainer_id;
	}

	public void setTrainer_id(int trainer_id) {
		Trainer_id = trainer_id;
	}

	public String getTrainer_name() {
		return Trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		Trainer_name = trainer_name;
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

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}

	public String getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public String getExperience() {
		return Experience;
	}

	public void setExperience(String experience) {
		Experience = experience;
	}

	public String getBatch_time() {
		return Batch_time;
	}

	public void setBatch_time(String batch_time) {
		Batch_time = batch_time;
	}

	@Override
	public String toString() {
		return "Trainer [Trainer_id=" + Trainer_id + ", Trainer_name=" + Trainer_name + ", Address=" + Address
				+ ", DOB=" + DOB + ", Gender=" + Gender + ", Email_id=" + Email_id + ", Mobile_no=" + Mobile_no
				+ ", Specialization=" + Specialization + ", Experience=" + Experience + ", Batch_time=" + Batch_time
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
