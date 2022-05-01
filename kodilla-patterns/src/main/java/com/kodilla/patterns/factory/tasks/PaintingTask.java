package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean executed = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        executed = true;
        return true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
