package com.github.uuidcode.gradle.test2;

import com.github.uuidcode.util.CoreUtil;

public class ProjectService {
    public Project findById(Long projectId) {
        return Project.of().setName(CoreUtil.createUUID())
            .setProjectId(projectId);
    }
}
