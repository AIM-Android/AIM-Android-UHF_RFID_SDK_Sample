[简体中文](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/master/README_ZH.md)

This project is an example code written for the use of the UHF_RFID_SDK App, mainly aimed at guiding developers on how to trigger the UHF_RFID_SDK App to perform an NFC read in their own app and how to receive NFC read results from the UHF_RFID_SDK App.

# usage
## 1. Install UHF_RFID_SDK App

The UHF_RFID_SDK App integrates RFID modules from multiple vendors. You only need to install and run the app to easily implement NFC reading function and obtain the read data.

## 2. Run the UHF_RFID_SDK App and set it up
### 2.1  Select Module
The UHF-RFID0SDK app currently supports the FT230X module and will continue to support more modules in the future. Please select the corresponding RFID module from the App RFID dropdown menu.
![](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/images/rfid.png)

### 2.2 Select Output Mode
There are two output methods for scanned barcode data in the UHF_RFID_SDK App: keyboard mode and broadcast mode. Users can make choices based on their application scenarios and needs. Please switch the data output mode in the Output method dropdown menu on the App Advanced page. The UHF_RFID_SDK Sample App receives data through broadcasting, so it is necessary to select the broadcasting output mode here.
![](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/images/output.png)

### 2.3  Confirm and set the configuration
Please click the "Confirm" button on the UHF_RFID_SDK App page to set the configuration information
![](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/images/rfid.png)

## 3. Install and run the UHF_RFID_SDK_Sample App
Install and run the UHF_RFID_SDK_Sample App. When you click the "Trigger once Scan" button, scanning starts. After scanning the barcode successfully, you can see the scanned barcode data on the page

# other
For more information about the UHF_RFID_SDK App, please refer to:   
[User Manual  for ScannerWedge App](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/doc/UHF_RFID_SDK%0D%0AQuick%20Start%20Guide%20V1.0.pdf)  
[ScannerWedge release package download](https://github.com/AIM-Android/ScannerWedgeSample/blob/master/release/v1.0/ScannerWedge_20220316_V1.0.7z)
