package lk.ijse.spring.mvc.boot.repository;

import lk.pos.springmvc.finalapp.entity.OrderDetail;
import lk.pos.springmvc.finalapp.entity.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {

}
