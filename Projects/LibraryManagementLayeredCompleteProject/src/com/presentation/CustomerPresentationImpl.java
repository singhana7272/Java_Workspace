package com.presentation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Book;
import com.bean.BookType;
import com.bean.CustomerCard;
import com.service.BookService;
import com.service.CustomerService;
import com.service.IssueBookService;

@Component
public class CustomerPresentationImpl implements CustomerPresentation {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private BookService bookService;
	@Autowired
	private IssueBookService issueBookService;

	@Override
	public void showLoginMenu() {
		System.out.println("1.List of books available");
		System.out.println("2.Check Your Account Details");
		System.out.println("3.List Of Books Issued");
		System.out.println("4.Issue a Book");
		System.out.println("5.Return a Book");
		System.out.println("6.Logout");
	}

	@Override
	public void performLoginMenu(int choice, String cardId) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		try {
			switch (choice) {
			case 1:
				ArrayList<Book> books = null;
				books = bookService.listOfBookAvailable();
				for (Book book : books) {
					System.out.println(book);
				}
				break;
			case 2:
				System.out.println("Enter your customerId");
				String customerId = scanner.nextLine();
//				System.out.println("Enter cardId");
//				String cardId = scanner.nextLine();
//				customerService.CustomerAccountDetails(customerId, cardId);
				break;
			case 4:
				System.out.println("Enter bookTypeId");
				String bookTypeId = scanner.nextLine();
				BookType bookType = null;
				bookType = bookService.searchBookByType(bookTypeId);
				if (bookType != null) {
					System.out.println("Enter bookid");
					String bookId = scanner.nextLine();
					Book book = null;
					book = bookService.searchBookById(bookId);
					if (book != null) {
						System.out.println("Please enter your cardId");
						cardId = scanner.nextLine();
						CustomerCard customerCard = customerService.searchCustomerCard(cardId);
						System.out.println("Enter issueDate in format 'YYYY-MM-DD'");
						String issueDate = scanner.nextLine();
						System.out.println(book.getNoOfCopiesAvailable());
						System.out.println(issueBookService.updateNoOfCopies(bookId,book.getNoOfCopiesAvailable() - 1));
						if (book.getNoOfCopiesAvailable() > 0) {
							boolean issueStatus = issueBookService.issueBook(bookTypeId, cardId, book, issueDate);
							boolean updateNoOfCopiesStatus = issueBookService.updateNoOfCopies(bookId,book.getNoOfCopiesAvailable() - 1);
							boolean updateNoOfBooksIssuedStatus=issueBookService.updateNoOfBooksIssued(customerCard, customerCard.getNoOfBooksIssued() + 1);
							if (issueStatus && updateNoOfCopiesStatus && updateNoOfBooksIssuedStatus)
								System.out.println("Book issuing succesful");
							else
								System.out.println("Book issuing failed");
						}
					} else {
						System.out.println("Sorry!This book is not available");
					}
				} else
					System.out.println("Sorry!This book type is not available");
				break;
			case 6:
				break;
			}
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			e.printStackTrace();
		}
	}

}
