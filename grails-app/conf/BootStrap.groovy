import sample.Example

class BootStrap {

    def init = { servletContext ->
        environments {
            test {
                if(0 == Example.count()){
                    new Example(name: "one", street: "one", zip: "12345", country: "BR").save(validate: true, failOnError: true)
                    new Example(name: "two", street: "two", zip: "12345", country: "DE").save(validate: true, failOnError: true)
                }
            }
        }

    }

    def destroy = {
    }
}
