package com.shopping.inventory;

import lombok.Data;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;

@Data
@Service
public class TableService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private GradeRepository gradeRepository;

    public Item createItem(Item item)
    {
        Item createdItem = itemRepository.save(item);
        return createdItem;
    }

    public Iterable<Item> getAllItems()
    {
        return itemRepository.findAll();
    }

    public Optional<Item> getOneItem(Long id)
    {
        return itemRepository.findById(id);
    }

    public Grade createGrades(Grade grade)
    {
        return gradeRepository.save(grade);
    }

    public Iterable<Grade> getAllGrades()
    {
        return gradeRepository.findAll();
    }

    public Optional<Grade> getOneGrade(Long id)
    {
        return gradeRepository.findById(id);
    }

    public Item updateItem(Long id, Item item) throws ItemNotFoundException{
        Optional<Item> currentOptionalItem = getOneItem(id);
        if(currentOptionalItem.isPresent()){
            Item currentItem = currentOptionalItem.get();
            currentItem.setName(item.getName());
            currentItem.setFullDescription(item.getFullDescription());
            currentItem.setPrice(item.getPrice());
            createItem(currentItem);
        }else {
            throw new ItemNotFoundException(id);
        }
        return item;
    }
}
