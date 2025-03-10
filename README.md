﻿# NumberGuessingGame
# 🎯 Guess the Number Game

## 📌 About
The **Guess the Number Game** is a command-line Java game where players try to guess a randomly generated number between 1 and 100. The game offers three difficulty levels:
- **Easy**: 10 guesses
- **Medium**: 5 guesses
- **Hard**: 3 guesses

## 🚀 Features
✅ Random number generation between 1 and 100  
✅ Three difficulty levels  
✅ Input validation to handle incorrect entries  
✅ Interactive feedback on guesses  
✅ User-friendly messages and retry attempts  
✅ Clean and optimized code structure

## 🛠️ Installation & Setup
1. **Clone the repository**:
   ```sh
   git clone https://github.com/tjothiprakash/guess-number-game.git
   cd guess-number-game
   ```

2. **Compile the Java file**:
   ```sh
   javac GuessNumber.java
   ```

3. **Run the game**:
   ```sh
   java GuessNumber
   ```

## 🎮 How to Play
1. Run the game in your terminal.
2. Select a difficulty level by entering 1, 2, or 3.
3. Enter a number between 1 and 100.
4. Get feedback on whether your guess is too high or too low.
5. Keep guessing until you win or run out of attempts.

## 📝 Example Gameplay
```
Welcome to the Guess the Number Game
++++++++++++++++++++++++++++++++++++

Choose your difficulty level:
1. Easy (10 guesses)
2. Medium (5 guesses)
3. Hard (3 guesses)

Enter your choice: 2
You have 5 guesses to guess the number.
Guess a number between 1 and 100: 50
Your number is lower than the actual one. Try again.
Remaining attempts: 4
...
Congratulations! You guessed correctly! The number was 73.
```

## 📌 Code Structure
- `GuessNumber.java` - Contains the main logic of the game.
- Uses a `Map` to store difficulty levels.
- Implements `try-with-resources` to handle user input safely.

## 🔧 Future Enhancements
- Add a **scoring system** based on attempts.
- Implement a **leaderboard** for best scores.
- Add **multiplayer mode**.
- Create a **GUI version**.

## 📜 License
This project is licensed under the **MIT License**.

---
👨‍💻 **Developed by:** TJOTHIPRAKASH
📧 **Contact:** jothiprakash888@gmail.com 
🔗 **GitHub:** [Your GitHub Profile](https://github.com/tjothiprakash)
https://roadmap.sh/projects/number-guessing-game
