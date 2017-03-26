package manager.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "projects")
public class Project implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projects_id;
	private String project_name;
	private String project_desc;
	@Temporal(TemporalType.TIMESTAMP)
	private Date project_added_date;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "projects_stakeholders", joinColumns = @JoinColumn(name = "projects_id", referencedColumnName = "projects_id"), inverseJoinColumns = @JoinColumn(name = "stakeholders_id", referencedColumnName = "stakeholders_id"))
	private Set<Stakeholders> stakeHolders;

	public Project() {
	}

	public Project(String project_name, String project_desc, Date project_added_date) {
		super();
		this.project_name = project_name;
		this.project_desc = project_desc;
		this.project_added_date = project_added_date;
	}

	public Project(Set<Stakeholders> stakeHolders, String project_name, String project_desc, Date project_added_date) {
		super();
		this.stakeHolders = stakeHolders;
		this.project_name = project_name;
		this.project_desc = project_desc;
		this.project_added_date = project_added_date;
	}

	public int getProject_id() {
		return projects_id;
	}

	public void setProject_id(int project_id) {
		this.projects_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_desc() {
		return project_desc;
	}

	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}

	public Date getProject_added_date() {
		return project_added_date;
	}

	public void setProject_added_date(Date project_added_date) {
		this.project_added_date = project_added_date;
	}

	public Set<Stakeholders> getStakeHolders() {
		return stakeHolders;
	}

	public void setStakeHolders(Set<Stakeholders> stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	@Override
	public String toString() {
		String result = "Project [ project_id=" + projects_id + ", project_name=" + project_name + ", project_desc="
				+ project_desc + ", project_added_date=" + project_added_date + "]";
		if (stakeHolders != null) {

			for (Stakeholders st : stakeHolders) {
				result += String.format("StakeHolder[stakeholders_id=%d, stakeholder_name=%s]", st.getStakeholder_id(),
						st.getStakeholder_name());
			}
		}

		return result;
	}

}
