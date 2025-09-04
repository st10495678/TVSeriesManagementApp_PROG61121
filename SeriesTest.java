/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.co.varsitycollege.tvseries.test;

/**
 *
 * @author lab_services_student
 */
public class SeriesTest {
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Series;

/**
 *
 * @author lab_services_student
 */
public class Series {
    static ArrayList<SeriesMOdel> seriesList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in):
    
    public stsic void launchMenu() {
        while (true) {
            System.out.println("\n==== LATEST SERIES 2025 ====");
            System.out.println("Please select one of the following:");
            System.out.println("(1) Capture new series");
            System.out.println("(2) Search for series");
            system.out.println("(3) Update series");
            System.out.println("(4) Delete Series");
            System.out.println("(5) Prinbt series report");
            System.out.println("(6) Exit Application");
            System.out.print("Enter your choice");
            
            String choice = scanner.nextLine();
            
            switch(choice) {
                case "1":
                    captureSeries();
                    break;
                case "2":
                    searchSeries();
                    break;
                case "3:":
                    updateSeries();
                    break;
                case "4":
                    deleteSeries();
                    break;
                case "5"    
                        seriesReport();
                        break;
                case "6"
                    exitSeriesApplication();
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
        }
    }
}

public static void captureSeries() {
    System.out.println("\n=== CAPTURE NEW SERIES ===");
    System.out.print("Enter the series ID: ");
    String id = scanner.nextLine();
    
    System.out.print("Enter the series name: ");
    String name = scanner.nextLine();
    
    int age = validateAge();
    
    System.out.print("Enter the number of episodes: ");
    int episodes = Integer.parseInt(scanner.nextLine());
    
    seriesList.add(new SeriesModel(id, name, age, episodes));
    System.out.println("Series processed successfully!");
}

public static int validateAge() {
    int age;
    while (true)
        System.out.print("Enter the series age restriction: "):
        String input = scanner.nextLine();
        try {
            age = Integer.parseInt(input);
            if (age >= 2 && age <= 18) {
                break;
            } else{
                System.out.println("You haev entered an invalid series age! Please re-enter.");
            }    
        } catch (NumberFormatException e) {
            System.out.println("You have entered an incorrect series age! Please re-enter"); 
        }
    }    
    return age;
}

public static void searchSeries() {
   System.out.println("Enter the series ID to search:");
   String id = scanner.nextLine();
   boolean found = false;

   for(SeriesModel s : seriesList) {
       if (s.getSeriesId().equals(id)){
           System.out.println("\n" + s);
           found = true;
           break;
        }
    }

    if (!found) {
        System.out.println("Series with Series ID: " + id + "was not found");
    }    
}

public static void updateSeries
    System.out.print("Enter the series ID to Update: ");
    String id = scanner.nextLine();

    for (SeriesModel s : seriesList){
         if (s.getSeriesId().equals(id)) { 
             System.out.print("Enter the new series name: ");
             s.setSeriesName(scanner.nextLine());
        
             s.setSeriesAge(validateAge()):

             System.out.print("Enter the New number of episodes: ");
             s.setNumberOfEpisodes(Integer.parseInt(scanner.nextLine()));

             System.out.println("Series updated successfully!");
             return;
          }
    }
    System.out.println("Series with series ID: " + id + " was not found.");
}

public static void deleteSeries() {
    System.out.print("Enter the series Id to delete: ");
    String id = scanner.nextLine();

    for (s.getSeriesId().equals(id)) {
        if (s.getSeriesId().equals (id)){
            System.out.print("Are you sure you want to delete series " +id + "? (y/n): ");
            string confrim = scanner.nextLine();
            if (confirm.equalsIgnorecase("Y")) {
                seriesList.remove(s);
                System.out.println("Series ID: " + id + "was deleted.");
            } else {
                System.out.println("Deletion cancelled.");
            }  
            return;
        }
    }
    System.out.println("Series with series ID: " + id + "was not found.");
}

public static void seriesReport() {
    if (seriesList.isEmpty()) {
        System.out.println("No Serise available");
    } else {
        int count = 1;
        for (SeriesModel s : seriesList) {
             System.out.println("\nSeries " + count++);
             System.out.println(s);
        }
    }
}

public static void exitSeriesApplication() {
    System.out.println("Exiting application...Goodbye");
}
}
}
