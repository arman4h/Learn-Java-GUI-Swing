# JLabel Tutorial - Java Swing

## Overview
This repository demonstrates how to create and customize JLabel components in Java Swing. JLabel is a fundamental component used to display text, images, or both in a GUI application. This tutorial covers text positioning, styling, borders, and various visual customizations.

## What You'll Learn
- Creating JLabel components
- Adding text and images to labels
- Positioning text relative to images
- Customizing fonts, colors, and styling
- Adding borders to labels
- Setting background colors and opacity
- Aligning labels within containers

## Prerequisites
- Basic Java programming knowledge
- Understanding of JFrame basics
- Java Development Kit (JDK) installed
- IDE or text editor for Java development


## Key Methods and Properties

### Creating a JLabel
```java
JLabel label = new JLabel(); // Create empty label
// Or create with text/image directly:
JLabel label = new JLabel("Text");
JLabel label = new JLabel(imageIcon);
JLabel label = new JLabel("Text", imageIcon, JLabel.CENTER);
```

### Setting Text and Icon
```java
label.setText("Bro, I need a good CGPA");
ImageIcon image = new ImageIcon("Swing-Label/src/pic.jpg");
label.setIcon(image);
```

### Text Positioning Relative to Icon
```java
// Horizontal positioning: LEFT, CENTER, RIGHT
label.setHorizontalTextPosition(JLabel.CENTER);

// Vertical positioning: TOP, CENTER, BOTTOM
label.setVerticalTextPosition(JLabel.CENTER);
```

### Text Styling
```java
// Set text color using predefined colors
label.setForeground(Color.white);

// Set custom text color using hex values
label.setForeground(new Color(0xFF0000)); // Red color

// Set font (name, style, size)
label.setFont(new Font("MV Boli", Font.PLAIN, 20));
```

### Icon and Text Gap
```java
// Adjust spacing between icon and text (negative values overlap)
label.setIconTextGap(-300);
```

### Background Styling
```java
label.setBackground(Color.black);
label.setOpaque(true); // Must be true to show background color
```

### Adding Borders
```java
Border border = BorderFactory.createLineBorder(Color.green, 3);
label.setBorder(border);
```

### Label Alignment in Container
```java
// Vertical alignment: TOP, CENTER, BOTTOM
label.setVerticalAlignment(JLabel.CENTER);

// Horizontal alignment: LEFT, CENTER, RIGHT
label.setHorizontalAlignment(JLabel.CENTER);
```

### Manual Positioning (Alternative)
```java
// Set x, y position and width, height manually
// label.setBounds(10, 10, 50, 50);
```

## Text Position Constants

### Horizontal Text Position
- `JLabel.LEFT` - Text to the left of icon
- `JLabel.CENTER` - Text centered on icon
- `JLabel.RIGHT` - Text to the right of icon

### Vertical Text Position
- `JLabel.TOP` - Text above icon
- `JLabel.CENTER` - Text centered on icon
- `JLabel.BOTTOM` - Text below icon

## Font Styles
- `Font.PLAIN` - Normal text
- `Font.BOLD` - Bold text
- `Font.ITALIC` - Italic text
- `Font.BOLD + Font.ITALIC` - Bold and italic

## Border Types
```java
// Line border with color and thickness
BorderFactory.createLineBorder(Color.green, 3);

// Raised border
BorderFactory.createRaisedBorder();

// Lowered border
BorderFactory.createLoweredBorder();

// Empty border (padding)
BorderFactory.createEmptyBorder(10, 10, 10, 10);
```


## Important Notes
- **Image Path**: Ensure the image file exists at the specified path, or update the path accordingly
- **Opaque Property**: Set `setOpaque(true)` to make background colors visible
- **Pack Method**: `frame.pack()` resizes the frame to fit all components
- **Icon Text Gap**: Negative values create overlap between text and icon
- **Font Availability**: Ensure the specified font ("MV Boli") is available on the system

## Common Use Cases
- Display application logos with text
- Create informational panels
- Show status messages with icons
- Build custom UI components
- Create headers and titles for sections

## Troubleshooting
- **Image not showing**: Check file path and ensure image exists
- **Background not visible**: Verify `setOpaque(true)` is called
- **Text not visible**: Check foreground color contrast against background
- **Layout issues**: Consider using layout managers instead of manual positioning

## Next Steps
- Learn about different layout managers
- Explore other Swing components (JButton, JTextField)
- Study event handling for interactive components
- Practice combining multiple components

---
*This tutorial demonstrates fundamental JLabel usage in Java Swing applications.*