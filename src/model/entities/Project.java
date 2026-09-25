package model.entities;

import java.util.Objects;

public class Project {
	private Integer id;
	private String name;
	private Double budget;

	public Project(Integer id, String name, Double budget) {
		this.id = id;
		this.name = name;
		this.budget = budget;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	@Override
	public int hashCode() {
		return Objects.hash(budget, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(budget, other.budget) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", budget=" + budget + "]";
	}
	
	

}
