package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ProjectDao;
import model.entities.Project;

public class Program3 {

	public static void main(String[] args) {
		ProjectDao projectDao = DaoFactory.createProject();
		
//		System.out.println("=== TEST 1: Project insert =====");
//		Project proj = new Project(null,"Equipamentos Tecnologicos", 150000.00);
//		projectDao.insert(proj);
//		System.out.println("Inserted! New id = " + proj.getId());
		
//		System.out.println("=== TEST 2: Project update =====");
//		Project proj2 = new Project(4,"Equipamentos Tecnologicos", 170000.00);
//		projectDao.update(proj2);
//		System.out.println("complete update!");
		
		System.out.println("=== TEST 3: Project findById =====");
		Project proj3 = projectDao.findById(2);
		System.out.println(proj3);
		
		System.out.println("=== TEST 4: Project findAll =====");
		List<Project> list = projectDao.findAll();
		list.forEach(System.out::println);
		
		
	}

}
