package aws.lambda.test;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class AwsLambdaTest2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

