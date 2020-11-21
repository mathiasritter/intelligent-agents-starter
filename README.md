# 🤖 Intelligent Agents Starter Template

This is a starter template for development of an agent with Genius and Gurobi that requires zero IDE configuration - thanks to Gradle!

The template contains two example agents: a simple example, and a more advanced example using the BOA framework.
Both agents simply place random bids above a target.

## 🧑‍💻 Development

First, clone this repository and import the project into your preferred IDE (see below) - IntelliJ is recommended.
When developing your Agent, put your source code into packages located in `src/main/java`.

### IntelliJ

Open IntelliJ and select "Open or Import" on the start screen OR "File" and "Open..." from the menu bar.
Choose the root repository folder when importing.

### Eclipse

Open Eclipse and select "File" and "Import..." from the menu bar.
In the dialog, select "Existing Gradle Project" from the "Gradle" folder.
Choose the root repository folder when importing.


## 🏎 Running

You can run the Genius GUI or a Tournament by running Gradle Tasks via the Gradle Wrapper included in this repository.
There are two configured Gradle Tasks for running:
- `run`: Runs the Genius GUI.
- `runTournament`: Runs a Tournament, as specified in `genius/multilateraltournament.xml`.

Gradle Tasks can be run via command line or from your IDE.

### Command Line

It is easy to run Gradle Tasks from the command line.
Make sure you are in the root directory of this repository, then run:
- On Mac/Linux: `./gradlew <Task Name>`
- On Windows: `gradlew.bat <Task Name>`

Replace `<Task Name>` with either `run` or `runTournament`.

### IDE

Most IDEs provide some sort of user interface that allows you to run Gradle Tasks.
- In IntelliJ, select "View", "Tool Windows" and "Gradle" from the menu bar.
- In Eclipse, select "Window", "Show View", "Other..." from the menu bar and then "Gradle", "Gradle Tasks" from the dialog.

Now you can click on the `run` and `runTournament` Gradle Tasks to execute them from your IDE.

## 👷 Building

There's also a Gradle Task to build a `jar` file that includes compiled classes and source code.
The Task is called `jar` and you can run it in same way as other Tasks (see section "Running" above).
For example, to run this Task from the command line, execute:
- On Mac/Linux: `./gradlew jar`
- On Windows: `gradlew.bat jar`

The `jar` file will be written to `build/libs` and won't include any external dependencies.


## ⚙️ Configuration

This section describes configuration of your Agent and Gradle.

### Agent

If you want to add your agent in the Genius GUI, run the GUI (see above), which will also compile your source code.
In Genius, proceed to add your agent as usual.
The compiled Agent `class` is located in `build/classes/java/main` + directories named according to your java packages.

### Gradle

The build tool Gradle is used to configure any Project Dependencies or Tasks.
Per default, `genius` and `gurobi` libraries are included.
If you want to update this configuration, edit the `build.gradle.kts` file.


## 🆘 Help

If you run into any issues or have any questions, feel free to contact me at [mr2n17@soton.ac.uk](mailto:mr2n17@soton.ac.uk) or on Microsoft Teams.
