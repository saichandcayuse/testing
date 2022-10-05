package com.github.huksley.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceTaskEXDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Thread.sleep(5000);
        delegateExecution.setVariable("endResult","testing");
        System.out.println("Testing execution "+delegateExecution.getCurrentActivityId());
    }
}
