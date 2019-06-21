package lk.ijse.spring.mvc.boot.service.custom;

import lk.ijse.spring.mvc.boot.dto.ItemDTO;
import lk.ijse.spring.mvc.boot.service.SuperService;

import java.util.List;

public interface ItemService extends SuperService {

    public List<ItemDTO> getAllItems();

    public String saveItem(ItemDTO item);

    public void updateItem(ItemDTO item);

    public void deleteItem(String code);

    public ItemDTO getItemById(String code);

    boolean isItemExists(String code);
}
