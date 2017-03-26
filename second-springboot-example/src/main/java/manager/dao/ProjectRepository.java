package manager.dao;

import org.springframework.data.repository.CrudRepository;

import manager.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer>{

}
