grails-mount-plugin
===================

allows grails plugins to be mounted to any grails application without restarting.  A subset of grails features will be 
supported and is meant to make a content editor's life easier.  This is not a CMS.  Mountable plugins will be accessed 
directly in a users favorite text editor / IDE and no web editors are provided.  That said, one could build a web editor
around this plugin, or simply use it along with a VCS as a poor man's CMS.  A mountable plugin will have the same form as
a grails plugin, allowing for a familiar grails environement.

####Supported Features

 * gsp pages (0.1)
 * service to render gsp pages from anywhere (0.1)
 * static resources (0.2)
 * Domains and Services (0.3, still debating this)
 * Extendable API to allow for potential mounts from other locations
 
Although a mountable grails plugin will have the same layout as a grails plugin, its feature set is more limited.  
The following features are not supported:

 * plugin specific UrlMapping files
 * plugin hooks in the main plugin file (withSpring, etc.)
 * Controllers (url handling will be discussed below)
 * transactions in Services
 * dependencies, all used dependencies must be in the parent project
 * artifacts provided by other plugins
 * class enhancements to domain objects
 * multiple dataSources for a domain object

####Use Cases

This plugin can be very handy for separating out the most dynamic parts of your application (ie the view), and making it 
updatable in real time.  Also allows one to extend a core app with a micro app real time.
 
