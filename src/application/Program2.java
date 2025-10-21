package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDAO oDepartmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = new ArrayList<>();

		System.out.println("======== TESTE 1 ========");
		Department department = oDepartmentDao.findById(1);
		System.out.println(department);

		System.out.println("======== TESTE 2 ========");
		list = oDepartmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("======== TESTE 4 ========");
		Department newDepartment = new Department(null, "DepartamentoTeste");
		oDepartmentDao.insert(newDepartment);
		System.out.println("Insert! new id = " + newDepartment.getId());

		System.out.println("======== TESTE 5 ========");
		department = oDepartmentDao.findById(5);
		department.setName("DepartamentoTesteUpdate");
		oDepartmentDao.update(department);
		System.out.println("Update Completed");

		System.out.println("======== TESTE 6 ========");
		System.out.println("Enter id for delete");
		int id = sc.nextInt();
		oDepartmentDao.deleteById(id);
		System.out.println("Delete Completed");
		sc.close();

	}

}