package Lap6;

import java.util.Scanner;

public class test {
	public static void main(String[] args) throws Exception {
		
		PH ph1 = new PH();
		Scanner input = new Scanner(System.in);
        LinkedQueue waiting = new LinkedQueue();
        int choice, amount;
        
        String name, dose, directions;

        do {

            System.out.println("Welcome to hospital Information Syatem ");
            System.out.println("1-New patient");
            System.out.println("2-displey patients");
            System.out.println("3-pharmacy System");
            System.out.println("4-Exit");
            System.out.println("Enter your choice :");
            choice = input.nextInt();
            switch (choice) {

                case 1://Doctor
                    System.out.println("Please enter the patient Id ");
                    int id = input.nextInt();
                    patient p = ph1.Search_Patient(id);
                    if (p == null) {
                        System.out.print("invalid Id");
                        break;
                    } else {
                        System.out.println("Please enter a medicine name ");
                        name = input.next();
                        System.out.println("Please enter a medicine dose");
                        dose = input.next();
                        System.out.println("Please enter a medicine amount ");
                        amount = input.nextInt();
                        System.out.println("Please enter a medicine directions");
                        directions = input.next();
                        Medication mdc = new Medication(name,dose , amount, directions);
                       
                        prescriptions presc = new prescriptions(id, mdc);

                        waiting.enqueue(presc);

                        System.out.println("prescriptions has been added successfully to the queue");

                    }

                    break;

                case 2:
                			ph1.PrintPatients();
                			break;
                case 3:
                    System.out.printf("Hello,  there are %d unprepared prescriptions %n", waiting.size());
                    if (waiting.size() != 0) {
                        System.out.println("The first prescriptions is \n");
                        prescriptions pr = (prescriptions) waiting.first();

                        pr.print();

                        System.out.println("if done please enter \"Done\" \n");
                        if (input.next().equalsIgnoreCase("Done")) {
                            waiting.dequeue();
                        }
                    }

                    break;
            }
        } while (choice != 4);

    }


	}

