package com.love.service.impl;

import com.love.dao.ProjectsDAO;
import com.love.model.DTO.ProjectsDTO;
import com.love.model.Projects;
import com.love.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    private ProjectsDAO projectsDAO;

    @Override
    public void insert(Projects entity) {
        projectsDAO.insert(entity);
    }

    @Override
    public List selectAll() {
        return projectsDAO.selectAll();
    }

    @Override
    public List selectById(int id) {
        return projectsDAO.selectById(id);
    }

    @Override
    public void updateProject(Projects projects) {
        projectsDAO.updateProject(projects);
    }

    @Override
    public void distribute(int memId, int money) {
        projectsDAO.distribute(memId,money);
    }
}
