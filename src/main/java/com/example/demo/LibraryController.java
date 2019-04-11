package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Book;
import com.example.demo.domain.Book_Copies;
import com.example.demo.domain.Book_Loans;
import com.example.demo.domain.Borrower;
import com.example.demo.service.BookService;
import com.example.demo.service.BorrowerService;

import oracle.sql.DATE;

@Controller
public class LibraryController {
	
	@Autowired
	BorrowerService borrowerService;
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/homepage")
	public String homepage(Model model) {
		return "homepage";
	}
	
	@RequestMapping(value = "/insertBorrower", method=RequestMethod.POST) 
	public String insertBorrower(@RequestParam("cardNo") String cardNo, @RequestParam("name") String name, 
									@RequestParam("address") String address, @RequestParam("phone") String phone, 
									@RequestParam("password") String password, @ModelAttribute Borrower borrower, Model model) {
		borrower = new Borrower();
		System.out.println("before insert attempt");
		borrower.setCardNo(cardNo);
		borrower.setName(name);
		borrower.setAddress(address);
		borrower.setPhone(phone);
		borrower.setPassword(password);
		System.out.println(borrower);
		borrowerService.insertBorrower(borrower);
		model.addAttribute("message", "Sign-up successful");
		return "homepage";
	}
	
	@GetMapping("/welcome")
	public String welcome(@RequestParam("cardNo") String cardNo, @RequestParam("password") String password, @ModelAttribute Borrower borrower, Model model ) {
		borrower = new Borrower();
		borrower.setCardNo(cardNo);
		borrower.setPassword(password);
		System.out.println("inside /welcome");
		borrower = borrowerService.getBorLogin(borrower);
		System.out.println(borrower);
		if(borrower != null) {
			model.addAttribute("borrower", borrower);
			return "welcome";
		}
		else {
			model.addAttribute("message", "The Card Number or Password you entered is incorrect");
			return "homepage";
		}
	}
	
	@GetMapping("/signup")
	public String signup(Model model) {
		return "signup";
	}
	
	@GetMapping("/books/{cardNo}")
	public String getBooks(@PathVariable String cardNo, @ModelAttribute Borrower borrower, Model model) {
		borrower = new Borrower();
		borrower.setCardNo(cardNo);
    	borrower = borrowerService.getBorrower(borrower);
    	model.addAttribute("borrower", borrower);
		List<Book> bookList = new ArrayList<Book>();
		bookList = bookService.getBookList();
		model.addAttribute("bookList", bookList);
		return "bookLanding";
	}
	
	@GetMapping("/bookLoans/{cardNo}")
	public String getLoans(@PathVariable String cardNo, Model model) {
		List<Book_Loans> bookList = new ArrayList<Book_Loans>();
		System.out.println("inside /book_loans");
		bookList = bookService.getBookLoans();
		System.out.println(bookList);
		model.addAttribute("bookList", bookList);
		return "bookLoans";
	}
	
	@GetMapping("/checkout/{bookId}{cardNo}")
	public String checkout(@PathVariable String cardNo, @PathVariable int bookId, @ModelAttribute Book_Loans bookLoan, Model model) {
    	Book_Copies bc = new Book_Copies();
    	int branchId = bc.getBranchId();
		bookLoan = new Book_Loans();
    	bookLoan.setBookId(bookId);
    	bookLoan.setBranchId(branchId);
    	bookLoan.setCardNo(cardNo);
    	bookLoan.setDateOut(null);
    	bookLoan.setDueDate(null);
    	model.addAttribute("message", "Book successfully checked out");
    	return "/checkedOut";
    	
    	
    	
	}
    @GetMapping("/borrowers")
    public String getBorrowers(Model model) {
    	System.out.println("inside /borrowers");
    	List<Borrower> borList = new ArrayList<Borrower>();
    	borList = borrowerService.getBorList();
        model.addAttribute("borList", borList);
        return "borLanding";
    }
    
    @GetMapping("/editBorrower/{cardNo}")
    public String editBorrower(@PathVariable String cardNo, @ModelAttribute Borrower borrower, Model model) {
    	borrower = new Borrower();
    	borrower.setCardNo(cardNo);
    	System.out.println("before getBorrower"+borrower);
    	borrower = borrowerService.getBorrower(borrower);
    	System.out.println("after getBorrower"+borrower);
    	model.addAttribute("borrower", borrower);
        return "editBorrower";
    }
    
    @RequestMapping(value = "/updateBorrower", method = RequestMethod.POST)
    public String updateBorrower(@ModelAttribute Borrower borrower, Model model) {
    	
    	borrowerService.updateBorrower(borrower);
    	model.addAttribute("message", "success. borrower updated.");
        
        return "editBorrower";
    }
}