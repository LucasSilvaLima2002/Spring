package com.dev.superior.SQL.Table.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.superior.SQL.Table.entities.Employees;

public interface UserRepository extends JpaRepository<Employees, Long>{

}
