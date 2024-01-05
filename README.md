# Travel Agency Project

This Java project is designed to help travel agencies maintain their travel packages' itinerary and passengers.

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Overview

This project allows travel agencies to manage travel packages, including details about the itinerary, destinations, activities, and passengers. It supports different types of passengers (standard, gold, premium) with various enrollment rules and provides functionalities to print itinerary details, passenger lists, individual passenger details, and available activities.

## Prerequisites

- Java Development Kit (JDK) installed
- Integrated Development Environment (IDE) such as IntelliJ or Eclipse
- Git (optional for version control)

## Getting Started

1. **Clone the repository to your local machine:**
    ```bash
    git clone https://github.com/your-username/travel-agency-project.git
    ```

2. **Open the project in your preferred IDE.**
3. **Build the project.**

## Usage

1. Explore the `Main` class to see a sample usage of the project.
2. Modify the code in the classes (e.g., `TravelPackage`, `Passenger`, etc.) to suit your specific requirements.
3. Run the `Main` class to test the project with sample data.

## Project Structure

- **src:** Contains the source code files.
  - `TravelPackage.java`: Represents a travel package.
  - `Itinerary.java`: Represents the itinerary of a travel package.
  - `Destination.java`: Represents a destination within an itinerary.
  - `Activity.java`: Represents an activity available at a destination.
  - `Passenger.java`: Represents a passenger with enrollment details.
  - `EnrolledActivity.java`: Represents an activity that a passenger is enrolled in.
  - `StandardPassenger.java`, `GoldPassenger.java`, `PremiumPassenger.java`: Subclasses of `Passenger` with specific behavior.
  - `Main.java`: Sample main class demonstrating project usage.
- **test:** Contains unit test files.

## Contributing

Feel free to contribute to the project by opening issues or submitting pull requests.
