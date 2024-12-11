# GROOVY (Fullstack) avec Spring boot 3, Angular 17, Bootstrap 5, PostgreSQL, Auth0 (2024) (Backend)

Spring boot backend of the spotify clone

### Key Features :
- 🔐 Security with Auth0 (OAuth2)
- 🎶➕ Music Upload
- 🎧 Audio Streaming
- 🔍 Search Function
- ❤️ User Favorites
- 📱💻 Responsive UI with Bootstrap
- 🅰️ Latest Angular Features: Signal, Standalone Component, New Control Flow Syntax

## Usage
### Prerequisites
- JDK 21
- IDE (VS code, IntelliJ)
- PostgreSQL

### Clone the repository
````

### Setup .env file
Create a .env file at the root of the project
(Make sure the username and DB matches with ur Postgres DB)
````
POSTGRES_USERNAME= <username>
POSTGRES_PASSWORD= <default is blank>
POSTGRES_URL= <url>
POSTGRES_DB= <dbname>

AUTH0_CLIENT_ID=
AUTH0_CLIENT_SECRET=
````

### Fetch the dependencies
``./mvnw install -Dmaven.test.skip=true``

### Launch
Go in IntelliJ add .env file to the environment variables and then run it
