package com.presentation;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Customer;
import com.service.CustomerService;

@Component
public class LoginPresentationImpl implements LoginPresentation {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerPresentation customerPresentation;;

	@Override
	public void showMenu() {
		System.out.println("1.Create new account:");
		System.out.println("2.Login into your existing account:");
		System.out.println("3.Exit.");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		try {
			switch (choice) {
			case 1:
				System.out.println("Enter Customer Name:");
				String customerName = scanner.nextLine();
				System.out.println("Enter College Name:");
				String collegeName = scanner.nextLine();
				System.out.println("Enter Address");
				String address = scanner.nextLine();
				Customer customer = new Customer(0, customerName, collegeName, address);
				int customerId = customerService.addNewCustomer(customer);
				String cardId = customerService.generateNewCard(customerId);
				if (customerId > 0)
					System.out.println("Customer Registered Successfully, CardId: " + customerId);
				else
					System.out.println("Customer Registration Failed");
				break;
			case 2:
//				System.out.println("Enter your cardId");
//				cardId= scanner.nextLine();
//				status = false;
//				status = customerService.getCustomerById(cardId);
//				if (status) {
//					while (choice != 6) {
//						customerPresentation.showLoginMenu();
//						System.out.println("Enter your choice");
//						choice = Integer.parseInt(scanner.nextLine());
//						customerPresentation.performLoginMenu(choice,cardId);
//					}
//				}
				break;
			case 3:
				System.out.println("Thank you for using our application.Kindly visit us again");
				System.exit(0);
				break;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
