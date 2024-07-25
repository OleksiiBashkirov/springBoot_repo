package mate.academy.repository;

import mate.academy.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookRepository extends JpaRepository<Book, Long>,
        BookRepositoryCustom, JpaSpecificationExecutor<Book> {
}
