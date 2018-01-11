package com.csj.csjweb.mapper;



import com.csj.csjweb.model.Permission;
import java.util.List;
import java.util.Map;

public interface PermissionMapper {

    List<Permission> getByMap(Map<String, Object> map);

    Permission getById(Integer id);

    Integer create(Permission permission);

    int update(Permission permission);

    List<Permission> getByUserId(Integer userId);

}