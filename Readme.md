Log4jstdourerr has set of classes that will configure System.out, System.err to log4j appenders.

Test :

jar -cf log4jstdourerr.jar com/
java -cp .:log4j-1.2.17.jar:out/production/log4jstdouterr/log4jstdourerr.jar -Djava.util.logging.config.file="log.properties" com.log4jstdouterr.Main