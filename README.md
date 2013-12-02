grails-mount-plugin
===================

allows grails plugins to be mounted to any grails application without restarting.  A subset of grails features will be 
supported and is meant to make a content editor's life easier.  This is not a CMS.  Mountable plugins will be accessed 
directly in a users favorite text editor / IDE and no web editors are provided.  That said, one could build a web editor
around this plugin, or simply use it along with a VCS as a poor man's CMS.  A mountable plugin will have the same form as
a grails plugin.

####Supported Features

 * gsp pages (0.1)
 * service to render gsp pages from anywhere (0.1)
 * static resources (0.2)
 * groovy file to handle adhoc requests (0.2)
 
Although a mountable grails plugin will have the same layout as a grails plugin, its feature set is limited.  
Basically anything under views or webapp can be served out, and that is it.

####Use Cases

This plugin can be very handy for separating out the most dynamic parts of your application (ie the view), and making it 
updatable in real time.  Also allows one to extend a core app with a micro app in real time.
 
