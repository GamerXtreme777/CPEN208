package com.projectwork.API.service.impl;

import com.projectwork.API.dto.StudentDto;
import com.projectwork.API.entity.Student;
import com.projectwork.API.exception.ResourceNotFoundException;
import com.projectwork.API.mapper.StudentMapper;
import com.projectwork.API.repository.StudentRepository;
import com.projectwork.API.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;


    @Override
    public StudentDto createStudent(StudentDto studentDto) {

        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student =  studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student does not exist with the given id: " + studentId));

        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students =  studentRepository.findAll();
        return students.stream().map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto updateStudent(Long studentId, StudentDto updatedStudent) {
        Student student = studentRepository.findById(studentId).orElseThrow(
                () -> new ResourceNotFoundException("Student does not exist with the given id: " + studentId)
        );
        student.setFirstName(updatedStudent.getFirstName());
        student.setLastName(updatedStudent.getLastName());
        student.setEmail(updatedStudent.getEmail());

        Student updatedStudentObj = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(updatedStudentObj);
    }

    @Override
    public void deleteStudent(Long studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(
                () -> new ResourceNotFoundException("Student does not exist with the given id: " + studentId)
        );
        studentRepository.deleteById(studentId);


    }
}
