package net.metasite.coderetreat

import spock.lang.Specification


class CodeTest extends Specification {
    def "should properly calculate Percentage "() {
        when:
        def coverage = new Code(750, 1000).coverage()
        then:
        coverage == 75
    }

    def "should calculate percentage using data driven approach"(covered, total, percentage) {
        expect:
        new Code(covered, total).coverage() == percentage
        where:
        covered | total || percentage
        750     | 1000  || 75
        100     | 1000  || 10
        100     | 500   || 20
// uncomment to fail the test
//      100     | 500   || 20
    }

}
