package com.leo.cli.command;

import com.leo.generator.MainGenerator;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import java.util.concurrent.Callable;
import org.apache.commons.beanutils.BeanUtils;
import lombok.Data;

import com.leo.model.MainTemplateConfig;


@Command(name = "generate", description = "generate code", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer>{
    @Option(names = {"-l", "--loop"}, arity = "0..1", description = "loop or not", interactive = true, echo = true)
    private boolean loop;

    @Option(names = {"-a", "--author"}, arity = "0..1", description = "author", interactive = true, echo = true)
    private String author = "_";

    @Option(names = {"-o", "--outputText"}, arity = "0..1", description = "output text", interactive = true, echo = true)
    private String outputText = "<no output text>";

    public Integer call() throws Exception {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtils.copyProperties(mainTemplateConfig, this); // copy properties to config object
        System.out.println("config: " + mainTemplateConfig);
        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}
