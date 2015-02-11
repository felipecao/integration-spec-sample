package sample

class Example {

    String name
    String street
    String streetNo
    String zip
    String city
    String country

    static constraints = {
        streetNo(nullable: true)
        zip(blank: false, maxSize: 5)
        city(nullable: true)
    }
}
