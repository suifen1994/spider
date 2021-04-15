package com.admin.dao.mysql.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface ProjectMapper {
    List<Map> query();
}
