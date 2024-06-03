package bamboo_test.spec1;

import com.atlassian.bamboo.specs.api.builders.plan.Plan;
import com.atlassian.bamboo.specs.api.exceptions.PropertiesValidationException;
import com.atlassian.bamboo.specs.api.util.EntityPropertiesBuilders;

import bamboo_spec.spec1.PlanSpec;

import org.junit.Test;

public class PlanSpecTest {
    @Test
    public void checkYourPlanOffline() {
        Plan plan = new PlanSpec().createPlan();

        EntityPropertiesBuilders.build(plan);
    }
}
