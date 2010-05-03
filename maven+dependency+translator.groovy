def CAR_RECORDS = '''
 <dependencies>

        <dependency>
            <groupId>joda-time</groupId>
            <artifactId>joda-time</artifactId>
            <version>1.5</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.4.3</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>1.4.3</version>
        </dependency>
        <!-- work around for jetty commons logging issue -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>jcl104-over-slf4j</artifactId>
            <version>1.4.3</version>
        </dependency>

  </dependencies>
  '''
def records = new XmlParser().parseText(CAR_RECORDS)
records.each() {
    println "compile: \"${it.groupId.text()}:${it.artifactId.text()}:${it?.version?.text()}\""
}
