package fel.cvut.cz.ear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EntityScan(basePackages = "fel.cvut.cz.ear.model")
@EnableCaching
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


}
//
//s PowerShell
//    Copyright (C) Microsoft Corporation. All rights reserved.
//
//        Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows
//
//        PS C:\Users\zidme\IdeaProjects\Karate (3)\Karate> docker ps
//        CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
//        PS C:\Users\zidme\IdeaProjects\Karate (3)\Karate> docker ps
//        CONTAINER ID   IMAGE      COMMAND                  CREATED          STATUS          PORTS                    NAMES
//        4d17ff54f345   postgres   "docker-entrypoint.s…"   19 seconds ago   Up 17 seconds   0.0.0.0:5432->5432/tcp   karate
//        PS C:\Users\zidme\IdeaProjects\Karate (3)\Karate> docker exec -it 4d17 bash
//        root@4d17ff54f345:/# psql -U sa
//        psql (16.1 (Debian 16.1-1.pgdg120+1))
//        Type "help" for help.
//
//        sa=# \l
//        List of databases
//        Name    | Owner | Encoding | Locale Provider |  Collate   |   Ctype    | ICU Locale | ICU Rules | Access privileges
//        -----------+-------+----------+-----------------+------------+------------+------------+-----------+-------------------
//        postgres  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        sa        | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        template0 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        template1 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        (4 rows)
//
//        sa=# CREATE DATABASE karatedb;
//        CREATE DATABASE
//        sa=# GRANT ALL PRIVILEGES ON DATABASE karatedb TO sa;
//        GRANT
//        sa=# \l
//        List of databases
//        Name    | Owner | Encoding | Locale Provider |  Collate   |   Ctype    | ICU Locale | ICU Rules | Access privileges
//        -----------+-------+----------+-----------------+------------+------------+------------+-----------+-------------------
//        karatedb  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =Tc/sa           +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        postgres  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        sa        | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        template0 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        template1 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        (5 rows)
//
//        sa=#
//        PS C:\Users\zidme\IdeaProjects\Karate (3)\Karate> docker ps
//        CONTAINER ID   IMAGE      COMMAND                  CREATED              STATUS              PORTS                    NAMES
//        8911bd120647   postgres   "docker-entrypoint.s…"   About a minute ago   Up About a minute   0.0.0.0:5431->5432/tcp   karate
//        PS C:\Users\zidme\IdeaProjects\Karate (3)\Karate> docker exec -it 8911 bash
//        root@8911bd120647:/# psql -U sa
//        psql (16.1 (Debian 16.1-1.pgdg120+1))
//        Type "help" for help.
//
//        sa=# \l
//        List of databases
//        Name    | Owner | Encoding | Locale Provider |  Collate   |   Ctype    | ICU Locale | ICU Rules | Access privileges
//        -----------+-------+----------+-----------------+------------+------------+------------+-----------+-------------------
//        postgres  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        sa        | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        template0 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        template1 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        (4 rows)
//
//        sa=# CREATE DATABASE karatedb;
//        CREATE DATABASE
//        sa=# \l
//        List of databases
//        Name    | Owner | Encoding | Locale Provider |  Collate   |   Ctype    | ICU Locale | ICU Rules | Access privileges
//        -----------+-------+----------+-----------------+------------+------------+------------+-----------+-------------------
//        karatedb  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        postgres  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        sa        | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        template0 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        template1 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        (5 rows)
//
//        sa=# GRANT ALL PRIVILEGES ON DATABASE karatedb TO sa;
//        GRANT
//        sa=# \l
//        List of databases
//        Name    | Owner | Encoding | Locale Provider |  Collate   |   Ctype    | ICU Locale | ICU Rules | Access privileges
//        -----------+-------+----------+-----------------+------------+------------+------------+-----------+-------------------
//        karatedb  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =Tc/sa           +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        postgres  | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        sa        | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           |
//        template0 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        template1 | sa    | UTF8     | libc            | en_US.utf8 | en_US.utf8 |            |           | =c/sa            +
//        |       |          |                 |            |            |            |           | sa=CTc/sa
//        (5 rows)
//
//        sa=#














































