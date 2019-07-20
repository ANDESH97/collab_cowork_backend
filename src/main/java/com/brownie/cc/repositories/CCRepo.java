package com.brownie.cc.repositories;

import com.brownie.cc.entity.C2C;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CCRepo extends JpaRepository<C2C, Long> {


}
