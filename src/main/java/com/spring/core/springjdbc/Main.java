package com.spring.core.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        Address address = (Address) context.getBean("address");

        Address address1 = new Address();
            address1.setCity("pune");
            address1.setPinCode(123456);

        Student student = new Student();
            student.setStudentId(3);
            student.setStudenttName("Sanu");
            student.setAddress(address1);


//        int status=studentDao.saveStudent(student);
//        int status=studentDao.deleteStudents(student);
//        int status=studentDao.updateStudent(student);

//        System.out.println(status);


    }
}
