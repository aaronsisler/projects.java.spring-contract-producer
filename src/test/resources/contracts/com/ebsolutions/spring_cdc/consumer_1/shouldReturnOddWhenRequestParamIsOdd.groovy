package contracts.com.ebsolutions.spring_cdc.consumer_1;

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return odd when number input is odd"
    request {
        method GET()
        url("/even-odd") {
            queryParameters {
                parameter("number", "5")
            }
        }
    }
    response {
        body("Odd")
        status 200
    }
}