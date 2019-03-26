package com.github.uuidcode.gradle.test2;

import org.junit.Test;

import com.github.uuidcode.util.CoreUtil;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectTest {
    @Test
    public void test() {
        Project project = Project.of()
            .setName(CoreUtil.createUUID())
            .setProjectId(1000L);

        assertThat(project.getProjectId()).isEqualTo(1000L);
    }
}