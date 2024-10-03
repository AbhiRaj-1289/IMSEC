def chatbox_response(user_input):
    responses = {
        "hello": "Hello! How can I help you?",
        "how are you": "I am a bot, but I am doing great. How about you?",
        "what is your name": "I am your chatbot assistant!",
        "bye": "Chaliye Chalte hai",
        "namaste": "Namaste, Kaise hai aap?"
    }
    user_input = user_input.lower()

    return responses.get(user_input, "I am sorry, I didn't understand that.")

while True:
    user_input = input("You: ")
    if user_input.lower() == "bye":
        print("Chatbox: Bye")
        break

    print("Bot:", chatbox_response(user_input))
