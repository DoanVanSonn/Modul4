package repository;

import model.BorrowBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowBookRepository extends JpaRepository<BorrowBook,Long> {
}
