package parallel.activiti.test;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.engine.impl.context.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisplayMessageTask implements JavaDelegate {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(DisplayMessageTask.class);

    @Override
    public void execute(DelegateExecution context) {
        String entry = (String) context.getVariable("message");
        Context.getProcessEngineConfiguration().getRuntimeService().setVariable(context.getRootProcessInstanceId(), entry, "UNIMPORTANT VALUE");
    }

}
