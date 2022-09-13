FROM openjdk:17
EXPOSE 9030
ADD target/student-data-msa6-0.0.1-SNAPSHOT.jar student-data-msa6-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/student-data-msa6-0.0.1-SNAPSHOT.jar"]