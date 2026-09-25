package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//Department obj = new Department(1, "Books");
		
		//Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
//		System.out.println("=== TEST 1: selller findById =====");
//		Seller seller = sellerDao.findById(3);
//		System.out.println(seller);
//		System.out.println("=== TEST 2: selller findByDepartment =====");
//		Department department = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//		list.forEach(System.out::println);
		
		System.out.println("=== TEST 3: seller findByAll =====");
		List<Seller> list2 = sellerDao.findAll();
		list2.forEach(System.out::println);
		
//		System.out.println("=== TEST 4: seller insert  =====");
//		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.00, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
//		
		System.out.println("=== TEST 5: seller update  =====");
		Seller seller = sellerDao.findById(7);
		seller.setName("Greg Green");
		sellerDao.update(seller);
		System.out.println("Update completed");
//		
//		System.out.println("=== TEST 6: seller delete  =====");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Digite um id para deletar: ");
//		int num = sc.nextInt();
//		sellerDao.deleteById(num);
//		System.out.println("Delete completed");
		
//		sc.close();
		
		System.out.println("=== TEST 6: seller findyBaySalaryRange  =====");
		List<Seller> list = sellerDao.findBySalaryRange(500.00, 2500.00);
		list.forEach(System.out::println);
		
		System.out.println("=== TEST 7: seller findyBayPartialName  =====");
		List<Seller> list3 = sellerDao.findByPartialName("Green");
		list3.forEach(System.out::println);





	}

}
 