# Smart Inventory Management System

![Project Image](Screenshot from 2024-11-18 16-18-17.png)

A feature-rich Android application designed to streamline inventory management by integrating custom hardware with Bluetooth functionality, real-time database updates, and a user-friendly interface.

## Overview

The **Smart Inventory Management System** empowers users to efficiently manage inventory using NFC tag scanning, Bluetooth communication, and Firebase real-time database integration. The system consists of a custom-designed hardware module and an Android application to deliver seamless inventory management.

## Features

- **Real-time Inventory Updates**: All changes sync instantly with Firebase.
- **Custom Attributes**: Define custom fields for detailed component tracking.
- **Bluetooth Integration**: NFC tag scanning and Bluetooth communication via ESP32.
- **Search and Navigation**: Efficient search, filter, and navigation for inventory items.
- **Compact Hardware Design**: Portable and user-friendly hardware powered by a rechargeable battery.

## System Architecture

The system integrates:
- An **ESP32 microcontroller** with an NFC reader (MFRC522) for tag scanning.
- A **real-time Firebase database** for storing and managing inventory data.
- An **Android application** for user interaction, backed by Bluetooth and database connectivity.

### High-Level Workflow
1. The ESP32 scans NFC tags and sends data to the Android app via Bluetooth.
2. The app communicates with Firebase for real-time data storage and retrieval.
3. Users interact with the app for adding, updating, and managing inventory.

## Setup and Installation

### Prerequisites
- Android Studio
- ESP32 development environment (e.g., Arduino IDE)
- Firebase account with a real-time database setup
- nRF Connect app for initial hardware testing (optional)

### Steps
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/SmartInventory.git
   cd SmartInventory
   ```
2. Open the Android project in **Android Studio**.
3. Configure Firebase in the app:
   - Add the `google-services.json` file to the `app/` directory.
   - Ensure Firebase Database rules allow read and write permissions.
4. Upload the BLE firmware to the ESP32 using the Arduino IDE.
5. Connect the hardware components as per the provided [schematic](#system-architecture).

## Usage

### App Features
1. **Add Components**: Tap an NFC tag or click the "Add" button to register new inventory items.
2. **Edit Components**: Update item details through the app interface or NFC scan.
3. **Search Items**: Use the search bar or browse by categories to locate items.
4. **Real-Time Updates**: All changes reflect immediately in the Firebase database.

### Hardware Instructions
1. Power on the hardware using a USB connection or battery.
2. Use the app's "Connect to Device" feature to pair with the ESP32 via Bluetooth.
3. Place the NFC tag close to the reader to scan and manage inventory items.

## Technology Stack

### Hardware
- **ESP32**: Microcontroller with integrated BLE.
- **MFRC522**: NFC Reader IC for tag scanning.
- **Custom PCB Design**: Includes power management, charging circuit, and antennas.

### Software
- **Android**: Kotlin-based application.
- **Firebase**: Real-time database for inventory management.
- **Bluetooth Low Energy (BLE)**: Facilitates communication between hardware and app.

## Project Structure

```
SmartInventory/
│
├── app/                     # Android app source code
│   ├── java/com/example/... # Core app logic
│   ├── res/                 # UI resources
│   ├── AndroidManifest.xml  # App configuration
│
├── firmware/                # ESP32 BLE and NFC firmware
│
├── hardware/                # Hardware schematics and PCB files
│
└── README.md                # Project documentation
```

## Testing

The project has been rigorously tested to ensure reliability:
- **Bluetooth Communication**: Verified using nRF Connect and Android app.
- **Database Syncing**: Tested with various CRUD operations.
- **Hardware Functionality**: NFC scanning, BLE notifications, and power management.

## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this project with proper attribution.

---
