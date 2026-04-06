package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
@CrossOrigin
public class MedicineController {

    @Autowired
    private MedicineRepository repo;

    @GetMapping
    public List<Medicine> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Medicine add(@RequestBody Medicine m) {
        return repo.save(m);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}