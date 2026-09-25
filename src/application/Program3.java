package application;

import model.dao.DaoFactory;
import model.dao.ProjectDao;
import model.entities.Project;

public class Program3 {

	public static void main(String[] args) {
		ProjectDao projectDao = DaoFactory.createProject();
		
		System.out.println("=== TEST 1: Project insert =====");
		Project proj = new Project(null,"Equipamentos Tecnologicos", 150000.00);
		projectDao.insert(proj);
		System.out.println("Inserted! New id = " + proj.getId());

	}

}
