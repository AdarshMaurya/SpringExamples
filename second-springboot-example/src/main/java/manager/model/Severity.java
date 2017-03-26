package manager.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "severity")
public class Severity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int severityId;
	private String severity_type;

	public Severity() {
	}

	public Severity(String severity_type) {
		super();
		this.severity_type = severity_type;
	}

	public int getSeverityId() {
		return severityId;
	}

	public void setSeverityId(int severityId) {
		this.severityId = severityId;
	}

	public String getSeverity_type() {
		return severity_type;
	}

	public void setSeverity_type(String severity_type) {
		this.severity_type = severity_type;
	}

	@Override
	public String toString() {
		return "Severity [severityId=" + severityId + ", severity_type=" + severity_type + "]";
	}

}
