package service;

import model.BorrowBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBorrowBookService {
    void create(BorrowBook personBookBorrower);
    void update(BorrowBook personBookBorrower);
    void delete(Long id);
    List<BorrowBook> findAll();
    void deleteByIdLongCar(Long idBookLoanCard,Long idPerson);
    BorrowBook findById(Long id);
    Page<BorrowBook> findAllWithPaging(Pageable pageable);
}
