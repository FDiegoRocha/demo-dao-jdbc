package model.dao;

import java.util.List;

import model.entities.Project;

public interface ProjectDao {
	void insert(Project proj);
	void update(Integer id);
	Project findById();
	List<Project> findAll();
	void deleteById(Integer id);
}
