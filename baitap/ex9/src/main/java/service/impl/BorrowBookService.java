package service.impl;

import model.BorrowBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.IBorrowBookRepository;
import service.IBorrowBookService;

import java.util.List;
@Service
public class BorrowBookService implements IBorrowBookService {
    @Autowired
    private IBorrowBookRepository iBorrowBookRepository;
    @Override
    public void create(BorrowBook personBookBorrower) {
personBookBorrower.setBookLoanCard((long) ((Math.random() * (99999 - 10000 + 1)) + 10000));
iBorrowBookRepository.save(personBookBorrower);
    }

    @Override
    public void update(BorrowBook personBookBorrower) {
iBorrowBookRepository.save(personBookBorrower);
    }

    @Override
    public void delete(Long id) {
iBorrowBookRepository.deleteById(id);
    }

    @Override
    public List<BorrowBook> findAll() {
        return iBorrowBookRepository.findAll();
    }

    @Override
    public void deleteByIdLongCar(Long idBookLoanCard, Long idPerson) {

    }

    @Override
    public BorrowBook findById(Long id) {
        return iBorrowBookRepository.findById(id).orElse(null);
    }

    @Override
    public Page<BorrowBook> findAllWithPaging(Pageable pageable) {
        return null;
    }
}
