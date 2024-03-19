package vn.com.gsoft.services.service;

import vn.com.gsoft.services.model.system.Profile;

public interface BaseService {
    Profile getLoggedUser() throws Exception;

}
