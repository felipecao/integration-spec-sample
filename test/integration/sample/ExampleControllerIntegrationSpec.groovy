package sample

import grails.test.spock.IntegrationSpec

/**
 * Created by felipe on 2/11/15.
 */
class ExampleControllerIntegrationSpec extends IntegrationSpec {

    def "index should return the 2 instances created at Bootstrap"(){
        given:
        def exampleController = new ExampleController()

        when:
        exampleController.index()

        then:
        200 == exampleController.response.status
        2 == exampleController.response.json.size()
        exampleController.response.json.id.containsAll([1,2])
    }

}
