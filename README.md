# BLE Beacon Scanner
### An Android application for scanning and parsing Bluetooth Low Energy beacons

BLE Beacon Scanner is a native Android app built with Java that discovers nearby Bluetooth Low Energy (BLE) beacons, parses their advertisement data in real time, and presents detailed beacon information in a dynamic RecyclerView list. It supports multiple beacon protocols including iBeacon and the full Eddystone family.

---

## Features

- **Multi-Protocol Beacon Support** -- Detects and parses iBeacon, Eddystone UID, Eddystone URL, Eddystone TLM, and Eddystone EID beacon types
- **Real-Time BLE Scanning** -- Continuous background scanning using Android's `BluetoothLeScanner` API with configurable scan periods
- **Dynamic RecyclerView Display** -- Beacon data rendered in a scrollable list with type-specific layouts that update live as new advertisements arrive
- **iBeacon Data Extraction** -- Reads Proximity UUID, Major/Minor numbers, and Tx Power from iBeacon advertisements
- **Eddystone UID Parsing** -- Extracts Namespace ID, Instance ID, Beacon ID, and calibrated Tx Power
- **Eddystone URL Parsing** -- Decodes broadcasted URLs from Eddystone URL frames
- **Eddystone TLM Telemetry** -- Reads TLM version, battery voltage, beacon temperature, advertisement count, and uptime
- **Eddystone EID Parsing** -- Decodes Ephemeral Identifier (EID) data and Tx Power
- **BLE Flags Parsing** -- Extracts LE Discoverable Mode flags, BR/EDR support, and controller/host simultaneity capabilities
- **Raw Data Display** -- Shows raw advertisement bytes as hexadecimal alongside parsed data
- **Device Deduplication** -- Tracks devices by MAC address, updating existing entries rather than creating duplicates
- **Runtime Permission Handling** -- Manages Bluetooth and location permissions with user-friendly prompts

---

## Tech Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Bluetooth](https://img.shields.io/badge/Bluetooth_LE-0082FC?style=for-the-badge&logo=bluetooth&logoColor=white)

---

## Getting Started

### Prerequisites

- Android Studio (Arctic Fox or later)
- Android device or emulator with BLE support (minimum SDK 23 / Android 6.0)
- Bluetooth and Location services enabled on the test device

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/MajorAbdullah/BLE-Bluetooth-Low-Energy-Beacon-Scanner.git
   ```
2. Open the project in Android Studio and sync Gradle files.
3. Connect an Android device with BLE support (emulators generally do not support BLE scanning).
4. Build and run the application.

---

## Usage

1. Launch the app and grant Bluetooth and Location permissions when prompted.
2. Tap the **Enable Bluetooth** button if Bluetooth is not already active.
3. Tap the **Scan** button to begin discovering nearby BLE beacons.
4. View detected beacons in the list -- each entry displays the device name, MAC address, RSSI signal strength, raw advertisement data, and protocol-specific parsed fields.
5. The list updates in real time as new beacons are detected or existing beacon data changes.

---

## Project Structure

```
BLE-Bluetooth-Low-Energy-Beacon-Scanner/
|-- app/
|   |-- build.gradle                    # App-level dependencies (nv-bluetooth, Nordic BLE, RecyclerView, Material)
|   |-- src/main/java/.../
|   |   |-- MainActivity.java           # BLE scanning logic, permission handling, scan callbacks, beacon parsing
|   |   |-- ExampleAdapter.java         # RecyclerView adapter with dynamic beacon-type layouts
|   |   |-- ExampleItem.java            # Data model for beacon information (iBeacon, Eddystone fields)
|   |   |-- SecondActivity.java         # Secondary activity placeholder
|   |-- src/main/res/                   # Layouts, drawables, and resources
|-- build.gradle                        # Project-level Gradle configuration
|-- gradle/                             # Gradle wrapper
|-- README.md                           # Project documentation
```

---

## Dependencies

| Library | Purpose |
|---------|---------|
| `com.neovisionaries:nv-bluetooth:1.8` | BLE advertisement data parsing (iBeacon, Eddystone) |
| `no.nordicsemi.android:ble:2.3.0` | Nordic Semiconductor BLE library |
| `androidx.recyclerview:recyclerview` | RecyclerView for beacon list display |
| `com.google.android.material:material` | Material Design components |

---

## Contributing

Contributions are welcome. Please fork this repository, create a feature branch, and submit a pull request for review.

---

## Contact

- **GitHub:** [MajorAbdullah](https://github.com/MajorAbdullah)
- **Email:** sa.abdullahshah.2001@gmail.com
