1.build app with ant xml file :

ant -f "xml file" "target name"

ant -f "xml file"

ant "target name"

ant 


2.Reference:

http://ant.apache.org/manual/using.html

https://www.tutorialspoint.com/ant/index.htm


3.Install Ant:

Install Ant for Ubuntu
----------------------


- JAVA_HOME should be set to jdk location.

- Ant bin and home variable setup:
  
  Download ant and unzip

   tar -xvf <ant>.tar.gz 

  sudo vim /etc/profile.d/ant.sh

  Add below line in ant.sh
  
   export ANT_HOME="/home/anurag/Apps/apache-ant-1.9.13"
  
   export PATH=${ANT_HOME}/bin:${PATH}

  source /etc/profile

- ant -version

4. ant printing classpath values:
    
    <target name="localDebugg">
        <pathconvert property="build.classpath" refid="build.claspath"/>
        <echo>${build.classpath}</echo>
    </target>
 
