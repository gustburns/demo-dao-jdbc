package model.dao;

import java.util.List;

import model.dao.impl.SellerDAOImplJDBC;
import model.entities.Seller;

public class DaoFactory {
	public static SellerDAO createSellerDao() {
		return new SellerDAOImplJDBC();
	}
}
