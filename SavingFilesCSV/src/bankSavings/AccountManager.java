package bankSavings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	private List<Integer> accountIDs;
    private static final String FILE_NAME = "account_ids.txt";

    public AccountManager() {
        accountIDs = new ArrayList<>();
        loadAccountIDs();  // Load existing account IDs from the file
    }

    public void addAccountID(int accountID) {
        accountIDs.add(accountID);
        saveAccountIDs();  // Save the updated list to the file
    }

    public List<Integer> getAllAccountIDs() {
        return new ArrayList<>(accountIDs);  // Return a copy to prevent external modification
    }

    private void loadAccountIDs() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            // Load account IDs from the file
            String line;
            while ((line = reader.readLine()) != null) {
                int id = Integer.parseInt(line.trim());
                accountIDs.add(id);
            }
        } catch (FileNotFoundException e) {
            // Create the file if it doesn't exist
            createAccountIDsFile();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void createAccountIDsFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            // Initial content if needed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void saveAccountIDs() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int id : accountIDs) {
                writer.write(Integer.toString(id));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
