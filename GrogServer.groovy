@Grab('org.mortbay.jetty:jetty-embedded:6.1.26')
import groovy.servlet.GroovyServlet
import groovy.servlet.TemplateServlet

@Grab('org.mortbay.jetty:jetty-embedded:6.1.26')
import static org.mortbay.jetty.Handler.DEFAULT
import org.mortbay.jetty.Server
import org.mortbay.jetty.servlet.Context
import org.mortbay.jetty.servlet.DefaultServlet
import org.mortbay.servlet.MultiPartFilter

new Server(8080).with {
    new Context(it, '/', Context.SESSIONS).with {
        resourceBase = '.'
        addFilter MultiPartFilter, '/*', DEFAULT
        addServlet(DefaultServlet, '/static/*').with {
            setInitParameter 'dirAllowed', 'true'
        }
        addServlet(TemplateServlet, '/view/*').with {
            setInitParameter 'resource.name.regex', '/view(.*)'
            setInitParameter 'resource.name.replacement', 'gsp/$1.gsp'
        }
        addServlet(GroovyServlet, '/groovy/*').with {
            setInitParameter 'resource.name.regex', '/groovy(.*)'
            setInitParameter 'resource.name.replacement', 'groovy/$1.groovy'
        }
    }
    start()
    join()
}