@Grab('org.mortbay.jetty:jetty-embedded:6.1.26')
import org.mortbay.jetty.Server
import org.mortbay.jetty.servlet.Context
import org.mortbay.jetty.servlet.DefaultServlet

new Server(8080).with {
    new Context(it, '/', Context.SESSIONS).with {
        resourceBase = './build/grog/'
        addServlet(DefaultServlet, '/*').with {
            setInitParameter 'dirAllowed', 'true'
        }
    }
    start()
    join()
}