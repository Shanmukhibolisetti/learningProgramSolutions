package learningProgramSolutions.BuildPatternExample;

public class Test {

    public static void main(String[] args) {

        // Basic configuration
        Computer basicComputer = new Computer.Builder()
                .setCpu("Intel i3")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .build();

        // Gaming configuration
        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11")
                .build();

        // Office configuration
        Computer officeComputer = new Computer.Builder()
                .setCpu("AMD Ryzen 5")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Ubuntu Linux")
                .build();

        // Display all configurations
        basicComputer.displayConfiguration();
        gamingComputer.displayConfiguration();
        officeComputer.displayConfiguration();
    }
}
