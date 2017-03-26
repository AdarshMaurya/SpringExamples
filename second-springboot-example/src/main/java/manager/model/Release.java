package manager.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "releases")
public class Release implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int release_date_id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date release_date;
	private String release_name;

	public Release() {
	}

	public Release(Date release_date, String release_name) {
		super();
		this.release_date = release_date;
		this.release_name = release_name;
	}

	public int getRelease_date_id() {
		return release_date_id;
	}

	public void setRelease_date_id(int release_date_id) {
		this.release_date_id = release_date_id;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public String getRelease_name() {
		return release_name;
	}

	public void setRelease_name(String release_name) {
		this.release_name = release_name;
	}

	@Override
	public String toString() {
		return "Release [release_date_id=" + release_date_id + ", release_date=" + release_date + ", release_name="
				+ release_name + "]";
	}

}
