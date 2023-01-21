package com.shopping.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping("/item")
    public Item createItem(@RequestBody  Item item){
        return itemService.createItem(item);
    }

    @GetMapping("/items")
    public Iterable<Item> getItems(){
            return itemService.getAllItems();
    }

}
