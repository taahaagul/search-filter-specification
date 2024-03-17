package com.taahaagul.searchfilterspecification.service;

import com.taahaagul.searchfilterspecification.dto.PageRequestDto;
import com.taahaagul.searchfilterspecification.dto.RequestDto;
import com.taahaagul.searchfilterspecification.entity.Student;
import com.taahaagul.searchfilterspecification.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final FiltersSpecificationService<Student> studentFiltersSpecificationService;
    private final StudentRepository studentRepository;


    public List<Student> getStudents(RequestDto requestDto) {
        Specification<Student> searchSpecification =
                studentFiltersSpecificationService
                        .getSearchSpecification(requestDto.getSearchRequestDto(), requestDto.getGlobalOperator());
        return studentRepository.findAll(searchSpecification);
    }

    public Page<Student> getStudentsPage(RequestDto requestDto) {
        Specification<Student> searchSpecification =
                studentFiltersSpecificationService
                        .getSearchSpecification(requestDto.getSearchRequestDto(), requestDto.getGlobalOperator());

        Pageable pageable = new PageRequestDto().getPageable(requestDto.getPageDto());

        return studentRepository.findAll(searchSpecification, pageable);
    }
}
