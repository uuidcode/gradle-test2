package com.github.uuidcode.gradle.test2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectServiceTest {
    @Test
    public void test() {
        ProjectService projectService = new ProjectService();
        Project project = projectService.findById(100L);
        assertThat(project.getProjectId()).isEqualTo(100L);
    }
}