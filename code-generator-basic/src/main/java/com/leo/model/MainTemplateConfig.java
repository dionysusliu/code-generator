package com.leo.model;

import lombok.Data;

@Data
public class MainTemplateConfig {
    private boolean loop;
    private String author = "leo";
    private String outputText = "sum:";
}
