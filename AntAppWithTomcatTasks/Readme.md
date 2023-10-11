1. https://tomcat.apache.org/tomcat-7.0-doc/appdev/build.xml
2. modify tomcat-users.xml files of tomcat/conf folder with below role and user.

<tomcat-users>

  <role rolename="tomcat"/>
  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <role rolename="manager-jmx"/>
  <role rolename="manager-status"/>
  <user username="admin" password="admin" roles="manager-script"/>

</tomcat-users>
