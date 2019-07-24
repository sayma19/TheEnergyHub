package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Batches {
	@Id
	int Batch_id;
	String Day;
	String Time;
	String Type;
	
	
	public Batches() {
		super();
	}


	public Batches(int batch_id, String day, String time, String type) {
		super();
		Batch_id = batch_id;
		Day = day;
		Time = time;
		Type = type;
	}


	public int getBatch_id() {
		return Batch_id;
	}


	public void setBatch_id(int batch_id) {
		Batch_id = batch_id;
	}


	public String getDay() {
		return Day;
	}


	public void setDay(String day) {
		Day = day;
	}


	public String getTime() {
		return Time;
	}


	public void setTime(String time) {
		Time = time;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	@Override
	public String toString() {
		return "Batches [Batch_id=" + Batch_id + ", Day=" + Day + ", Time=" + Time + ", Type=" + Type + "]";
	}
	
	
	
	

}
