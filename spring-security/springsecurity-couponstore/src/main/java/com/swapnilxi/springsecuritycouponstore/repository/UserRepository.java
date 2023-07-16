package com.swapnilxi.springsecuritycouponstore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.swapnilxi.springsecuritycouponstore.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUname(String username);
}

