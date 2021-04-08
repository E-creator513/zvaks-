package com.utility.collection;
import com.collection.Flat;

import java.util.*;

public class Commander {

    /**
     * @author Zvavamwe Emmanuel
     * @version 1.0
     * Method for handling user`s command


        /** Collection manager for realising user`s commands */
        private final collectionManager collectionManager;
        /** Field for receiving user`s command */
        private String userCommand;
        /** Field for separating user input into a command and an argument to it */
        private String[] finalUserCommand;

        {
            userCommand = "";
        }

        /**
         * Constructor for making a commander
         * @param manager - CollectionManager class object which will realise user`s commands
         */
        public Commander(collectionManager manager) {
            this.collectionManager = manager;
        }

        /**
         * Method for starting interactive mood
         */
        public void interactiveMod() {
            try {
                try (Scanner commandReader = new Scanner(System.in)) {
                    while (!userCommand.equals("exit")) {
                        System.out.print("Enter Command here : ");
                        userCommand = commandReader.nextLine();
                        finalUserCommand = userCommand.trim().toLowerCase().split(" ", 2);
                        try {
                            switch (finalUserCommand[0]) {
                                case "":
                                    break;
                                case "help":
                                    collectionManager.help();
                                    break;
                                case "info":
                                    collectionManager.info();
                                    break;
                                case "show":
                                    collectionManager.show();
                                    break;
                                case "add":
                                    collectionManager.add();
                                    break;
                                case "update_by_id":
                                    collectionManager.update_by_id(finalUserCommand[1]);
                                    break;
                                case "remove_by_id":
                                    collectionManager.remove_by_id(finalUserCommand[1]);
                                    break;
                                case "clear":
                                    collectionManager.clear();
                                    break;
                                case "save":
                                    collectionManager.save();
                                    break;
                                case "execute_script":
                                    collectionManager.execute_script(finalUserCommand[1]);
                                    break;
                                case "exit":
                                    collectionManager.exit();
                                    break;
                                case "add_if_min":
                                    System.out.println("THE characters element to be compared .");
                                    collectionManager.add_if_min(new Flat(collectionManager.receiveId(), collectionManager.receiveName(),
                                            collectionManager.receiveCoordinates(), collectionManager.returnDate(),
                                            collectionManager.receiveArea(), collectionManager.receiveLivingSpace(),
                                            collectionManager.receiveView(), collectionManager.receiveFurnish(),collectionManager.ReceiveNumberOfRooms()));
                                    break;


                                case "sum_of_height":
                                    collectionManager.sum_of_height();
                                    break;


                                default:
                                    System.out.println("Unknown command. Write help for help.");
                                    break;
                            }
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            System.out.println("Argument of command is absent. Write help for help.");
                        }
                    }
                }
            } catch (NoSuchElementException noSuchElementException) {
                System.out.println("Program will be finished now.");
                System.exit(1);
            }
        }

        /** Method for comparing elements */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Commander)) return false;
            Commander commander = (Commander) o;
            return Objects.equals(commander, commander.collectionManager);
        }

        /** Method for receiving hashcode of element */
        @Override
        public int hashCode() {
            int result = Objects.hash(collectionManager, userCommand);
            result = 42 * result + Arrays.hashCode(finalUserCommand);
            return result;
        }
    }

