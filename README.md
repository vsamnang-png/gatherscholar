**GatherScholar**

GatherScholar is a platform that collect all scholarship opportunities to put on a single platform for students to search for easily. They don't have to go to different platforms like Facebook, Tik Tok, Instagram, etc to find scholarships.

**Features**
- Add scholarship
- Delete scholarship
- Edit scholarships
- Search scholarship by name and country

**Technology Used**
Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
Database
- PostgreSQL
Development Tools
- Intellij IDEA
- Git & GitHub
- Postman (API testing)
Publishing tool
- Railway

**Database Configuration**
It is defined in src/main/resources/application.properties

**Database Structure Figure**

Scholarship
- ID
- Name
- Country
- Level
- Deadline

To deploy the project (short documentation):
1. Configure the database connection in "application.properties"
2. Build the project using Maven: mvn clean package
3. Run the generated JAR file: java -jar target/scholargather.jar
4. The application will start and expose the API endpoints.

Link to deployment on Railway: https://gatherscholar-production.up.railway.app/

AI Disclosure
AI was used in assistance of creating this project such as organizing and debuggin problems.
