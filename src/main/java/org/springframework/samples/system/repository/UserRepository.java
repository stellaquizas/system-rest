package org.springframework.samples.system.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.system.model.User;

public interface UserRepository {

    void save(User user) throws DataAccessException;
}
