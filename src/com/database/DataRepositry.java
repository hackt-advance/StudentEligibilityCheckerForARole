package com.database;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.dto.Role;



public class DataRepositry {
      final private List<Role> repo = Arrays.asList(
            new Role("CF01", "Data Operations Intern", 
                     Arrays.asList("CSE", "IT"), 7.5, Collections.singletonList(2027), 1, Arrays.asList("Python", "SQL")),
                     
            new Role("CF02", "QA Automation Intern", 
                     Arrays.asList("CSE", "ECE", "IT"), 7.0, Arrays.asList(2027, 2028), 1, Collections.singletonList("Git")),
                     
            new Role("CF03", "Embedded Systems Intern", 
                     Arrays.asList("ECE", "EEE"), 7.5, Collections.singletonList(2027), 1, Collections.singletonList("Git")),
                     
            new Role("CF04", "Machine Learning Intern", 
                     Arrays.asList("CSE", "IT"), 8.5, Collections.singletonList(2027), 1, Collections.singletonList("Python")),
                     
            new Role("CF05", "Platform Engineering Intern", 
                     Arrays.asList("CSE", "ECE"), 7.0, Collections.singletonList(2026), 0, Arrays.asList("Docker", "Git"))
        );


        List<Role> extendedRepo = new ArrayList<>(repo);
        
        public void addRole(Role role){
            extendedRepo.add(role);
        }

        public void setToDefaultRepo(){
            extendedRepo = repo;
        }

        public  List<Role> getExtendedRepo() {
              return extendedRepo;
        }
      
}
