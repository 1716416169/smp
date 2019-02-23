package com.smp.smp.Dao;

import com.smp.smp.Entity.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface User_repository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
