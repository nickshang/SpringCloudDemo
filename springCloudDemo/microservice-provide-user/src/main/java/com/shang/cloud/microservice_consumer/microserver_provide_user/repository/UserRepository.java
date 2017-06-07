package com.shang.cloud.microservice_consumer.microserver_provide_user.repository;

import com.shang.cloud.microservice_consumer.microserver_provide_user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Think on 2017/5/30.
 */
@Repository
public interface  UserRepository extends JpaRepository<User,Long>{
}
