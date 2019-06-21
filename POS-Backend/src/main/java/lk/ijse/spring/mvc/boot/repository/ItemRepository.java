package lk.ijse.spring.mvc.boot.repository;

import lk.ijse.spring.mvc.boot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {

}
