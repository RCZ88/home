package idkbruh;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static ArrayList<String> getFiles(String dir) {
        ArrayList<String> fileNames = new ArrayList<>();
        Path directoryPath = Paths.get(dir);

        // Check if the directory exists
        if (Files.exists(directoryPath) && Files.isDirectory(directoryPath)) {
            try (Stream<Path> paths = Files.list(directoryPath)) {
                paths.forEach(path -> {
                    if (Files.isRegularFile(path) && path.toString().endsWith(".ser")) {
                        fileNames.add(path.getFileName().toString());
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
        return fileNames;
    }

    public static void save(String dir, String name, Data d) {
        String filePath = dir + File.separator + name + ".ser";
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(d);
            System.out.println(d.getCash().size());
            System.out.println(d.getDates().size());
            System.out.println("Data Successfully Saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Data load(String dir, List<String> fileNames) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        System.out.println("Select Files!");
        for (String name : fileNames) {
            index++;
            System.out.println(index + ". " + name);
        }
        int i = 0;
        while (true) {
            i = sc.nextInt();
            i--;
            if (i >= 0 && i < fileNames.size()) {
                break;
            } else {
                System.out.println("Invalid Index");
            }
        }
        String filePath = dir + File.separator + fileNames.get(i);
        System.out.println("Loading from: " + filePath);
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (Data) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Data d = null;
        final String dir = "C:\\Users\\cleme\\eclipse-workspace\\SavingClassTest\\src\\Datas";
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        while (true) {
            while (true) {
                System.out.println("Choose your Action!");
                System.out.println("1. Load Data\n2. Create new Data\n0. Exit");
                System.out.print("Enter Choice: ");
                menuChoice = sc.nextInt();
                if (menuChoice >= 0 && menuChoice <= 2) {
                    break;
                } else {
                    System.out.println("Invalid Input");
                }
            }
            switch (menuChoice) {
                case 0:
                    break;
                case 1:
                    ArrayList<String> files = getFiles(dir);
                    d = load(dir, files);
                    break;
                case 2:
                    System.out.print("File Name: ");
                    String name = sc.next();
                    d = new Data(name);
                    save(dir, name, d);
                    break;
            }
            if (menuChoice != 0) {
                int input = 0;
                while (true) {
                    while (true) {
                        System.out.println("1. Add Data\n2. Print Data\n3. Toggle AutoSave\n0. Save and Exit");
                        input = sc.nextInt();
                        if (input >= 0 && input < 4) {
                            break;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    }
                    switch (input) {
                        case 0:
                        	save(dir, d.getName(), d);
                            break;
                        case 1:
                            System.out.print("Income: ");
                            double income = sc.nextDouble();
                            System.out.print("Outcome: ");
                            double outcome = sc.nextDouble();
                            System.out.print("Notes: ");
                            sc.nextLine(); // Consume the newline
                            String note = sc.nextLine();
                            d.addIncome(income);
                            d.addOutcome(outcome);
                            d.addDate();
                            d.addCash();
                            d.addNote(note);
                            if(d.getAutoSave()) {
                            	save(dir, d.getName(), d);
                            }
                            break;
                        case 2:
                            d.printData();
                            break;
                        case 3:
                            if (d.getAutoSave()) {
                                d.setSave(false);
                                System.out.println("Autosave: False");
                            } else {
                                d.setSave(true);
                                save(dir, d.getName(), d);
                                System.out.println("Autosave: True");
                            }
                            break;
                    }
                    if (input == 0) {
                        break;
                    }
                }
            }
            if (menuChoice == 0) {
                break;
            }
        }
    }
}
