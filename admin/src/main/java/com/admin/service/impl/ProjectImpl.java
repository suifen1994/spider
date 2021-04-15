package com.admin.service.impl;

import com.admin.dao.mysql.mapper.ProjectMapper;
import com.admin.model.ProjectDto;
import com.admin.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProjectImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<ProjectDto> query() {
        List<ProjectDto> rs  = new ArrayList<>();
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(0);
        projectDto.setName("测试");
        projectDto.setHost("http://127.0.0.1");
        projectDto.setDesc("hahahah");
        rs.add(projectDto);
        projectMapper.query();
        return rs;
    }
}
