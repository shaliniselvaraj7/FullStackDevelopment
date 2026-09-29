package com.example.LibraryManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @GetMapping
    public List<Library> getLibrary(){
        return libraryService.getLibrary();
    }
    @GetMapping("/{bookId}")
        public Library getBookById(@PathVariable int bookId){
            return libraryService.getBookById(bookId);
        }
        @PostMapping
        public String addBook(@RequestBody Library lib){
            libraryService.addBook(lib);
            return "Success";
        }
        @PutMapping
    public String updateBook(@RequestBody Library lib){
        return libraryService.updateBook(lib);
        }
}
