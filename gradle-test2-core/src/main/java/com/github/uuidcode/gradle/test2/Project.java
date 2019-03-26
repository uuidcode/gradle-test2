package com.github.uuidcode.gradle.test2;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class Project {
    private Long projectId;
    private String name;
}
