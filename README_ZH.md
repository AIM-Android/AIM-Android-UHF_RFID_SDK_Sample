[English](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/master/README.md)

该项目是为UHF_RFID_SDK App的使用而写的一个范例代码，主要在于指导开发者来如何在自己的app中触发UHF_RFID_SDK App进行一次NFC读取以及如何接收来自于UHF_RFID_SDK App的NFC读取结果

# 用法
## 1. 安装UHF_RFID_SDK App
UHF_RFID_SDK App 集成多家厂商的RFID模块。你只需要安装并运行该app就可以很轻松的实现NFC读取功能并且获取读取后的数据。

## 2. 运行UHF_RFID_SDK App并进行设置
### 2.1 选择模块
UHF_RFID_SDK App目前支持FT230X模块以后还会支持更多模块。请在App RFID下拉菜单来选择对应的RFID模块
![](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/images/rfid.png)

### 2.2 选择输出方式
UHF_RFID_SDK App对扫描到的条形码数据有键盘方式和广播方式两种输出方式，用户可以根据自己应用场景和需求做出选择。请在App Advanced页面的Output method下拉菜单来切换数据输出模式。UHF_RFID_SDK_Sample App是通过广播接收数据的，所以这里需要选择为广播输出模式
![](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/images/output.png)

###  2.3 确认并设置配置
请点击UHF_RFID_SDK App页面的“确认”按键将配置信息设置下去
![](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/images/rfid.png)

## 3. 安装并运行UHF_RFID_SDK_Sample App
安装并且运行UHF_RFID_SDK_Sample App，当点击“Trigger once Scan“按键时，就开始读取，当扫描读取NFC成功后就可以在页面看到扫描到的NFC数据

# 其他
有关UHF_RFID_SDK App的更多资料请参考:  
[UHF_RFID_SDK App使用说明](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/main/doc/UHF_RFID_SDK%0D%0AQuick%20Start%20Guide%20V1.0.pdf)  
[UHF_RFID_SDK发布包下载](https://github.com/AIM-Android/UHF_RFID_SDK_Sample/blob/master/release/v1.0/ScannerWedge_20220316_V1.0.7z)
