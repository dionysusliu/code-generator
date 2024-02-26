package com.leo.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.io.File;
import java.util.List;

@Command(name = "list", description = "check file list", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable{
    public void run() {
        String projectPath = System.getProperty("user.dir");
        // Big project root
        File parentFile = new File(projectPath).getParentFile();
        // input path
        String inputPath = new File(parentFile, "code-generator-demo-projects/acm-template").getAbsolutePath();
        List<File> files = FileUtil.loopFiles(inputPath);
        for (File file: files){
            System.out.println(file);
        }
    }
}
