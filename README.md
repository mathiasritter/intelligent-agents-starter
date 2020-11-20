# Intelligent Agents Starter Template

This is a starter template for development of an agent with Genius and Gurobi.

## 🧑‍💻 Development

First, clone this repository and import the project into your preferred IDE.
Then, to develop your Agent, put your source code into packages located in `src/main/java`.

This template contains two example agents: a simple example, and a more advanced example using the BOA framework. Both agents simply place random bids above a target.


## 🏎 Running

You can run the Genius GUI or a Tournament by using the Gradle Wrapper included in this repository.

### Genius GUI

To Run the Genius GUI, execute the following command on the command line:
- On Mac/Linux: `./gradlew runTournament`
- On Windows: `gradlew.bat runTournament`

### Tournament

To run the tournament, execute the following command on the command line:
- On Mac/Linux: `./gradlew runTournament`
- On Windows: `gradlew.bat runTournament`


## 👷 Building

To build a `jar` file that includes compiled classes and source code, execute the following command on the command line:
- On Mac/Linux: `./gradlew jar`
- On Windows: `gradlew.bat jar`

The `jar` file will be written to `build/libs` and won't include any external dependencies.


## ⚙️ Configuration

This section describes configuration of your Agent and Project Dependencies/Tasks.

### Agent

If you want to add your agent in the Genius GUI, run the GUI (see above), which will also compile your source code.
In Genius, proceed to add your agent as usual. The compiled Agent `class` is located in `build/classes/java/main` + directories named according to your java packages.

### Project Dependencies/Tasks

This project uses Gradle to configure any tasks/builds and to manage external libraries.
The libraries `genius` and `gurobi` are included per default.
If you want to update this configuration, please edit the `build.gradle.kts` file.


## 🆘 Help

If you run into any issues or have any questions, feel free to contact me at [mr2n17@soton.ac.uk](mailto:mr2n17@soton.ac.uk).
