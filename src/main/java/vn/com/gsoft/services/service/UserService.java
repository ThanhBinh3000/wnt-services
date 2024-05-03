package vn.com.gsoft.services.service;

import vn.com.gsoft.services.model.system.Profile;

import java.util.Optional;

public interface UserService {
    Optional<Profile> findUserByToken(String token);

}
