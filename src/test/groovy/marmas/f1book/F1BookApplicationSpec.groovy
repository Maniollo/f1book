package marmas.f1book

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class F1BookApplicationSpec extends Specification {
    @Autowired
    ApplicationContext context
    def "Context runs"() {
        expect:
        context
    }
}
