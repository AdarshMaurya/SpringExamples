package manager;

import java.util.Date;
import java.util.HashSet;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import manager.dao.ProjectJpaRespository;
import manager.dao.StakeholderRepository;
import manager.model.Project;
import manager.model.Stakeholders;

@SpringBootApplication
public class CommandLineManagerApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(CommandLineManagerApplication.class);

	@Autowired
	private ProjectJpaRespository projectRepository;

	@Autowired
	private StakeholderRepository stakeholderRepository;

	public static void main(String[] args) {
		SpringApplication.run(CommandLineManagerApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... arg0) throws Exception {

		projectRepository.save(new HashSet<Project>() {
			{
				add(new Project(new HashSet<Stakeholders>() {
					{
						add(new Stakeholders("StakeHolderE", new Date()));
					}
				}, "ProjectE", "ProjectE-Desc", new Date()));

				add(new Project(new HashSet<Stakeholders>() {
					{
						add(new Stakeholders("StakeHolderF", new Date()));
					}
				}, "ProjectF", "ProjectF-Desc", new Date()));
			}
		});

		// Fetch all the Project
		for (Project proj : projectRepository.findAll()) {
			logger.info(proj.toString());
		}

		stakeholderRepository.save(new HashSet<Stakeholders>() {
			{
				add(new Stakeholders("StakeHolderG", new Date(), new HashSet<Project>() {
					{
						add(new Project("ProjectG", "ProjectG-Desc", new Date()));
						add(new Project("ProjectH", "ProjectH-Desc", new Date()));
					}
				}));

				add(new Stakeholders("StakeHolderI", new Date(), new HashSet<Project>() {
					{
						add(new Project("ProjectI", "ProjectI-Desc", new Date()));
					}
				}));

			}
		});

		for (Stakeholders stkholdr : stakeholderRepository.findAll()) {
			logger.info(stkholdr.toString());
		}

	}
}
