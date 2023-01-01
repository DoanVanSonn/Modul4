package controller;

import exception.QuantityZero;
import model.Book;
import model.BorrowBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.IBookService;
import service.IBorrowBookService;
import validate.Validate;

import javax.validation.Valid;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBorrowBookService personBookBorrowerService;
    @Autowired
    private Validate personValidate;

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "index";
    }
    @GetMapping("/create/{id}")
    public String showCreate(@PathVariable Long id, Model model) throws QuantityZero {
        BorrowBook personBookBorrower = new BorrowBook();
        Book book = bookService.findById(id);
        if (book.getAmountBook() <= 0) {
            throw new QuantityZero("This book was rent empty");
        }
        model.addAttribute("book", book);
        model.addAttribute("personBookBorrower", personBookBorrower);
        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("personBookBorrower") BorrowBook personBookBorrower,
                       BindingResult bindingResult, Model model) {
        personValidate.validate(personBookBorrower, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("book", bookService.findById(personBookBorrower.getBooks().getIdBook()));
            return "create";
        }
        personBookBorrowerService.create(personBookBorrower);
        bookService.updateAmount_bookService(personBookBorrower.getBooks().getIdBook());
        return "redirect:/home";
    }

    @GetMapping("/view-person")
    public String viewPerson(Model model) {
        model.addAttribute("persons", personBookBorrowerService.findAll());
        return "viewPerson";
    }

    @GetMapping("/delete-person")
    public String deletePerson(@RequestParam("idDelete") Long idPerson,
                               @RequestParam("idDeleteBook") Long idDeleteBook) {
        personBookBorrowerService.delete(idPerson);
        bookService.updateAmount_book_up(idDeleteBook);
        return "redirect:/home";
    }
}