//<?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0"
//         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//    <modelVersion>4.0.0</modelVersion>
//    <parent>
//        <groupId>org.springframework.boot</groupId>
//        <artifactId>spring-boot-starter-parent</artifactId>
//        <version>3.1.5</version>
//    </parent>
//
//    <groupId>fel.cvut.cz.ear</groupId>
//    <artifactId>Karate</artifactId>
//    <version>1.0-SNAPSHOT</version>
//
//    <description>Demo project for Spring Boot</description>
//    <properties>
//        <java.version>17</java.version>
//        <org.mapstruct.version>1.4.2.Final</org.mapstruct.version>
//        <lombok-mapstruct-binding.version>0.2.0</lombok-mapstruct-binding.version>
//        <maven.compiler.plugin.version>3.5.1</maven.compiler.plugin.version>
//    </properties>
//    <dependencies>
//
//
//        <dependency>
//            <groupId>org.springframework.security</groupId>
//            <artifactId>spring-security-web</artifactId>
//            <version>6.1.2</version>
//        </dependency>
//        <dependency>
//            <groupId>org.springframework.security</groupId>
//            <artifactId>spring-security-config</artifactId>
//            <version>6.1.2</version>
//        </dependency>
//        <!--JPA-->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-data-jpa</artifactId>
//        </dependency>
//        <!--WEB-->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-web</artifactId>
//        </dependency>
//        <dependency>
//            <groupId>javax.validation</groupId>
//            <artifactId>validation-api</artifactId>
//            <version>2.0.1.Final</version> <!-- Use the latest version available -->
//        </dependency>
//        <!--LIQUIBASE-->
//        <!--DEV-TOOLS-->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-devtools</artifactId>
//            <scope>runtime</scope>
//            <optional>true</optional>
//        </dependency>
//        <!--DATABASE-->
//        <dependency>
//            <groupId>org.postgresql</groupId>
//            <artifactId>postgresql</artifactId>
//            <scope>runtime</scope>
//        </dependency>
//        <!--LOMBOK-->
//        <dependency>
//            <groupId>org.projectlombok</groupId>
//            <artifactId>lombok</artifactId>
//            <optional>true</optional>
//        </dependency>
//        <!--MAPPING-->
//        <dependency>
//            <groupId>org.mapstruct</groupId>
//            <artifactId>mapstruct</artifactId>
//            <version>${org.mapstruct.version}</version>
//        </dependency>
//        <dependency>
//            <groupId>org.projectlombok</groupId>
//            <artifactId>lombok-mapstruct-binding</artifactId>
//            <version>${lombok-mapstruct-binding.version}</version>
//        </dependency>
//        <!--TESTING-->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-test</artifactId>
//            <scope>test</scope>
//        </dependency>
//
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-security</artifactId>
//        </dependency>
//
//        <dependency>
//            <groupId>org.springframework.security</groupId>
//            <artifactId>spring-security-test</artifactId>
//            <scope>test</scope>
//        </dependency>
//
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-data-jpa</artifactId>
//        </dependency>
//        <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
//        <dependency>
//            <groupId>org.postgresql</groupId>
//            <artifactId>postgresql</artifactId>
//            <version>42.6.0</version>
//        </dependency>
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-validation</artifactId>
//        </dependency>
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-data-jpa</artifactId>
//        </dependency>
//        <!--        &lt;!&ndash; Eclipselink JPA reference implementation &ndash;&gt;-->
//        <!--        <dependency>-->
//        <!--            <groupId>org.eclipse.persistence</groupId>-->
//        <!--            <artifactId>org.eclipse.persistence.jpa</artifactId>-->
//        <!--            <version>${org.eclipse.persistence.version}</version>-->
//        <!--        </dependency>-->
//        <!--        &lt;!&ndash; JPA metamodel for Criteria API &ndash;&gt;-->
//        <!--        <dependency>-->
//        <!--            <groupId>org.eclipse.persistence</groupId>-->
//        <!--            <artifactId>org.eclipse.persistence.jpa.modelgen.processor</artifactId>-->
//        <!--            <version>${org.eclipse.persistence.version}</version>-->
//        <!--            <scope>runtime</scope>-->
//        <!--        </dependency>-->
//
//        <!--        <dependency>-->
//        <!--            <groupId>org.springframework.boot</groupId>-->
//        <!--            <artifactId>spring-boot-starter-mail</artifactId>-->
//        <!--        </dependency>-->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-test</artifactId>
//            <scope>test</scope>
//        </dependency>
//
//        <dependency>
//            <groupId>com.sun.mail</groupId>
//            <artifactId>javax.mail</artifactId>
//            <version>1.6.2</version>
//        </dependency>
//        <!-- Web application -->
//        <!-- Will pull in web-related dependencies, including Jackson for JSON -->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-web</artifactId>
//        </dependency>
//        <!-- JPA dependencies -->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-data-jpa</artifactId>
//        </dependency>
//        <!-- PostgreSQL driver -->
//        <dependency>
//            <groupId>org.postgresql</groupId>
//            <artifactId>postgresql</artifactId>
//        </dependency>
//        <!-- Will pull in Spring security-related dependencies -->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-security</artifactId>
//        </dependency>
//        <!-- Logging -->
//        <dependency>
//            <groupId>org.slf4j</groupId>
//            <artifactId>slf4j-api</artifactId>
//        </dependency>
//        <dependency>
//            <groupId>ch.qos.logback</groupId>
//            <artifactId>logback-core</artifactId>
//        </dependency>
//        <dependency>
//            <groupId>ch.qos.logback</groupId>
//            <artifactId>logback-classic</artifactId>
//        </dependency>
//        <!-- Will pull in test dependencies -->
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-test</artifactId>
//            <scope>test</scope>
//        </dependency>
//        <!-- Spring security test utilities -->
//        <dependency>
//            <groupId>org.springframework.security</groupId>
//            <artifactId>spring-security-test</artifactId>
//            <scope>test</scope>
//        </dependency>
//
//        <dependency>
//            <groupId>io.jsonwebtoken</groupId>
//            <artifactId>jjwt-api</artifactId>
//            <version>0.11.5</version>
//        </dependency>
//
//        <dependency>
//            <groupId>io.jsonwebtoken</groupId>
//            <artifactId>jjwt-impl</artifactId>
//            <version>0.11.5</version>
//        </dependency>
//        <dependency>
//            <groupId>io.jsonwebtoken</groupId>
//            <artifactId>jjwt-jackson</artifactId>
//            <version>0.11.5</version>
//        </dependency>
//        <!-- z2 database for tests -->
//        <dependency>
//            <groupId>com.h2database</groupId>
//            <artifactId>h2</artifactId>
//            <scope>test</scope>
//        </dependency>
//
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-security</artifactId>
//        </dependency>
//    </dependencies>
//
//    <build>
//        <plugins>
//            <plugin>
//                <groupId>org.springframework.boot</groupId>
//                <artifactId>spring-boot-maven-plugin</artifactId>
//                <configuration>
//                    <excludes>
//                        <exclude>
//                            <groupId>org.projectlombok</groupId>
//                            <artifactId>lombok</artifactId>
//                        </exclude>
//                    </excludes>
//                </configuration>
//            </plugin>
//            <plugin>
//                <groupId>org.apache.maven.plugins</groupId>
//                <artifactId>maven-compiler-plugin</artifactId>
//                <version>${maven.compiler.plugin.version}</version>
//                <configuration>
//                    <source>17</source>
//                    <target>17</target>
//                    <annotationProcessorPaths>
//                        <path>
//                            <groupId>org.mapstruct</groupId>
//                            <artifactId>mapstruct-processor</artifactId>
//                            <version>${org.mapstruct.version}</version>
//                        </path>
//                        <path>
//                            <groupId>org.projectlombok</groupId>
//                            <artifactId>lombok</artifactId>
//                            <version>${lombok.version}</version>
//                        </path>
//                        <path>
//                            <groupId>org.projectlombok</groupId>
//                            <artifactId>lombok-mapstruct-binding</artifactId>
//                            <version>${lombok-mapstruct-binding.version}</version>
//                        </path>
//                    </annotationProcessorPaths>
//                </configuration>
//            </plugin>
//        </plugins>
//
//    </build>
//
//</project>