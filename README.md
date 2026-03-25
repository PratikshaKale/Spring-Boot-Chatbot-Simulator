# WhatsApp Chatbot Backend Simulation
Built with Java and Spring Boot.

## Features
- **REST API Endpoint:** `/webhook` accepts POST requests.
- **Logic:** Responds "Hello" to "Hi" and "Goodbye" to "Bye".
- **Logging:** All incoming messages are logged to the console.

## How to Run
1. Clone the repo: `git clone https://github.com/PratikshaKale/Spring-Boot-Chatbot-Simulator.git`
2. Run the app: `./mvnw spring-boot:run`
3. Test using Postman: `POST http://localhost:8080/webhook`
