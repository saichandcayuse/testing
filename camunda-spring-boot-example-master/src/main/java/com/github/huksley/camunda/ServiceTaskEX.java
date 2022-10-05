package com.github.huksley.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceTaskEX implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Thread.sleep(2000);
        //${valueFor}
        delegateExecution.setVariable("valueFor",false);

        delegateExecution.setVariable("testing","testing");
        System.out.println("Testing execution "+delegateExecution.getCurrentActivityId());
    }
}
