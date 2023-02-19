package com.shopping.inventory;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {
    @Autowired
    private TableService tableService;
    @PostMapping("/grade")
    public Grade createGrade(@RequestBody Grade grade){
        return tableService.createGrades(grade);
    }

    @GetMapping("/grades")
    public Iterable<Grade> getGrades(){
        return tableService.getAllGrades();
    }

    @GetMapping("/grades/{id}")
    public Optional<Grade> getOneGradeByID(@PathVariable Long id)
    {
        return tableService.getOneGrade(id);
    }    
}
