PACAKAGE CLOUD DEPLOYMENT SETTINGS.XML

    <servers>
        <server>
            <id>packagecloud.releases</id>
            <password>{your-api-key}</password>
        </server>
        <server>
            <id>packagecloud.snapshots</id>
            <password>{your-api-key}</password>
        </server>
    </servers>

NEXUS DEPLOYMENT SETTINGS.XML
  
    <servers>

        <server>
            <id>nexus-snapshot</id>
            <username>admin</username>
            <password>admin</password>
        </server>
        <server>
            <id>nexus-release</id>
            <username>admin</username>
            <password>admin</password>
        </server>
    </servers>


NEXUS GROUP SETTINGS.XML


        <server>
            <id>nexus-snapshot</id>
            <username>admin</username>
            <password>admin</password>
        </server>
        <server>
            <id>nexus-release</id>
            <username>admin</username>
            <password>admin</password>
        </server>
    </servers>

    <mirrors>
        <mirror>
            <id>central</id>
            <name>central</name>
            <url>http://localhost:8081/repository/nexus-group/</url>
            <mirrorOf>*</mirrorOf>
        </mirror>
    </mirrors>