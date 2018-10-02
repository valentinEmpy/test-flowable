package parallel.activiti.test;

import org.flowable.engine.test.Deployment;
import org.flowable.engine.test.FlowableRule;
import org.junit.Rule;
import org.junit.Test;

public class MyUnitTest {

    @Rule
    public FlowableRule activitiRule = new FlowableRule();

    @Test
    @Deployment(resources = { "diagrams/main-process.bpmn", "diagrams/sub-process.bpmn" })
    public void test() throws Exception {
        activitiRule.getRuntimeService()
            .startProcessInstanceByKey("mainProcess");
        Thread.sleep(50 * 1000);
    }

}
