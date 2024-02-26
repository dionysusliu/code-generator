package com.leo.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {
    public static void copyFilesByHutool(String inputPath, String outputPath){
        FileUtil.copy(inputPath, outputPath, false);
    }

    public static void main(String[] args) {
        // get the BIG project root
        String projectPath = System.getProperty("user.dir");
        File parentPath = new File(projectPath).getParentFile();
        // input path: path to template
        String inputPath = new File(parentPath, "code-generator-demo-projects/acm-template").getAbsolutePath();
        // output path: project root
        String outputPath = projectPath;
        copyFilesByHutool(inputPath, outputPath);
    }
}
