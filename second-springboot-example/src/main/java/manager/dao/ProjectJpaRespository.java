package manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import manager.model.Project;

public interface ProjectJpaRespository extends JpaRepository<Project, Integer> {

}
