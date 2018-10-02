package parallel.activiti.test;

import java.util.Arrays;
import java.util.List;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class SetMessageTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution context) {
        List<String> entries = Arrays.asList("new1", "new2", "new3", "new4", "new5", "new6", "new7", "new8", "new9", "new10", "new11",
            "new12", "new13", "new14", "new15", "new16", "new17", "new18", "new19", "new20");

        context.setVariable("messages", entries);
    }

}
