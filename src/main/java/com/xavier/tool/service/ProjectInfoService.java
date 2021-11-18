package com.xavier.tool.service;

import com.xavier.tool.dao.ProjectInfoDao;
import com.xavier.tool.entity.ProjectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProjectInfoService {

    private ProjectInfoDao projectInfoDao;

    @Autowired
    public ProjectInfoService(ProjectInfoDao projectInfoDao) {
        this.projectInfoDao = projectInfoDao;
    }

    public void testCreate() {
        ProjectInfo projectInfo = new ProjectInfo();
        projectInfoDao.save(projectInfo);
    }
}
