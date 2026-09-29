package com.example.LibraryManagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LibraryService {
    private List<Library> library = new ArrayList<>();
    public LibraryService(){
        library.add(new Library(1,"Thirukural","Thiruvalluvar"));
        library.add(new Library(2,"Ponniyin Selvan","Kalki"));
    }
    public List<Library> getLibrary(){
        return library;
    }
    public Library getBookById(int id){
        for(Library lib : library){
            if(lib.getBookId()==id){
                return lib;
            }
        }
        return null;
    }
    public void addBook(Library lib){

        library.add(lib);
    }

    public String updateBook(Library lib) {
        for(int i =0; i<lib.size;i++){

        }
    }
}
