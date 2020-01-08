package com.leyou.registry.service;

import com.leyou.registry.entity.Users;
import com.leyou.registry.result.AppResult;

import java.util.List;

public interface UserService {

    AppResult selectAllUsers();
}
