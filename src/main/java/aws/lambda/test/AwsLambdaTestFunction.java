package aws.lambda.test;

import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;
import javax.inject.*;
import java.io.IOException;
import java.util.function.Function;

@FunctionBean("aws-lambda-test")
public class AwsLambdaTestFunction extends FunctionInitializer implements Function<AwsLambdaTest, AwsLambdaTest> {

    @Override
    public AwsLambdaTest apply(AwsLambdaTest msg) {
         return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar 
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        AwsLambdaTestFunction function = new AwsLambdaTestFunction();
        function.run(args, (context)-> function.apply(context.get(AwsLambdaTest.class)));
    }    
}

