package modules;

import java.time.LocalDate;

public class Challenge_9 {
    public static void challenge_9() {
        int lineNumbers = 15;
        String[] firstnames = {
            "Liam", "Emma", "Noah", "Olivia", "Elijah",
            "Ava", "James", "Isabella", "William", "Sophia",
            "Benjamin", "Charlotte", "Lucas", "Amelia", "Henry",
            "Mia", "Alexander", "Harper", "Michael", "Evelyn",
            "Daniel", "Abigail", "Matthew", "Emily", "Jackson",
            "Ella", "Sebastian", "Elizabeth", "Jack", "Sofia"
        };
        String[] lastnames = {
            "Smith", "Johnson", "Williams", "Brown", "Jones",
            "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson",
            "Thomas", "Taylor", "Moore", "Jackson", "Martin",
            "Lee", "Perez", "Thompson", "White", "Harris",
            "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson",
            "Walker", "Young", "Allen", "King", "Wright",
            "Scott", "Torres", "Nguyen", "Hill", "Flores"
        };
        String[] services = {"Cardiology", "Radiology", "Pediatrics", "Geriatrics", "Pulmonology"};
        String[] reasons = {"Appointement", "Visit"};
        LocalDate date = LocalDate.now(); // Create a date object
        write.writeC9("date, firstname,lastname,reason,service\n");
        int i = 0;
        while (i < lineNumbers) {
            int randFirstname = (int) (Math.random() * firstnames.length);
            int randLastname = (int) (Math.random() * lastnames.length);
            int randReason = (int) (Math.random() * reasons.length);
            int randService = (int) (Math.random() * services.length);
            if (randReason == 0) {
                String data = (date + "," + firstnames[randFirstname] + "," + lastnames[randLastname] + "," + reasons[randReason] + "," + services[randService] + "\n");
                System.out.println(data);
                write.writeC9(data);
            } else if (randReason == 1){
                String data = (date + "," + firstnames[randFirstname] + "," + lastnames[randLastname] + "," + reasons[randReason] + "\n");
                System.out.println(data);
                write.writeC9(data);               
            }
            i++;
        }     
    } 
}
