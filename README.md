# Spring AI

## Description

This project is a simple example of using **Spring Boot**, **Maven**, and the **OpenAI API** to build an AI-powered application.

## Requirements

* Java 17+
* Maven 3.8+
* Spring Boot 3+
* OpenAI API Key

## Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/ivandj0h/ai-springdev.git
   cd ai-springdev
   ```

2. **Configure OpenAI API Key**

   Add your API key in `application.properties`:

   ```properties
   openai.api.key=YOUR_OPENAI_API_KEY
   ```

3. **Build and Run the Project**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## Example Endpoint

Example controller endpoint:

```java
@RestController
@RequestMapping("/api/ai")
public class AiController {

    @Autowired
    private OpenAiService openAiService;

    @GetMapping("/ask")
    public ResponseEntity<String> ask(@RequestParam String prompt) {
        String response = openAiService.askOpenAi(prompt);
        return ResponseEntity.ok(response);
    }
}
```

## Example Service

Example service to call OpenAI:

```java
@Service
public class OpenAiService {

    @Value("${openai.api.key}")
    private String apiKey;

    public String askOpenAi(String prompt) {
        // Implement the call to OpenAI API
        // You can use RestTemplate or WebClient
        return "Response from OpenAI";
    }
}
```

## License

This project is licensed under the MIT License.

---

Happy coding bro! 🚀
