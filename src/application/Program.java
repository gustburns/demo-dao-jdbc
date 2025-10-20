package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO oSellerDao = DaoFactory.createSellerDao();
		
		Seller seller = oSellerDao.findById(3);
		System.out.println(seller);
		
		Department departament = new Department(2,null);
		List<Seller> list = oSellerDao.findByDepartment(departament);
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}