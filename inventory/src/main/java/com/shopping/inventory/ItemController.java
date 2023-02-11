package com.shopping.inventory;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    @Autowired 
    private TableService tableService;
    @PostMapping("/item")
    public Item createItem(@RequestBody  Item item){
        return tableService.createItem(item);
    }

    //This is the API to retrieve GetALLItems
    //adding another comment

    @GetMapping("/items")
    public Iterable<Item> getItems(){
        return tableService.getAllItems();
    }
    
    @GetMapping("/items/{id}")
    public Optional<Item> getOneItemByID(@PathVariable Long id){
        //System.out.println("id is : "+id);
        return tableService.getOneItem(id);
    }
    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable("id") Long id, @RequestBody Item item) throws ItemNotFoundException{
        return tableService.updateItem(id, item);
    }

}
