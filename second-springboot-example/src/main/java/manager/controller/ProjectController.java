package manager.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import manager.model.Project;
import manager.service.ProjectService;


@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;

//	@GetMapping("/")
//	public String home(HttpServletRequest request) {
//		request.setAttribute("mode", "MODE_HOME");
//		return "manager";
//	}
	
	@GetMapping("/")
	public String index() {
		return "home";
	}

	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/all-project")
	public String allTasks(HttpServletRequest request) {
		request.setAttribute("tasks", projectService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "manager";
	}

	@GetMapping("/new-project")
	public String newTask(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_NEW");
		return "manager";
	}

	@PostMapping("/save-project")
	public String saveTask(@ModelAttribute Project project, BindingResult bindingResult, HttpServletRequest request) {
		project.setProject_added_date(new Date());
		projectService.save(project);
		request.setAttribute("tasks", projectService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "manager";
	}

	@GetMapping("/update-project")
	public String updateTask(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("task", projectService.findProject(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "manager";
	}

	@GetMapping("/delete-project")
	public String deleteTask(@RequestParam int id, HttpServletRequest request) {
		projectService.delete(id);
		request.setAttribute("tasks", projectService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "manager";
	}

}
