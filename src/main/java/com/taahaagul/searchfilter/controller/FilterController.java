package com.taahaagul.searchfilter.controller;

import com.taahaagul.searchfilter.dto.RequestDto;
import com.taahaagul.searchfilter.entity.Student;
import com.taahaagul.searchfilter.service.FiltersSpecification;
import com.taahaagul.searchfilter.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filter")
@RequiredArgsConstructor
public class FilterController {

    private final StudentService studentService;
    private final FiltersSpecification<Student> studentFiltersSpecification;


    @PostMapping("/specification")
    public ResponseEntity<List<Student>> getStudents(@RequestBody RequestDto requestDto) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(studentService.getStudents(requestDto));
    }

    @PostMapping("/specification/pagination")
    public ResponseEntity<Page<Student>> getStudentsPage(@RequestBody RequestDto requestDto) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(studentService.getStudentsPage(requestDto));
    }
}
