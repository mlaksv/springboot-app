package com.shopping.inventory;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Data
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item createItem(Item item){

        Item createdItem = itemRepository.save(item);
        return createdItem;
    }

    public Iterable<Item> getAllItems(){
        return itemRepository.findAll();
    }

}
