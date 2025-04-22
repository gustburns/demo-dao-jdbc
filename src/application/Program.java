package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Gustavo", "TESTE@GMAIL>COM", new Date(), 3000.00 , obj);

		
		SellerDAO oSellerDao = DaoFactory.createSellerDao();
		System.out.println(seller);
	}

}
