import groovy.util.logging.*

@Log //annotation - these are used to markup code and have a number of purposes including error detection and ggenerating funcionality
class AssertionTest {
    static void runTest() {
        try {
            assert true == false : 'true cannot be false'
        } catch(AssertionError err) {
            log.severe "An assertion failed ${err}"
        }
    }
}

AssertionTest.runTest()

