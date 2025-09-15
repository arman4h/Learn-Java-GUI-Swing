# JFrame Basics - Java Swing Tutorial

## Overview
This repository contains the first lesson on Java Swing programming, focusing on creating and configuring a basic JFrame window. This tutorial covers fundamental JFrame operations and properties essential for GUI development in Java.

## What You'll Learn
- Creating a basic JFrame window
- Setting window properties (title, size, icon)
- Configuring close operations
- Customizing appearance (background color)
- Making the frame visible

## Prerequisites
- Basic Java programming knowledge
- Java Development Kit (JDK) installed
- IDE or text editor for Java development

## Code Example

### Basic JFrame Setup
```java
import javax.swing.*;
import java.awt.Color;

public class FirstApp extends JFrame {
    public FirstApp() {
        // Set title
        this.setTitle("First Java App");
        
        // Set default close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set size of the frame
        this.setSize(720, 720);
        
        // Set frame icon
        ImageIcon image = new ImageIcon("src/favicon.png");
        this.setIconImage(image.getImage());
        
        // Set background color
        this.getContentPane().setBackground(new Color(123, 50, 250));
        
        // Make frame visible
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new FirstApp(); // Create and display the frame
    }
}
```

## Key Methods Explained

### `setTitle(String title)`
Sets the title that appears in the window's title bar.
```java
this.setTitle("First Java App");
```

### `setDefaultCloseOperation(int operation)`
Defines what happens when the user closes the window. Common options:
- `JFrame.EXIT_ON_CLOSE` - Terminates the application
- `JFrame.HIDE_ON_CLOSE` - Hides the frame (default)
- `JFrame.DISPOSE_ON_CLOSE` - Disposes the frame
```java
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

### `setSize(int width, int height)`
Sets the dimensions of the frame in pixels.
```java
this.setSize(720, 720);
```

### `setIconImage(Image image)`
Sets a custom icon for the frame using an ImageIcon.
```java
ImageIcon image = new ImageIcon("src/favicon.png");
this.setIconImage(image.getImage());
```

### `getContentPane().setBackground(Color color)`
Changes the background color of the frame's content pane.
```java
// Using predefined colors
this.getContentPane().setBackground(Color.GREEN);

// Using custom RGB values
this.getContentPane().setBackground(new Color(123, 50, 250));
```

### `setVisible(boolean visible)`
Controls the visibility of the frame. Must be set to `true` to display the window.
```java
this.setVisible(true);
```

## Running the Code

1. **Compile the Java file:**
   ```bash
   javac FirstApp.java
   ```

2. **Run the application:**
   ```bash
   java FirstApp
   ```

3. **Expected Result:**
    - A 720x720 pixel window will appear
    - Window title: "First Java App"
    - Custom purple background color (RGB: 123, 50, 250)
    - Custom icon (if favicon.png exists in src folder)
    - Application exits when window is closed

## File Structure
```
project-folder/
│
├── FirstApp.java
├── src/
│   └── favicon.png (optional icon file)
└── README.md
```

## Notes
- Ensure the `favicon.png` file exists in the `src` folder, or remove the icon-related code
- The frame extends `JFrame` class, inheriting all GUI functionality
- Always call `setVisible(true)` as the last step to display the frame

## Next Steps
- Learn about adding components (buttons, labels, text fields)
- Explore layout managers
- Handle user events and interactions

## Lesson Duration
**00:00:00 - 00:12:09**

---
*This is part of a comprehensive Java Swing tutorial series.*