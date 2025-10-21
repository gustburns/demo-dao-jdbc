package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO oSellerDao = DaoFactory.createSellerDao();
		System.out.println("======== TESTE 1 ========");
		Seller seller = oSellerDao.findById(3);
		System.out.println(seller);

		System.out.println("======== TESTE 2 ========");
		Department departament = new Department(2, null);
		List<Seller> list = oSellerDao.findByDepartment(departament);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("======== TESTE 3 ========");
		list = oSellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("======== TESTE 4 ========");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departament);
		oSellerDao.insert(newSeller);
		System.out.println("Insert! new id = " + newSeller.getId());

	}

}