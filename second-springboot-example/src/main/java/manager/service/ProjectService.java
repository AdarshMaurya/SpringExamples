package manager.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import manager.dao.ProjectRepository;
import manager.model.Project;

@Service
@Transactional
public class ProjectService {

	private final ProjectRepository projectRepository;

	public ProjectService(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	public List<Project> findAll() {
		List<Project> projects = new ArrayList<>();
		for (Project project : projectRepository.findAll()) {
			projects.add(project);
		}
		return projects;
	}

	public Project findProject(int id) {
		return projectRepository.findOne(id);
	}

	public void save(Project task) {
		projectRepository.save(task);
	}

	public void delete(int id) {
		projectRepository.delete(id);
	}
}
