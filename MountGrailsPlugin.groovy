class MountGrailsPlugin {
    def version = "0.1-SNAPSHOT"
    def grailsVersion = "2.2 > *"
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]
    def title = "Mount Plugin" // Headline display name of the plugin
    def author = "Thomas Barker"
    def authorEmail = "mingus.karate@gmail.com"
    def description = '''\
Plugin allows for mounting grails plugins in a certain form without restarting grails
'''

    def documentation = "http://grails.org/plugin/mount"
}
