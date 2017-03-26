package manager.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "stakeholders")
public class Stakeholders implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stakeholders_id;
	private String stakeholder_name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date stakeholder_added_date;

	@ManyToMany(mappedBy = "stakeHolders")
	private Set<Project> projects;

	public Stakeholders() {
	}

	public Stakeholders(String stakeholder_name, Date stakeholder_added_date) {
		super();
		this.stakeholder_name = stakeholder_name;
		this.stakeholder_added_date = stakeholder_added_date;
	}

	public Stakeholders(String stakeholder_name, Date stakeholder_added_date, Set<Project> projects) {
		super();
		this.stakeholder_name = stakeholder_name;
		this.stakeholder_added_date = stakeholder_added_date;
		this.projects = projects;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public int getStakeholder_id() {
		return stakeholders_id;
	}

	public void setStakeholder_id(int stakeholder_id) {
		this.stakeholders_id = stakeholder_id;
	}

	public String getStakeholder_name() {
		return stakeholder_name;
	}

	public void setStakeholder_name(String stakeholder_name) {
		this.stakeholder_name = stakeholder_name;
	}

	public Date getStakeholder_added_date() {
		return stakeholder_added_date;
	}

	public void setStakeholder_added_date(Date stakeholder_added_date) {
		this.stakeholder_added_date = stakeholder_added_date;
	}

	@Override
	public String toString() {
		return "Stakeholders [stakeholders_id=" + stakeholders_id + ", stakeholder_name=" + stakeholder_name
				+ ", stakeholder_added_date=" + stakeholder_added_date + ", projects=" + projects + "]";
	}

}
