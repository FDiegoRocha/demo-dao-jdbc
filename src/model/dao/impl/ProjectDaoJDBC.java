package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ProjectDao;
import model.entities.Project;

public class ProjectDaoJDBC implements ProjectDao {
	
	private Connection conn;
	
	public ProjectDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Project proj) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("INSERT INTO Project (Name, Budget) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
			st.setString(1, proj.getName());
			st.setDouble(2, proj.getBudget());
			
			int rows = st.executeUpdate();
			if(rows > 0) {
				rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					proj.setId(id);
				}
			}else {
				throw new DbException("Unexpected error! No rows affected!");
			}
					
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closedResultSet(rs);
			DB.closedStatemnet(st);
		}
		
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
