package com.leo.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import com.leo.cli.command.ConfigCommand;
import com.leo.cli.command.GenerateCommand;
import com.leo.cli.command.ListCommand;

@Command(name="leo", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{
    private final CommandLine commandLine;
    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        System.out.println("Enter your command, or enter --help for helping info");
    }

    public Integer doExecute(String[] args){
        return commandLine.execute(args);
    }
}
