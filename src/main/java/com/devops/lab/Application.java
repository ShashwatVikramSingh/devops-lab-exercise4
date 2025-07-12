package com.devops.lab;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Main Application class for DevOps Lab Exercise
 * Updated for CI/CD demonstration
 */
public class Application {
    
    public static void main(String[] args) {
        Application app = new Application();
        app.displayWelcomeMessage();
        app.displayCurrentTime();
        app.displaySystemInfo();
        app.displayBuildInfo();
    }
    
    /**
     * Display welcome message
     */
    public void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("  DevOps Lab Exercise - CI/CD");
        System.out.println("  Updated Version 1.1");
        System.out.println("=================================");
        System.out.println("Welcome to Continuous Integration Demo!");
        System.out.println("This build was triggered automatically!");
    }
    
    /**
     * Display current date and time
     */
    public void displayCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Time: " + now.format(formatter));
    }
    
    /**
     * Display system information
     */
    public void displaySystemInfo() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("User: " + System.getProperty("user.name"));
        System.out.println("Build Status: SUCCESS");
    }
    
    /**
     * Display build information
     */
    public void displayBuildInfo() {
        System.out.println("Build Tool: Maven");
        System.out.println("CI/CD Tool: Jenkins");
        System.out.println("Version Control: Git");
        System.out.println("=================================");
    }
    
    /**
     * Method to get greeting message (for testing)
     */
    public String getGreeting() {
        return "Hello from DevOps Lab - Updated!";
    }
    
    /**
     * Method to add two numbers (for testing)
     */
    public int addNumbers(int a, int b) {
        return a + b;
    }
    
    /**
     * Method to get version (for testing)
     */
    public String getVersion() {
        return "1.1";
    }
}
