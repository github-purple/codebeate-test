package aws.lambda.test;

import io.micronaut.core.annotation.*;

@Introspected
public class AwsLambdaTest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

