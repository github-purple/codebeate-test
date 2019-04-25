package aws.lambda.test;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface AwsLambdaTestClient {

    @Named("aws-lambda-test")
    Single<AwsLambdaTest> apply(@Body AwsLambdaTest body);

}
