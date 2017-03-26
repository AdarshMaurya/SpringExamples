package manager.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "project_area")
public class ProjectArea {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int project_area_id;

	private String project_area_name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date project_area_added_date;

	public ProjectArea() {
	}

	public ProjectArea(String project_area_name, Date project_area_added_date) {
		super();
		this.project_area_name = project_area_name;
		this.project_area_added_date = project_area_added_date;
	}

	public int getProject_area_id() {
		return project_area_id;
	}

	public void setProject_area_id(int project_area_id) {
		this.project_area_id = project_area_id;
	}

	public String getProject_area_name() {
		return project_area_name;
	}

	public void setProject_area_name(String project_area_name) {
		this.project_area_name = project_area_name;
	}

	public Date getProject_area_added_date() {
		return project_area_added_date;
	}

	public void setProject_area_added_date(Date project_area_added_date) {
		this.project_area_added_date = project_area_added_date;
	}

	@Override
	public String toString() {
		return "ProjectArea [project_area_id=" + project_area_id + ", project_area_name=" + project_area_name
				+ ", project_area_added_date=" + project_area_added_date + "]";
	}

}
