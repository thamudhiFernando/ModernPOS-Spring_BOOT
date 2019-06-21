package lk.ijse.spring.mvc.boot.repository;

import lk.pos.springmvc.finalapp.entity.CustomEntity;

import java.util.List;

public interface QueryRepository {

    List<CustomEntity> getOrdersTotal();

}
