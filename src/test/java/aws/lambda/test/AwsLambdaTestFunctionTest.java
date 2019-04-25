package aws.lambda.test;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class AwsLambdaTestFunctionTest {

    @Inject
    AwsLambdaTestClient client;

    @Test
    public void testFunction() throws Exception {
    	AwsLambdaTest body = new AwsLambdaTest();
    	body.setName("aws-lambda-test");
        assertEquals("aws-lambda-test", client.apply(body).blockingGet().getName());
    }

    @Test
    public void testFunction2() throws Exception {
        AwsLambdaTest body = new AwsLambdaTest();
        body.setName("aws-lambda-test");
        assertEquals("aws-lambda-test", client.apply(body).blockingGet().getName());
    }
}
