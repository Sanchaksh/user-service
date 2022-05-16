<<<<<<< HEAD
package com.oracle.userservice.repository;

import com.oracle.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(String id);
}

=======
package com.oracle.userservice.repository;

import com.oracle.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(String id);
}

>>>>>>> 0123469b063a7d675e6b6f59eb1374fefd8816aa
