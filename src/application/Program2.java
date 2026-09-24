package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		//Department obj = new Department(1, "Books");
		
		//Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.00, obj);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
//		System.out.println("=== TEST 2: selller findByDepartment =====");
//		Department department = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//		list.forEach(System.out::println);
		
		System.out.println("=== TEST 3: Department findByAll =====");
		List<Department> list2 = departmentDao.findAll();
		list2.forEach(System.out::println);
		
		System.out.println("=== TEST 4: Department insert  =====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("=== TEST 5: Department update  =====");
		newDepartment = departmentDao.findById(4);
		newDepartment.setName("Alimentação");
		departmentDao.update(newDepartment);
		System.out.println("Update completed");
		
		System.out.println("=== TEST 6: Department delete  =====");
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um id para deletar: ");
		int num = sc.nextInt();
		departmentDao.deleteById(num);
		System.out.println("Delete completed");
		
		sc.close();




	}

}
 