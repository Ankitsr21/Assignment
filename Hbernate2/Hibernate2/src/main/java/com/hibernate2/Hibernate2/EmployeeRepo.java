package com.hibernate2.Hibernate2;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
    @Query("from Employee")
    List<Employee> findAllEmployees();
    @Query("select firstName, lastName from Employee where salary > (select AVG(salary) from Employee Order by age) order by salary Desc  ")
    List<Object[]> findfname();
//    @Query("from Employee where firstName=:fName")
//    List<Employee> findByFirstName(@Param("fName") String fName);
    @Query("select AVG(salary) from Employee")
    Integer avg();
    @Modifying
    @Query("update Employee set salary= :salary where salary< :avg")
    Integer updateSalary( @Param("avg") Integer avg, @Param("salary") int salary);
    @Query("select MIN(salary) from Employee")
    Integer min();

    @Modifying
    @Query("delete from Employee where salary= :min")
    Integer deleteMinSalary(@Param("min") Integer min);
    @Query(value = "select emp_id, empfirstname, empage from employeetable where emplastname Like '%Singh'",nativeQuery = true)
    List<Object[]> findAllDetail();

    @Query("select age from Employee where age > 45")
    Integer ageGreaterThan();
    @Modifying
    @Query(value = "delete from employeetable where empage= :ageGreaterThan",nativeQuery = true)
    Integer deleteAgeGreaterThan(@Param("ageGreaterThan")Integer ageGreaterThan);

}
