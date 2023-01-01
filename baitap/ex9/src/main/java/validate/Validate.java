package validate;

import model.BorrowBook;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import service.impl.BorrowBookService;

public class Validate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        BorrowBook personBookBorrower = (BorrowBook) target;
        if (personBookBorrower.getBorrowedDate().getDate() > personBookBorrower.getPayDay().getDate()) {
            errors.rejectValue("borrowedDate", "DateValidate", null, "Ngay muong khong duoc lon hon ngay tra sach");
        }
    }
}
