package chapterfive;


import java.util.Scanner;

public class PhoneBook {
        public PhoneBook() {
        }

        public static void main(String[] args) {
            String format = "press 1 for Phonebook\npress 2 for Messages\npress 3 for Chat\npress 4 for Call register\npress 5 for Tones\npress 6 for Settings\npress 7 for Call divert\npress 8 for Games\npress 9 for Calculator\npress 10 for Reminders\npress 11 for Clock\npress 12 for Profiles\npress 13 for Sim services\npress 0 to exit\n";
            System.out.println(format);
            System.out.println("Enter any of the numbers above to proceed: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            String message;
            int messages;
            String setting;
            int sett;
            switch (number) {
                case 1:
                    message = "press 1 to search\npress 2 for service nos\npress 3 to add name\npress 4 to erase\npress 5 to edit\npress 6 to assign tone\npress 7 to send b'card\npress 8 for options\npress 9 for speed dials\npress 10 for voice tags\n";
                    System.out.println(message);
                    System.out.println("Select any of the numbers above to proceed");
                    messages = input.nextInt();
                    switch (messages) {
                        case 1:
                            System.out.println("You are using the search box");
                            return;
                        case 2:
                            System.out.println("You are in for service nos");
                            return;
                        case 3:
                            System.out.println("You can add name now");
                            return;
                        case 4:
                            System.out.println("You can erase now");
                            return;
                        case 5:
                            System.out.println("Edit");
                            return;
                        case 6:
                            System.out.println("Assign tone");
                            return;
                        case 7:
                            System.out.println("Send b'card");
                        case 8:
                            setting = "Enter 1 for type of view\nEnter 2 for message validity\n";
                            System.out.println("options");
                            System.out.println("enter any of the number above to proceed");
                            sett = input.nextInt();
                            switch (sett) {
                                case 1:
                                    System.out.println("You are in the type of view");
                                    break;
                                case 2:
                                    System.out.println("You want to check your memory status");
                                    break;
                                default:
                                    System.out.println("You have to enter one");
                            }
                        case 9:
                            System.out.println("Speed dials selected");
                            return;
                        case 10:
                            System.out.println("Voice tag selected");
                            return;
                        default:
                            return;
                    }
                case 2:
                    message = "press 1 to write message\npress 2 to check inbox\npress 3 to check outbox\npress 4 for picture messages\npress 5 for templates\npress 6 for smileys\npress 7 for message settings\npress 8 for info service\npress 9 to check voice mail number\npress 10 to check service command editor\n";
                    System.out.println(message);
                    System.out.println("Select any of the numbers above to proceed");
                    messages = input.nextInt();
                    switch (messages) {
                        case 1:
                            System.out.println("Now u can write your texts messages");
                            break;
                        case 2:
                            System.out.println("You have a message");
                            break;
                        case 3:
                            System.out.println("No message in outbox");
                        case 4:
                            System.out.println("Picture message");
                        case 5:
                            System.out.println("Templates are not available right now");
                        case 6:
                            System.out.println("LOL smileys only available");
                        case 7:
                            setting = "Enter 1 for Set 1\nEnter 2 for Common\n";
                            System.out.println(setting);
                            System.out.println("Enter 1 of the number above");
                            sett = input.nextInt();
                            switch (sett) {
                                case 1:
                                    String settt = "Enter 1 for Message Centre Number\nEnter 2 for Message sent as\nEnter 3 for Message validity\n";
                                    System.out.println(settt);
                                    System.out.println("Enter 1 of the above");
                                    int setvv = input.nextInt();
                                    switch (setvv) {
                                        case 1:
                                            System.out.println("This is the message centre number");
                                            break;
                                        case 2:
                                            System.out.println("Your message was sent as");
                                            break;
                                        case 3:
                                            System.out.println("Message validity is ok");
                                        default:
                                            System.out.println("Enter 1 of the key biko");
                                    }
                                case 2:
                                    String settv = "Enter 1 to check delivery report\nEnter 2 to reply via same centre\nEnter 3 for character support\n";
                                    System.out.println(settv);
                                    System.out.println("Enter 1 of the above");
                                    int settvv = input.nextInt();
                                    switch (settvv) {
                                        case 1:
                                            System.out.println("Message delivered");
                                            return;
                                        case 2:
                                            System.out.println("Replied via same centre");
                                            return;
                                        case 3:
                                            System.out.println("Check character support");
                                            return;
                                        default:
                                            System.out.println("Enter 1 of the key biko");
                                            return;
                                    }
                                case 3:
                                    System.out.println("Begin chatting with your loved ones");
                            }
                    }
            }

        }
    }


