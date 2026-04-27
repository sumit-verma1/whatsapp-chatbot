# whatsapp-chatbot
## Description
This is a simple WhatsApp chatbot backend built using Java and Spring Boot.

## Features
- REST API endpoint (/webhook)
- Accepts POST JSON input
- Predefined responses (Hi → Hello, Bye → Goodbye)

## API
POST /webhook

Request:
{
  "message": "Hi"
}

Response:
{
  "reply": "Hello"
}
