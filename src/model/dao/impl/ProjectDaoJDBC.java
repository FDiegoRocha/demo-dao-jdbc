package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.ProjectDao;
import model.entities.Project;

public class ProjectDaoJDBC implements ProjectDao {
	
	private Connection conn;
	
	public ProjectDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Project proj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Project findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
