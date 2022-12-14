package contracts.com.ebsolutions.spring_cdc.consumer_1;

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return even when number input is even"
    request {
        method GET()
        url("/even-odd") {
            queryParameters {
                parameter("number", "2")
            }
        }
    }
    response {
        body("Even")
        status 200
    }
}